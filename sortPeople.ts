// sortPeople.ts

// npm install --save-dev typescript ts-node
// npx tsc --init
// npx ts-node sortPeople.ts

type Person = {
  name: string;
  birthYear: number;
};

const people: Person[] = [
  { name: 'Anna', birthYear: 1990 },
  { name: 'Bernd', birthYear: 1985 },
  { name: 'Clara', birthYear: 1990 },
  { name: 'David', birthYear: 2000 },
  { name: 'Eva', birthYear: 1985 },
  { name: 'Anna', birthYear: 1985 },
];

people.sort((a, b) => {
  // Zuerst: Nach Geburtsjahr absteigend
  if (a.birthYear !== b.birthYear) {
    return b.birthYear - a.birthYear;
  }

  // Dann: Nach Name aufsteigend
  return a.name.localeCompare(b.name);
});

console.log(people);

// Ausgabe:

// [
//   { name: 'David', birthYear: 2000 },
//   { name: 'Anna', birthYear: 1990 },
//   { name: 'Clara', birthYear: 1990 },
//   { name: 'Anna', birthYear: 1985 },
//   { name: 'Bernd', birthYear: 1985 },
//   { name: 'Eva', birthYear: 1985 },
// ];
