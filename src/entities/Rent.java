package entities;

public class Rent {

	String name;
	String email;

	public Rent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Rent() {
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email;
	}
}
