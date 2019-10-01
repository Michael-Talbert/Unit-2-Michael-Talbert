
/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main (String[] args){
        int sides = 7;
        int radius = 5;
        final double PI = 22/7;
        int a = 30;
        int b = 4;
        double y = 6.0;
        int c;
        double z;
        
        z = (double) a/b;
        System.out.println(z);
        System.out.println("A heptagon has "+ sides+" sides");
        System.out.println("A decagon has "+ (sides+3)+" sides");
        System.out.println("A dodecagon has "+ (sides+5)+" sides");
        System.out.println("The circumfrence of a circle with a radius of "+radius+" is "+(2*radius*PI));
        
        
    }
}