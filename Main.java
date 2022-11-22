import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        intro();
        
        Scanner scan = new Scanner(System.in);
        String option = scan.next();

        System.out.println();

        if(option.equals("D")){
            System.out.print("--Geben Sie zwei Wörter gleicher Länge ein: ");
            String[] wordArray = {scan.next(), scan.next()};
            Distance hammingDistance = new Distance(wordArray[0], wordArray[1]);

            if(wordArray[0].length() != wordArray[1].length()){
                System.out.println("--ERROR: Ungültige Wortlänge.");
                return;
            }

            int distance = hammingDistance.calcDistance();
            hammingDistance.printDistance(distance);
        } else if (option.equals("C")){
            System.out.print("--Geben Sie eine 4-bis-16-Bit Binärzahl ein, um sie zu codieren: ");
            String binNumber = scan.next();
            int length = binNumber.length();
            Code hammingCode = new Code(binNumber, length);
    
            if(length != 4 && length != 8 && length != 16){
                  System.out.println("--ERROR: Ungültige Binärzahl.");
                  return;
            }

            hammingCode.printCode();
        } else {
            System.out.println("--ERROR: Bitte gültige Option wählen.");
        }
    }

    public static void intro(){
        System.out.println("-----------------------------------Hamming-App-----------------------------------");
        System.out.println("--Geben Sie... \n");
        System.out.println("--D für die Hamming-Distance ein.");
        System.out.print("--C für den Hamming-Code ein.");
    }
}
