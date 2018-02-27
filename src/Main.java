

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int proceed = 0;
        try{
            String random = Game.generateRandomNumber();
            while(proceed == 0) {

                String guess = JOptionPane.showInputDialog("Welcome to BULLSEYE!\nPlease enter a 4 digit guess");
                while ((!guess.matches("\\d{4}+") || Game.checkForDuplications(guess)) == true) {
                    guess = JOptionPane.showInputDialog("Please make sure your guess is only 4 different digits long");
                }

                Game.checkGuess(guess, Game.generateRandomNumber());
                proceed = JOptionPane.showConfirmDialog(null,"Would you like to try again?",
                        "Next round?",JOptionPane.YES_NO_OPTION);
            }


        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }

    }
}
