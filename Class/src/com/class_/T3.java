package com.class_;


/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/T3.class
  Last modified 2017-4-30; size 727 bytes
  MD5 checksum d0cbd5cf376f926e218810ece6c00f42
  Compiled from "T3.java"
public class com.class_.T3
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/T3
   #2 = Utf8               com/class_/T3
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
  #13 = Utf8               Lcom/class_/T3;
  #14 = Utf8               t
  #15 = Fieldref           #16.#18        // java/lang/System.out:Ljava/io/PrintStream;
  #16 = Class              #17            // java/lang/System
  #17 = Utf8               java/lang/System
  #18 = NameAndType        #19:#20        // out:Ljava/io/PrintStream;
  #19 = Utf8               out
  #20 = Utf8               Ljava/io/PrintStream;
  #21 = Methodref          #3.#22         // java/lang/Object.toString:()Ljava/lang/String;
  #22 = NameAndType        #23:#24        // toString:()Ljava/lang/String;
  #23 = Utf8               toString
  #24 = Utf8               ()Ljava/lang/String;
  #25 = Methodref          #26.#28        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #26 = Class              #27            // java/io/PrintStream
  #27 = Utf8               java/io/PrintStream
  #28 = NameAndType        #29:#30        // println:(Ljava/lang/String;)V
  #29 = Utf8               println
  #30 = Utf8               (Ljava/lang/String;)V
  #31 = Methodref          #1.#22         // com/class_/T3.toString:()Ljava/lang/String;
  #32 = Utf8               main
  #33 = Utf8               ([Ljava/lang/String;)V
  #34 = Methodref          #1.#9          // com/class_/T3."<init>":()V
  #35 = Methodref          #1.#36         // com/class_/T3.t:()V
  #36 = NameAndType        #14:#6         // t:()V
  #37 = Utf8               args
  #38 = Utf8               [Ljava/lang/String;
  #39 = Utf8               SourceFile
  #40 = Utf8               T3.java
{
  public com.class_.T3();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 113: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/T3;

  public void t();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #15                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokespecial #21                 // Method java/lang/Object.toString:()Ljava/lang/String;--------->调用父类的方法的指令是invokespecial，可以看到那个super就是this，不过指令不同而已。
         7: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        10: getstatic     #15                 // Field java/lang/System.out:Ljava/io/PrintStream;
        13: aload_0
        14: invokevirtual #31                 // Method toString:()Ljava/lang/String; --------------->调用自己的toString用的是指令invokevirtual，这个方法传入一个参数，那就是调用者（this）
        17: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        20: return
      LineNumberTable:
        line 117: 0
        line 119: 10
        line 121: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lcom/class_/T3;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 125: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/T3;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=1, args_size=1
         0: new           #1                  // class com/class_/T3
         3: dup
         4: invokespecial #34                 // Method "<init>":()V
         7: invokevirtual #35                 // Method t:()V
        10: return
      LineNumberTable:
        line 131: 0
        line 133: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  args   [Ljava/lang/String;
}
SourceFile: "T3.java"
 *
 * 
 * @author may
 *
 */
public class T3 {
	
	 public void t() {
		 
		 System.out.println(super.toString());
		 
		 System.out.println(this.toString());
		 
	 }
	 
	 @Override
	public String toString() {
		return null;
		
	}
	 
	 public static void main(String[] args) {
		
		 new T3().t();
		 
	}
	 

}
