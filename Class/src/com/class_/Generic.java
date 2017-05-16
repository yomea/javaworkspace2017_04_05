package com.class_;

/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/Generic.class
  Last modified 2017-5-1; size 744 bytes
  MD5 checksum 438244b79de1c58c8d12d9956d104c46
  Compiled from "Generic.java"
public class com.class_.Generic<T extends java.lang.Object> extends java.lang.Object
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/Generic
   #2 = Utf8               com/class_/Generic
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
  #13 = Utf8               Lcom/class_/Generic;
  #14 = Utf8               LocalVariableTypeTable
  #15 = Utf8               Lcom/class_/Generic<TT;>;
  #16 = Utf8               test
  #17 = Utf8               ()Ljava/lang/Object;
  #18 = Utf8               Signature
  #19 = Utf8               ()TT;
  #20 = Utf8               clazz
  #21 = Utf8               (Ljava/lang/Object;)Ljava/lang/Class;
  #22 = Utf8               <E:TT;>(TE;)Ljava/lang/Class<TE;>;
  #23 = Utf8               e
  #24 = Utf8               Ljava/lang/Object;
  #25 = Utf8               TE;
  #26 = Utf8               SourceFile
  #27 = Utf8               Generic.java
  #28 = Utf8               <T:Ljava/lang/Object;>Ljava/lang/Object;
{
  public com.class_.Generic();
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
            0       5     0  this   Lcom/class_/Generic;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Generic<TT;>;

  public T test();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC
    Signature: #19                          // ()TT;
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 8: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic<TT;>;

  public <E extends T> java.lang.Class<E> clazz(E);
    descriptor: (Ljava/lang/Object;)Ljava/lang/Class;
    flags: ACC_PUBLIC
    Signature: #22                          // <E:TT;>(TE;)Ljava/lang/Class<TE;>;
    Code:
      stack=1, locals=2, args_size=2
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 13: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic;
            0       2     1     e   Ljava/lang/Object;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic<TT;>;
            0       2     1     e   TE;
}
SourceFile: "Generic.java"
Signature: #28                          // <T:Ljava/lang/Object;>Ljava/lang/Object;
 * @author may
 *
 * @param <T>
 */
public class Generic<T> {
	
	public T test() {//TT;
		
		
		return null;
	}
	
	public <E extends T> Class<E> clazz(E e) {//<E:TT;>(TE;)Ljava/lang/Class<TE;>;
		
		return null;
	}

}
