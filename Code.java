public class Code {
    public static void main(String[] args) {
        /*
         * // Product and sum of digits of a number
         * int a = 988;
         * // int sum = 0;
         * int product = 1;
         * for(;a>0;a/=10) {
         * // sum += a%10;
         * product *= a%10;
         * }
         * System.out.println(product);
         */

        /*
         * //Count the digit of number
         * int num=5467;
         * int count=0;
         * for(;num>0;num/=10) {
         * count++;
         * }
         * System.out.println(count);
         */

        /*
         * // Palindrome number
         * 
         * int ori=n;
         * int rev = 0;
         * while(n > 0) {
         * int d = n % 10;
         * rev = rev * 10 + d;
         * n = n / 10;
         * }
         * 
         * if(ori == rev) {
         * System.out.println("Palindrome");
         * } else {
         * System.out.println("Not Palindrome");
         * }
         */

        /*
         * //count even and odd digits
         * //sum of even and odd digits
         * int n=54645;
         * int esum=0;
         * int osum=0;
         * int ecount =0;
         * int ocount=0;
         * for(;n>0;n=n/10){
         * if(n%2==0){
         * ecount++;
         * esum += n % 10;
         * }
         * else {
         * ocount++;
         * osum += n % 10;
         * }
         * // else ocount++;
         * // count++;
         * }
         * System.out.println(ecount);
         * System.out.println(ocount);
         * System.out.println(esum);
         * System.out.println(osum);
         */


        /* 
        // Fibonacci series
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
            */

      /*
    // Reverse of a number
        int n = 7864;
        int rev = 0;
        while(n > 0) {
            int dig = n % 10;
            rev = rev * 10 + di;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
*/


      /*
     // Armstrong of a number
        int n = 153;
        int or = n;
        int sum = 0;
        while(n > 0) {
            int dig = n % 10;
            sum = sum + dig * dig * dig;
            n = n / 10;
        }
            if(sum == or) {
                System.out.println("Armstrong Number");
            } else {
                System.out.println("Not Armstrong Number");
            }
        }
    }*/
    }
}
