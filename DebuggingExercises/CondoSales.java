/**
 * Created by Jc337839 on 28/08/17.
 */
import javax.swing.*;
public class CondoSales
{
    public static void main(String[] args)
    {
        String park = "$150,000";
        String golf = "$175,000";
        String lake = "$210,000";
        String input;
        input = JOptionPane.showInputDialog(null, "Choose\n1 - park view\n2 - golf course view" + "\n3 - lake view");
        int number = Integer.parseInt(input);
        switch (number)
        {
            case 1:
                System.out.println("Park View condos are " + park);
                break;
            case 2:
                System.out.println("golf course view condos are " + golf);
                break;
            case 3:
                System.out.println("lake view condos are " + lake);
                break;
            default:
                System.out.println("price is $0");
        }
    }
}
