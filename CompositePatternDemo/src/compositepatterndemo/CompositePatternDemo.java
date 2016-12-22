


package compositepatterndemo;


public class CompositePatternDemo 
{  
    public static void main(String args[]){  
         Employee emp1=new Cashier(007,"James Bond", 2000000.0);  
         Employee emp2=new Cashier(777,"George Bush", 2500000.0);  
         Employee emp3=new Accountant(786,"Salman Khan", 3000000.0);   
         Employee manager1=new BankManager(143,"Ashwani Priya",1000000.0);  
            
          manager1.add(emp1);  
          manager1.add(emp2);  
          manager1.add(emp3);  
          manager1.print();  
        }  
}  