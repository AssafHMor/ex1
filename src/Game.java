import java.util.ArrayList;
import java.util.Random;

public class Game {


    /**
     * Returns a 4 digits random number in string format
     * @return a 4 digit number
     */
    public static String generateRandomNumber(){
        String number = "";
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < 4) {

            int random = randomGenerator .nextInt(9);
            if (!numbers.contains(random)) {
                numbers.add(random);
                number += random;
            }
        }
        return number;
    }

    /**
     *
     * @param guess
     * @param random
     */
    public static void checkGuess(String guess, String random){

        for(int i = 0; i < guess.length(); i++){

            if(guess.charAt(i) == random.charAt(i)){
                System.out.println("BULLEYE!");
            }
            else if (random.indexOf(guess.charAt(i))!=-1){
                System.out.println("its there but not spot on try again");
            }
            else{
                System.out.println("does not exist");
            }
        }
    }

    /**
     * Returns true if a string checks positive for duplications
     * @param guess the string to check for duplications
     * @return true if a char appears more twice or more
     */
    public static boolean checkForDuplications(String guess){
        boolean result = false;
        short count = 0;
        for(int j = 0; j < guess.length(); j++){
            char c = guess.charAt(j);
            for (int i = 0; i < guess.length(); i++) {
                if (guess.charAt(i) == c) {
                    count++;
                }
                if(count > 1){
                    result = true;
                    break;
                }
            }
            count = 0;
        }
        return result;
    }





}
