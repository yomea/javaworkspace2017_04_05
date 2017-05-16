package com.class_;

/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/InvokeSuper2.class
  Last modified 2017-5-1; size 617 bytes
  MD5 checksum 0e81952d7b28bb1bf3172052ebedde63
  Compiled from "InvokeSuper2.java"
public class com.class_.InvokeSuper2
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/InvokeSuper2
   #2 = Utf8               com/class_/InvokeSuper2
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
  #13 = Utf8               Lcom/class_/InvokeSuper2;
  #14 = Utf8               toString
  #15 = Utf8               ()Ljava/lang/String;
  #16 = Methodref          #3.#17         // java/lang/Object.toString:()Ljava/lang/String;
  #17 = NameAndType        #14:#15        // toString:()Ljava/lang/String;
  #18 = Utf8               print
  #19 = Fieldref           #20.#22        // java/lang/System.out:Ljava/io/PrintStream;
  #20 = Class              #21            // java/lang/System
  #21 = Utf8               java/lang/System
  #22 = NameAndType        #23:#24        // out:Ljava/io/PrintStream;
  #23 = Utf8               out
  #24 = Utf8               Ljava/io/PrintStream;
  #25 = Methodref          #26.#28        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #26 = Class              #27            // java/io/PrintStream
  #27 = Utf8               java/io/PrintStream
  #28 = NameAndType        #29:#30        // println:(Ljava/lang/String;)V
  #29 = Utf8               println
  #30 = Utf8               (Ljava/lang/String;)V
  #31 = Methodref          #1.#17         // com/class_/InvokeSuper2.toString:()Ljava/lang/String;
  #32 = Utf8               SourceFile
  #33 = Utf8               InvokeSuper2.java
{
  public com.class_.InvokeSuper2();
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
            0       5     0  this   Lcom/class_/InvokeSuper2;

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #16                 // Method java/lang/Object.toString:()Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 13: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/InvokeSuper2;

  public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokespecial #16                 // Method java/lang/Object.toString:()Ljava/lang/String;
         7: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        10: getstatic     #19                 // Field java/lang/System.out:Ljava/io/PrintStream;
        13: aload_0
        14: invokevirtual #31                 // Method toString:()Ljava/lang/String;
        17: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        20: return
      LineNumberTable:
        line 18: 0
        line 20: 10
        line 22: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lcom/class_/InvokeSuper2;
}
SourceFile: "InvokeSuper2.java"
 * @author may
 *
 */
public class InvokeSuper2 {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public void print() {
		
		System.out.println(super.toString());
		
		System.out.println(this.toString());
		
	}

}
