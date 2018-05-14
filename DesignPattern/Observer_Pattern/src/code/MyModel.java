package code;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MyModel {
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";

	public ObservableList<Person> persons = FXCollections.observableArrayList();

	public void addToPersons(Person person) {
		System.out.println(persons);
		persons.add(person);
		System.out.println(persons);
	}

	public List<Person> getPersons() {
		return persons;
	}

	public MyModel() {
		persons.add(new Person("Lars", "Vogel"));
		persons.add(new Person("Peter", "Meier"));
	}
}
