/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;




class Book 
{
    String Auther;
    String Tittle;
    int Price;
    int Pages;
    int Stock;
    
    public void getDetails(String at, String tt,int pr,int pg,int st) 
    {
      Auther=at;
       Tittle=tt;
	Price=pr;
	Pages=pg;
	Stock=st;
    }
         public void showDetails()
         {
             System.out.println(" ");
             System.out.println(" Book Information ");
             System.out.println(" Book Auther: " + " John Cena " );
             System.out.println(" Book Tittle" + " All about Respect " );
             System.out.println(" Book Price" + " 420 " );
             System.out.println(" Number of pages " + " 120 " );
             System.out.println(" Book Stock " + " 40 " );
         }
}
    class HardwareBook extends Book
    {
        String HardCat;
	String Pub;
 
    public void getDetails()
    {
        super.getDetails(" John Cena " , " All about Respect ", 420 , 120 , 40);
        HardCat = " system ";
        Pub = " wwe ";
    }
    
        public void showDetails()
        {
            System.out.println(" Pub: " + Pub);
            System.out.println(" hardCat: " + HardCat);
            
        }
    
    }
     class SoftwareBook extends Book
 
    {
	double SoftVersion;
	String SoftName;
	public void getDetails()
        {
        super.getDetails(" Rock " , " All about Royalty " , 500, 225 , 80);
        
        SoftName = " Python " ;
        SoftVersion = 8.1 ;
        }
     
        public void showDetails()
        {
            super.showDetails();
            System.out.println("SoftName: "+"Rock");
            System.out.println("SoftVersion:" + "8.1");
            System.out.println("All about Royalty");
        }
     }
     class BookDemo
    {
        public static void main(String[] args) 
        {    
            SoftwareBook softDetails = new SoftwareBook(); 
            softDetails.getDetails();
            softDetails.showDetails();
            
            HardwareBook hardDetails = new HardwareBook(); 
            hardDetails.getDetails();
            hardDetails.showDetails();
        }
    }

            
       
       
   

