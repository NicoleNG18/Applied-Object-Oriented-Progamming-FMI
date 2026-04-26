Week 9 

Problem 1

Open the Modular Java project DrawingBoard (see attached DrawingBoard.rar)
in IntelliJ. Add module named model with package geometry to this project and create
the following classes in package geometry (the module requires access to JavaFX
controls):

• Create a module-info descriptor for this module and add statements allowing
access to JavaFX controls

• Write a class Point. It has an array of two integer data members- the x and y
coordinates. Define a full set of constructors (default, general purpose and a
copy constructor), set and get methods for the class data members, a set method
with a Point argument and a get method returning a Point object, as well as a
toString() method.

• Next, write a class Line. A Line is a Point sPoint and has a data member Point
ePoint denoting respectively the starting and the ending Point of the line. Define
a full set of constructors (default, general purpose and a copy constructor), set
and get methods for the class data members, as well as a toString() method (reuse
the toString() method defined for class Point). Write additionally a measure()
method returning the length of the Line. Write additionally a draw(Pane pane)
method allowing to draw this rectangle in the Container node of a JavaFX
Scene, referenced by pane

Finally, write a class Rectangle. Rectangle is a Point, which defines the upper
left corner and has a Point that defines the lower right corner of the rectangle.
Define a full set of constructors (default, general purpose and a copy
constructor), set and get methods for the class data members, as well as a
toString() method (reuse the toString() method defined for class Point). Write
additionally a measure() method returning the perimeter of the Rectangle. Write
additionally a draw(Pane pane) method allowing to draw this Rectangle in the
Container node of a JavaFX Scene, referenced by pane.