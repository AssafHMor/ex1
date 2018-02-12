import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String guess = JOptionPane.showInputDialog("Welcome to Bullseye!\nPlease enter a 4 digit guess");
        while(guess.length() != 4){
            guess = JOptionPane.showInputDialog("Please make sure your guess is only 4 digits long");
        }
        System.out.println(guess);
    }
}
