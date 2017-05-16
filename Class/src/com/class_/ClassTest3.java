package com.class_;


/**
 * 常量池项数量43个
 *Constant pool:
   #1 = Class              #2             // com/class_/ClassTest3
   #2 = Utf8               com/class_/ClassTest3
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               a
   #6 = Utf8               I
   #7 = Utf8               ConstantValue
   #8 = Integer            10
   #9 = Utf8               age
  #10 = Utf8               <init>
  #11 = Utf8               ()V
  #12 = Utf8               Code
  #13 = Methodref          #3.#14         // java/lang/Object."<init>":()V
  #14 = NameAndType        #10:#11        // "<init>":()V
  #15 = Fieldref           #1.#16         // com/class_/ClassTest3.age:I
  #16 = NameAndType        #9:#6          // age:I
  #17 = Utf8               LineNumberTable
  #18 = Utf8               LocalVariableTable
  #19 = Utf8               this
  #20 = Utf8               Lcom/class_/ClassTest3;
  #21 = Utf8               print
  #22 = Methodref          #1.#23         // com/class_/ClassTest3.print:()V
  #23 = NameAndType        #21:#11        // print:()V
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
  #36 = Utf8               StackMapTable
  #37 = Utf8               printFloat
  #38 = Float              1234.5f
  #39 = Methodref          #31.#40        // java/io/PrintStream.println:(F)V
  #40 = NameAndType        #34:#41        // println:(F)V
  #41 = Utf8               (F)V
  #42 = Utf8               SourceFile
  #43 = Utf8               ClassTest3.java
  
  NameAndType类型的常量只有在程序中显示调用才会出现,看见了吧，和ClassTest比较一下确实是这样的
  
 * @author may
 *
 */
public class ClassTest3 {//在字节码文件中的常量池中会存储这些字符，类com/class_/ClassTest; 
	
	private static final int  a = 10;
	private int age = 0; //int => I age = age
	
	public void print() { //=>()V print => print
		
		if(age == 15) {
			
			print();
		}
		age += 1;
		
		System.out.println(234);
		
	}
	
	
	void printFloat(){  
	    System.out.println(1234.5f);  
	} 
	
	

}
