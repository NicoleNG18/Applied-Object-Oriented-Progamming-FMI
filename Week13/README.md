## Week 13

### Задача 1

Напишете class ArrayListTest за тестване на следните методи.
a) метод, който връща най- големия елемент в двумерен масив.
public static <E extends Comparable<E>> E max(E[][]
list)

b) метод, който разбърква по произволен начин (shuffles) елементите .на
ArrayList:
public static <E> void shuffle(ArrayList<E> list)

c) метод, който връща най- големия елемент на ArrayList:
public static <E extends Comparable<E>> E
max(ArrayList<E> list)

d) метод, който връща нов ArrayList. Новият списък на съдържа само
различните елементи от подадения като параметър списък .
public static <E> ArrayList<E>
removeDuplicates(ArrayList<E> list)

### Задача 2

Да предположим, че данната list в class ArrayListTest от Задача 2.1 е
списък съдържащ низовете Лили, Мария, Георги, Илия, Цвета, Георги.

d) Нека aList и bList са ArrayList от String елементи.
Използвайте два итератора за намиране и извеждане на общите елементи
в двата списъка без да променяте съдържанието на изходните списъци
aList и bList

e) Нека list е данната на class ArrayListTest инициализиран, както в
условие(а). Използвайте ListIterator<String> nameIterator , за да
напишете командите за добавяне на низа Симеон след първото
появяване на Георги в list

### Задача 4

При извеждане на крайните резултати в Fig. 19.17 (PriorityQueueTest) се
вижда, че PriorityQueue сортира Double елементите във възходящ ред.
Пренапишете Fig. 19.17 така че да сортира Double елементите в низходящ
ред.

Упътване: Използвайте приложения код на Fig. 19.17 (fig19_17.rar)

Fig19.17
```java
// Fig. 19.17: PriorityQueueTest.java
// Standard library class PriorityQueue test program.
import java.util.PriorityQueue;

public class PriorityQueueTest 
{
   public static void main( String args[] ) 
   {
      // queue of capacity 11
      PriorityQueue< Double > queue = new PriorityQueue< Double >();

      // insert elements to queue
      queue.offer( 3.2 );
      queue.offer( 9.8 );
      queue.offer( 5.4 );

      System.out.print( "Polling from queue: " );

      // display elements in queue
      while ( queue.size() > 0 )
      {
         System.out.printf( "%.1f ", queue.peek() ); // view top element
         queue.poll(); // remove top element
      } // end while
   } // end main
} // end class PriorityQueueTest
```
### Задача 6

Напишете приложение което създава TreeMap<String, String>
teams, която съдържа следните двойки (ключ- стойност) от град и клуб на
отбор от този град.
San Francisco Forty-niners
Chicago Bears
Denver Broncos
Seattle Seahawks
Detroit Lions
Miami Dolphins
Изпълнете следните операции.

a) Изведете броят на елементите в изображението TreeMap<String,
String> teams и името на отбора от Chicago.

b) Променете името на отбора от San Francisco да бъде "Niners".

c) Отговорете н авъпроса, дали San Diego има отбор въведен в
съответствието TreeMap<String, String> teams .

d) Изтрийте Denver от съответствието TreeMap<String, String> teams.

e) Въведете отбора Cowboys на Dallas в съответствието
TreeMap<String, String> teams 

f) Изведете на стандартен изход полученото съответствие
TreeMap<String, String> teams.

g) Изведете на стандартен изход ключовете и стойностите на полученото
съответствие TreeMap<String, String> teams, сортирани в
низходящ ред на стойностите т.е. имената на клубовете на отборите,
заедно с градовете на тези клубове.
