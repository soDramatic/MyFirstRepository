package javastart;

public class OperatoryMat {

	public static void main(String[] args) {
		
		int a = 17;
		int b = 4;
		int c;
		c = a / b; //=4 - poniewa� 4*4=16 i zostaje 1
		c = a % b; //=1 - reszta z dzielenia
		
		//skr�towe operatory 
		int x = 17;
		double y = 4.0;
		x += y; //a= a+b
		x -= y; //a= a-b
		x *= y; //a= a*b
		x /= y; //a= a/b
		x %= y; //a= a%b
		
		//inkrementacja i dekrementacja
		
		int q = 5;
		int w = 3;
		int e = q + w++; // e = q + w, p�niej w = w + 1;
			e =(q++)+w; //e = q + w, a nast�pnie q = q + 1; mozna zapisa� e=q+++w;
					
	}
}
