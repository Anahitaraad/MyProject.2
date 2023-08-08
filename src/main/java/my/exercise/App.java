package my.exercise;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        String arg = "mine";
        char charArg = 'm';

        String item1 = "Anna";
        System.out.println("The length of item1 is:" + item1.length() );
        String item2 = "Long example sentence" ;
        System.out.println("The item2's character 6th is:"+item2.charAt(6));
        String item3 = "Even longer example sentence" ;
        System.out.println("The number of character 'o' in item3 is:" + item3.indexOf('o') );
        String item4 = "Ok this is not as long!" ;
        System.out.println("The substring(11,12) of item4 is:"+ item4.substring(11,22)); //it divided text to the indexes number
        String item5 = "caps equals screaming";
        String item6 = item5.toUpperCase();
        System.out.println("The uppercase of item5 is: " + item6);
        String item7 = item6.toLowerCase();
        System.out.println("The lower case of item6 is: " + item7);
        String item8 = "Java is the worst programming language!";
        System.out.println("The new replacing text of item8 is:" + item8.replaceAll("worst","best"));
        String item9 = "\tJ\ta\tv\ta\t";
        System.out.println("The trim of item9 is: " + item9.trim()) ;
        // trim can work on reduce space
        String item10 = "20";
        System.out.println("The concat of item10 with 20 is:" + item10.concat("20"));//add sth
        String item11 = "oil and water";
        System.out.println("The substring of(0,10) item11 is: " + item11.substring(0,3));
        String item12 = "Carl,Susie,Fredrik,Bob,Erik";
        String[] arrayItem12 = item12.split(",");//divided the text by ','
        System.out.print("The split form by ',' in item12 is: ");
        for(int i=0; i<arrayItem12.length; i++){
            System.out.print(arrayItem12[i] + ' ' );
        }
        System.out.println();
        String item13 = "ThisShouldBe,Converted";
        char[] item13ToArr = item13.toCharArray();


        String inputString = "ThisShouldBe,Converted";
        char[] charArray = inputString.toCharArray();

        System.out.println("Original String: " + inputString);
        System.out.print("Char Array: [");

        for (int i = 0; i < charArray.length; i++) {
            System.out.print("'" + charArray[i] + "'");
            if (i < charArray.length - 1) {
                    }
                }

        System.out.println("]");
        

        System.out.println();
        char[] item14 = {'J','A','V','A'};
        String item14Str = "  ";
        for(int i=0; i<item14.length; i++){
            item14Str += item14[i];
        }
        System.out.println(item14Str);

    }
}
