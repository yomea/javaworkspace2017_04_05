package com.class_;


/**
 * 
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/T2.class
  Last modified 2017-4-30; size 598 bytes
  MD5 checksum 582b5b08b20695f8e7d6b904b5185486
  Compiled from "T2.java"
public class com.class_.T2
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/T2
   #2 = Utf8               com/class_/T2
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Methodref          #3.#9          // java/lang/Object."<init>":()V
   #9 = NameAndType        #5:#6          // "<init>":()V
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lcom/class_/T2;
  #14 = Utf8               t
  #15 = Class              #16            // java/lang/String
  #16 = Utf8               java/lang/String
  #17 = String             #18            // java
  #18 = Utf8               java
  #19 = String             #20            // jsp
  #20 = Utf8               jsp
  #21 = Fieldref           #22.#24        // java/lang/System.out:Ljava/io/PrintStream;
  #22 = Class              #23            // java/lang/System
  #23 = Utf8               java/lang/System
  #24 = NameAndType        #25:#26        // out:Ljava/io/PrintStream;
  #25 = Utf8               out
  #26 = Utf8               Ljava/io/PrintStream;
  #27 = Methodref          #28.#30        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #28 = Class              #29            // java/io/PrintStream
  #29 = Utf8               java/io/PrintStream
  #30 = NameAndType        #31:#32        // println:(Ljava/lang/String;)V
  #31 = Utf8               println
  #32 = Utf8               (Ljava/lang/String;)V
  #33 = Utf8               str
  #34 = Utf8               [Ljava/lang/String;
  #35 = Utf8               ss
  #36 = Utf8               Ljava/lang/String;
  #37 = Utf8               SourceFile
  #38 = Utf8               T2.java
{
  public com.class_.T2();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/T2;

  public void t();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=4, locals=3, args_size=1
         0: iconst_2
         1: anewarray     #15                 // class java/lang/String
         4: dup
         5: iconst_0
         6: ldc           #17                 // String java
         8: aastore                          -------------------->弹出栈顶的值java，再弹出栈顶的值0，继续弹出栈顶的值str数组引用，将java字符串存进去
         9: dup
        10: iconst_1
        11: ldc           #19                 // String jsp
        13: aastore
        14: astore_1
        15: aload_1
        16: iconst_0
        17: aaload
        18: astore_2
        19: getstatic     #21                 // Field java/lang/System.out:Ljava/io/PrintStream;
        22: aload_2
        23: invokevirtual #27                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        26: return
      LineNumberTable:
        line 12: 0
        line 14: 15
        line 16: 19
        line 18: 26
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      27     0  this   Lcom/class_/T2;
           15      12     1   str   [Ljava/lang/String;
           19       8     2    ss   Ljava/lang/String;
}
SourceFile: "T2.java"
 * @author may
 *
 */
public class T2 {
	
	 public void t() {
		 
		 String[] str = new String[] {"java", "jsp"};
		 
		 String ss = str[0];
		 
		 System.out.println(ss);
		 
	 }
	 
	 public static void main(String[] args) {
		
		 new T2().t();
		 
	}

}
