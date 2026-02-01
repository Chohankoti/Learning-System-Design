# Interface Segregation Principle (ISP)

## Definition

Clients should not be forced to depend on interfaces they do not use. No client should be forced to implement methods it doesn't need.

## What is a "Client" Here?

In ISP, a "client" refers to any class that implements an interface or depends on it. It's the class that uses or implements the interface.


## Core Concept

Split large interfaces into smaller, more focused interfaces. Each interface should represent a specific set of related behaviors. Classes should only implement interfaces that contain methods they actually need.

## Key Points

- Many small, focused interfaces are better than one large interface
- Interfaces should be cohesive and specific
- No class should implement empty or unsupported methods
- High cohesion within interfaces
- Reduces coupling between unrelated functionalities
- Makes code more modular and flexible

## Why ISP Matters

When interfaces are too large:
- Classes are forced to implement unnecessary methods
- Leads to dummy implementations or exceptions
- Creates unwanted dependencies
- Makes code harder to understand and maintain
- Violates single responsibility at interface level

## Benefits

- **Focused Interfaces**: Each interface has a clear, single purpose
- **Modular Design**: Easy to compose different behaviors
- **Better Maintainability**: Changes affect fewer classes
- **Cleaner Implementations**: No dummy or empty methods
- **Flexible Composition**: Classes can implement multiple small interfaces
- **Reduced Coupling**: Classes don't depend on methods they don't use

## Problem Example (Before.java)

The Machine interface is too large and forces clients to implement unneeded methods:

```java
interface Machine {
    void print();
    void scan();
    void fax();
}

class Printer implements Machine {
    public void print() {}

    public void scan() {
        throw new UnsupportedOperationException();
    }

    public void fax() {
        throw new UnsupportedOperationException();
    }
}
```

Problems with this approach:
- Printer class (client) must implement scan() and fax() even though it only prints
- Forced to throw exceptions or provide empty implementations
- Violates LSP (substitution fails when calling scan/fax)
- Creates unnecessary dependencies
- If scan() signature changes, Printer must be recompiled

## Solution Example (After.java)

Split the large interface into smaller, focused interfaces:

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() {
        // print logic
    }
}
```

Now the design is better:
- SimplePrinter only implements what it needs
- No dummy methods or exceptions
- Clear and focused interface
- Can add Scanner interface only when needed


## How to Identify Violations

Look for these signs:
- Classes with empty method implementations
- Methods throwing UnsupportedOperationException
- Comments like "not implemented" or "not applicable"
- Large interfaces with many methods
- Classes implementing only some methods of an interface
- Frequent changes to interface affecting many unrelated classes


## Common Interview Questions

**Q: What is the Interface Segregation Principle?**
A: Clients should not be forced to depend on interfaces they do not use. Split large interfaces into smaller, more specific ones so classes only implement what they need.

**Q: What does "client" mean in ISP?**
A: A client is any class that implements or depends on an interface. It's the consumer of the interface.

**Q: How is ISP different from Single Responsibility?**
A: SRP applies to classes (one reason to change), while ISP applies to interfaces (clients shouldn't depend on unused methods). Both promote focused, cohesive design.

**Q: What are the benefits of focused interfaces?**
A: No unnecessary dependencies, cleaner implementations, better modularity, easier maintenance, and ability to compose behaviors flexibly.

**Q: Can a class implement multiple interfaces?**
A: Yes, that's actually encouraged in ISP. Classes should implement multiple small, focused interfaces rather than one large interface.


## Real-World Analogy

Think of a Swiss Army knife vs specialized tools:
- Bad: One huge "Tool" interface with methods for knife, screwdriver, scissors, etc.
- Good: Separate interfaces: Cutter, Screwer, Snipper
- A simple knife only implements Cutter
- A multi-tool can implement all three
- Each tool does what it's designed for without forced empty methods


## Quick Tips for Implementation

- If an interface has methods clients don't use, split it
- Group related methods that change together
- Use interface inheritance for "is-a" relationships
- Prefer multiple interface implementation over large interfaces
- Review interfaces when adding new methods
- Ask: "Will all clients need this method?"