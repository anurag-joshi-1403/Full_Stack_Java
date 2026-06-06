# Core Java - Basics Concepts & Logic

[![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=java)]()
[![Beginner Friendly](https://img.shields.io/badge/Level-Beginner-green?style=flat-square)]()
[![Open Source](https://img.shields.io/badge/Open-Source-blue?style=flat-square)]()
[![Documentation](https://img.shields.io/badge/Docs-Complete-brightgreen?style=flat-square)]()
[![Last Updated](https://img.shields.io/badge/Updated-June%202026-lightblue?style=flat-square)]()

A comprehensive guide to understanding fundamental Java programming concepts with practical examples.

---

## Table of Contents
1. [Introduction to Java](#introduction-to-java)
2. [Hello World - First Program](#hello-world---first-program)
3. [Features of Java](#features-of-java)
4. [Operators](#operators)
5. [Methods](#methods)
6. [Loops](#loops)
7. [Conditional Statements](#conditional-statements)
8. [Method Overloading](#method-overloading)
9. [Problem Solving](#problem-solving)
10. [Pattern Problems](#pattern-problems)

---

## Introduction to Java

🎯 **Core Concept** | 📚 **Foundational** | ⭐ **Essential**

Java is a versatile, object-oriented programming language known for its "write once, run anywhere" philosophy. It's widely used in enterprise applications, web development, and Android app development.

**Key Characteristics:**
- Simple and easy to learn
- Object-oriented
- Platform-independent (bytecode compiled runs on any JVM)
- Strongly typed language
- Memory management through garbage collection

---

## Hello World - First Program

🔰 **Beginner** | 💻 **Code Example** | ✅ **Entry Point**

### Concept
Every Java program starts with a simple "Hello World" example to understand the basic structure.

### Code Structure
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World...");
    }
}
```

### Logic Breakdown
| Component | Purpose |
|-----------|---------|
| `public class HelloWorld` | Declares a public class named HelloWorld |
| `public static void main(String[] args)` | Entry point of the program - JVM starts execution here |
| `System.out.println()` | Prints output to console with a newline |

### Key Takeaways
- Every Java application must have at least one **main method**
- `main` must be `public static void` - these are mandatory keywords
- Class names should start with uppercase (naming convention)

---

## Features of Java

📋 **Language Features** | 🏆 **8 Key Aspects** | 💡 **Why Java?**

### 8 Key Features of Java

1. **🎭 Object-Oriented Programming (OOPs)**
   - Everything in Java is an object
   - Supports encapsulation, inheritance, and polymorphism
   - Promotes code reusability and organization

2. **🌍 Platform Independence**
   - Code compiled into bytecode (.class files)
   - Runs on any system with Java Virtual Machine (JVM)
   - Slogan: "Write Once, Run Anywhere" (WORA)

3. **🔒 Robust and Secure**
   - Strong memory management
   - Exception handling built-in
   - Secure type checking

4. **⚙️ Multi-Threading and Concurrency**
   - Can run multiple threads simultaneously
   - Better resource utilization
   - Useful for applications needing parallel processing

5. **📦 Rich API and Standard Libraries**
   - Extensive built-in packages (java.lang, java.util, etc.)
   - Pre-built solutions for common tasks
   - Reduces development time

6. **🏢 Frameworks for Enterprise and Web Development**
   - Spring, Hibernate, Struts frameworks
   - Support for building scalable applications
   - MVC architecture support

7. **🔓 Open-Source Libraries**
   - Apache Commons, Google Guava, etc.
   - Community-driven development
   - Free to use and modify

8. **📈 Maintainability and Scalability**
   - Clean syntax and structure
   - Easy to maintain large codebases
   - Scales well with application growth

---

## Operators

➕ **Mathematical Operations** | 🔢 **Data Manipulation** | ⚡ **Core Concepts**

Operators are symbols that perform operations on variables and values.

### 1. Arithmetic Operators

🧮 **Math Operations** | ✏️ **Basic Calculations**

Used to perform basic mathematical operations.

```java
int a = 19;
int b = 11;
int sum = a + b;        // 30
int sub = a - b;        // 8
int multi = a * b;      // 209
int div = a / b;        // 1 (integer division)
int mod = a % b;        // 8 (remainder)
```

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | 19 + 11 | 30 |
| `-` | Subtraction | 19 - 11 | 8 |
| `*` | Multiplication | 19 * 11 | 209 |
| `/` | Division | 19 / 11 | 1 |
| `%` | Modulus | 19 % 11 | 8 |

### 2. Unary Operators

📊 **Single Operand** | 🔄 **Increment/Decrement**

Operate on a single operand.

```java
a++;        // Post-increment: use value, then increment
++a;        // Pre-increment: increment, then use value
b--;        // Post-decrement: use value, then decrement
--b;        // Pre-decrement: decrement, then use value
```

**Difference between Pre and Post:**
- `a++` returns current value, then increments
- `++a` increments first, then returns new value

### 3. Relational Operators

🔗 **Comparisons** | ✔️ **Boolean Results**

Compare two values and return boolean results.

```java
a == b      // Equal to: false if a ≠ b
a != b      // Not equal to
a > b       // Greater than
a < b       // Less than
a >= b      // Greater than or equal to
a <= b      // Less than or equal to
```

### 4. Logical Operators

🧠 **Boolean Logic** | 🎯 **Decision Making**

Combine boolean values.

```java
// AND (&&) - both conditions must be true
age > 18 && age < 30          // true only if both true

// OR (||) - at least one condition must be true
age < 18 || age > 60          // true if either condition is true

// NOT (!) - reverses boolean value
!pass                         // inverts the value
```

**Truth Tables:**
| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|-----|
| T | T | T | T | F |
| T | F | F | T | F |
| F | T | F | T | T |
| F | F | F | F | T |

### 5. Assignment Operators

💾 **Value Assignment** | 🔧 **Compound Operations**

Assign and modify values.

```java
z = 21;        // Simple assignment
z += 4;        // z = z + 4 → 25
z -= 4;        // z = z - 4 → 21
z *= 4;        // z = z * 4 → 84
z /= 4;        // z = z / 4 → 21
z %= 4;        // z = z % 4 → 1
```

---

## Methods

🎨 **Code Blocks** | 🔁 **Reusability** | 📍 **Organization**

Methods are reusable blocks of code that perform specific tasks.

### Method Types

#### 1. Static Methods

⚡ **Class Methods** | 🚀 **No Object Needed**

- Can be called without creating an object
- Belong to the class, not instances

```java
static void greet() {
    System.out.println("Hello...");
}

// Calling static method
greet();  // No object needed
```

#### 2. Instance Methods

🎭 **Object Methods** | 📦 **Object Required**

- Require an object to be called
- Operate on instance variables

```java
void name() {
    System.out.println("Anurag Joshi...");
}

// Calling instance method
Methods obj = new Methods();
obj.name();  // Object needed
```

### Method Structure
```java
[access modifier] [static/non-static] [return type] [method name]([parameters]) {
    // method body
    return [value];  // if return type is not void
}
```

### Benefits of Methods
- **Code Reusability**: Write once, use multiple times
- **Maintainability**: Easier to update logic in one place
- **Readability**: Code becomes more organized
- **Modularity**: Break complex logic into smaller pieces

---

## Loops

🔄 **Iteration** | 📡 **Repetition** | ⏰ **Flow Control**

Loops are used to execute a block of code repeatedly.

### 1. For Loop

📌 **Fixed Iterations** | 🎯 **Known Count**

**Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // code to execute
}
```

**Example:**
```java
// Print numbers 0 to 5
for (int i = 0; i <= 5; i++) {
    System.out.println(i);
}

// Print sum of first 10 numbers
int sum = 0;
for (int i = 0; i <= 10; i++) {
    sum = sum + i;
}
```

**Components:**
| Part | Purpose | Example |
|------|---------|---------|
| Initialization | Set starting value | `int i = 0` |
| Condition | Check before each iteration | `i <= 5` |
| Increment/Decrement | Update value after each iteration | `i++` |

### 2. While Loop

🔀 **Conditional Loops** | ❓ **Unknown Count**

**Syntax:**
```java
while (condition) {
    // code to execute
}
```

**Example:**
```java
int e = 1;
while (e <= 5) {
    System.out.println(e);
    e++;  // Must increment manually
}
```

**Key Points:**
- Condition is checked BEFORE execution
- Must manually update the counter
- Best when iteration count is unknown

### 3. Do-While Loop

▶️ **Execute First** | ✋ **Condition After**

**Syntax:**
```java
do {
    // code to execute
} while (condition);
```

**Example:**
```java
do {
    System.out.println(e);
    e++;
} while (e <= 5);
```

**Key Difference from While:**
- Code executes AT LEAST ONCE (even if condition is false)
- Condition checked AFTER execution
- Useful when you need at least one execution

### Comparison of Loops

| Feature | For Loop | While Loop | Do-While Loop |
|---------|----------|-----------|---------------|
| Iteration count | Known | Unknown | Unknown |
| Condition check | Before | Before | After |
| Minimum execution | 1 time | 0 times | 1 time |
| Best used for | Fixed iterations | Conditional loops | At least once execution |

---

## Conditional Statements

🚦 **Decision Making** | ✅ **Branching Logic** | 🎛️ **Control Flow**

### Ternary Operator

⚡ **Quick Decision** | 1️⃣ **One Liner**

Shorthand for if-else statements.

**Syntax:**
```java
condition ? value_if_true : value_if_false
```

**Example:**
```java
int a = 13;
String result = (a > 0) ? "Positive" : "Negative";
// Result: "Positive"

int b = 10;
String result1 = (a > b) ? "a" : "b";
// Result: "a"
```

**How it works:**
1. Evaluate condition
2. If TRUE → return first value
3. If FALSE → return second value

**When to Use:**
- Simple one-line conditional assignments
- More readable than if-else for simple decisions
- Returns a value directly

### Switch-Case Statement

🔀 **Multiple Choices** | 📍 **Case Based**

Used for multiple conditions.

```java
public class CalculatorUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt();
        
        System.out.println("Enter Operator (+,-,*,/,%): ");
        char op = sc.next().charAt(0);
        
        switch(op) {
            case '+':
                System.out.println("Result = " + (a+b));
                break;
            case '-':
                System.out.println("Result = " + (a-b));
                break;
            case '*':
                System.out.println("Result = " + (a*b));
                break;
            case '/':
                System.out.println("Result = " + (a/b));
                break;
            case '%':
                System.out.println("Result = " + (a%b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
```

**Logic Flow:**
1. Evaluate the expression in `switch()`
2. Match with corresponding `case` label
3. Execute code until `break` is encountered
4. If no match found, execute `default` block

**Important Points:**
- `break` is essential (prevents fall-through)
- Each `case` value must be unique
- `default` is optional but recommended

---

## Method Overloading

🎭 **Polymorphism** | 📚 **Same Name, Different Parameters** | 🔧 **Method Flexibility**

Method overloading allows multiple methods with the SAME NAME but DIFFERENT PARAMETERS.

### Concept
The compiler determines which method to call based on the number and type of arguments.

```java
class Overload {
    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method with two doubles
    double add(double a, double b) {
        return a + b;
    }
}
```

### Calling Overloaded Methods

```java
Overload obj = new Overload();

System.out.println(obj.add(5, 10));           // Calls 2-int version → 15
System.out.println(obj.add(5, 10, 15));       // Calls 3-int version → 30
System.out.println(obj.add(2.5, 3.5));        // Calls 2-double version → 6.0
```

### Rules for Method Overloading
- **Method name** must be SAME
- **Parameters** must be DIFFERENT
  - Different number of parameters
  - Different type of parameters
  - Different order of parameters

### Benefits
- **Improves readability**: Same operation, same method name
- **Easy to remember**: Don't need to remember different method names
- **Flexibility**: Call same method with different arguments

---

## Problem Solving

🧩 **Algorithm** | 🔍 **Logic** | 💡 **Real-World Application**

### 1. Palindrome Number

🔢 **Number Theory** | ↔️ **Reverse Logic** | 📖 **Classic Problem**

**Concept:** A number that reads the same forward and backward.

**Example:** 121 → Reversed: 121 → Palindrome ✓

**Algorithm:**
```
1. Store original number
2. Reverse the number by extracting digits
3. Compare reversed with original
4. If equal → Palindrome
5. If not equal → Not a Palindrome
```

**Code Logic:**
```java
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int Original = num;
        int reversed = 0;
        
        // Reverse the number
        while(num > 0) {
            int digit = num % 10;           // Extract last digit
            reversed = reversed * 10 + digit; // Add to reversed
            num = num / 10;                  // Remove last digit
        }
        
        // Check if palindrome
        if(Original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
```

**Step-by-Step Example (121):**
| Step | num | digit | reversed |
|------|-----|-------|----------|
| 1 | 121 | 1 | 1 |
| 2 | 12 | 2 | 12 |
| 3 | 1 | 1 | 121 |
| 4 | 0 | - | 121 |

Result: 121 == 121 → **Palindrome**

### 2. Armstrong Number

🔢 **Number Theory** | 🔲 **Power Calculation** | ⭐ **Special Numbers**

**Concept:** A number equal to the sum of its own digits raised to the power of the number of digits.

**Example:** 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✓

**Algorithm:**
```
1. Count number of digits
2. Calculate sum of each digit raised to power (number of digits)
3. Compare sum with original number
4. If equal → Armstrong Number
```

**Code Logic:**
```java
public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        int OriginalNum = num;
        int sum = 0;
        int count = 0;
        
        // Step 1: Count digits
        int temp = num;
        while(temp > 0) {
            count++;
            temp = temp / 10;
        }
        
        // Step 2: Calculate sum of digits^count
        temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum = sum + (int)Math.pow(digit, count);
            temp = temp / 10;
        }
        
        // Step 3: Check if Armstrong
        if(OriginalNum == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
```

**Step-by-Step Example (153):**

Counting digits:
- 153 → count = 3
- 15 → count = 2
- 1 → count = 1

Calculating sum:
- digit = 3 → 3³ = 27
- digit = 5 → 5³ = 125
- digit = 1 → 1³ = 1
- **sum = 27 + 125 + 1 = 153**

Result: 153 == 153 → **Armstrong Number**

**Other Armstrong Numbers:** 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407...

---

## Pattern Problems

🎨 **Nested Loops** | 🖼️ **Visual Design** | 📐 **Geometry**

Pattern printing combines loops to create visual designs.

### Concept
Use nested loops:
- **Outer loop**: Controls rows
- **Inner loop**: Controls columns

### Example: Triangle Pattern

```java
public class PatternsProblems {
    public static void main(String[] args) {
        // Triangle Pattern
        for(int i = 1; i <= 4; i++) {           // i rows
            for(int j = 1; j <= i; j++) {        // j columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```
*
* *
* * *
* * * *
```

**Logic Breakdown:**

| i (Rows) | j (Columns) | Output |
|----------|-------------|--------|
| 1 | 1 | * |
| 2 | 1,2 | * * |
| 3 | 1,2,3 | * * * |
| 4 | 1,2,3,4 | * * * * |

### More Pattern Examples

**Square Pattern (4x4):**
```java
for(int i = 1; i <= 4; i++) {
    for(int j = 1; j <= 4; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
Output:
```
* * * *
* * * *
* * * *
* * * *
```

**Pyramid Pattern:**
```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= 5-i; j++) {
        System.out.print(" ");
    }
    for(int k = 1; k <= 2*i-1; k++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
Output:
```
    *
   * * *
  * * * * *
 * * * * * * *
* * * * * * * * *
```

---

## Learning Progression Path

🎯 **Step-by-Step Journey** | 📈 **Difficulty Levels** | ✨ **Mastery Path**

Follow this sequence to master Core Java Basics:

1. **Start** → HelloWorld (understand program structure)
2. **Learn** → Features of Java (know language characteristics)
3. **Practice** → Variables & Data Types
4. **Understand** → Operators (arithmetic, logical, relational)
5. **Master** → Conditional Statements (if-else, switch, ternary)
6. **Practice** → Loops (for, while, do-while)
7. **Learn** → Methods (static, instance, parameters)
8. **Advance** → Method Overloading (polymorphism basics)
9. **Apply** → Problem Solving (palindrome, armstrong)
10. **Create** → Pattern Problems (nested loops)

---

## Tips for Better Learning

💡 **Study Tips** | 📚 **Best Practices** | 🎓 **Success Strategies**

1. **Practice Daily**: Code along with examples
2. **Understand Logic**: Don't just memorize syntax
3. **Debug Code**: Learn to use print statements for debugging
4. **Experiment**: Modify examples and observe results
5. **Solve Problems**: Try variations of examples
6. **Comment Code**: Explain your code logic
7. **Ask Questions**: Understand every concept deeply
8. **Review Code**: Read and understand others' code

---

## Common Mistakes to Avoid

⚠️ **Pitfalls** | 🚫 **Don'ts** | ✅ **Solutions**

| Mistake | Impact | Solution |
|---------|--------|----------|
| Forgetting `break` in switch | Fall-through execution | Always add `break` in each case |
| Off-by-one errors in loops | Skipping/extra iteration | Carefully set loop conditions |
| Confusing `++i` and `i++` | Wrong values in complex expressions | Use prefix for simple loops |
| Missing `main` method | Program won't run | Every app needs `main(String[] args)` |
| Not initializing variables | Compile error | Always initialize before use |

---

## Quick Reference

📋 **Cheat Sheet** | 🔍 **Quick Lookup** | 📖 **Reference Guide**

### Operator Precedence (High to Low)
1. Unary: `++`, `--`, `!`
2. Multiplicative: `*`, `/`, `%`
3. Additive: `+`, `-`
4. Relational: `<`, `>`, `<=`, `>=`
5. Equality: `==`, `!=`
6. Logical AND: `&&`
7. Logical OR: `||`
8. Ternary: `?:`
9. Assignment: `=`, `+=`, `-=`

### Variable Naming Conventions
- **Classes**: PascalCase (HelloWorld, Calculator)
- **Methods**: camelCase (greet, calculateSum)
- **Constants**: UPPER_SNAKE_CASE (MAX_SIZE, PI)
- **Variables**: camelCase (firstName, totalSum)

---

## Conclusion

🏆 **Final Thoughts** | 🚀 **Next Steps** | 💪 **Keep Learning**

Core Java Basics provide the foundation for advanced programming. Master these concepts thoroughly as they are building blocks for:
- Object-Oriented Programming (OOP)
- Data Structures and Algorithms
- Enterprise Development
- Android Application Development

Keep practicing and building projects! 🚀

---

**Last Updated:** 2026-06-06  
**Status:** ✅ Ready for GitHub Commit  
**Difficulty Level:** 🟢 Beginner-Friendly  
**Topics Covered:** 10  
**Code Examples:** 50+
