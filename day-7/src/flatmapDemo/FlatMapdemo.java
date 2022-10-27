package flatmapDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapdemo {

	public static void main(String[] args) {
		 
		List<Developer> team= new ArrayList<Developer>();
		Developer dev= new Developer("esoteric");
		
		dev.add("java");
		dev.add("scala");
		dev.add("groovy");
		 
		
		Developer dev2= new Developer("pragmatic");
		
		dev2.add("C++");
		dev2.add(".NET");
		
		team.add(dev);
        team.add(dev2);		 
		
List<String> teamSkills=team.stream()
.map(d -> d.getSkills())
.flatMap(l -> l.stream())
.collect(Collectors.toList());
System.out.println(teamSkills);
	}

}
