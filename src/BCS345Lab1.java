
//package bcs.pkg345.lab.pkg1;

import java.util.*;

/**
 *
 * Jonathan Saloman 2/14/21 BCS 345 Tue-Thurs 12:45-1:
 */
public class BCS345Lab1 {

    
    public static void main(String arg[]) {
        int n = 100; //Initializing variable n = 100 to run loop till 100
        for (int i = 0; i <= n; i++) //Run loop from i = 0 to n i.e 100 to cover all elements
            if (i % 2 == 0) //If number is divisible by 2, then it will be even
                System.out.println(i);
    }
    
}
