// import java.util.Scanner;
// import java.io.*;
// import java.io.InputStreamReader;

public class conditionalStatement{
	public static void main(String[] args) {
		// System.out.println("Введите возраст, число");
		// Scanner scan = new Scanner(System.in);
		// int age = scan.nextInt();
		// InputStreamReader in = new InputStreamReader(System.in);
		// System.out.println("Введите пол: М или Ж");
		// char sex = (char)in.read();
		// System.out.println("Введите рост");
		// float height = scan.nextFloat();
		// System.out.println("Введите первую букву вашего имени");
		// char nameChar = (char)in.read();

		// про считывание значений в задаче - нет, предположим, 
		//что считали
int age = 22;
char sex = 'M';
double height = 2.20;
char nameChar = 'I';


if (age > 20){
	System.out.println("Ваш возраст ");
	System.out.println(age);
}

else if (sex == 'М') {
    System.out.println("Ваш пол М");
}
else { System.out.println("Ваш пол не М");
}

if (height < 1.80) {
    System.out.println("Рост ниже 1.80");
} else  {System.out.println("Рост выше 1.80");}

if(nameChar == 'М') {
      System.out.println("Имя начинается с M");
} 
else if(nameChar == 'I') {
    System.out.println("Имя начинается с I");
} else {
    System.out.println("Имя начинается не с символа M или I");
 }}
}

