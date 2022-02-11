package com.technoelevate.javabasic;

import com.te.javabasic.accessmodifiers.AccessModifiersExample;

public class Test extends AccessModifiersExample {
	public static void main(String[] args) {
		Test differentPackage = new Test();
		differentPackage.publicMethod();
		differentPackage.protecedMethod();
	}
	
}
