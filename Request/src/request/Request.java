/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package request;
import java.util.ArrayDeque;
/**
 *
 * @author UCSCMH_NS159818
 */
public class Request 
{
    ArrayDeque<String> pool;
    
    public Request ()
    {
        pool = new ArrayDeque<>();
    }
    public void initRequest(String A, String B)
    {
        String ID = A;
        String Prb = B;
        
        String rqt = "Employee ID : " + ID + "\nProblem: " + Prb;
        pool.add(rqt);
    }
    
    public void dispRequest()
    {
        System.out.println("Loading....");
        System.out.println("----REQUEST POOL----\n");
        
        if (pool.isEmpty()== true)
        {
            System.out.println("Currently there are no Request in the pool.");
        }
        else 
        {
            pool.stream().map((s) -> {
                System.out.println(s);
                return s;
            }).forEachOrdered((_item) -> {
                System.out.println("-----");
            });
        }
        
    }
    public void attdRequest()
    {
        String Status;
        if (pool.isEmpty()== true)
        {
            System.out.println("Loading....");
            System.out.println("Currently there are no Request in the pool.");
            
        }
        else
        {
            System.out.println("LOADING....");
            System.out.println("You Need to Resolve the Following Problem:");
            System.out.println(pool.getFirst());
            
            Status = "R";
            
            if(Status.toUpperCase().equals("R"))
            {
                System.out.println("LOADING....");
                System.out.println("The following Problem has been Resolved:");
                System.out.println(pool.getFirst());
                pool.remove();
            }
            else if(Status.toUpperCase().equals("P"));
            {
                System.out.println("LOADING...");
                System.out.println("Please Resolve the Proiblem ASAP.");
            }
                        
            {
                    Status = "N";
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
     Request rq = new Request();
     rq.initRequest("1234" , " System is Not Working ");
     rq.initRequest("1252", "Internet is not Working");
     rq.dispRequest();
     rq.attdRequest();// TODO code application logic here
    }
    
}
