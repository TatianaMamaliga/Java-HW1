package session9.challenge9.fitnessTrackingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FitnessTrackingSystem {

    public static void main(String[] args) {
        List<Workout.RunWorkout> runWorkouts = new ArrayList<>();
        List<Workout.YogaWorkout> yogaWorkouts = new ArrayList<>();
        List<Workout.WeightliftingWorkout> weightliftingWorkouts = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the type of workout to log a workout: ");
        System.out.println("1. Running; 2. Weightlifting; 3. Yoga");
        int response = scanner.nextInt();

        if (response == 1) {
            System.out.println("Enter workout date (YYYY-MM-DD): ");
            String workoutDate = scanner.next();
            Workout.RunWorkout.setWorkoutDate(workoutDate);
            System.out.println(workoutDate);

            System.out.println("Enter duration (minutes): ");
            int duration = scanner.nextInt();
            Workout.RunWorkout.setDurationMinutes(duration);

            System.out.println("Enter distance (km): ");
            int distanceKm = scanner.nextInt();
            Workout.RunWorkout.setDistance(distanceKm);

            Workout.RunWorkout runLog = new Workout.RunWorkout(workoutDate, duration, distanceKm);
            runWorkouts.add(runLog);
            System.out.println(runLog.printRunWorkout());
        } else if (response == 2) {
            System.out.println("Enter workout date (YYYY-MM-DD): ");
            String workoutDate = scanner.next();
            Workout.WeightliftingWorkout.setWorkoutDate(workoutDate);
            System.out.println(workoutDate);

            System.out.println("Enter duration (minutes): ");
            int duration = scanner.nextInt();
            Workout.WeightliftingWorkout.setDurationMinutes(duration);

            System.out.println("Enter weight lifted (kg): ");
            int weight = scanner.nextInt();
            Workout.WeightliftingWorkout.setLiftedWeight(weight);

            Workout.WeightliftingWorkout weightliftingWorkout = new Workout.WeightliftingWorkout(workoutDate, duration, weight);
            weightliftingWorkouts.add(weightliftingWorkout);
            System.out.println(weightliftingWorkout.printWeightLiftingWorkout());
        } else {
            System.out.println("Enter workout date (YYYY-MM-DD): ");
            String workoutDate = scanner.next();
            Workout.YogaWorkout.setWorkoutDate(workoutDate);
            System.out.println(workoutDate);

            System.out.println("Enter duration (minutes): ");
            int duration = scanner.nextInt();
            Workout.YogaWorkout.setDurationMinutes(duration);

            Workout.YogaWorkout yogaLog = new Workout.YogaWorkout(workoutDate, duration);
            yogaWorkouts.add(yogaLog);
            System.out.println(yogaLog.printYogaWorkout());
        }
    }

}
