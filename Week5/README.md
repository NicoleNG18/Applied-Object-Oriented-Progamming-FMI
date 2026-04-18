# Week 5 - Tasks

## Problem 1a: Card Shuffling and Dealing
Modify the application of Fig. 7.9-11 (see Lab5SampleCode.rar) to deal a five-card poker hand. Then modify class **DeckOfCards** of Fig. 7.10 to include methods that determine whether a hand contains:
* **a)** a pair
* **b)** two pairs
* **c)** three of a kind (e.g., three jacks)
* **d)** four of a kind (e.g., four aces)
* **e)** a flush (i.e., all five cards of the same suit)
* **f)** a straight (i.e., five cards of consecutive face values)
* **g)** a full house (i.e., two cards of one face value and three cards of another face value)

---

## Problem 1b: Simulation: Coupon Collector’s Problem
Coupon collector is a classic statistics problem with many practical applications. The problem is to pick objects from a set of objects repeatedly and find out how many picks are needed for all the objects to be picked at least once. 

**Task:** Write a program to simulate the number of picks needed to get four cards from each suit and display the four cards picked (assume a picked card is placed back in the deck before picking another).

---

## Problem 1c: Game: Pick Four Cards
Write a program that picks four cards from a deck of 52 cards and computes their sum. 
* **Values:** An Ace, King, Queen, and Jack represent 1, 13, 12, and 11, respectively. 
* **Goal:** Display the number of picks that yields the sum of 24.

---

## Problem 2a: Caesar Cipher
Напишете Java конзолно приложение за шифроване на текстов низ (plaintext) посредством алгоритъма на **Caesar cipher**. 
* **Алгоритъм:** Всяка буква се замества с буква, отстояща на дясно от нея на `SHIFT_LENGTH` позиции (циклично).
* **Пример:** Ако `SHIFT_LENGTH=3`, думата `TOY` става `WRB`.
* **Изисквания:** * Всички операции да се сведат до работа с масиви (`char[]`).
    * Използвайте единствено `toCharArray()` и конструктора `new String(char[])`. 
    * **Забранено** е използването на други методи на клас `String`.
    * Използвайте меню в текстов режим за избор на шифроване или дешифриране.

---

## Problem 2b: Transposition Cipher
Implement a simple transposition cipher. 
* **Encryption:** The plaintext is cut into series of characters equal to the cipher key (length of a key phrase). These are stored by rows of a matrix, and the ciphertext is read column by column.
* **Requirements:**
    * Create a class `TransCipher` with appropriate data, constructors, and methods.
    * Use only `toCharArray()` and `new String(char[])`. 
    * **DO NOT USE ANY OTHER STRING METHODS.**

---

## Problem 3: ZIP Code Barcode
За по-бързо сортиране на писма се използва бар-код за означаване на ZIP кода (3-цифрен). Всяка цифра се представя чрез 5-битов код с тегла `7 4 2 1 0`.

| Цифра | Код (7 4 2 1 0) |
| :--- | :--- |
| 1 | 0 0 0 1 1 |
| 2 | 0 0 1 0 1 |
| 3 | 0 0 1 1 0 |
| 0 | 1 1 0 0 0 |

**Task:**
1. Създайте клас `BarCode` със статична константа за таблицата.
2. Реализирайте метод `decode(int zipCode)`, който връща `String` (използвайте `:` за нула и `|` за единица). 
3. Пример за цифра 1: `: : : | |`.
4. Напишете приложение за тест, което приема 3-цифрен код и извежда баркода.

---

## Problem 4: Merge Two Sorted Lists
Write the following method that merges two sorted arrays into a new sorted array:
`public static int[] merge(int[] list1, int[] list2)`
* **Efficiency:** The implementation must take at most `list1.length + list2.length` comparisons.

---

## Problem 5: Algebra: Multiply Two Matrices
Write a method to multiply two $3 \times 3$ matrices:
`public static double[][] multiplyMatrix(double[][] a, double[][] b)`
* Each element $c_{ij}$ is the sum of the products of the elements in the corresponding row of $a$ and column of $b$.

---

## Problem 6: Shuffle Rows
Write a method that shuffles the rows in a two-dimensional `int` array using the following header:
`public static void shuffle(int[][] m)`
* **Test Case:** `int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};`

---

## Problem 7: Luhn Algorithm (Credit Card Validation)
Write a program that prompts the user for a credit card number (long integer) and validates it using the **Luhn check (Mod 10)**.

**Steps:**
1. Double every second digit from right to left. If doubling results in a two-digit number, sum the digits (e.g., $16 \rightarrow 1+6=7$).
2. Add all single-digit numbers from Step 1.
3. Add all digits in the odd places from right to left.
4. If the sum of Step 2 and Step 3 is divisible by 10, the card is valid.
**Constraints:** Use `toCharArray()` and `new String(char[])`. Avoid all other `String` methods.