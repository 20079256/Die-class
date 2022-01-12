import java.util.*;
class Main {
  public static void main(String[] args) {
    Die d1=new Die();
    Die d2 = new Die();
    Scanner it = new Scanner (System.in);
    boolean ans=d1.equals(d2);
    System.out.println("Are d1 and d2 equals? "+ans);
    System.out.println(d1);
    System.out.println(d1.roll());
    System.out.println(d1);
    System.out.println("Are d1 and d2 equals? "+d1.equals(d2));
    Die d3 = new Die (1,20);
    d3.roll();
    System.out.println("d3: "+d3);
    d3.roll();
    System.out.println("d3: "+d3);
    System.out.println("Are d1 and d3 equal? "+d1.equals(d3));
    System.out.println("Please enter the amount of rolls");
int num =it.nextInt();
TwoDieGames p = new TwoDieGames(num);
p.snakeEyes();
  }
} 