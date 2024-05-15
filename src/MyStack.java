/*
MyStack<E>()   Constructs a new stack with elements of type E 
push(val)      Places val on top of the stack
pop()          Removes top value from the stack and returns it; throws NoSuchElementException if stack is empty
peek()         Returns top value from the stack without removing it; throws NoSuchElementException if stack is empty
isEmpty()      Returns true if the stack has no elements
size()         Returns the number of elements in the stack
*/

import java.util.*;
import java.util.NoSuchElementException;

public class MyStack<E> {

   private ArrayList<E> stack; // null

   /**
    * Constructs an empty stack (null)
    */
   public MyStack() {
      stack = new ArrayList<>();
   }

   /**
    * Places value on top of the stack
    * @param val object to add
    */
   public void push(E val) {
      // places at the end of the arraylist
      stack.add(val);
   }

   /**
    * Return and remove the item on the top of the stack
    * the last item in the stack.
    * Throws NoSuchElementException if the stack is empty.
    * @return the item removed from the end of the list
    */
   public E pop() {
      // base case
      if (stack.isEmpty()) {
         throw new NoSuchElementException();
      }

      // return and remove the item at the end of the arraylist
      return stack.remove(stack.size()-1);
   }

   /**
    * returns the value at the top of the stack (but does not remove it)
    * throws NoSuchElementException if the stack is empty
    * @return the last item added to the stack (top of the stack)
    */
   public E peek() {
      if (stack.isEmpty()) {
         throw new NoSuchElementException();
      }

      return stack.get(stack.size()-1);
   }

   /**
    * returns true if the stack is empty, false otherwise
    * @return true if the stack is empty, false otherwise
    */
   public boolean isEmpty() {
      return stack.isEmpty();
   }

   /**
    * returns how many elements are in the stack
    * @return number of elements
    */
   public int size() {
      return stack.size();
   }
   
   public String toString() { return stack.toString();}

}