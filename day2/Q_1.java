package day2;

import java.util.Arrays;

public class Q_1 {
	 int ref=10;
    public static void main(String[] args) {
         byte b=0;
		 short s=0;
		 int i=0;
		 long l=0L;
		 float f=0.0f;
		 double d=0.0d;
	     boolean bool=true;
		 char c='a';
		 System.out.println("Call by value example:");
		 System.out.println();
		 bytePassByvalue(b);
		 shortPassByvalue(s);
		 intPassByvalue(i);
		 longPassByvalue(l);
		 floatPassByvalue(f);
		 doublePassByvalue(d);
		 charPassByvalue(c);
		 booleanPassByvalue(bool);
		 
		 System.out.println();
		 System.out.println("Call by reference example:");
		 System.out.println();
		 Q_1 q=new Q_1();
		 System.out.println("Object Before call by reference: "+q.ref);
		 q.objectPassByReference(q);
		 System.out.println("Object After call by reference: "+q.ref);
		 
		 int a[]= {1,2,3,4,};
		 System.out.println("Array after pass by reference: ");
		 System.out.println(Arrays.toString(arrayPassByReference(a)));
		 
	}
    static void bytePassByvalue(byte b)
    {
    	System.out.println("Byte pass by value example; Value:"+b);
    }
    static void shortPassByvalue(short s)
    {
    	System.out.println("Short pass by value example; Value:"+s);
    }

    static void intPassByvalue(int i)
    {
    	System.out.println("Int pass by value example; Value:"+i);
    }

    static void longPassByvalue(long l)
    {
    	System.out.println("Long pass by value example; Value:"+l);
    }

    static void floatPassByvalue(float f)
    {
    	System.out.println("Float pass by value example; Value:"+f);
    }

    static void doublePassByvalue(double d)
    {
    	System.out.println("Double pass by value example; Value:"+d);
    }

    static void charPassByvalue(char c)
    {
    	System.out.println("Character pass by value example; Value:"+c);
    }

    static void booleanPassByvalue(boolean bool)
    {
    	System.out.println("Boolean pass by value example; Value:"+bool);
    } 
    void objectPassByReference(Q_1 q)
    {
    	q.ref=q.ref+10;
    }
    static int[] arrayPassByReference(int a[])
    {
     return a;
    }
    
}
