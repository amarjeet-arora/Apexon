package flatmapDemo;

import java.util.HashSet;
import java.util.Set;

public class Developer {
	
	private String name;
	private Set<String> skills;
	@Override
	public String toString() {
		return "Developer [name=" + name + ", skills=" + skills + "]";
	}
	public Developer() {
		super();
	}
	public Developer(String name) {
		super();
		this.name = name;
		this.skills = new HashSet<String>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getSkills() {
		return skills;
	}
	public void setSkills(Set<String> skills) {
		this.skills = skills;
	}

	public void add(String skills) {
		this.skills.add(skills);
	}
}
