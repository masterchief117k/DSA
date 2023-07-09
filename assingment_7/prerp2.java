package assingment_7;
class node{
    node next;
    int data;
}
public class prerp2 {
    node front , rear = null;
    public void enqueue(int data) {
       node n = new node();
       n.data = data;
       n.next=null;
       if(front == null && rear == null){
        front = rear = n;
       }
       else{
        rear.next=n;
        rear=n;
       }
    }
    public void dequeue(){
        if (front == null){
            System.out.println("The node queue  is empty");
        }else{
            System.out.println("The deleted node is "+front.data);
            front=front.next;
            if(front == null){
                rear=null;
            }
        }
    }
}
