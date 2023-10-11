// File: ShortLinkedQueue.java from the package edu.colorado.collections
// Complete documentation is available from the ShortLinkedQueue link in:
//   http://www.cs.colorado.edu/~main/docs/

package edu.colorado.collections;

import java.util.NoSuchElementException;
import edu.colorado.nodes.ShortNode;

/******************************************************************************
* A <CODE>ShortLinkedQueue</CODE> is a queue of short values.
*
* <b>Limitations:</b>
*   Beyond <CODE>Int.MAX_VALUE</CODE> items, <CODE>size</CODE> is wrong. 
*
* <b>Java Source Code for this class:</b>
*   <A HREF="../../../../edu/colorado/collections/ShortLinkedQueue.java">
*   http://www.cs.colorado.edu/~main/edu/colorado/collections/ShortLinkedQueue.java
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version Feb 10, 2016
*
* @see ShortQueue
* @see ObjectLinkedQueue
* @see BooleanLinkedQueue
* @see ByteLinkedQueue
* @see CharLinkedQueue
* @see DoubleLinkedQueue
* @see FloatLinkedQueue
* @see IntLinkedQueue
* @see LongLinkedQueue
******************************************************************************/
public class ShortLinkedQueue implements Cloneable
{
   // Invariant of the ShortLinkedQueue class:
   //   1. The number of items in the queue is stored in the instance variable
   //      manyNodes.
   //   2. The items in the queue are stored in a linked list, with the front 
   //      of the queue stored at the head node, and the rear of the queue at 
   //      the final node.
   //   3. For a non-empty queue, the instance variable front is the head 
   //      reference of the linked list of items and the instance variable rear
   //      is the tail reference of the linked list. For an empty queue, both 
   //      front and rear are the null reference.
   private int manyNodes;
   ShortNode front;
   ShortNode rear;


   /**
   * Initialize an empty queue.
   * <b>Postcondition:</b>
   *   This queue is empty.
   **/   
   public ShortLinkedQueue( )
   {
      front = null;
      rear = null;
   }

   
   /**
   * Generate a copy of this queue.
   * @return
   *   The return value is a copy of this queue. Subsequent changes to the
   *   copy will not affect the original, nor vice versa. Note that the return
   *   value must be type cast to an <CODE>ShortLinkedQueue</CODE> before it can be used.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for creating the clone.
   **/ 
   public Object clone( )       
   {  // Clone an ShortLinkedQueue.
      ShortLinkedQueue answer;
      ShortNode[ ] cloneInfo;
      
      try
      {
         answer = (ShortLinkedQueue) super.clone( );
      }
      catch (CloneNotSupportedException e)
      { 
         // This exception should not occur. But if it does, it would probably indicate a
         // programming error that made super.clone unavailable. The most comon error
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
         ("This class does not implement Cloneable");
      }
      
      cloneInfo = ShortNode.listCopyWithTail(front);
      answer.front = cloneInfo[0];
      answer.rear = cloneInfo[1];
      
      return answer;
   }        

 
   /**
   * Get the front item, removing it from this queue.
   * <b>Precondition:</b>
   *   This queue is not empty.
   * @return
   *   The return value is the front item of this queue, and the item has
   *   been removed.
   * @exception NoSuchElementException
   *   Indicates that this queue is empty.
   **/    
   public short getFront( )
   {
      short answer;

      if (manyNodes == 0)
         // NoSuchElementException is from java.util and its constructor has no argument.
         throw new NoSuchElementException("Queue underflow");
      answer = front.getData( );
      front = front.getLink( );
      manyNodes--;
      if (manyNodes == 0)
         rear = null;
      return answer;
   }
   
   
   /**
   * Put a new a new item in this queue. 
   * @param item
   *   the item to be pushed onto this queue 
   * <b>Postcondition:</b>
   *   The item has been pushed onto this queue.
   * @exception OutOfMemoryError
   *   Indicates insufficient memory for increasing the queue's capacity.
   * <b>Note:</b>
   *   An attempt to increase the capacity beyond
   *   <CODE>Integer.MAX_VALUE</CODE> will cause the queue to fail with an
   *   arithmetic overflow.
   **/    
   public void insert(short item)
   {
       if (isEmpty( ))
       {  // Insert first item.
	  front = new ShortNode(item, null);
	  rear = front;
       }
       else
       {  // Insert an item that is not the first.
          rear.addNodeAfter(item);
          rear = rear.getLink( );          
       }
       manyNodes++;
   }
              

   /**
   * Determine whether this queue is empty.
   * @return
   *   <CODE>true</CODE> if this queue is empty;
   *   <CODE>false</CODE> otherwise. 
   **/
   public boolean isEmpty( )
   {
      return (manyNodes == 0);
   }


   /**
   * Accessor method to determine the number of items in this queue.
   * @return
   *   the number of items in this queue
   **/ 
   public int size( )   
   {
      return manyNodes;
   }

}
