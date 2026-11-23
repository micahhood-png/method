package method;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		// Map<String,String> activity = new HashMap<>();
		// activity.put("running", running);
		// activity.put("jogging", jogging);
		// activity.put("jumprope", jumpRope);
		// activity.put("cycle", cycle);
		// System.out.println("What activity are you doing?");
		// String x = in.nextLine();
		// System.out.println(activity.get(x));
		// create the list
		Random rnd = new Random();
		String running = "Running: sprint for 30 seconds, rest for 30 seconds repeat 5 times";
		String jogging = "Jogging: jog for a minute, rest for 30 seconds. repeat for 30 minutes";
		String cycle = "Cycle: Do a bunch of strength excercises back-to-back without resting until all complete. Examples include burpees, squat thrusts, and squat jumps. repeat 3-4 times";
		String jumpRope = "Jump rope: Jump rope for 3 minutes.";
		String[] cardio = { running, jogging, cycle, jumpRope };
		// make the second list
		String dumbellPress = "Dumb bell press: 20 reps 22.5 pounds.";
		String chestFlies = "Chest flies: 10 reps lightweight";
		String pushups = "pushups: 10 full reps, nose an inch from the ground, chest an inch from the ground.";
		String pullups = "Pullups: as many as you can until failure.";
		String[] upperBody = { dumbellPress, chestFlies, pushups, pullups, };
		// make the third list
		String squats = "Squats: 30 weighted squats, dumbell or barbell acceptable.";
		String weightedLunges = "Weighted lunges: hold a weight in each hand and lunge. You can do this forward or backward.";
		String calfRaises = "Calf raises: stand on a plate or block and lower your heels to the floor before quickly raising them again. 30 reps.";
		String deadlifts = "Deadlifts: grab a barbell and keep your back flat before standing up, using your legs to lift the weight. repeat 5 - 6 times.";
		String[] legs = { squats, weightedLunges, calfRaises, deadlifts };
		// make the fourth list.
		String hollowHolds = "Hollow holds: pelvic tilt, crunch up with your arms straight out behind your head, then lift your legs straight out. hold for 30 seconds.";
		String crunches = "Crunches: pelvic tilt then crunch up. 30 reps.";
		String dragonflies = "Dragon flies: pelvic tilt, then lift your legs straight up, as high as you can, getting your hips up off the ground. as you lower, keep your butt off the ground as log as you can, all the while maintaining control.";
		String russianTwists = "Russian twists: in a sitting position, lean backwards while holding a weight. rotate your shoulders back and forth, tapping the weight on the ground as you do, keeping it from touching your body.  ";
		String[] core = { hollowHolds, crunches, dragonflies, russianTwists };
		// make the ultimate array
		String[][] activities = { cardio, upperBody, legs, core };
		System.out.println("Good Morning, ready to work out? Here are some movements you can do today.");
		int previousChoice=0;
		int exerciseChoice=-1;
		for (int x = 4; x > 0; x--) {
			int activitychoice = rnd.nextInt(activities.length);
			previousChoice = exerciseChoice;
			exerciseChoice = rnd.nextInt(activities[activitychoice].length);
			if (exerciseChoice == previousChoice) {
				x++;
				continue;
			}
			System.out.println(activities[activitychoice][exerciseChoice]);

		}
		System.out.println("Take one minutes breaks between sets. ");
		System.out.println("Have a good workout!");

		in.close();
	}

}