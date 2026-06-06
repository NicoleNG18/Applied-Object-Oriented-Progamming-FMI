# Week 15

## Problem 1

Use the class Invoice provided with the sample code in the Lab folder to create an array
of Invoice objects.
Use the sample data shown below.
Class Invoice includes four properties- a partNumber (type int), a partDescription
(type String), a quantity of the item being purchased (type int) and a price (type
double). 

Perform the following queries on the array of Invoice objects and display the results using only Stream API:

a) Use lambdas and streams to sort the Invoice objects by partDescription, then display
the results.

b) Use lambdas and streams to sort the Invoice objects by price, then display the results.

c) Use lambdas and streams to map each Invoice to its partDescription and
quantity, sort the results by quantity, then display the results.

d) Use lambdas and streams to map each Invoice to its partDescription and the value of
the Invoice (i.e., quantity * price). Order the results by Invoice value.

e) Modify Part (d) to select the Invoice values in the range $200 to $500.

f) Group the Invoice values into two sets of Invoices- Invoices with values (quantity *
price) below of equal to $300 and Invoices with values above $300.

g) Create a Map<String, Invoice>, where the Key id the hashcode of the Value. Add the elements of the above created array to this Map and output the elements of the map sorted in decreasing order of the price.