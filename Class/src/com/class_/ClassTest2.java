package com.class_;


/**
 * 常量池项数量23个
 *Constant pool:
   #1 = Class              #2             // com/class_/ClassTest2
   #2 = Utf8               com/class_/ClassTest2
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
  #15 = Utf8               Lcom/class_/ClassTest2;
  #16 = Utf8               print
  #17 = Fieldref           #1.#18         // com/class_/ClassTest2.age:I
  #18 = NameAndType        #5:#6          // age:I             引用了#5，#6
  #19 = Methodref          #1.#20         // com/class_/ClassTest2.print:()V
  #20 = NameAndType        #16:#8         // print:()V
  #21 = Utf8               StackMapTable
  #22 = Utf8               SourceFile
  #23 = Utf8               ClassTest2.java
  
  
  NameAndType类型的常量只有在程序中显示调用才会出现,看见了吧，和ClassTest比较一下确实是这样的
  
 * @author may
 *
 */
public class ClassTest2 {//在字节码文件中的常量池中会存储这些字符，类com/class_/ClassTest; 
	
	
	private int age; //int => I age = age
	
	public void print() { //=>()V print => print
		
		if(age == 0) {
			
			print();
		}
		age += 1;
		
	}
	
	

}
