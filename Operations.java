package com.MyShop;
import java.util.Scanner;
public class Operations 
{
static Scanner sc = new Scanner(System.in);
public static void getMobiles() {
System.out.println("press 1 for iphone\t press 2 for samsung");
int ch=sc.nextInt();
switch(ch) {

case 1:
	IPhone obj1 = new IPhone();
	System.out.println(obj1.getProductId()+" "+obj1.getName()+" "+obj1.getPrice()+" "+obj1.getCateogory());
    break;
case 2:
	Samsung obj2 = new Samsung();
	System.out.println(obj2.getProductId()+" "+obj2.getName()+" "+obj2.getPrice()+" "+obj2.getCateogory());
	 break;	
	
}

}
public static void getTV() {
System.out.println("press 1 for iphone\t press 2 for samsung");
int ch=sc.nextInt();
switch(ch) {

case 1:
	LG obj1 = new LG();
	System.out.println(obj1.getProductId()+" "+obj1.getName()+" "+obj1.getPrice()+" "+obj1.getCateogory());
    break;
case 2:
	Onida obj2 = new Onida();
	System.out.println(obj2.getProductId()+" "+obj2.getName()+" "+obj2.getPrice()+" "+obj2.getCateogory());
	 break;	
	
}

}

public static void getAC() {
System.out.println("press 1 for AC1\t press 2 for AC2");
int ch=sc.nextInt();
switch(ch) {

case 1:
	AC1 obj1 = new AC1();
	System.out.println(obj1.getProductId()+" "+obj1.getName()+" "+obj1.getPrice()+" "+obj1.getCateogory());
    break;
case 2:
	AC2 obj2 = new AC2();
	System.out.println(obj2.getProductId()+" "+obj2.getName()+" "+obj2.getPrice()+" "+obj2.getCateogory());
	 break;	
	
}

}



}


