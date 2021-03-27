package Ex_01;

import java.util.Scanner;

public class EX_1_1 {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//문제1) 1+3+5+7....99의 합을 구하시오
		 //변수선언
		int n =1; int sum  =0;
		final int MAX = 99;
		int i =1;
			
		//입력

	    //처리
		while( n >= MAX){
		  sum= sum +n;
		  n= n+2;
		 
			
		}	
		 i= i+n;
	}
		//츌력
		System.out.println("1~99까지 홀수의 합계=" + sum);
		}
	//error원인 byte가 표현할 수 있는 값의 범위는 -128 ~ 127,
	//배열은 같은 타입만 저장할 수 있다.


