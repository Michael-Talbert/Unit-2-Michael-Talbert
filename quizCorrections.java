

public class quizCorrections{

  public static void main(String[] args){

    String firstName = "Sofia";

    String middleName = "Maria";

    String lastName = "Hernandez";

    String firstInt = firstName.substring(0, 1);

    String secondInt = middleName.substring(0, 1);

    String thirdInt = lastName.substring(0, 1);

    String initials = (firstInt + secondInt + thirdInt);

    initials = initials.toLowerCase();

    System.out.println(initials);

  }

}
