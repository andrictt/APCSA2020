package DataLab;

public class BabyNames {
	
	int birthYear;
	String gender;
	String ethnicity;
	String name;
	int count;
	int rank;

	BabyNames(int by, String g, String e, String n, int c, int r) {
		birthYear = by;
		gender = g;
		ethnicity = e;
		name = n;
		count = c;
		rank = r;
	}

	public int getBirthYear() {
		return birthYear;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getEthnicity() {
		return ethnicity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCount() {
		return count;
	}
	public int getRank() {
		return rank;
	}
	

}