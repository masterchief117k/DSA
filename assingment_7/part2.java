package assingment_7;
class node {
    int data;
    node next;
}
public class part2{
    node front , rear = null;
    public void enqueue(int data){
     node n = new node();
     n.data =data;                      
     n.next=null;
     if(front==null && rear==null){
       front = rear = n;
     }
     else{
        rear.next= n;
        rear=n;
     }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("The queue is empty");
        }
        else{
            front=front.next;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("The queue is empty");
        }else{
            node temp = front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[]args){
        part2 p = new part2();
        p.enqueue(99);
        p.enqueue(69);
        p.enqueue(2);
        p.dequeue();
        p.display();
    }
}