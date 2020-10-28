package learnJava1;

import java.util.Scanner;
import java.util.Arrays;

public class learn1 {

	public static void main(String[] args) {
		
		/*
		// 기본 자료형, 객체 자료형
		 
		 기본자료형: 데이터가 변수에 직접 저장
		 	정수형: byte(1), char(2), short(2), int(4), long(8)
		 	실수형: float(4), double(8)
		 	논리형: boolean(1)				
		 객체 자료형: 객체 메모리 주소가 변수에 저장
		 
		*/
		
		/*
		// 자동(묵시적) 형변환: 적은 공간의 메오리에서 큰 공간의 메모리로 이동
		byte by = 10;
		int in = by;
		System.out.println("in = " + in);
		
		// 명시적 형변환: 큰 공간의 메모리에서 작은 공간의 메모리로 이동(데이터 누실될 수 있다)
		int iVar = 123456;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		*/
		
		/* 
		//특수 문자와 서식 문자		 
		 특수 문자
		 	\t : 탭, \n : 줄 바꿈, \' : 작은 따옴표, \": 큰 따옴표, \\ : 역슬래쉬
		 서식 문자
		 	&?(?진수)--- %d(10) %o(8) %x(16) %c(문자) &s(문자열) &f(실수)
		 	문자의 정렬, 소수점 제한 기능: %5d / %.0f,%.1f,%.2f
		 
		System.out.println("Good\t Morning~!"); //Good	 Morning~!
		
		int num1 = 25;
		String name = "최우석";
		System.out.printf("%s의 나이는 %d 입니다\n", name, num1);
		System.out.printf("%d\n", 12345);
		System.out.printf("%5d\n", 12345);
		System.out.printf("%f\n", 1.12345);
		System.out.printf("%.2f\n", 1.12345);
		*/
		
		/* 
		//연산자 
		 단항 연산자 : -x, !x, +x
		 이항 연산자 : x=y, x<y, x!=y
		 삼항 연산자 : 조건식: true ? false
		 
		 대입 연산자: =
		 산술 연산자: +, -, *, /, %
		 복합 대입연산자: +=, -=, *=, /=, %=
		 관계 연산자: >,>=,<,<=,==,!=
		 증감 연산자: ++, --
		 논리 연산자: &&, ||, !
		 조건 연산자: 조건식? 식:식
		 비트 연산자: &, |, ^(비트 연산자를 사용하면 연산 속도가 향상된다)
		 */
		
		/* 
		//배열: 인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것		 
		int[] arr1 = new int[5];//int[] arr1 = {100,200,300,400,500}
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		System.out.println("arr1[2] = " + arr1[2]);
		*/
		
		/*		
		// 배열과 메모리
		// 배열 변수는 배열 데이터의 주소를 담고 있다.
		int[] arrAtt1 = {10, 20, 30, 40};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		// 배열 길이
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		// 배열 요소 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		// 배열 요소 복사
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		// 배열 레퍼런스
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1: "+ arrAtt1);
		System.out.println("arrAtt2: "+ arrAtt2);
		System.out.println("arrAtt3: "+ arrAtt3);
		// 다차원 배열
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		System.out.println("arrMul: " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul: " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul: " + Arrays.toString(arrMul[2]));
		*/
		
		/*
		// 조건식
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		if(num1<num2) {
			System.out.println("num1은 num2보다 작다");
		} else if(num1 == num2) {
			System.out.println("num1은 num2와 같다");
		} else {
			System.out.println("num1은 num2 보다 크다");
		}
		
		int score = scanner.nextInt();
		switch(score) {
		case 100:
		case 90:
			System.out.println("A");
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		scanner.close();
		*/
		
		/*
		//반복문
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);				
			}			
		}
		int x = 1;
		int y = 4;
		while(x < 10) {
			System.out.printf("%d X %d = %d\n",y,x,x*y);
			x++;
		}
		do {
			System.out.println("무조건 1번 실행");
			x += 80;
		}while(x>99);
		*/
		
		
		// 배열을 이용한 학사관리		
		String[] name = {"최우석", "정동원", "장성원"};
		int[] score = new int[name.length];
		char[] grade = new char[name.length];
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		for (int j = 0; j < name.length; j++) {
			System.out.printf("%s의 점수를 입력하세요. : ", name[j]);
			score[j] = scanner.nextInt();
			total += score[j];
		}
		for (int i = 0; i < name.length; i++) {
			
			if (score[i] >= 90) {
				grade[i] = 'A';		
			} else if(score[i] >= 80) {
				grade[i] = 'B';		
			}else if(score[i] >= 70) {
				grade[i] = 'C';		
			}else if(score[i] >= 60) {
				grade[i] = 'D';		
			}else {
				grade[i] = 'F';	
			}
			System.out.printf("%s의 점수 : %d(%c)\n", name[i], score[i], grade[i]);
		}
		System.out.println("---------------");
		System.out.printf("평 점 : %d", total/3);	
		scanner.close();		
		
	}

}
