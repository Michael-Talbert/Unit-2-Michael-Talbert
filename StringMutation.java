import java.util.*;


/**
 * Play with Strings
 *
 * @author Michael Talbert
 * @version 1.0
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String phrase= new String("Change is inevitable");
        int phrasreLength = phrase.length();
        System.out.println("phrase length is "+phrasreLength+"and the phrase is "+phrase);
       String mut1, mut2, mut3, mut4;

       mut1 = phrase +" except from vending machines";
       System.out.println(mut1);
       System.out.println("length of mut1 = "+ mut1.length());

       mut2 = mut1.toUpperCase();
       System.out.println(mut2);

       mut3 = mut2.replace("E","X");
       System.out.println(mut3);
    }
}
