public class Code {

    String binNumber = "";
    int binLength = 0;

    public Code (String number, int length){
        this.binNumber = number;
        this.binLength = length;
    }

    public void printCode(){
        int[] finalCodeArray = new int[0];

        if(binLength == 4){
            char[] charArray = binNumber.toCharArray();
            int[] binNumberArray = new int[4];
        
            for(int i = 0; i < 4; i++){
                binNumberArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
            }

            finalCodeArray = new int[7];

            finalCodeArray[0] = 0;
            finalCodeArray[1] = 0;
            finalCodeArray[2] = binNumberArray[0];
            finalCodeArray[3] = 0;
            finalCodeArray[4] = binNumberArray[1];
            finalCodeArray[5] = binNumberArray[2];
            finalCodeArray[6] = binNumberArray[3];

            int paritySum1 = finalCodeArray[0] + finalCodeArray[2] + finalCodeArray[4] + finalCodeArray[6];
            int paritySum2 = finalCodeArray[1] + finalCodeArray[2] + finalCodeArray[5] + finalCodeArray[6];
            int paritySum3 = finalCodeArray[3] + finalCodeArray[4] + finalCodeArray[5] + finalCodeArray[6];

            if (paritySum1 % 2 != 0) {
                finalCodeArray[0] = 1;
            }

            if (paritySum2 % 2 != 0) {
                finalCodeArray[1] = 1;
            }

            if (paritySum3 % 2 != 0) {
                finalCodeArray[3] = 1;
            }
            System.out.println();
            System.out.print("--Die Codierung von " + binNumber + " lautet: ");
            
            for(int i = 0; i < finalCodeArray.length; i++){
                System.out.print(finalCodeArray[i]);
            }
            System.out.print(".");
            System.out.println();
            System.out.println("\n---by_tn-------------------------------------------------------------------------");
         }
        
        if(binLength == 8){
            char[] charArray = binNumber.toCharArray();
            int[] binNumberArray = new int[8];
        
            for(int i = 0; i < 8; i++){
                binNumberArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
            }

            finalCodeArray = new int[12];

            finalCodeArray[0] = 0;
            finalCodeArray[1] = 0;
            finalCodeArray[2] = binNumberArray[0];
            finalCodeArray[3] = 0;
            finalCodeArray[4] = binNumberArray[1];
            finalCodeArray[5] = binNumberArray[2];
            finalCodeArray[6] = binNumberArray[3];
            finalCodeArray[7] = 0;
            finalCodeArray[8] = binNumberArray[4];
            finalCodeArray[9] = binNumberArray[5];
            finalCodeArray[10] = binNumberArray[6];
            finalCodeArray[11] = binNumberArray[7];

            int paritySum1 = finalCodeArray[0] + finalCodeArray[2] + finalCodeArray[4] + finalCodeArray[6] + finalCodeArray[8] + finalCodeArray[10];
            int paritySum2 = finalCodeArray[1] + finalCodeArray[2] + finalCodeArray[5] + finalCodeArray[6] + finalCodeArray[9] + finalCodeArray[10];
            int paritySum3 = finalCodeArray[3] + finalCodeArray[4] + finalCodeArray[5] + finalCodeArray[6] + finalCodeArray[11];
            int paritySum4 = finalCodeArray[7] + finalCodeArray[8] + finalCodeArray[9] + finalCodeArray[10] + finalCodeArray[11];

            if (paritySum1 % 2 != 0) {
                finalCodeArray[0] = 1;
            }

            if (paritySum2 % 2 != 0) {
                finalCodeArray[1] = 1;
            }

            if (paritySum3 % 2 != 0) {
                finalCodeArray[3] = 1;
            }

            if (paritySum4 % 2 != 0) {
                finalCodeArray[7] = 1;
            }

            System.out.print("--Die Codierung von " + binNumber + " lautet: ");
            for(int i = 0; i < finalCodeArray.length; i++){
                System.out.print(finalCodeArray[i]);
            }
            System.out.print(".");
            System.out.println();
            System.out.println("\n---by_tn-------------------------------------------------------------------------");
        } else if(binLength == 16){
            char[] charArray = binNumber.toCharArray();
            int[] binNumberArray = new int[16];
        
            for(int i = 0; i < 16; i++){
                binNumberArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
            }

            finalCodeArray = new int[22];

            finalCodeArray[0] = 0;
            finalCodeArray[1] = 0;
            finalCodeArray[2] = binNumberArray[0];
            finalCodeArray[3] = 0;
            finalCodeArray[4] = binNumberArray[1];
            finalCodeArray[5] = binNumberArray[2];
            finalCodeArray[6] = binNumberArray[3];
            finalCodeArray[7] = 0;
            finalCodeArray[8] = binNumberArray[4];
            finalCodeArray[9] = binNumberArray[5];
            finalCodeArray[10] = binNumberArray[6];
            finalCodeArray[11] = binNumberArray[7];
            finalCodeArray[13] = binNumberArray[8];
            finalCodeArray[14] = binNumberArray[9];
            finalCodeArray[15] = binNumberArray[10];
            finalCodeArray[16] = 0;
            finalCodeArray[17] = binNumberArray[11];
            finalCodeArray[18] = binNumberArray[12];
            finalCodeArray[19] = binNumberArray[13];
            finalCodeArray[20] = binNumberArray[14];
            finalCodeArray[21] = binNumberArray[15];

            int paritySum1 = finalCodeArray[0] + finalCodeArray[2] + finalCodeArray[4] + finalCodeArray[6] + finalCodeArray[8] + finalCodeArray[10] + finalCodeArray[12] + finalCodeArray[14] + finalCodeArray[16] + finalCodeArray[18] + finalCodeArray[20];
            int paritySum2 = finalCodeArray[1] + finalCodeArray[2] + finalCodeArray[5] + finalCodeArray[6] + finalCodeArray[9] + finalCodeArray[10] + finalCodeArray[13] + finalCodeArray[14] + finalCodeArray[17] + finalCodeArray[18];
            int paritySum3 = finalCodeArray[3] + finalCodeArray[4] + finalCodeArray[5] + finalCodeArray[6] + finalCodeArray[11] + finalCodeArray[12] + finalCodeArray[13] + finalCodeArray[14] + finalCodeArray[19] + finalCodeArray[20];
            int paritySum4 = finalCodeArray[7] + finalCodeArray[8] + finalCodeArray[9] + finalCodeArray[10] + finalCodeArray[11] + finalCodeArray[12] + finalCodeArray[13] +finalCodeArray[14];
            int paritySum5 = finalCodeArray[15] + finalCodeArray[16] + finalCodeArray[17] + finalCodeArray[18] + finalCodeArray[19] + finalCodeArray[20];

            if (paritySum1 % 2 != 0) {
                finalCodeArray[0] = 1;
            }

            if (paritySum2 % 2 != 0) {
                finalCodeArray[1] = 1;
            }

            if (paritySum3 % 2 != 0) {
                finalCodeArray[3] = 1;
            }

            if (paritySum4 % 2 != 0) {
                finalCodeArray[7] = 1;
            }

            if (paritySum5 % 2 != 0) {
                finalCodeArray[16] = 1;
            }

            System.out.print("--Die Codierung von " + binNumber + " lautet: ");
            for(int i = 0; i < finalCodeArray.length; i++){
                System.out.print(finalCodeArray[i]);
            }
            System.out.print(".");
            System.out.println();
            System.out.println("\n---by_tn-------------------------------------------------------------------------");
        }   
    }
}
