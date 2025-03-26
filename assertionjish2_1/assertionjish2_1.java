package jishe1;
import java.util.*;

public class assertionjish2_1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		assert x>=0: "Тоо 0-ээс их буюу тэнцүү байх ёстой!";
		System.out.println("Өгөгдсөн тоо =: "+x);
		sc.close();

	}

}
