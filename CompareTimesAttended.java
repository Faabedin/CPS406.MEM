import java.util.*;

public class CompareTimesAttended implements Comparator<Member> {
	
	public int compare(Member member1, Member member2) {
		return member2.getTimesAttended() - member1.getTimesAttended();
	}
}