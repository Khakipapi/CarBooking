import java.util.Scanner;

public class Main {

  static void main() {
    Scanner scanner = new Scanner(System.in);
    int input;
    do {
      try {

        menu();
        input = scanner.nextInt();

        switch (input){
          case 1:
            System.out.println("book");
            break;
          default: System.out.println("invalid entry ");
          break;
        }
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }while (input != 8);


  }

  public static void menu(){
    System.out.println("1 - Book Car");
    System.out.println("2 - Delete Booking");
    System.out.println("3 - View All User Booked Cars");
    System.out.println("4 - View All Bookings");
    System.out.println("5 - View Available Cars");
    System.out.println("6 - View Available Electric Cars");
    System.out.println("7 - View All Users");
    System.out.println("8 - Exit");
    System.out.print("Enter: ");

  }

}
