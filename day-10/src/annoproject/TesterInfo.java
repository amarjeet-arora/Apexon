package annoproject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TesterInfo {
	
	public enum Priority{
		LOW, MEDIUM,HIGH
	}

	Priority priority() default Priority.MEDIUM;
	
	String [] tags () default "";
	String createdBy() default "Admin";
	String lastModified() default "30/10/2022";
}
