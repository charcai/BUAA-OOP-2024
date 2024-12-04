class Person {
	private String name;
	private int age;
	private boolean isMale;
	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		if(gender.equals("Male")) {
			this.isMale = true;
		} else if(gender.equals("Female")){
			this.isMale = false;
		}
		else {
			System.out.println("Invalid Gender");
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return isMale? "Male" : "Female"; 
	}
	public void setAge(int age) {
		if(age >= 0 && age <= 130) {
			this.age = age;
		} else {
			System.out.println("Invalid Age");
		}
	}
	public void showAge() {
		System.out.println(this.name + "\'s Age: " + age);
	}
}

public class TestPerson {
	public static void main(String[] args) {
		Person c = new Person("Charactex", 19, "Male");
		c.showAge();
		c.setAge(c.getAge() + 1);
		c.showAge();

		Person z = new Person("Zeitgeist", 24, "Male");
		z.showAge();
		z.setAge(z.getAge() + 1);
		z.showAge();
	}
}