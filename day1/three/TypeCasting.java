package day1.three;
public class TypeCasting {
 public static void main(String[] args) {
	 boolean bool=true;
	 bool=false;
	 byte b=0;
	 short s=0;
	 int i=0;
	 long l=0L;
	 float f=0f;
	 double d=0d;
	 char c='a';
	 
	 implicitTypeCasting(b,s,i,l,f,d,c);
	 explicitTypeCasting(b,s,i,l,f,d,c);
}
 static void implicitTypeCasting(byte b,short s,int i,long l,float f,double d,char c)
 {
	 s=b;
	 i=b;
	 i=s;
	 l=b;
	 l=s;
	 l=i;
	 f=b;
	 f=s;
	 f=i;
	 f=l;
	 d=b;
	 d=s;
	 d=i;
	 d=l;
	 d=f;
	 
 }
 static void explicitTypeCasting(byte b,short s,int i,long l,float f,double d,char c)
 {  
	 /*byte*/
	 b=(byte)s;
	 b=(byte)i;
	 b=(byte)l;
	 b=(byte)f;
	 b=(byte)d;
	 b=(byte)c;
	 
	 /*short*/
	 s=(short)b;
	 s=(short)i;
	 s=(short)l;
	 s=(short)f;
	 s=(short)d;
	 s=(short)c;
     
	 /*int*/
     i=(int)b;
     i=(int)s;
     i=(int)l;
     i=(int)f;
     i=(int)d;
     i=(int)c;
     
     /*long*/
     l=(long)b;
     l=(long)s;
     l=(long)i;
     l=(long)l;
     l=(long)f;
     l=(long)c;
     
     /*float*/
     f=(float)b;
     f=(float)s;
     f=(float)i;
     f=(float)l;
     f=(float)d;
     f=(float)c;
     
     /*double*/
     d=(double)b;
     d=(double)s;
     d=(double)i;
     d=(double)l;
     d=(double)f;
     d=(double)c;
     
     /*char*/
     c=(char)b;
     c=(char)s;
     c=(char)i;
     c=(char)f;
     c=(char)l;
     c=(char)f;
	 
 }
 
}
