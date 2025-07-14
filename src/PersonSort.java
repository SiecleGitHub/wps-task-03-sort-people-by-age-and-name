// src/PersonSort.java

// brew install openjdk
// export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"
// vim ~/.zshrc
// java -version
// openjdk version "24.0.1" 2025-04-15
// OpenJDK Runtime Environment Homebrew (build 24.0.1)
// OpenJDK 64-Bit Server VM Homebrew (build 24.0.1, mixed mode, sharing)

import java.util.*;

class Person {
    String name;
    int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return name + " (" + birthYear + ")";
    }
}

public class PersonSort {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Anna", 1990),
            new Person("Bernd", 1985),
            new Person("Clara", 1990),
            new Person("David", 2000),
            new Person("Anna", 1985),
            new Person("Eva", 1985)
        );

        // Sortieren mit Comparator
        people.sort((a, b) -> {
            // Zuerst nach birthYear absteigend
            if (a.birthYear != b.birthYear) {
                return Integer.compare(b.birthYear, a.birthYear);
            }
            // Dann nach name aufsteigend (case-insensitive)
            return a.name.compareToIgnoreCase(b.name);
        });

        // Ausgabe
        for (Person p : people) {
            System.out.println(p);
        }
    }
}

// javac -d out src/PersonSort.java
// java -cp out PersonSort

// Ausgabe:
// David (2000)
// Anna (1990)
// Clara (1990)
// Anna (1985)
// Bernd (1985)
// Eva (1985)
