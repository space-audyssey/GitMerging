
public class TheBubblyOne {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're the most awesome ever!");
		else if (score > 90)
			System.out.println("You're doing so great!");
		else if (score > 80)
			System.out.println("You can still succeed!");
		else if (score > 70)
			System.out.println("I have total faith in you!");
		else if (score > 60)
			System.out.println("You'll get it next time!");
		else
			System.out.println("You can still do well if you try hard!");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(80);
	}
}
