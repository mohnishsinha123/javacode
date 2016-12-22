/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author UCSCMH_NS159818
 */
public class PatternException extends RuntimeException
{
    public PatternException()
    {
        System.out.println("Invalid Pattern for Employee ID...");
    }
    public  PatternException(String msg)
    {
        super(msg);
    }
}
