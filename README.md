# Grocery Bill Calculator

A Java console application that calculates the average weekly and monthly
grocery bill for a family of four, both with and without a coupon discount.

## Files

| File | Description |
|------|-------------|
| `pseudocode.txt` | Pseudocode design for the program |
| `GroceryCalculator.java` | Java source code |
| `README.md` | This file |

## Compile

```
javac GroceryCalculator.java
```

## Run

```
java GroceryCalculator
```

## Program Requirements

- Prompts for a coupon amount entered as a decimal (for example, `.10`)
- Resets the coupon to 10% if the value is above 100% or is zero or negative
- Prompts for the grocery bills for weeks 1 through 4
- Calculates the monthly total and the weekly average
- Displays those figures both without and with the coupon applied

## Concepts Demonstrated

- Reading user input with the `Scanner` class
- Input validation with an `if` statement and a compound `OR` condition
- Arithmetic operators and operator precedence
- Formatted output with `System.out.printf()` and the `%.2f` specifier
