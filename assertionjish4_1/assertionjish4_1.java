package jishe1;
import java.util.Scanner;

public class assertionjish4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		assert age>=18:"Санал өгч болохгүй";
		System.out.println("Иргэний нас нь : "+age);
		sc.close();
	}

}
