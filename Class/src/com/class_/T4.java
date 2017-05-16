package com.class_;


/**
 *Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/T4.class
  Last modified 2017-4-30; size 382 bytes
  MD5 checksum 878af3e70b71b6c81e17b9b95249ea6a
  Compiled from "T4.java"
public class com.class_.T4
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/T4
   #2 = Utf8               com/class_/T4
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               age
   #6 = Utf8               I
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Methodref          #3.#11         // java/lang/Object."<init>":()V
  #11 = NameAndType        #7:#8          // "<init>":()V
  #12 = Fieldref           #1.#13         // com/class_/T4.age:I
  #13 = NameAndType        #5:#6          // age:I
  #14 = Utf8               LineNumberTable
  #15 = Utf8               LocalVariableTable
  #16 = Utf8               this
  #17 = Utf8               Lcom/class_/T4;
  #18 = Utf8               t
  #19 = Utf8               (I)V
  #20 = Utf8               SourceFile
  #21 = Utf8               T4.java
{
  public int age;
    descriptor: I
    flags: ACC_PUBLIC

  public com.class_.T4();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #10                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: bipush        12
         7: putfield      #12                 // Field age:I
        10: return
      LineNumberTable:
        line 10: 0
        line 12: 4
        line 10: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lcom/class_/T4;

  public void t(int);
    descriptor: (I)V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #12                 // Field age:I           //这里调用本地的方法，给age复制，参数是操作数栈的两个值
         5: return
      LineNumberTable:
        line 16: 0
        line 17: 5
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   Lcom/class_/T4;
            0       6     1   age   I
}
SourceFile: "T4.java"
 * 
 * @author may
 *
 */
public class T4 {
	
	public int age = 12;
	
	 public void t(int age) {
		 
		 this.age = age;
	 }
	 
	 

}
