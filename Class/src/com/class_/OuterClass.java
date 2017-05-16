package com.class_;




/***
 * 
 * 
C:\Users\Administrator\workspace\asm\target\classes\com\asm>javap -c -v OuterCla
ss$1T.class
Classfile /C:/Users/Administrator/workspace/asm/target/classes/com/asm/OuterClas
s$1T.class
  Last modified 2017-4-28; size 686 bytes
  MD5 checksum c31a3c4b6fa2f1fad47b0a4ccbe162b2
  Compiled from "OuterClass.java"
class com.asm.OuterClass$1T
  minor version: 0
  major version: 52
  flags: ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/asm/OuterClass$1T
   #2 = Utf8               com/asm/OuterClass$1T
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               this$0
   #6 = Utf8               Lcom/asm/OuterClass;
   #7 = Utf8               val$a
   #8 = Utf8               I
   #9 = Utf8               <init>
  #10 = Utf8               (Lcom/asm/OuterClass;I)V
  #11 = Utf8               Code
  #12 = Fieldref           #1.#13         // com/asm/OuterClass$1T.this$0:Lcom/asm/OuterClass;

  #13 = NameAndType        #5:#6          // this$0:Lcom/asm/OuterClass;
  #14 = Fieldref           #1.#15         // com/asm/OuterClass$1T.val$a:I
  #15 = NameAndType        #7:#8          // val$a:I
  #16 = Methodref          #3.#17         // java/lang/Object."<init>":()V
  #17 = NameAndType        #9:#18         // "<init>":()V
  #18 = Utf8               ()V
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lcom/asm/OuterClass$1T;
  #23 = Utf8               print
  #24 = Fieldref           #25.#27        // java/lang/System.out:Ljava/io/PrintStream;

  #25 = Class              #26            // java/lang/System
  #26 = Utf8               java/lang/System
  #27 = NameAndType        #28:#29        // out:Ljava/io/PrintStream;
  #28 = Utf8               out
  #29 = Utf8               Ljava/io/PrintStream;
  #30 = Methodref          #31.#33        // java/io/PrintStream.println:(I)V
  #31 = Class              #32            // java/io/PrintStream
  #32 = Utf8               java/io/PrintStream
  #33 = NameAndType        #34:#35        // println:(I)V
  #34 = Utf8               println
  #35 = Utf8               (I)V
  #36 = Utf8               SourceFile
  #37 = Utf8               OuterClass.java
  #38 = Utf8               EnclosingMethod
  #39 = Class              #40            // com/asm/OuterClass
  #40 = Utf8               com/asm/OuterClass
  #41 = NameAndType        #42:#18        // test:()V
  #42 = Utf8               test
  #43 = Utf8               InnerClasses
  #44 = Utf8               T
{
  final com.asm.OuterClass this$0;                           ---------------------->编译器自动给方法内部类增加了一个引用外部类的字段叫做this$0
    descriptor: Lcom/asm/OuterClass;
    flags: ACC_FINAL, ACC_SYNTHETIC
    
  private final int val$a;                                            ----------------------->编译器给局部变量a在内部类中创建了一个final的的val$a，也许有人会问了，为什么是final的？你想想，如果这个不是final的，我把这个值改了，那么外面的那个值会随着变化吗？明显不会，所以为了统一，必须是final的
   descriptor: I
   flags: ACC_PRIVATE, ACC_FINAL, ACC_SYNTHETIC

  com.asm.OuterClass$1T(com.asm.OuterClass, int);  -------------------->编译器给这个内部类创建了一个构造器，这个构造器有这么几个参数（外部类，int）
    descriptor: (Lcom/asm/OuterClass;I)V
    flags:
    Code:
      stack=2, locals=3, args_size=3
         0: aload_0                                                         ----------------------->将参数this压入操作数栈
         1: aload_1                                                         ----------------------->将参数类型为OutClass的压入操作数栈
         2: putfield      #12                 // Field this$0:Lcom/asm/OuterClass;->给代表外部类的this$0赋值

         5: aload_0                                                        
         6: iload_2                                                          ----------------------->将a这个整型参数压入操作数栈
         7: putfield      #14                 // Field val$a:I    ----------------------->给这个局部赋值
        10: aload_0
        11: invokespecial #16                 // Method java/lang/Object."<init>":()V---------->调用父类的构造器

        14: return
      LineNumberTable:
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      15     0  this   Lcom/asm/OuterClass$1T;

  public void print();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1                                     -------------------------------->有人问，为什么是1啊，因为虚拟机会自动传入一个this参数
         0: getstatic     #24                 // Field java/lang/System.out:Ljava/io/PrintStream;

         3: aload_0
         4: getfield      #14                 // Field val$a:I
         7: invokevirtual #30                 // Method java/io/PrintStream.println:(I)V

        10: return
      LineNumberTable:
        line 14: 0
        line 16: 10
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  this   Lcom/asm/OuterClass$1T;
}
SourceFile: "OuterClass.java"
EnclosingMethod: #39.#41                // com.asm.OuterClass.test
InnerClasses:
     #44= #1; //T=class com/asm/OuterClass$1T

 * 
 * 
 * 
 * @author Administrator
 *
 */
public class OuterClass {
	
	
	public void test() {
		
		int a = 10;
		
		class T {
			
			public  void print() {
				
				System.out.println(a);
				
			}
			
		}
		
		
	}

}