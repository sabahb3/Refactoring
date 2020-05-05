package Refactor;
import java.util.ArrayList;
import java.util.List;
public class Member {

	private String gender;
	private int birthYear;
	private String major;
	private List<String> interests = new ArrayList<String>();

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public List<String> getInterests() {
		return interests;
	}

	public void setInterests(List<String> interests) {
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "Member [gender=" + gender + ", birthYear=" + birthYear + ", major=" + major + ", interests=" + interests
				+ "]";
	}

	boolean isOppositeGender(Member candidate) {
		if (getGender() != candidate.getGender()) {
			return true;

		}
		return false;
	}

	boolean hasAppropriateAge(Member candidate) {
		return Math.abs(getBirthYear() - candidate.getBirthYear()) <= 3;
	}

	boolean hasOneInterestInCommon(Member candidate) {
		boolean hasCommonInterest = false;
		for (String interest : candidate.getInterests()) {
			// The member and the candidate should have at least one interest
			if (getInterests().contains(interest)) {
				hasCommonInterest = true;
				break;
			}
		}
		return hasCommonInterest;
	}

	boolean match(Member candidate) {
		boolean match = false;
		if (candidate.isOppositeGender(this)) {
			if (candidate.hasSameMajor(this)) {
				if (candidate.hasAppropriateAge(this)) {
					if (hasOneInterestInCommon(candidate)) {
						match = true;
					}
				}
			}
		}
		return match;
	}

	private boolean hasSameMajor(Member candidate) {
		// TODO Auto-generated method stub
		return (this.getMajor() == candidate.getMajor());
	}
	
}
