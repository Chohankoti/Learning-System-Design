# Dependency Inversion Principle (DIP)

## Definition

Depend on abstractions (interfaces/abstract classes), not on concrete implementations (specific classes).

## Core Concept

Traditional dependency flow goes from high-level to low-level modules. DIP inverts this by introducing an abstraction layer. Both high-level and low-level modules depend on the abstraction, creating a decoupled design.

## Key Points

- Depend on interfaces, not concrete classes
- High-level modules define the abstraction
- Low-level modules implement the abstraction
- Decouples components from specific implementations
- Enables flexibility and testability
- Foundation for dependency injection


## Why DIP Matters

When high-level modules depend on concrete low-level modules:
- Changing implementation requires changing high-level code
- Difficult to test (can't mock dependencies)
- Tight coupling between components
- Hard to swap implementations
- Violates Open-Closed Principle

## Benefits

- **Decoupled Design**: Components are independent and interchangeable
- **Easy Testing**: Can inject mock implementations
- **Flexibility**: Can switch implementations without changing high-level code
- **Maintainability**: Changes in low-level modules don't affect high-level logic
- **Reusability**: High-level modules can work with any implementation
- **Extensibility**: Add new implementations without modifying existing code

## Problem Example (Before.java)

OrderService (high-level) directly depends on concrete payment classes (low-level):

```java
class StripePayment {
    public void pay() {
        // stripe logic
    }
}

class RazorpayPayment {
    public void pay() {
        // razorpay logic
    }
}

class OrderService {
    public void placeOrder(String paymentType) {
        if (paymentType.equals("STRIPE")) {
            StripePayment stripe = new StripePayment();
            stripe.pay();
        } else if (paymentType.equals("RAZORPAY")) {
            RazorpayPayment razorpay = new RazorpayPayment();
            razorpay.pay();
        }
    }
}
```

Problems with this approach:
- OrderService is tightly coupled to specific payment implementations
- Adding new payment gateway requires modifying OrderService
- Cannot test OrderService without actual payment gateways
- High-level module (OrderService) depends on low-level modules (payment classes)
- Violates OCP and makes code rigid

## Solution Example (After.java)

Introduce abstraction that both high-level and low-level modules depend on:

```java
interface PaymentGateway {
    void pay();
}

class StripePayment implements PaymentGateway {
    public void pay() {
        // stripe payment logic
    }
}

class RazorpayPayment implements PaymentGateway {
    public void pay() {
        // razorpay payment logic
    }
}

class OrderService {
    private PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder() {
        paymentGateway.pay();
    }
}
```

Now the design follows DIP:
- OrderService (high-level) depends on PaymentGateway (abstraction)
- StripePayment/RazorpayPayment (low-level) implement PaymentGateway (abstraction)
- OrderService doesn't know or care about specific implementation
- Can easily add new payment gateways without changing OrderService
- Easy to test with mock implementations

Usage:
```java
PaymentGateway payment = new StripePayment();
OrderService service = new OrderService(payment);
service.placeOrder();
```


## Common Interview Questions

**Q: What is the Dependency Inversion Principle?**
A: High-level modules should not depend on low-level modules. Both should depend on abstractions. This means depending on interfaces rather than concrete implementations.

**Q: What does "inversion" mean in DIP?**
A: Traditionally, high-level modules depend on low-level modules. DIP inverts this by introducing abstractions that both depend on, reversing the dependency direction.

**Q: What's the difference between DIP and Dependency Injection?**
A: DIP is a principle (depend on abstractions). Dependency Injection is a technique to implement DIP (injecting dependencies from outside rather than creating them internally).

**Q: How does DIP improve testability?**
A: By depending on abstractions, you can inject mock or stub implementations during testing instead of real dependencies, making unit testing easier.


**Q: What are high-level and low-level modules?**
A: High-level modules contain business logic (what to do). Low-level modules contain implementation details (how to do it). DIP says both should depend on abstractions.

## Real-World Analogy

Think of electrical outlets:
- Appliances (high-level) don't depend on specific power plants (low-level)
- Both depend on the electrical standard (abstraction)
- You can plug any appliance into any outlet following the standard
- Power source can change without affecting appliances
- The plug interface decouples appliances from power generation


## Quick Tips for Implementation

- If you use `new` for a concrete class, consider if it should be injected
- Ask: "Will this dependency ever need to be replaced or mocked?"
- Use DI frameworks (Spring, Guice) for automatic dependency management
- Keep abstractions in the same module as high-level code
- Low-level implementations can be in separate modules
- Favor composition with injected dependencies over inheritance