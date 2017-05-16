package com.class_;

/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/InvokeSuper.class
  Last modified 2017-5-1; size 548 bytes
  MD5 checksum 4ddaa6a60cf504f86d3ca8ba74000b2c
  Compiled from "InvokeSuper.java"
public class com.class_.InvokeSuper
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/InvokeSuper
   #2 = Utf8               com/class_/InvokeSuper
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
  #13 = Utf8               Lcom/class_/InvokeSuper;
  #14 = Utf8               print
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
  #31 = Utf8               SourceFile
  #32 = Utf8               InvokeSuper.java
{
  public com.class_.InvokeSuper();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/InvokeSuper;

  public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: getstatic     #15                 // Field java/lang/System.out:Ljava/io/PrintStream;
         3: aload_0
         4: invokespecial #21                 // Method java/lang/Object.toString:()Ljava/lang/String;
         7: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        10: getstatic     #15                 // Field java/lang/System.out:Ljava/io/PrintStream;
        13: aload_0
        14: invokevirtual #21                 // Method java/lang/Object.toString:()Ljava/lang/String;
        17: invokevirtual #25                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        20: return
      LineNumberTable:
        line 8: 0
        line 10: 10
        line 12: 20
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      21     0  this   Lcom/class_/InvokeSuper;
}
SourceFile: "InvokeSuper.java"
 * @author may
 *
 */
public class InvokeSuper {
	
	
	
	public void print() {
		
		System.out.println(super.toString());
		
		System.out.println(this.toString());
		
	}

}
