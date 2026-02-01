# Liskov Substitution Principle (LSP)

## Definition

Objects of a superclass should be replaceable with objects of its subclasses without breaking the application. Subtypes must be substitutable for their base types.

## Core Concept

If class B is a subtype of class A, then we should be able to replace A with B without disrupting the behavior of the program. The child class must not violate the expectations set by the parent class.

## Key Points

- Subclass must fulfill the contract of the parent class
- Child class should not break parent class behavior
- Substitution should be safe and transparent
- Derived types must be completely substitutable
- Method signatures and behavior should be consistent
- No strengthening of preconditions or weakening of postconditions

## Why LSP Matters

When a subclass violates LSP:
- Unexpected exceptions or errors occur
- Code becomes fragile and unpredictable
- Cannot rely on polymorphism safely
- Breaks the is-a relationship
- Requires type checking before substitution

## Benefits

- **Safe Substitutions**: Can use derived classes without worry
- **Reliable Polymorphism**: Parent type references work with any child
- **Predictable Behavior**: No surprises when using inheritance
- **Better Design**: Forces proper inheritance hierarchies
- **Reduced Bugs**: Prevents runtime errors from incorrect substitutions

## Problem Example (Before.java)

The Penguin class violates LSP because it cannot fulfill the Bird contract:

```java
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException();
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Flying");
    }
}
```

Problems with this approach:
- Penguin is-a Bird but cannot fly
- Calling fly() on a Bird reference might throw exception
- Cannot safely substitute Penguin for Bird
- Breaks the expected behavior of Bird class
- Violates the contract that all Birds can fly

Example of the problem:
```java
Bird bird = new Penguin();
bird.fly(); // Throws UnsupportedOperationException - breaks LSP
```

## Solution Example (After.java)

Redesign the hierarchy to match actual capabilities:

```java
interface Bird {}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin implements Bird {
    // no fly method
}
```

Now the design is correct:
- Not all birds have to fly
- Only FlyingBird types have the fly() method
- Penguin is a Bird but not a FlyingBird
- Can safely substitute any FlyingBird with its implementations
- No unexpected exceptions

Usage:
```java
FlyingBird bird = new Sparrow();
bird.fly(); // Works perfectly - LSP satisfied
```

## How to Identify Violations

Watch for these red flags:
- Throwing exceptions in overridden methods when parent doesn't
- Empty implementations or methods that do nothing
- Strengthening preconditions (requiring more than parent)
- Weakening postconditions (guaranteeing less than parent)
- Type checking before calling methods (instanceof checks)
- Comments like "this method doesn't apply to this subclass"


## Common Interview Questions

**Q: What is the Liskov Substitution Principle?**
A: Subclasses should be substitutable for their base classes without altering the correctness of the program. A child class must not break the behavior expected from the parent class.

**Q: How does LSP differ from simple inheritance?**
A: Inheritance creates an is-a relationship, but LSP ensures this relationship is behaviorally correct. Just because you can extend a class doesn't mean you should if it violates LSP.

**Q: What happens when LSP is violated?**
A: The code becomes fragile. You get unexpected exceptions, need type checking before using polymorphism, and cannot safely substitute derived types.

**Q: How do you fix LSP violations?**
A: Redesign the inheritance hierarchy. Extract interfaces that match actual capabilities, use composition instead of inheritance, or create more specific base types.


## Real-World Analogy

Think of a vehicle rental service:
- You book a "car" and expect it to have 4 wheels and drive normally
- If they substitute it with a broken car that can't drive, the substitution fails
- Any working car should be substitutable for the generic "car" type
- The substitute must fulfill all expectations of the original


## Quick Tips for Implementation

- Ask "is-a" vs "behaves-like-a" before inheriting
- If child needs to disable parent methods, don't inherit
- Use abstract classes and interfaces appropriately
- Document preconditions and postconditions clearly
- Ensure child class honors all parent contracts
- When in doubt, prefer composition over inheritance