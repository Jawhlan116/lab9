package jishe1;

public class jishee1 {

	public static void main(String[] args) {
		final char[] vowels = new char[] {'x','y','z'};
		System.out.println("Анхны үүсгэсэн тэмдэгтүүд: ");
		for(char i: vowels) {
			System.out.println(i);
		}
		vowels[0]='z';
		System.out.println("Массивын эхний элемэнтийг өөрчилсний дараа: ");
		for(int i=0; i<3; i++) {
			System.out.print(vowels[i]+" ");
		}
	}

}
