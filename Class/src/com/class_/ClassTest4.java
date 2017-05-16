package com.class_;


/**
 * 
 * javap -c -v -private  ClassTest4.class
 * 
 * 常量池项数量43个
 *Constant pool:
   #1 = Class              #2             // com/class_/ClassTest4
   #2 = Utf8               com/class_/ClassTest4
   #3 = Class              #4             // java/lang/Object
   #4 = Utf8               java/lang/Object
   #5 = Utf8               a
   #6 = Utf8               I
   #7 = Utf8               ConstantValue
   #8 = Integer            10
   #9 = Utf8               age
  #10 = Utf8               person
  #11 = Utf8               Lcom/class_/Person;
  #12 = Utf8               <init>
  #13 = Utf8               ()V
  #14 = Utf8               Code
  #15 = Methodref          #3.#16         // java/lang/Object."<init>":()V
  #16 = NameAndType        #12:#13        // "<init>":()V
  #17 = Fieldref           #1.#18         // com/class_/ClassTest4.age:I
  #18 = NameAndType        #9:#6          // age:I
  #19 = Utf8               LineNumberTable
  #20 = Utf8               LocalVariableTable
  #21 = Utf8               this
  #22 = Utf8               Lcom/class_/ClassTest4;
  #23 = Utf8               print
  #24 = Methodref          #1.#25         // com/class_/ClassTest4.print:()V
  #25 = NameAndType        #23:#13        // print:()V
  #26 = Fieldref           #27.#29        // java/lang/System.out:Ljava/io/PrintStream;
  #27 = Class              #28            // java/lang/System
  #28 = Utf8               java/lang/System
  #29 = NameAndType        #30:#31        // out:Ljava/io/PrintStream;
  #30 = Utf8               out
  #31 = Utf8               Ljava/io/PrintStream;
  #32 = Methodref          #33.#35        // java/io/PrintStream.println:(I)V
  #33 = Class              #34            // java/io/PrintStream
  #34 = Utf8               java/io/PrintStream
  #35 = NameAndType        #36:#37        // println:(I)V
  #36 = Utf8               println
  #37 = Utf8               (I)V
  #38 = Utf8               StackMapTable
  #39 = Utf8               printFloat
  #40 = Fieldref           #1.#41         // com/class_/ClassTest4.person:Lcom/class_/Person;
  #41 = NameAndType        #10:#11        // person:Lcom/class_/Person;
  #42 = Methodref          #43.#45        // com/class_/Person.getName:()Ljava/lang/String;
  #43 = Class              #44            // com/class_/Person
  #44 = Utf8               com/class_/Person
  #45 = NameAndType        #46:#47        // getName:()Ljava/lang/String;
  #46 = Utf8               getName
  #47 = Utf8               ()Ljava/lang/String;
  #48 = Utf8               SourceFile
  #49 = Utf8               ClassTest4.java
  
  NameAndType类型的常量只有在程序中显示调用才会出现,看见了吧，和ClassTest比较一下确实是这样的
  
 * @author may
 *
 */
public class ClassTest4 {//在字节码文件中的常量池中会存储这些字符，类com/class_/ClassTest; 
	
	private static final int  a = 10;
	private int age = 0; //int => I age = age
	
	private Person person;
	
	public void print() { //=>()V print => print
		
		if(age == 15) {
			
			print();
		}
		age += 1;
		
		System.out.println(234);
		
	}
	
	
	void printFloat(){  
	   person.getName();
	} 
	
	

}
