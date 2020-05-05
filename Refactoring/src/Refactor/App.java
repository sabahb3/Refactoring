package Refactor;

import java.util.ArrayList;
import java.util.List;
public class App {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setGender("F");
		m1.setBirthYear(2000);
		List<String> inter = new ArrayList<String>();
		inter.add("swimming");
		inter.add("reading");
		m1.setInterests(inter);
		m1.setMajor("CE");

		Member m2 = new Member();
		m2.setGender("F");
		m2.setBirthYear(2004);
		inter = new ArrayList<String>();
		inter.add("sport");
		inter.add("reading");
		m2.setInterests(inter);
		m2.setMajor("CE");

		List<Member> lis = new ArrayList<Member>();
		lis.add(m1);
		lis.add(m2);
		TeamAgency ta = new TeamAgency();
		ta.setMembers(lis);

		Member newMem = new Member();
		newMem.setGender("M");
		newMem.setBirthYear(2003);
		inter = new ArrayList<String>();
		inter.add("swimming");
		inter.add("reading");
		newMem.setInterests(inter);
		newMem.setMajor("CE");
		List<Member> res = ta.matchMember(newMem);
		System.out.println("The new  " + newMem + "  is matched with the following members:\n");
		for (Member m : res) {
			System.out.println(m);
		}
	}

}
