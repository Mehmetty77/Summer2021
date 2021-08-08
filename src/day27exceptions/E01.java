package day27exceptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class E01 {
    
    /*
     * FileNotFoundException:
     * it is about finding a file and accessing it
     * a)if the file can not be found in this address
     * b)file exist but java can not reach it
     * 
     * IOException:
     * it can handle all exceptions about input and output
     * if you use IO no need to use filenotfound
     * IOExceptions is the parent of FileNotFoundException
     * 
     * when we try to handle an exception we have two ways
     * 1- Throws
     * 2-Try catch
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/day27exceptions/TextFile01");
        
        int i = 0;
        while((i=fileInputStream.read())!=-1) {
            System.out.print((char)i);
        }
        
        fileInputStream.close();
        
    }
}
