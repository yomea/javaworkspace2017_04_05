package com.nameCheck;

import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementScanner8;

public class ElementScanner extends ElementScanner8<Void, Void> {

	@Override
	public Void visitVariable(VariableElement e, Void p) {
		// TODO Auto-generated method stub
		return super.visitVariable(e, p);
	}

	@Override
	public Void scan(Element e, Void p) {
		
		return super.scan(e, p);
	}

	@Override
	public Void visitPackage(PackageElement e, Void p) {
		System.out.println(e.getSimpleName());
		return super.visitPackage(e, p);
	}

	@Override
	public Void visitType(TypeElement e, Void p) {
		System.out.println(e.getSimpleName());
		return super.visitType(e, p);
	}

	@Override
	public Void visitExecutable(ExecutableElement e, Void p) {
		// TODO Auto-generated method stub
		return super.visitExecutable(e, p);
	}

	@Override
	public Void visitTypeParameter(TypeParameterElement e, Void p) {
		// TODO Auto-generated method stub
		return super.visitTypeParameter(e, p);
	}

	@Override
	public Void visitUnknown(Element e, Void p) {
		// TODO Auto-generated method stub
		return super.visitUnknown(e, p);
	}
	
	

}
