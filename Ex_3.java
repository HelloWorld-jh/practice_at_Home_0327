package Ex_01;
import java.util.Scanner;
public class Ex_3 {
	//100���� ���� �Էµ� �� ����� ������ ������ ������ ���ϰ�
	//��� �߿��� Ȧ���� ¦���� ������ ���Ͻÿ�
	public static void main(String[] args) {
		//��������
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
        } // while ��
        System.out.println( "��� ���� :"  +  pos_cnt    );
        System.out.println( "���� ���� :" +   neg_cnt    );
        System.out.println( "����� ¦�� ����:" +even_cnt );
        System.out.println( "����� Ȧ�� ����:" +odd_cnt  );
}

}

