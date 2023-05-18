/*Question-6:   
    
Write a simple main class in Java that contains an experiment that uses the generic Box<T> 
class to build boxes with different types and that verifies that this class works as advertised. 
Your experiment should include the following: 
 
 Create a boxed String  object and two variables that refer to that box. Change the contents 
of one and determine the effect on the other. 
 
  Create  a  boxed  Integer  object  and  two  variables  that  refer  to  that  box.  Change  the 
contents of one and determine the effect on the other. 
 
  Create  a  boxed  Object  object  and  two  variables  that  refer  to  that  box.  Determine  what 
happens  if  you  put  a  string  in  the  box.  Determine  what  happens  if  you  put  an  integer  in 
the box.
 */
package Assingment_3;
public class Q_6 {

        public static void main(String[] args) {
            Box<String> stringBox = new Box<>("Hello World!");
            Box<String> stringBox2 = stringBox;
            System.out.println(stringBox.get()); // Hello World!
            System.out.println(stringBox2.get()); // Hello World!
            stringBox2.set("Goodbye World!");
            System.out.println(stringBox.get()); // Goodbye World!
            System.out.println(stringBox2.get()); // Goodbye World!
    
            Box<Integer> integerBox = new Box<>(1);
            Box<Integer> integerBox2 = integerBox;
            System.out.println(integerBox.get()); // 1
            System.out.println(integerBox2.get()); // 1
            integerBox2.set(2);
            System.out.println(integerBox.get()); // 2
            System.out.println(integerBox2.get()); // 2
    
            Box<Object> objectBox = new Box<>(new Object());
            Box<Object> objectBox2 = objectBox;
            System.out.println(objectBox.get()); // java.lang.Object@3b6eb2ec
            System.out.println(objectBox2.get()); // java.lang.Object@3b6eb2ec
            objectBox.set("Hello World!");
            System.out.println(objectBox.get()); // Hello World!
            System.out.println(objectBox2.get()); // Hello World!
            objectBox.set(1);
            System.out.println(objectBox.get()); // 1
        }
    }
    
    class Box<T> {
        private T t;
    
        public Box(T t) {
            this.t = t;
        }
    
        public T get() {
            return t;
        }
    
        public void set(T t) {
            this.t = t;
        }
    }


