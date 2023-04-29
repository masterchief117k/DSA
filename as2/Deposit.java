package as2;

public class Deposit {
    Long principal;
    int Time;
    double rate;
    double Total_amount;

    public Deposit() {
    }

    public Deposit(long p, int t, double r) {
        this.principal = p;
        this.Time = t;
        this. rate = r;
    }

    public Deposit(long p, int t) {
        this.principal = p;
        this.Time = t;
    }

    public Deposit(long p, double r) {
        this.principal = p;
        this.rate = r;
    }

    public void Display() {
        System.out.println("The principle amount is " + principal + "\n Time is " + Time + " \n Rate is " + rate);
        System.out.println("The total amount is " + Total_amount);
    }

    public void cal_amt() {
        Total_amount = principal + (principal * rate * Time) / 100;
    }

    public static void main(String[] args) {
        Deposit d = new Deposit(134L, 3, 3.3);
        d.Display();
        d.cal_amt();
        Deposit d2 = new Deposit(134L, 3);
        d.Display();
        d.cal_amt();
        Deposit d3 = new Deposit(134L, 3.3);
        d.Display();
        d.cal_amt();
        
    }
}
