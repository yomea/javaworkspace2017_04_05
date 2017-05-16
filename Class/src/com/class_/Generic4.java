package com.class_;

import java.util.ArrayList;
import java.util.List;

/**
 * Classfile /D:/javaworkspace2017_04_05/Class/bin/com/class_/Generic4.class
  Last modified 2017-5-1; size 1139 bytes
  MD5 checksum 957b63979b30cbfbd5f26738b4752ba0
  Compiled from "Generic4.java"
public class com.class_.Generic4<T extends java.lang.Number> extends java.util.ArrayList<T>
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Class              #2             // com/class_/Generic4
   #2 = Utf8               com/class_/Generic4
   #3 = Class              #4             // java/util/ArrayList
   #4 = Utf8               java/util/ArrayList
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Utf8               Code
   #8 = Methodref          #3.#9          // java/util/ArrayList."<init>":()V
   #9 = NameAndType        #5:#6          // "<init>":()V
  #10 = Utf8               LineNumberTable
  #11 = Utf8               LocalVariableTable
  #12 = Utf8               this
  #13 = Utf8               Lcom/class_/Generic4;
  #14 = Utf8               LocalVariableTypeTable
  #15 = Utf8               Lcom/class_/Generic4<TT;>;
  #16 = Utf8               test
  #17 = Utf8               ()Ljava/lang/Number;
  #18 = Utf8               Signature
  #19 = Utf8               ()TT;
  #20 = Utf8               clazz
  #21 = Utf8               (Ljava/util/List;)Ljava/lang/Class;
  #22 = Utf8               <E:TT;>(Ljava/util/List<TE;>;)Ljava/lang/Class<TE;>;
  #23 = Utf8               e
  #24 = Utf8               Ljava/util/List;
  #25 = Utf8               Ljava/util/List<TE;>;
  #26 = Utf8               m
  #27 = Utf8               (I)Ljava/lang/Class;
  #28 = Utf8               <T:Ljava/lang/Object;>(I)Ljava/lang/Class<+TT;>;
  #29 = Utf8               n
  #30 = Utf8               I
  #31 = Utf8               mm
  #32 = Utf8               <E:TT;>(Ljava/util/List<TT;>;)Ljava/lang/Class<+TE;>;
  #33 = Utf8               list
  #34 = Utf8               Ljava/util/List<TT;>;
  #35 = Utf8               SourceFile
  #36 = Utf8               Generic4.java
  #37 = Utf8               <T:Ljava/lang/Number;>Ljava/util/ArrayList<TT;>;
{
  public com.class_.Generic4();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #8                  // Method java/util/ArrayList."<init>":()V
         4: return
      LineNumberTable:
        line 10: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Generic4;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   Lcom/class_/Generic4<TT;>;

  public T test();
    descriptor: ()Ljava/lang/Number;
    flags: ACC_PUBLIC
    Signature: #19                          // ()TT;
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 15: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4<TT;>;

  public <E extends T> java.lang.Class<E> clazz(java.util.List<E>);
    descriptor: (Ljava/util/List;)Ljava/lang/Class;
    flags: ACC_PUBLIC
    Signature: #22                          // <E:TT;>(Ljava/util/List<TE;>;)Ljava/lang/Class<TE;>;
    Code:
      stack=1, locals=2, args_size=2
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 20: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4;
            0       2     1     e   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4<TT;>;
            0       2     1     e   Ljava/util/List<TE;>;

  static <T extends java.lang.Object> java.lang.Class<? extends T> m(int);
    descriptor: (I)Ljava/lang/Class;
    flags: ACC_STATIC
    Signature: #28                          // <T:Ljava/lang/Object;>(I)Ljava/lang/Class<+TT;>;
    Code:
      stack=1, locals=1, args_size=1
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 25: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0     n   I

  public <E extends T> java.lang.Class<? extends E> mm(java.util.List<T>);
    descriptor: (Ljava/util/List;)Ljava/lang/Class;
    flags: ACC_PUBLIC
    Signature: #32                          // <E:TT;>(Ljava/util/List<TT;>;)Ljava/lang/Class<+TE;>;
    Code:
      stack=1, locals=2, args_size=2
         0: aconst_null
         1: areturn
      LineNumberTable:
        line 30: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4;
            0       2     1  list   Ljava/util/List;
      LocalVariableTypeTable:
        Start  Length  Slot  Name   Signature
            0       2     0  this   Lcom/class_/Generic4<TT;>;
            0       2     1  list   Ljava/util/List<TT;>;
}
SourceFile: "Generic4.java"
Signature: #37                          // <T:Ljava/lang/Number;>Ljava/util/ArrayList<TT;>;
 * @param <T>
 */
public class Generic4<T extends Number> extends ArrayList<T> {//<T:Ljava/lang/Number;>Ljava/util/ArrayList<TT;>;
	
	public T test() {
		
		
		return null;
	}
	
	public <E extends T> Class<E> clazz(List<E> e) {
		
		return null;
	}
	
	static <T> Class<? extends T> m (int n) {
		
		return null;
	}
	
	public <E extends T> Class<? extends E> mm (List<T> list) {
		
		return null;
	}

}
