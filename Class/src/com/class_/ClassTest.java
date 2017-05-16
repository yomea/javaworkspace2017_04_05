package com.class_;


/**
 * class文件就相当于一个类的描述文件，像spring解析xml一样，JVM在按照它的规则去解析class文件
 * 常量池项数量18个
 * Constant pool:
   #1 = Class              #2             // com/class_/ClassTest
   #2 = Utf8               com/class_/ClassTest
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
  #15 = Utf8               Lcom/class_/ClassTest;
  #16 = Utf8               print
  #17 = Utf8               SourceFile
  #18 = Utf8               ClassTest.java
  
  
  NameAndType类型的常量只有在程序中显示调用才会出现
 * @author may
 *
 */
public class ClassTest {//在字节码文件中的常量池中会存储这些字符，类com/class_/ClassTest; 
	
	
	private int age; //int => I age = age
	
	public void print() { //=>()V print => print
		
		
		
	}

}
