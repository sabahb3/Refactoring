package Refactor;
import java.util.ArrayList;
import java.util.List;
public class TeamAgency extends R {
	
	List<Member> Members;

	public void setMembers(List<Member> Members2) {
		Members = new ArrayList<Member>(Members2);
	}

	public List<Member> matchMember(Member member) {
		List<Member> res = new ArrayList<Member>();
	
		for (Member candidate : Members) {
			System.out.println("hello");
			// A matching team partner needs to have the opposite gender
			if (!candidate.getGender().contentEquals(member.getGender())) {
				// if both have the same major
				if (candidate.getMajor().equals(member.getMajor())) {
					// The age difference should be less than 5
					int yearDiff = Math.abs(candidate.getBirthYear() - member.getBirthYear());
					if (yearDiff <= 5) {
						for (String interest : candidate.getInterests()) {
							// The member and the candidate should have at least one interest
							if (member.getInterests().contains(interest)) {
								res.add(candidate);
								break;
								
							}
						}
					}
				}
			}
		}
		return res;
	}

}
