
public class TheTerminator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("That's OK");
		else if (score > 90)
			System.out.println("You're really bad at this, you know?");
		else if (score > 80)
			System.out.println("You can't possibly succeed in life");
		else if (score > 70)
			System.out.println("Wow, I didn't realize someone could do that badly");
		else if (score > 60)
			System.out.println("That's abysmal.");
		else
			System.out.println("You might as well dropout now");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(80);
	}
}
