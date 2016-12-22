/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballmasterlist;

/**
 *
 * @author UCSCMH_NS159818
 */
public class FootballTeam implements Comparable
{
 private String name;
 private int age, n_Match, n_Goal, rank;
 
 public FootballTeam(String nm, int ag, int n_M, int n_G, int rk);
    {
        String nm = null;
     this.name = nm;
        int ag = 0;
     this.age = ag;
        int n_M = 0;
     this.n_Match = n_M;
        int n_G = 0;
     this.n_Goal = n_G;
        int rk = 0;
     this.rank = rk;
    }
    public int getRank()
    {
        return rank;
    }
    public int compareTo(Object obj)
    {
        FootballTeam ft = (FootballTeam) obj;
        
        if(this.rank > ft.getRank())
        {
            return 1;
        }
        else if (this.rank < ft.getRank())
        {
            return -1;
        }
        else{return 0}
    }
}
public String toString()
{
StringBuffer  buffer = new StringBuffer();
buffer.append()
}
