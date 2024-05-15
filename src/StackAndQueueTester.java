import java.util.*;

/**
 * This class will generate random integers to add to a Stack and Queue
 * and facilitate testing the structures
 */
public class StackAndQueueTester {
   private static final int UPPER_BOUND = 1000;

   public static void main(String[] args) {
      //MyStack<Integer> stack = new MyStack<>();
      Stack<Integer> stack = new Stack<>();

      //MyQueue<Integer> queue = new MyQueue<>();
      Queue<Integer> queue = new LinkedList<>();

      Scanner console = new Scanner(System.in);
      
      String action = "";

      do {
         System.out.print("add, remove, peek, or end? > ");

         action = console.nextLine().toLowerCase();

         if(action.startsWith("a")) {

            // generate a random number to place on stack and queue
            int x = new Random().nextInt(UPPER_BOUND) + 1;

            // push onto stack
            stack.push(x);

            // add to end of queue
            queue.add(x);
         }
         else if(action.startsWith("r")) {
            // remove last in from stack
            stack.pop();

            // remove first in from queue
            queue.remove();
         }else if(action.startsWith("p")) {
            // peek at top of the stack
            if(!stack.isEmpty()) {
               System.out.println("stack peek = " + stack.peek());
            } else {
               System.out.println("stack peek = stack is empty");
            }

            // peek at front of the queue
            System.out.println("queue peek = " + queue.peek());
         }
         // prints out stack from bottom ---> top
         System.out.println("stack size: " + stack.size()+ " = " + stack);

         // prints out queue from front --> back
         System.out.println("queue size: " + queue.size()+ " = " + queue);

      } while(action.startsWith("a") || action.startsWith("r") || action.startsWith("p"));
   
   }

}