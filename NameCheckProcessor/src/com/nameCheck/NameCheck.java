package com.nameCheck;

import javax.annotation.processing.ProcessingEnvironment;
import javax.lang.model.element.Element;

public class NameCheck {
	
	private ProcessingEnvironment processingEnv;

	public NameCheck(ProcessingEnvironment processingEnv) {
		this.processingEnv = processingEnv;
	}

	public void checkNames(Element element) {
		System.out.println(element.getSimpleName());
		new ElementScanner().scan(element);
		
		
	}

}
