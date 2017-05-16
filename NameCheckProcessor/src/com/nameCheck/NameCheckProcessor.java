package com.nameCheck;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;


/**
 * javac -processor com.nameCheck.NameCheckProcessor ../src/com/nameCheck/Test.java
 * @author may
 *
 */
@SupportedAnnotationTypes(value="*")//支持所有的注解
@SupportedSourceVersion(SourceVersion.RELEASE_8)//仅支持JDK8的注解
public class NameCheckProcessor extends AbstractProcessor {
	
	private NameCheck nameCheck;

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		
		if(!roundEnv.processingOver()) {
			for(Element element : roundEnv.getRootElements()) {
				
				nameCheck.checkNames(element);
			}
			
		}
		
		return false;
	}
	
	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		// TODO Auto-generated method stub
		super.init(processingEnv);
		nameCheck = new NameCheck(processingEnv);
	}

}
