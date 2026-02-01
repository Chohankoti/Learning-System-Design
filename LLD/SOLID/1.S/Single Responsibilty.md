# Single Responsibility Principle (SRP)

## Definition

A class should have only one reason to change. Each class should have a single responsibility or job.

## Core Concept

The principle states that a class should be responsible for one thing only. If a class has multiple responsibilities, changes to one responsibility might affect or break the other.

## Key Points

- One class = One responsibility
- A responsibility is a reason to change
- High cohesion within the class
- Low coupling between classes
- Easier to maintain and test
- Better code organization

## Why SRP Matters

When a class handles multiple responsibilities, it becomes harder to:
- Understand the code
- Test individual functionalities
- Make changes without breaking other parts
- Reuse specific functionality

## Benefits

- **Better Maintainability**: Changes are isolated to specific classes
- **Easier Testing**: Each class can be tested independently
- **Reduced Coupling**: Classes depend on fewer things
- **Improved Readability**: Clear purpose for each class
- **Enhanced Reusability**: Single-purpose classes are easier to reuse

## Problem Example (Before.java)

The Invoice class violates SRP by handling three different responsibilities:
- Business logic (calculate total)
- Presentation logic (printing)
- Data persistence (database operations)

```java
class Invoice {
    public void calculateTotal() { }
    public void printInvoice() { }
    public void saveToDB() { }
}
```

Problems with this approach:
- If printing format changes, Invoice class must change
- If database schema changes, Invoice class must change
- If calculation logic changes, Invoice class must change
- Three different reasons to modify the same class

## Solution Example (After.java)

Separate each responsibility into its own class:

```java
class Invoice {
    public void calculateTotal() { }
}

class InvoicePrinter {
    public void printInvoice() { }
}

class InvoiceRepository {
    public void saveToDB() { }
}
```

Now each class has a single responsibility:
- Invoice: Business logic only
- InvoicePrinter: Presentation concerns only
- InvoiceRepository: Data persistence only

## How to Identify Violations

Ask these questions:
- Does this class have more than one reason to change?
- Can I describe the class purpose in one sentence without using "and"?
- Are there methods that operate on different sets of data?
- Would changes in different business rules affect this class?

## Common Interview Questions

**Q: What is Single Responsibility Principle?**
A: A class should have only one reason to change, meaning it should have only one job or responsibility.

**Q: What are the benefits of SRP?**
A: Better maintainability, easier testing, improved readability, reduced coupling, and enhanced reusability.

**Q: How does SRP improve maintainability?**
A: Changes are isolated to specific classes. When a requirement changes, you only need to modify the class responsible for that specific functionality.


## Real-World Analogy

Think of a restaurant:
- Chef (cooks food)
- Waiter (serves customers)
- Cashier (handles payments)

Each person has one clear responsibility. If the chef also handled payments and serving, efficiency and quality would suffer.

## Quick Tips for Implementation

- Keep classes small and focused
- Name classes based on their single responsibility
- Use composition over inheritance when combining functionalities
- If a class name contains "and" or "or", it might be doing too much
- Each class should be expert in one thing only
