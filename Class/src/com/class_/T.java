package com.class_;


/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/T.class
  Last modified 2017-4-29; size 508 bytes
  MD5 checksum a4e7b168d157ecb32976ead7d4220142
  Compiled from "T.java"
public class com.class_.T
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/T
   #2 = Utf8               com/class_/T
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               str
   #6 = Utf8               [Ljava/lang/String;
   #7 = Utf8               age
   #8 = Utf8               I
   #9 = Utf8               <init>
  #10 = Utf8               ()V
  #11 = Utf8               Code
  #12 = Methodref          #3.#13         // java/lang/Object."<init>":()V
  #13 = NameAndType        #9:#10         // "<init>":()V
  #14 = Class              #15            // java/lang/String
  #15 = Utf8               java/lang/String
  #16 = String             #17            // java
  #17 = Utf8               java                                       ------------------------------>对于String类型，常量池中都会存在着这个字符串
  #18 = String             #19            // jsp
  #19 = Utf8               jsp                                        -------------------------------->
  #20 = Fieldref           #1.#21         // com/class_/T.str:[Ljava/lang/String;
  #21 = NameAndType        #5:#6          // str:[Ljava/lang/String;
  #22 = Fieldref           #1.#23         // com/class_/T.age:I
  #23 = NameAndType        #7:#8          // age:I
  #24 = Utf8               LineNumberTable
  #25 = Utf8               LocalVariableTable
  #26 = Utf8               this
  #27 = Utf8               Lcom/class_/T;
  #28 = Utf8               t
  #29 = Utf8               s
  #30 = Utf8               Ljava/lang/String;
  #31 = Utf8               SourceFile
  #32 = Utf8               T.java
{
  java.lang.String[] str;
    descriptor: [Ljava/lang/String;
    flags:

  int age;
    descriptor: I
    flags:

  public com.class_.T();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=5, locals=1, args_size=1
         0: aload_0                                --------------------->将this压入操作栈
         1: invokespecial #12                 // Method java/lang/Object."<init>":()V--------------->调用构造方法
         4: aload_0
         5: iconst_2
         6: anewarray     #14                 // class java/lang/String
         9: dup
        10: iconst_0
        11: ldc           #16                 // String java
        13: aastore
        14: dup
        15: iconst_1
        16: ldc           #18                 // String jsp
        18: aastore
        19: putfield      #20                 // Field str:[Ljava/lang/String;
        22: aload_0
        23: bipush        10
        25: putfield      #22                 // Field age:I
        28: return
      LineNumberTable:
        line 3: 0
        line 4: 4
        line 6: 22
        line 3: 28
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      29     0  this   Lcom/class_/T;

  public void t();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0                              ----------------->this
         1: getfield      #20                 // Field str:[Ljava/lang/String;  ---------->先获得栈顶中的this(可能存在本地方法可以传入this这个参数，因为c语言是面向过程的，所以应该是传的参数)，取到成员变量str的引用
         4: iconst_0                     //将0存到栈顶
         5: aaload                       //对数组进行操作，拿到下标0，拿到数组引用str，获得str[0]压入值栈
         6: astore_1                   //将值栈中的str[0]存到本地变量表中的s中
         7: return
      LineNumberTable:
        line 10: 0
        line 12: 7
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       8     0  this   Lcom/class_/T;
            7       1     1     s   Ljava/lang/String;
}
SourceFile: "T.java"
 * @author may
 *
 */
public class T {
	   String[] str = new String[] {"java", "jsp"};
	   
	   int age = 10;
	 
	 public void t() {
		 //aload_0
		 //getField com.class_.str:[Ljava.lang.String
		 //iconst_0
		 //aaload
		 //astore_1
		 //return
		 String s = str[0];
		 
	 }

}
