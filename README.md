**Object Oriented Programming in Java**

OOP is a programming paradigm that organizes software design around objects, which can hold both data and behavior.

An object = data (fields/attributes) + methods (functions/behavior).

OOP helps make your code:
- Modular
- Reusable
- Easier to maintain
- Scalable



🎯 Four Pillars of OOP 

| Pillar            | Status  | Description                                                                       |
| ----------------- | ------- | --------------------------------------------------------------------------------- |
| **Encapsulation** | Done  | Wrapping data and restricting direct access using `private` and `getters/setters` |
| **Abstraction**   | Done  | Hiding internal complexity and showing only essential features                    |
| **Inheritance**   | Done  | Acquiring properties and behavior from parent class                               |
| **Polymorphism**  | Done  | One interface, many forms (method overloading/overriding)                         |

🔐 Pillar 1: Encapsulation

Encapsulation is the process of binding data and the methods that operate on that data into a single unit (class) and restricting direct access to it.

Achieved in Java by:
Declaring class variables as private

Providing public getters and setters

Benefits:
- Data hiding and protection
- Controlled access
- Validation logic can be added
- Clean, maintainable, modular code

🎭 Pillar 2 : Abstraction 

Abstraction means showing only the essential features of an object while hiding the unnecessary details.

In Java, abstraction is achieved using:

- Abstract Classes
- Interfaces

Think of it as “what an object does” rather than “how it does it.”

🧩 Abstraction in Java: Two Tools


| Tool               | Description                                                                                                         |
| ------------------ | ------------------------------------------------------------------------------------------------------------------- |
| **Abstract Class** | A class that can have **abstract (unimplemented)** and **concrete (implemented)** methods                           |
| **Interface**      | A full abstraction (before Java 8), only method **signatures** (from Java 8 onward, default/static methods allowed) |

📌 Benefits of Abstraction
- Hides internal complexity
- Improves code readability and maintainability
- Encourages clean design and separation of concerns
- Makes systems easier to extend

🧬 PILLAR 3: INHERITANCE

Inheritance allows a class (child) to inherit properties and behaviors (fields and methods) from another class (parent).

It promotes code reuse, hierarchical relationships, and extensibility in programs.


✅ Benefits of Inheritance:
- Code reusability
- Logical class hierarchy
- Simpler code maintenance
- Enables method overriding and runtime polymorphism

| Concept       | Keyword     | Example                           |
| ------------- | ----------- | --------------------------------- |
| Inheritance   | `extends`   | `class Dog extends Animal {}`     |
| Access Parent | `super`     | `super.eat();`                    |
| Override      | `@Override` | Overriding parent method in child |

🧿 PILLAR 4: POLYMORPHISM in Java

Polymorphism means “many forms”. In Java, it allows objects to behave differently based on their actual class, even when they’re referenced through a parent type.

✌️ Two Types of Polymorphism
| Type             | Also Known As                        | When It Happens |
| ---------------- | ------------------------------------ | --------------- |
| **Compile-time** | Method Overloading                   | At compile time |
| **Runtime**      | Method Overriding + Dynamic Dispatch | At runtime      |

Benefits of Polymorphism:
- Code becomes flexible and extensible
- We can generalize behavior
- Helps in designing clean interfaces
- Enables runtime decisions

