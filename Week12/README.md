## Week12 - Tasks

### Problem 1a

Revise the attached code for class GenericStack to implement it using an array rather
than an ArrayList<E>, where the type of the array elements are generics. Implement the
revised class GenericStack as a nested class of a class named GenericStackProvider.
Test the revised GenericStack class with different values of the generic parameterInteger, String. You should check the array size before adding a new element to the stack. If
the array is full, create a new array that doubles the current array size and copy the elements
from the current array to the new array.

### Problem 1b

The attached code for class GenericStack is implemented using composition of ArrayList.
Define a new GenericStack class that extends ArrayList as an inner static class of a class
GenericStackAsArrayListTest. Write a main() method in class
GenericStackAsArrayListTest program that prompts the user to enter five strings and
displays them in reverse order using the nested GenericStack class.