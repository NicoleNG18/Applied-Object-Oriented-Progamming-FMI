# Week 6 - Tasks

## Task 1: Recursive Euclidean Algorithm (JavaFXML)
**Objective:** Implement the Euclidean algorithm for finding the Greatest Common Divisor (GCD) using recursion and visualize it through a JavaFX application.

**Problem Description:**
The Euclidean algorithm can be visualized as tiling an `a-by-b` rectangle with square tiles:
1. Assume `a` is the larger dimension.
2. Attempt to tile the rectangle with `b-by-b` square tiles.
3. This leaves an `(a mod b)-by-b` residual rectangle.
4. Continue the process by tiling the residual rectangle with squares of the smaller dimension.
5. The sequence ends when a square tile covers the previous residual rectangle exactly. The side length of this smallest square is the **GCD**.

**Requirements:**
- Create a **JavaFX (FXML)** application.
- Implement a **recursive method** for the GCD calculation: `gcd(a, b)`.
- UI: Two input fields for integers, a button to compute, and a display area for the result.

---

## Task 2a: Recursive Permutations of Distinct Elements (Console)
**Objective:** Write a recursive method to generate all unique permutations of an array of distinct integers.

**Problem Description:**
Given an array of 4 randomly generated distinct single-digit integers (e.g., `<2, 3, 5, 7>`), compute all possible permutations.

**Requirements:**
- **No FXML** (Console Application).
- Use a **recursive method** to generate permutations.
- Ensure each permutation appears exactly once in the output.
- Input: Array of 4 random distinct single-digit integers.

---

## Task 2b: Recursive Permutations with Duplicates (Console)
**Objective:** Solve the permutation problem when the input array contains duplicate elements.

**Problem Description:**
If the input array contains duplicates (e.g., `A = <2, 2, 3, 0>`), the program must generate all unique permutations without repeats.

**Example:**
For `<2, 2, 3, 0>`, the output should include:
`<2, 2, 0, 3>, <2, 2, 3, 0>, <2, 0, 2, 3>, <2, 0, 3, 2>, <2, 3, 2, 0>, <2, 3, 0, 2>, <0, 2, 2, 3>, <0, 2, 3, 2>, <0, 3, 2, 2>, <3, 2, 2, 0>, <3, 2, 0, 2>, <3, 0, 2, 2>`.

**Requirements:**
- **No FXML** (Console Application).
- The algorithm must handle duplicates and avoid generating the same permutation multiple times.
- Implement using **Recursion** and **Backtracking** best practices.