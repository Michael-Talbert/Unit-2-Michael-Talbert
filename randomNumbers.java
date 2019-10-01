import java.util.Random;
public class randomNumbers{
  public static void main(String[] args){
    Random rand = new Random();

    System.out.println(rand.nextInt(10));

    System.out.println((rand.nextInt(10)+1));

    System.out.println((rand.nextInt(15)+20));

    System.out.println((rand.nextInt(20)-10));

    System.out.println(rand.nextDouble());

    System.out.println(rand.nextDouble()*6.0);

    System.out.println((int) (Math.random()*10));

    System.out.println((int) (Math.random()*10+1));

    System.out.println((int) (Math.random()*15+20));
  }

}
