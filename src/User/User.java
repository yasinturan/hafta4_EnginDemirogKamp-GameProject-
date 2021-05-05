package User;

import java.time.LocalDate;

public class User {

	String Name;
	String Surname;
	int NationalId;
	LocalDate Date;
	
	public User() {}

	public User(String name, String surname, int nationalId, LocalDate date) {
		super();
		Name = name;
		Surname = surname;
		NationalId = nationalId;
		Date = date;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public int getNationalId() {
		return NationalId;
	}

	public void setNationalId(int nationalId) {
		NationalId = nationalId;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	
	
}
