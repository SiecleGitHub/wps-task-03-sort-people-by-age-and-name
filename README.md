## This repository contains two implementations to sort a list of persons.

## First by age descending and second name ascending

```
Task: Bestimme die Anzahl unterschiedlicher Wörter in einem Text
Initial
Anna  1990
Bernd 1985
Clara 1990
David 2000
Eva   1985
Anna  1985

Sorted
David (2000)
Anna (1990)
Clara (1990)
Anna (1985)
Bernd (1985)
Eva (1985)
```

### The first solution is a Typescript file. The following commands allow to start the program.

```console
Call all commands from root directory

npm install --save-dev typescript ts-node

npx tsc --init

npx ts-node sortPeople.ts
```

### Second solution in Java.

```console
brew install openjdk

export PATH="/opt/homebrew/opt/openjdk/bin:$PATH"

vim ~/.zshrc. // add the path to the .zshrc file

java -version

javac -d out src/PersonSort.java

java -cp out PersonSort
```
