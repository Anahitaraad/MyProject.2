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
        String exe8 = "Java is the worst programming language!";
        System.out.println("The new replacing text is:" + exe8.replaceAll("worst","best"));
        String exe9 = "\tJ\ta\tv\ta\t";
        System.out.println(exe9.trim()) ;
        // trim can work on reduce space
        String exe10 = "20";
        System.out.println(exe10.concat("20"));
        String exe11 = "oil and water";
        System.out.println(exe11.substring(0,3));
        String exe12 = "Carl,Susie,Fredrik,Bob,Erik";
        String[] arrayExe12 = exe12.split(",");
        for(int i=0; i<arrayExe12.length; i++){
            System.out.println(arrayExe12[i] + " ");
        }
        String exe13 = "ThisShouldBeConverted";
        char[] exe13ToArr = exe13.toCharArray();

        for(int i=0; i<exe13ToArr.length; i++){
            System.out.print(exe13ToArr[i] );
        }

        System.out.println();

        char[] exe14 = {'J','A','V','A'};
        String exe14Str = "";
        for(int i=0; i<exe14.length; i++){
            exe14Str += exe14[i];
        }
        System.out.println(exe14Str);


    }
}
