import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Store{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    DecimalFormat fmt = new DecimalFormat("00.");
    //declaring all magic numbers
    final double PEANUT_PRICE = 1.72;
    final double BOOK_PRICE = 9.0;
    final double MOVIE_PRICE = 13.97;
    final double BOOK_SHIPPING = 0.95;
    final double MOVIE_SHIPPING = 0.04;
    final double PEANUT_SHIPPING = 0.30;
    final double SALES_TAX = 0.072;
    final String storeName= new String("Steve's SuperStore");

    //welcome display
    System.out.println("Welcome to "+storeName);

    //Ask for cahier name
    System.out.println("Please enter your name");
        String cashierName = scan.nextLine();

    //asking and recieving number of each item
    System.out.println("Please enter the number of books:");
        int bookNum = scan.nextInt();
    System.out.println("Please enter the number of movies:");
        int movieNum = scan.nextInt();
    System.out.println("Please enter the number of pounds of peanuts;");
      double peanutNum = scan.nextDouble();

    //Subtotals
    double bookSubtotal = bookNum*BOOK_PRICE;
    System.out.println("bookSub: "+bookSubtotal);
    double movieSubtotal = movieNum*MOVIE_PRICE;
    System.out.println("movieSub: "+movieSubtotal);
    double peanutSubtotal = peanutNum*PEANUT_PRICE;
    System.out.println("peanutSub: "+peanutSubtotal);
    double subtotal = ((double)Math.round((bookSubtotal+movieSubtotal+peanutSubtotal)*100))/100;
    System.out.println("Sub: "+subtotal);

    //shipping cost
    double shipping = ((double)Math.round(((bookNum*BOOK_SHIPPING)+(movieSubtotal*MOVIE_SHIPPING)+
    (peanutNum*PEANUT_SHIPPING))*100))/100;
    System.out.println("ship: "+shipping);

    //sales tax
    double tax = ((double)Math.round((bookSubtotal+movieSubtotal)*SALES_TAX*100))/100;
    System.out.println("tax: "+tax);

    //grand total
    double total = ((double)Math.round((subtotal+shipping+tax)*100))/100;
    System.out.println("total: "+total);

    //time o' day
    int hour = (int)(Math.random()*24);
    int minute = (int)(Math.random()*60);
    System.out.println(hour);
    System.out.println(minute);
    String time = new String(hour+" : "+fmt.format(minute));
    System.out.println(time);



    //Final Recipt
    System.out.println("Steve's SuperStore");
    System.out.println();
    System.out.println("Helped By: "+cashierName);
    System.out.println("-----------------------");
    System.out.println("Item  Price");
    System.out.println("Books "+bookSubtotal);
    System.out.println("Peanuts "+peanutSubtotal);
    System.out.println("Movies "+movieSubtotal);
    System.out.println("Subtotal: "+subtotal);
    System.out.println("Shipping: "+shipping);
    System.out.println("Taxes: "+tax);
    System.out.println("Total: "+total);
    System.out.println("-----------------------");
    System.out.println("");
    System.out.println("+++++++++++++++++++++++");
    System.out.println(" Thank you shopping at ");
    System.out.println("  Steve's SuperStore  ");
    System.out.println("+++++++++++++++++++++++");
    System.out.println("");
    System.out.println("-----------------------");
  }
}
