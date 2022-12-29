import java.util.Scanner;
import java.util.Random;

public class diceroll{
  public static void main(String [] args){
    Random m_engine = new Random();
    Scanner io = new Scanner(System.in);
    boolean contFlag = true;
    do{
      System.out.println("Continue? Y/N");
      String b = io.nextLine();
      if(b.equalsIgnoreCase("Y")){
        int die1 = m_engine.nextInt(6)+1;
        int die2 = m_engine.nextInt(6)+1;
        double root1 = Math.sqrt(die1);
        double root2 = Math.sqrt(die2);
        double c1 = Math.ceil(root1);
        double c2 = Math.ceil(root2);
        System.out.println("The first die had a value of " +die1+ ", a square root of " +root1+ ", ceiling of " +c1);
        System.out.println("The second die had a value of " +die2+ ", a square root of " +root2+ ", ceiling of " +c2);
      }
      else{
        contFlag = false;
      }
    }while(contFlag);
    io.close();
  }
}
