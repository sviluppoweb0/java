public class Person {
private String name;

public void setName(String name) { this.name = name; }
public String getName() { return name; }

public static void main(String [] arguments) {
	Person person = new Person();
	person.setName("Bob");
	int i = 5;
	setPersonName(person, i);
	System.out.println(person.getName() + " " + i);
	
	getAnotherObjectNot(person);
	System.out.println(person.getName());
}
private static void setPersonName(Person person, int num) {
	person.setName("Linda");
	num = 9;
	System.out.println("NUM dopo " + num);
}

private static void getAnotherObjectNot(Person person) {
person = new Person();
person.setName("George");
return person;
}

}