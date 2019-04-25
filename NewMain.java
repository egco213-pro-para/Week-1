

import java.util.*;


public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m,n,gcd,lcm;
        
        Scanner scan = new Scanner(System.in);
	
        System.out.print("Enter M  = "); m = scan.nextInt();
	System.out.print("Enter N = "); n  = scan.nextInt();
        
        lcm=m*n;
            while(n!=0){
                int r = m % n;
                m = n;
                n = r;
            }
        
            gcd = m;
        lcm = lcm/gcd;
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
        }
        
    }