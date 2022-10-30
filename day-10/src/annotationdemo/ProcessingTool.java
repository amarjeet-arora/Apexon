package annotationdemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

//processing tool uses JAva Reflection API to process the annotations 
public class ProcessingTool {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		 //class level
		Class<DemoClass> class1= DemoClass.class;
		processAnnotations(class1);
		//method level
		Method method= class1.getMethod("sayHello");
		processAnnotations(method);

	}
	
	static void processAnnotations(AnnotatedElement element) {
		System.out.println(" finding annotation on " + element.getClass().getName());
		
		Annotation[] annotations= element.getAnnotations();
		for(Annotation annotation: annotations) {
			if(annotation instanceof JavaFileInfo) {
				JavaFileInfo fileInfo=(JavaFileInfo)annotation;
				System.out.println("Author Name " +fileInfo.author());
			}
		}
	}

}
