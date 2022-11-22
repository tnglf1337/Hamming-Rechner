public class Distance {
    
    String wordOne = "";
    String wordTwo = "";

    public Distance(String wordOne, String wordTwo){
        this.wordOne = wordOne;
        this.wordTwo = wordTwo;
    }

    public int calcDistance(){
        
        int wordLength = wordOne.length();
        int currentDistance = 0;
        
        char[] wordToCompare1 = wordOne.toCharArray();
        char[] wordToCompare2 = wordTwo.toCharArray();

        for(int i = 0; i < wordLength; i++){
            if(wordToCompare1[i] != wordToCompare2[i]){
            currentDistance++;
            }
        }
        return currentDistance;
    }

    public void printDistance(int distance){
        System.out.println();
        System.out.println("-Die Hamming-Distance von " + wordOne + " und " + wordTwo + " beträgt: " + distance + ".");
        System.out.println("\n---by_tn-------------------------------------------------------------------------");
    }


}
