package Ex_01;

import java.util.Scanner;

public class EX_1_1 {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		//����1) 1+3+5+7....99�� ���� ���Ͻÿ�
		 //��������
		int n =1; int sum  =0;
		final int MAX = 99;
		int i =1;
			
		//�Է�

	    //ó��
		while( n >= MAX){
		  sum= sum +n;
		  n= n+2;
		 
			
		}	
		 i= i+n;
	}
		//����
		System.out.println("1~99���� Ȧ���� �հ�=" + sum);
		}
	//error���� byte�� ǥ���� �� �ִ� ���� ������ -128 ~ 127,
	//�迭�� ���� Ÿ�Ը� ������ �� �ִ�.


