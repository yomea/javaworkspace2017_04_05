package com.class_;


/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/Cast.class
  Last modified 2017-5-2; size 436 bytes
  MD5 checksum 55e77ba8337cc85c7cad4f863c2d5ee8
  Compiled from "Cast.java"
public class com.class_.Cast
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/Cast
   #2 = Utf8               com/class_/Cast
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
  #15 = Utf8               Lcom/class_/Cast;
  #16 = Utf8               t
  #17 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #18 = Class              #19            // java/lang/String
  #19 = Utf8               java/lang/String
  #20 = Utf8               Ljava/lang/Object;
  #21 = Utf8               SourceFile
  #22 = Utf8               Cast.java
{
  public int age;
    descriptor: I
    flags: ACC_PUBLIC

  public com.class_.Cast();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Cast;

  public java.lang.String t(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Ljava/lang/String;
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: checkcast     #18                 // class java/lang/String
         4: areturn
      LineNumberTable:
        line 12: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Cast;
            0       5     1   age   Ljava/lang/Object;
}
SourceFile: "Cast.java"
*/
public class Cast {
	
	public int age;
	
	 public String t(Object age) {
		 Object obj = 2;
		return (String) age;
	 }
	 
	 

}
