package ASSINGMENT_6;
class node {
    node next;
    int data;
}
public class sdemo2 {
    node head = null;
    public void push(int data){
       node n= new node();
       n.data = data;
       n.next=head;
       head = n;
    }
    public void pop(){
        if(head==null){
            System.out.println("the stack is empty");
        }
        else{
        System.out.println("The poped element is "+head.data);
        head = head.next;
        }
    }
    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        sdemo2 s = new sdemo2();
        s.push(89);
        s.push(99);
        s.push(78);
        s.pop();
        s.display();
    }
}
