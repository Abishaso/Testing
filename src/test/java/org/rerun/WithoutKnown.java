package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class WithoutKnown implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation a, Class arg1, Constructor arg2, Method arg3) {
		a.setRetryAnalyzer(KnownFailed.class);
	}

}
