import javax.swing.plaf.synth.SynthLookAndFeel;

public class EvenOdd {
    public static void main(String[] args) {

        int numToExamine=556;

        if (numToExamine%2==0){
            System.out.println("The number you are checking is Even.");
        }
        else{
            System.out.print("The number you are checking is ODD.");
        }
    }
}
