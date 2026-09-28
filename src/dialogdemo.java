import javax.swing.JOptionPane;
public class dialogdemo {
    public static void main(String[] args){
        String firstName;
        String MiddleName;
        String Lastname;

        firstName=JOptionPane.showInputDialog("What is " + "your first name?");
        MiddleName=JOptionPane.showInputDialog("What is " + "your middle name");
        Lastname =JOptionPane.showInputDialog("What is " + "your last name");
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + MiddleName + " " + Lastname);

        System.exit(0);

    }
}
