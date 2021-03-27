package Ex_01;
import java.util.Scanner;
public class Ex_3 {
	//100개의 수가 입력될 때 양수의 개수와 음수의 개수를 구하고
	//양수 중에서 홀수와 짝수의 개수를 구하시오
	public static void main(String[] args) {
		//변수선언
        int pos_cnt=0, neg_cnt=0,  even_cnt=0 , odd_cnt=0;
        int number , i =1;
        final int MAX=10;

        Scanner sc = new Scanner(System.in); 	
        while(  i  <= MAX) {
            number = sc.nextInt();
            if( number  >0){
               pos_cnt = pos_cnt +1;
               if(number % 2 ==0 ) {
                    even_cnt  = even_cnt +1;
               }else{
                     odd_cnt = odd_cnt+1;
               }
            }else {
               neg_cnt  = neg_cnt +1;
            }          
            i= i+1;
        } // while 끝
        System.out.println( "양수 개수 :"  +  pos_cnt    );
        System.out.println( "음수 개수 :" +   neg_cnt    );
        System.out.println( "양수중 짝수 개수:" +even_cnt );
        System.out.println( "양수중 홀수 개수:" +odd_cnt  );
}

}

