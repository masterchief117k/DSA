/*Question-8: 
 
Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person 
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person.
 */

 interface detailedinfo{
    void display();
    void count();
}

class Person implements detailedinfo{
    private static int maxcount=0;
    private String name;
    public Person(String name){
        this.name=name;
        maxcount++;
    }
    public void display(){
        System.out.println("The name of the user is "+name+" The maximum user are"+maxcount );
        
    }
    public void count(){
        int count=0;
        for (int i=0; i<name.length(); i++){
         count++; 
    }
    System.out.println("The max numeber of charecter in the users name is "+count);
     
}
}
 public class main{
    public static void main(String args[]){
        Person p1=new Person("Rahul");
       p1.count();
       p1.display();
       Person p2=new Person("Rahul");
       p2.count();
       p2.display();
       Person p3=new Person("Rahul");
        p3.count();
        p3.display();
        
    }
 }
