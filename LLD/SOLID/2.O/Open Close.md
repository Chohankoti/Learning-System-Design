# Open-Closed Principle (OCP)

## Definition

Software entities (classes, modules, functions) should be open for extension but closed for modification.

## Core Concept

You should be able to add new functionality without changing existing code. Extend behavior through inheritance, interfaces, or composition rather than modifying existing classes.

## Key Points

- Open for extension: Can add new features
- Closed for modification: Don't change existing tested code
- Use abstraction (interfaces/abstract classes)
- Follow polymorphism to achieve OCP
- Prevents breaking existing functionality
- Reduces risk when adding features

## Why OCP Matters

When you modify existing code to add new features:
- Risk of introducing bugs in working code
- Need to retest everything
- Changes can have unexpected side effects
- Violates stability of tested code

## Benefits

- **Easy to Add Features**: New functionality added without touching old code
- **Reduced Risk**: Existing code remains unchanged and stable
- **Better Scalability**: System grows without constant refactoring
- **Improved Maintainability**: Less chance of breaking existing features
- **Cleaner Code**: Forces better design through abstraction

## Problem Example (Before.java)

The PaymentService class violates OCP because adding a new payment method requires modifying existing code:

```java
class PaymentService {
    public void pay(String type) {
        if (type.equals("CARD")) {
            // card payment
        } else if (type.equals("UPI")) {
            // upi payment
        }
    }
}
```

Problems with this approach:
- Adding wallet payment requires modifying PaymentService
- Need to add another if-else condition
- Existing code must be changed and retested
- Risk of breaking existing payment methods
- Violates single responsibility as well

## Solution Example (After.java)

Use abstraction to make it extensible without modification:

```java
interface PaymentMethod {
    void pay();
}

class CardPayment implements PaymentMethod {
    public void pay() {
        // card payment
    }
}

class UpiPayment implements PaymentMethod {
    public void pay() {
        // upi payment
    }
}

class PaymentService {
    public void process(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
```

Now to add a new payment method (e.g., WalletPayment):
- Create new class implementing PaymentMethod interface
- No need to modify PaymentService or existing payment classes
- System is open for extension, closed for modification

```java
class WalletPayment implements PaymentMethod {
    public void pay() {
        // wallet payment
    }
}
```

## How to Identify Violations

Look for these patterns:
- Multiple if-else or switch statements for type checking
- Frequent modifications to same class when adding features
- Hard-coded dependencies on concrete classes
- Need to modify existing code for every new requirement

## How to Implement OCP

- Use interfaces or abstract classes to define contracts
- Depend on abstractions, not concrete implementations
- Use polymorphism to handle different behaviors
- Make behavior configurable or pluggable

## Common Interview Questions

**Q: What is the Open-Closed Principle?**
A: Classes should be open for extension but closed for modification. You should add new features by extending code, not by changing existing working code.

**Q: Why is it called Open-Closed?**
A: Open means you can extend behavior to add new features. Closed means existing code should not be modified, keeping it stable and tested.

**Q: How does OCP make adding features easy?**
A: By using abstraction and polymorphism, new features are added as new classes implementing existing interfaces, without touching existing code.

**Q: What's the relationship between OCP and abstraction?**
A: Abstraction (interfaces/abstract classes) is the key mechanism to achieve OCP. It allows new implementations without modifying existing code.


## Real-World Analogy

Think of a power socket:
- The socket design is closed (you don't modify it)
- But it's open for extension (you can plug different devices)
- Any device with the right plug can work
- Adding a new device doesn't require changing the socket


## Quick Tips for Implementation

- Identify what varies in your system
- Extract that variation behind an interface
- Program to interfaces, not implementations
- Use dependency injection to provide implementations
- Avoid type checking (instanceof, type strings)
- Think "plug-in architecture" when designing