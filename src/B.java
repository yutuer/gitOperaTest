package arrayTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class B {
	public static void main(String[] args) {
		aa(new String[0]);
		
		int a  =1 ;
		int b = -1;
		
		b = a++;
		System.out.println(b);
	}

	public static <T> void aa(T[] a) {
		T[]  tt = (T[])Array.newInstance(a.getClass().getComponentType(), 5);
		System.out.println();
	}

}
