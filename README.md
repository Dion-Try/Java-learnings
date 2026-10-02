# Java-learnings

My personal journey in learning and understanding Java. This repository collects the exercises
and small practice programs from my Java course, mainly the basics of object-oriented programming
and working with strings. It is a learning log, not production code.

I study Business Information Technology part-time at the FHNW (Windisch) and want to build a solid
foundation in Java and software development.

## Exercises

All exercises live in `Exercises/`. Each folder is a small standalone project with its sources
in `src/`.

| Folder | Topic | What it covers |
|---|---|---|
| `Strings` | Output | Formatted output with `printf` |
| `AllAboutStrings` | String methods | `indexOf`, `lastIndexOf`, `equals`, `startsWith`, `contains`, `isBlank`, `charAt` (in `Main`); `substring`, `join`, `concat`, `replace`, `repeat`, `indent` (in `StringMethods`) |
| `StringOptions` | `String` vs. `StringBuilder` | Immutability, `append`, length vs. capacity |
| `minmaxEx` | Loops and input | Reads numbers from the console until a non-number is entered and tracks the minimum and maximum (`Scanner`, `do/while`, exception handling) |
| `OOP first` | Classes and constructors | `BankAcc` with `deposit` and `withdraw` (balance check); `Customer` with constructors that call each other via `this(...)` |
| `ConstructorChallebe` | Constructor overloading | `Customer` with three constructors, input read with `Scanner` |
| `InheritanceFirst` | Inheritance and polymorphism | `Animal` with subclasses `Dog` and `Fish`; `super`, overriding, `toString` |
| `InheritanceChallenge` | Class hierarchy | `Worker` → `Employee` → `HourlyEmployee` / `SalariedEmployee`; overriding `collectPay()`, age calculated from the birth date |
| `ComputerFactory` | Inheritance and composition | A `PersonalComputer` made of `ComputerCase`, `Monitor` and `Motherboard` (all extend `Product`) |
| `SmartKitchen` | Encapsulation and composition | `SmartKitchen` coordinates `CoffeeMaker`, `DishWasher` and `Refrigerator` |
| `PoJoe` | POJOs and records | A classic `Student` class (getters, setters, `toString`) next to a `record`; `switch` expression |
| `TheObjectClass` | The `Object` class | Work in progress, only the class skeleton so far |

## Requirements

The exercises are written and tested with **JDK 25** in IntelliJ IDEA. Most of them use language
features that are final in Java 25: a top-level `void main()` (compact source files) and statements
before `this(...)` in constructors. With older JDKs (for example 21) they do not compile.

## Running an exercise

Open an exercise folder as a project in IntelliJ IDEA (SDK 25) and run `Main`. Or from the command
line, for example for `Strings`:

```
cd Exercises/Strings
javac -d out src/*.java
java -cp out Main
```

`PoJoe` has its sources one level deeper (`Exercises/PoJoe/PoJoe/src`). In `AllAboutStrings`,
run `StringMethods` as well.

## More

My portfolio with further projects: https://dion-elshani-cv.netlify.app
