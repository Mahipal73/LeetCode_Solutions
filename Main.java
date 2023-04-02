import java.util.*;
public class Main {

        public static  int divisor_sum(int n){
            int sum =0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum = sum+i;
                }else{
                    sum = sum;
                }
            }
            System.out.println(sum);
            return sum;
        }
       public static void main(String args[]){
            //System.out.println(sum);
            divisor_sum(6);
            System.out.println(divisor_sum(12));
       }
    }
