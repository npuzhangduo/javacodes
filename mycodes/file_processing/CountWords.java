// COunts the number of words in Hamlet

import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt"));
        int count = 0;
        while (input.hasNext()) {
            String Word = input.next();
            count++;
        }
        input.close();
        System.out.println("total words = " + count);
    }
}