/**
 * Created by Jc337839 on 28/08/17.
 */
import javax.swing.*;
public class CondoSales2
{
    public static void main(String[] args)
    {
        String park = "$150,000";
        String golf = "$175,000";
        String lake = "$210,000";
        String input;
        int number, garage;
        input = JOptionPane.showInputDialog(null, "Choose\n1 - park view\n2 - " +
                "golf course view\n3 - lake view");
        number = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null, "Choose\n1 - garage" +
                "\n2 - parking space");
        garage = Integer.parseInt(input);
        if(garage == 1)
            switch (number)
            {case 1:
                    System.out.println("Park View condos are " + park + " plus $5000 for garage");
                    break;
                case 2:
                    System.out.println("golf course view condos are " + golf + " plus $5000 for garage");
                    break;
                case 3:
                    System.out.println("lake view condos are " + lake + " plus $5000 for garage");
                    break;
                default:
                    System.out.println("price is $0");
            }
        else
            switch (number)
            {
                case 1:
                    System.out.println("Park View condos are " + park + " with parking space");
                    break;
                case 2:
                    System.out.println("golf course view condos are " + golf + " with parking space");
                    break;
                case 3:
                    System.out.println("lake view condos are " + lake + " with parking space");
                    break;
                default:
                    System.out.println("price is $0");
            }

    }
}
