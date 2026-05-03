## Week 10 - Tasks

## Problem 1a: Geometry Inheritance and Sorting

### 1. Module `com.geometry.types`
**Package:** `com.geometry.types`

#### Inheritance Hierarchy
* **Point (Root)**: Implements `java.lang.Comparable`. Contains coordinates `mX` and `mY` (int).
* **Circle**: Inherits from `Point`. Adds `mRadius` (int).
* **Cylinder**: Inherits from `Circle`. Adds `mHeight` (int).

#### `compareTo(Object obj)` Implementation Logic
The implementation follows these mandatory steps:
1.  **Null Check**: If `obj` is null, `this` is greater (returns positive).
2.  **Type Check**: Uses `instanceof`. If types differ, `this` is greater.
3.  **Attribute Comparison**:
    * **Point**: P1 > P2 if P1.x > P2.x. If x is equal, then P1.y > P2.y.
    * **Circle**: C1 > C2 if center Point1 > Point2. If centers are equal, C1.radius > C2.radius.
    * **Cylinder**: Cy1 > Cy2 if base Circle1 > Circle2. If circles are equal, Cy1.height > Cy2.height.

---

### 2. Module `com.geometry.utils`
**Package:** `com.geometry.utils`

#### Selection Sort Algorithm
Class `SelectionSort` contains `public static void sortArray(Comparable[] arr)`. 
* **Algorithm**: Selection Sort.
* **Logic**: Repeatedly finds the minimum element from the unsorted part and swaps it with the element at the current starting position.

#### `SelectionSortTest` Application
* **Data Structure**: A static `Comparable[] arrComparable` with 9 elements.
* **Population**: 
    * 3 Points (Randomly generated in interval [10, 50])
    * 3 Circles (Using the points above, random radius in [10, 30])
    * 3 Cylinders (Using the circles above, random height in [10, 60])
* **Execution**: Sorts the array and displays objects using **Polymorphism** (Late Binding) via the overridden `toString()` method.

---

## Problem 2: Singleton Design Pattern

### Definition
A design pattern that restricts the instantiation of a class to one "single" instance and provides a global access point.

### Structural Requirements
* **Private Data Members**: For internal state.
* **Private Static Reference**: Stores the unique instance.
* **Private Constructor**: Prevents instantiation via the `new` keyword.
* **Public Static `getInstance()`**: Returns the unique instance, ensuring it is created only once.

### Verification
In the console application, compare two variables using `==` to verify they reference the same memory location.

---

## Problem 3a: Polymorphism and Method Overriding

### Scenario
1.  **Base Class**: `MethodA()` calls `MethodB()`.
2.  **Derived Class**: Inherits Base and overrides `MethodB()`.
3.  **Execution**: An object of `Derived` is upcast to `Base` type, and `MethodA()` is called.

### Result & Explanation
**Behavior**: The call to `MethodA()` will trigger the **Derived** class's version of `MethodB()`.

**Explanation**: This occurs due to **Late Binding** (Dynamic Method Dispatch). In Java, the method that gets executed is determined by the actual type of the object at runtime (Derived), regardless of the reference type (Base).