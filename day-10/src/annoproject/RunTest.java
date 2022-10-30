package annoproject;

import java.lang.annotation.Annotation;

public class RunTest {
	public static void main(String[] args) {
		System.out.println("testing....");
		int passed=0 ,failed =0 , ignore=0;
		
		Class<TestApp>obj= TestApp.class;
		if(obj.isAnnotationPresent(TesterInfo.class)) {
			
			Annotation annotation= obj.getAnnotation(TesterInfo.class);
			TesterInfo testerInfo=(TesterInfo)annotation;
			System.out.printf("%nPriority :%s ", testerInfo.priority());
			System.out.printf("%ncreatedBy :%s ", testerInfo.createdBy());
			System.out.printf("%nTags : ");
			int tagLength =testerInfo.tags().length;
			for(String tag : testerInfo.tags()) {
				if(tagLength >1) {
					System.out.println(tag + ", ");
				}else {
					System.out.println(tag);
				}
				tagLength--;
			}
			System.out.printf("%nLastModified : %s%n%n ", testerInfo.lastModified());
		}
	}

}
