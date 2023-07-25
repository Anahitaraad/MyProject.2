package my.exercise;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String arg = "mine";
        char charArg = 'm';
        String exe1 = "Anna";
        System.out.println("The length is:" + exe1.length() );
        String exe2 = "Long example sentence" ;
        System.out.println("The exe2 char 6th is:"+exe2.charAt(6));
        String exe3 = "Even longer example sentence" ;
        System.out.println("The number of char o is:" + exe3.indexOf('o') );
        String exe4 = "Ok this is not as long!" ;
        System.out.println("The new text is:"+ exe4.substring(11,22));
        String exe5 = "caps equals screaming";
        String exe6 = exe5.toUpperCase();
        System.out.println(exe6);
        String exe7 = exe6.toLowerCase();
        System.out.println(exe7);


    }
}
