package day25encapsulationandinterviewquestions;

public class InterviewQuestion02 {
    public static void main(String[] args) {
        // Print 1 to 100 without using any number in your code
        
        //1st way
        int x = 'b'/'b';//1
        String s="$$$$$$$$$$";
        
        for (int i = x; i<=s.length()*s.length();i++) {
            System.out.print(i+" ");
        }
        
        System.out.println(" ");
        
        //2nd way ascii
        //a=97, b=98, c=99, d=100
        
        for(int j= x; j<='d';j++) {
            System.out.print(j+" ");
            
        }
        
        
    }
}