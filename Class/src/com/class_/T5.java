package com.class_;


/**
 *Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/T5.class
  Last modified 2017-4-30; size 639 bytes
  MD5 checksum b05a50f2f88a21edd8fd3bcc73f1d409
  Compiled from "T5.java"
public class com.class_.T5
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/T5
   #2 = Utf8               com/class_/T5
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               age
   #6 = Utf8               I
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Methodref          #3.#11         // java/lang/Object."<init>":()V
  #11 = NameAndType        #7:#8          // "<init>":()V
  #12 = Utf8               LineNumberTable
  #13 = Utf8               LocalVariableTable
  #14 = Utf8               this
  #15 = Utf8               Lcom/class_/T5;
  #16 = Utf8               t
  #17 = Utf8               (I)V
  #18 = Fieldref           #19.#21        // java/lang/System.out:Ljava/io/PrintStream;
  #19 = Class              #20            // java/lang/System
  #20 = Utf8               java/lang/System
  #21 = NameAndType        #22:#23        // out:Ljava/io/PrintStream;
  #22 = Utf8               out
  #23 = Utf8               Ljava/io/PrintStream;
  #24 = String             #25            // 。。。。。你懂的
  #25 = Utf8               。。。。。你懂的
  #26 = Methodref          #27.#29        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #27 = Class              #28            // java/io/PrintStream
  #28 = Utf8               java/io/PrintStream
  #29 = NameAndType        #30:#31        // println:(Ljava/lang/String;)V
  #30 = Utf8               println
  #31 = Utf8               (Ljava/lang/String;)V
  #32 = Class              #33            // java/lang/RuntimeException
  #33 = Utf8               java/lang/RuntimeException
  #34 = String             #35            // 少儿不宜
  #35 = Utf8               少儿不宜
  #36 = Methodref          #32.#37        // java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
  #37 = NameAndType        #7:#31         // "<init>":(Ljava/lang/String;)V
  #38 = Utf8               StackMapTable
  #39 = Utf8               SourceFile
  #40 = Utf8               T5.java
{
  public int age;
    descriptor: I
    flags: ACC_PUBLIC

  public com.class_.T5();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 104: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/T5;

  public void t(int);
    descriptor: (I)V
    flags: ACC_PUBLIC
    Code:
      stack=3, locals=2, args_size=2
         0: iload_1
         1: bipush        12
         3: if_icmple     17
         6: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
         9: ldc           #24                 // String 。。。。。你懂的
        11: invokevirtual #26                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        14: goto          27
        17: new           #32                 // class java/lang/RuntimeException
        20: dup
        21: ldc           #34                 // String 少儿不宜
        23: invokespecial #36                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
        26: athrow
        27: return
      LineNumberTable:
        line 111: 0
        line 112: 6
        line 114: 14
        line 115: 17
        line 118: 27
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      28     0  this   Lcom/class_/T5;
            0      28     1   age   I
      StackMapTable: number_of_entries = 2
        frame_type = 17 /* same 
        frame_type = 9 /* same 
}
SourceFile: "T5.java"
*/
public class T5 {
	
	public int age;
	
	 public void t(long l, double d) {
//		 0: iload_1
//         1: bipush        12
//         3: if_icmple     17
//         6: getstatic     #18                 // Field java/lang/System.out:Ljava/io/PrintStream;
//         9: ldc           #24                 // String 。。。。。你懂的
//        11: invokevirtual #26                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        14: goto          27
//        17: new           #32                 // class java/lang/RuntimeException
//        20: dup
//        21: ldc           #34                 // String 少儿不宜
//        23: invokespecial #36                 // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
//        26: athrow
//        27: return
		 
		 Object[] objs = new Object[2];
		 
		 objs[0] = Long.valueOf(l);
		 objs[1] = Double.valueOf(d);
		 
		 if(age > 12) {
			 System.out.println("。。。。。你懂的");
			
		 } else {
			 throw new RuntimeException("少儿不宜");
			 
		 }
	 }
	 
	 

}
