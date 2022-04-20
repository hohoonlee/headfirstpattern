package ch11.dynamic;

public class PersonImpl implements Person {
	String name;
	String gender;
	String interests;
	int rating = 0;
	int ratingCount = 0;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterests() {
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public int getGeekRating() {
		if(ratingCount == 0) return 0;
		return rating / ratingCount;
	}
	public void setGeekRating(int rating) {
		this.rating += rating;
		this.ratingCount++;
	}

}