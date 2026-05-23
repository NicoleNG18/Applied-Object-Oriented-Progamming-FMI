package problem4;

import java.util.*;

public class PriorityQueueTest
{
    static void main()
    {
        PriorityQueue< Double > queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer( 3.2 );
        queue.offer( 9.8 );
        queue.offer( 5.4 );

        System.out.print( "Polling from queue: " );

        while (!queue.isEmpty())
        {
            System.out.printf( "%.1f ", queue.peek() );
            queue.poll();
        }

    }
}


