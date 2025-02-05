package Day2;

import java.util.*;

public class operator {
	public static void main(String[] args) {
		int fnum = 22;
		int snum = 82;
		int tnum = 10;
		int fonum =5;
		int _100 = 100;
		int _50 = 50;
		int $12= 12;
		System.out.println("Enter the first number: " + fnum);
		System.out.println("Enter the first number: " + snum);
		System.out.println("");
		System.out.println("Arithmetic Operations:");
		System.out.println("Addition: " + (fnum+snum));
		System.out.println("Subtraction: " + (fnum-snum));
		System.out.println("Multiplication: " + (fnum*snum));
		System.out.println("Divivsion: " + (fnum/snum));
		System.out.println("");
		System.out.println("Relational Operations:");
		System.out.println(fnum +" > "+snum + " : " + (fnum>snum));
		System.out.println(fnum +" < "+snum + " : " + (fnum<snum));
		System.out.println(fnum +" >= "+snum + " : " + (fnum>=snum));
		System.out.println(fnum +" <= "+snum + " : " + (fnum<=snum));
		System.out.println(fnum +" == "+snum + " : " + (fnum==snum));
		System.out.println(fnum +" != "+snum + " : " + (fnum!=snum));
		System.out.println("");
		System.out.println("Logical Operations:");
		System.out.println("("+fnum +" > 10  AND " +snum+ " < 50) : " +( (fnum>tnum)&&(snum<_50)));
		System.out.println("("+fnum +" > 10  AND " +snum+ " < 50) : " + ((fnum<fonum)||(snum>_100)));
		System.out.println("");
		System.out.println("Assignment Operations:");
		System.out.println("Initial value: "+ tnum);
		System.out.println("After += : "+(tnum=+12));
		System.out.println("After -= : "+(tnum=-12));
		System.out.println("After *= : "+(tnum*=12));
		System.out.println("After /= : "+(tnum/=10));
		System.out.println("After %= : "+(tnum%=2));
		System.out.println("");
		System.out.println("Unary Operations:");
		System.out.println("Initial value: "+ $12);
		System.out.println("After increment: "+(++$12));
		System.out.println("After decrement : "+(--$12));
		System.out.println("");
	}
}

