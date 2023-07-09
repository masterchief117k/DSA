package assingment_7;

public class prepQ {
    final int max = 4;
    int front = 0;
    int rear = 0;
    int arr[] = new int [max];
    public void enqueue(int val){
        if(rear == max){
         System.out.println("Queue is full ");
        }else{
            arr[rear]=val;
            rear++;
        }
    }
    public void dequeue(){
        if(front == rear){
        System.out.println("Queue is empty");
        }
        else{
            System.out.println("dequeue element is "+ arr[front]);
            front++;
        }
    }
    public void display(){
        System.out.println("The queue is ");
        for(int i = front ; i<rear; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
         prepQ q =new prepQ();
         q.enqueue(69);
         q.enqueue(99);
         q.enqueue(0);
         q.enqueue(23);
         //q.dequeue();
         q.display();
    }
}
