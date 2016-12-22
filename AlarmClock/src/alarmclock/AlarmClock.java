package alarmclock;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlarmClock 
{
    private Pattern pattern;
    private Matcher matcher;
    private static final String TIME12HOURS_PATTERN = 
            "(2[012]|[1-9]) : [0-5][0-9](\\s)?(?i)(am|pm)";
    
    public AlarmClock()
    {
        pattern = Pattern.compile(TIME12HOURS_PATTERN);
    }
    public boolean validate (final String time)
    {
        matcher = pattern.matcher(time);
        return matcher.matches();
    }

    public static void main(String[] args) 
    {
     Scanner sc = new Scanner(System.in);
     String time;
     boolean status;
     
        System.out.println("Enter the Alarm Time");
        time = sc.next();
        
        AlarmClock ac = new AlarmClock();
        status = ac.validate(time);
        
        if(status==true)
        {
            System.out.println("Correct Time");
        }
        else 
        {
            System.out.println("Incorrect Time");   
        }
    }
    
}
