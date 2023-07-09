package ASSINGMENT_6;

public class stackdemo {
final int max = 3;
 int arr [] = new int [max]; 
 int top = -1 ;
  public void push(int data){
    if(max-1 == top){
        System.out.println("The stack is full");
    }
    else{
        ++top;
        arr[top] = data;
    }
  }
  public void pop(){
    if(top == -1){
        System.out.println("The stack is empty");
    }else{
        System.out.println("the deleted element in stack is "+arr[top]);
        top--;
    }
    
  }
  public void display(){
     for(int i=0; i<=top; i++){
        System.out.println(arr[i]);
     }   
    }
  public static void main(String[] args){
    stackdemo s = new stackdemo();
    s.push(99);
    s.push(44);
    s.push(67);
    s.pop();
    s.display();
  }
}
