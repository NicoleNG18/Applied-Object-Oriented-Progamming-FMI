## Week 1 - Tasks
---

### 1. Temperature Converter 
Write an application to:
* **a)** Compute and output the celsius equivalent of an input Fahrenheit temperature, using the calculation:  
  `C = 5.0 / 9.0 * ( F - 32 );`
* **b)** Compute and output Fahrenheit the equivalent of an input celsius temperature, using the calculation:  
  `F = 9.0 / 5.0 * C + 32;`
* **c)** Use the methods from parts (a) and (b) to write an application that enables the user either to enter a Fahrenheit temperature and display the Celsius equivalent or to enter a Celsius temperature and display the Fahrenheit equivalent.
---

### 2. Palindrome Validator
Write code that inputs a five-digit number. Display an error message if the number is not five digits. Write code that separates the digits in the five digit number. Store the original value of number in variable `originalNumber` before performing calculations. Write code that determines whether the first and last digits are identical and the second and fourth digits are identical. Assign `resultString` a string indicating whether or not the original string is a palindrome.

---

### 3. Data Encryptor
A company wants to transmit data over the telephone, but they are concerned that their phones may be tapped. All their data is transmitted as four-digit Integers. They have asked you to write a program that encrypts their data so that it may be transmitted more securely. 

* **Encryption:** Your program should read a four-digit Integer entered by the user and encrypt it as follows: Replace each digit by (the sum of that digit plus 7) modulo 10. Then swap the first digit with the third, and swap the second digit with the fourth. Print the encrypted Integer. 
* **Decryption:** Write a separate program that inputs an encrypted four-digit Integer and decrypts it to form the original number.

---

### 4. Nucleotide Decryptor
A four-digit number $N$ is used to store genetic information about the four nucleotide bases denoted by each one of the A, C, G and T in terms of the powers of the digit 4. Let:

$$N = \sum_{i=0}^{n} k_i 4^i$$

where $k_i \in [0, 3]$. Assume, the digits 0, 1, 2, 3 denote the characters ‘A’, ‘C’, ’G’, ‘T’ of the four nucleotide bases. Write a Java application that reads a four digit integer number and outputs its representation in terms of the characters ‘A’, ‘C’, ’G’, ‘T’.

---

### 5. Character Representation
In this lecture, you learned about integers and the type `int`. Java can also represent uppercase letters, lowercase letters and a considerable variety of special symbols. Every character has a corresponding integer representation. The set of characters a computer uses together with the corresponding integer representations for those characters is called that computer’s character set. You can indicate a character value in a program simply by enclosing that character in single quotes, as in ‘A’.

Write an application that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols. Display the integer equivalents of the following: 
`A`, `B`, `C`, `a`, `b`, `c`, `0`, `1`, `2`, `$`, `*`, `+`, `/` and the `blank character`.
