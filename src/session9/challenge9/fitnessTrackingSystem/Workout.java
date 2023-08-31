package session9.challenge9.fitnessTrackingSystem;

public class Workout {

    private static String workoutDate;
    private static int durationMinutes;
    private static int distance;
    private static int liftedWeight;

    public Workout(String workoutDate, int durationMinutes, int distance) {

    }

    public Workout(String workoutDate, int durationMinutes) {
    }

    public static void setWorkoutDate(String workoutDate) {
        Workout.workoutDate = workoutDate;
    }

    public static void setDurationMinutes(int durationMinutes) {
        Workout.durationMinutes = durationMinutes;
    }

    public static void setDistance(int distance) {
        Workout.distance = distance;
    }

    public static void setLiftedWeight(int liftedWeight) {
        Workout.liftedWeight = liftedWeight;
    }


    static class RunWorkout extends Workout {

        public RunWorkout(String workoutDate, int durationMinutes, int distance) {
            super(workoutDate, durationMinutes, distance);
        }

        public String printRunWorkout() {
            return "Run workout: " + workoutDate + ", " + durationMinutes + " minutes, " + distance + " kilometers";
        }
    }

    static class YogaWorkout extends Workout {

        public YogaWorkout(String workoutDate, int durationMinutes) {
            super(workoutDate, durationMinutes);
        }

        public String printYogaWorkout() {
            return "Yoga workout: " + workoutDate + ", " + durationMinutes + " minutes.";
        }
    }

    static class WeightliftingWorkout extends Workout {

        public WeightliftingWorkout(String workoutDate, int durationMinutes, int liftedWeight) {
            super(workoutDate, durationMinutes, liftedWeight);
        }

        public String printWeightLiftingWorkout() {
            return "Weightlifting workout" + workoutDate + ", " + durationMinutes + " minutes, " + liftedWeight + "kg";
        }
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutDate='" + workoutDate + '\'' +
                ", durationMinutes=" + durationMinutes +
                ", distance=" + distance +
                ", liftedWeight=" + liftedWeight +
                '}';
    }
}
