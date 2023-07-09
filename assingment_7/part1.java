package assingment_7;
public class part1{
   final int max = 5;
   int front ,reare = 0;
   int [] arr = new int[max];
   public void inqueue(int data){
      if( reare == max){
         System.out.println("the Q id full ");
      }else{
         arr[reare]=data;
         reare++;
      }
   }
   public void dequeue(){
     if(front==reare){
      System.out.println("The Q is empty");
     }else{
      System.out.println("The deleted element is "+arr[front]);
      front++;
     }
   }
   public void display(){
      for(int i=front; i<reare; i++){
         System.out.println(arr[i]);
      }
   }
   public static void main(String[]args){
      part1 p = new part1();
      p.inqueue(69);
      p.inqueue(90);
      p.inqueue(100);
      p.dequeue();
      p.display();
   }
}