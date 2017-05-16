package com.class_;


/**
 * 
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/Lambda_hasReturnTest.class
  Last modified 2017-4-29; size 1619 bytes
  MD5 checksum f08e36c3f26a61bea458757520f1cf31
  Compiled from "Lambda_hasReturnTest.java"
public class com.class_.Lambda_hasReturnTest
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/Lambda_hasReturnTest
   #2 = Utf8               com/class_/Lambda_hasReturnTest
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
  #13 = Utf8               Lcom/class_/Lambda_hasReturnTest;
  #14 = Utf8               main
  #15 = Utf8               ([Ljava/lang/String;)V
  #16 = NameAndType        #17:#18        // printSomeInfo:()Lcom/class_/Lambda_hasRetrun;
  #17 = Utf8               printSomeInfo
  #18 = Utf8               ()Lcom/class_/Lambda_hasRetrun;
  #19 = InvokeDynamic      #0:#16         // #0:printSomeInfo:()Lcom/class_/Lambda_hasRetrun;
  #20 = String             #21            // hello
  #21 = Utf8               hello
  #22 = InterfaceMethodref #23.#25        // com/class_/Lambda_hasRetrun.printSomeInfo:(Ljava/lang/String;)Ljava/lang/String;
  #23 = Class              #24            // com/class_/Lambda_hasRetrun
  #24 = Utf8               com/class_/Lambda_hasRetrun
  #25 = NameAndType        #17:#26        // printSomeInfo:(Ljava/lang/String;)Ljava/lang/String;
  #26 = Utf8               (Ljava/lang/String;)Ljava/lang/String;
  #27 = Fieldref           #28.#30        // java/lang/System.out:Ljava/io/PrintStream;
  #28 = Class              #29            // java/lang/System
  #29 = Utf8               java/lang/System
  #30 = NameAndType        #31:#32        // out:Ljava/io/PrintStream;
  #31 = Utf8               out
  #32 = Utf8               Ljava/io/PrintStream;
  #33 = Methodref          #34.#36        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #34 = Class              #35            // java/io/PrintStream
  #35 = Utf8               java/io/PrintStream
  #36 = NameAndType        #37:#38        // println:(Ljava/lang/String;)V
  #37 = Utf8               println
  #38 = Utf8               (Ljava/lang/String;)V
  #39 = Utf8               args
  #40 = Utf8               [Ljava/lang/String;
  #41 = Utf8               lambda
  #42 = Utf8               Lcom/class_/Lambda_hasRetrun;
  #43 = Utf8               str
  #44 = Utf8               Ljava/lang/String;
  #45 = Utf8               lambda$0
  #46 = Class              #47            // java/lang/StringBuilder
  #47 = Utf8               java/lang/StringBuilder
  #48 = Methodref          #49.#51        // java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #49 = Class              #50            // java/lang/String
  #50 = Utf8               java/lang/String
  #51 = NameAndType        #52:#53        // valueOf:(Ljava/lang/Object;)Ljava/lang/String;
  #52 = Utf8               valueOf
  #53 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
  #54 = Methodref          #46.#55        // java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
  #55 = NameAndType        #5:#38         // "<init>":(Ljava/lang/String;)V
  #56 = String             #57            //  lambda
  #57 = Utf8                lambda
  #58 = Methodref          #46.#59        // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #59 = NameAndType        #60:#61        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #60 = Utf8               append
  #61 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #62 = Methodref          #46.#63        // java/lang/StringBuilder.toString:()Ljava/lang/String;
  #63 = NameAndType        #64:#65        // toString:()Ljava/lang/String;
  #64 = Utf8               toString
  #65 = Utf8               ()Ljava/lang/String;
  #66 = Utf8               SourceFile
  #67 = Utf8               Lambda_hasReturnTest.java
  #68 = Utf8               BootstrapMethods
  #69 = Methodref          #70.#72        // java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #70 = Class              #71            // java/lang/invoke/LambdaMetafactory
  #71 = Utf8               java/lang/invoke/LambdaMetafactory
  #72 = NameAndType        #73:#74        // metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #73 = Utf8               metafactory
  #74 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #75 = MethodHandle       #6:#69         // invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
  #76 = MethodType         #26            //  (Ljava/lang/String;)Ljava/lang/String;
  #77 = Methodref          #1.#78         // com/class_/Lambda_hasReturnTest.lambda$0:(Ljava/lang/String;)Ljava/lang/String;
  #78 = NameAndType        #45:#26        // lambda$0:(Ljava/lang/String;)Ljava/lang/String;
  #79 = MethodHandle       #6:#77         // invokestatic com/class_/Lambda_hasReturnTest.lambda$0:(Ljava/lang/String;)Ljava/lang/String;
  #80 = MethodType         #26            //  (Ljava/lang/String;)Ljava/lang/String;
  #81 = Utf8               InnerClasses
  #82 = Class              #83            // java/lang/invoke/MethodHandles$Lookup
  #83 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #84 = Class              #85            // java/lang/invoke/MethodHandles
  #85 = Utf8               java/lang/invoke/MethodHandles
  #86 = Utf8               Lookup
{
  public com.class_.Lambda_hasReturnTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 182: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Lambda_hasReturnTest;

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: invokedynamic #19,  0             // InvokeDynamic #0:printSomeInfo:()Lcom/class_/Lambda_hasRetrun;
         5: astore_1                                ------------>存到本地变量表中
         6: aload_1                                 ------------>将本地变量lambda的值压入值栈
         7: ldc           #20                 // String hello-->将hello值压入值栈
         9: invokeinterface #22,  2           // InterfaceMethod com/class_/Lambda_hasRetrun.printSomeInfo:(Ljava/lang/String;)Ljava/lang/String;
        14: astore_2                              ----------------->将方法调用的返回值存到本地变量表str中
        
        15: getstatic     #27                 // Field java/lang/System.out:Ljava/io/PrintStream;---->获得静态值System.out
        18: aload_2                                ----------->将hello存到值栈
        19: invokevirtual #33                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V  调用
        22: return
      LineNumberTable:
        line 188: 0
        line 190: 6
        line 193: 15
        line 194: 22
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      23     0  args   [Ljava/lang/String;
            6      17     1 lambda   Lcom/class_/Lambda_hasRetrun;
           15       8     2   str   Ljava/lang/String;
}
SourceFile: "Lambda_hasReturnTest.java"
BootstrapMethods:
  0: #75 invokestatic java/lang/invoke/LambdaMetafactory.metafactory:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #76 (Ljava/lang/String;)Ljava/lang/String;
      #79 invokestatic com/class_/Lambda_hasReturnTest.lambda$0:(Ljava/lang/String;)Ljava/lang/String;
      #80 (Ljava/lang/String;)Ljava/lang/String;
InnerClasses:
     public static final #86= #82 of #84; //Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
 * @author may
 *
 */
public class Lambda_hasReturnTest {
	
	
	public static void main(String[] args) {
		
		//str->{return str += " lambda";}或者str->str += " lambda"
		Lambda_hasRetrun lambda = (String str)->{return str += " lambda";};//或者(str)->{return str += " lambda";}因为lambda是可以推导出你需要什么养的类型
		
		String str = lambda.printSomeInfo("hello");
		
		
		System.out.println(str);
	}

}
