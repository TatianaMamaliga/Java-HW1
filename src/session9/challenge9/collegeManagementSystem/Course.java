package session9.challenge9.collegeManagementSystem;

import java.time.Duration;
import java.time.LocalTime;

public class Course {
    private String courseName;
    private String scheduledDay;
    private String duration;
    private String description;
    private String assignedProfessor;

    public Course(String courseName, String scheduledDay, String description, LocalTime startTime, LocalTime endTime) {
        this.courseName = courseName;
        this.scheduledDay = scheduledDay;
        this.description = description;
        getDuration(startTime, endTime);
    }

    public void getDuration(LocalTime startTime, LocalTime endTime) {
        Duration courseDuration = Duration.between(startTime, endTime);
        long hours = courseDuration.toHours();
        long minutes = courseDuration.toMinutes() - (courseDuration.toHours() * 60);
        this.duration = String.valueOf(hours) + " hours " + String.valueOf(minutes) + " minutes";
    }

    public void assignProfessor(String professor) {
        this.assignedProfessor = professor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", scheduledDay='" + scheduledDay + '\'' +
                ", duration=" + duration +
                ", description='" + description + '\'' +
                ", assignedProfessor='" + assignedProfessor + '\'' +
                '}';
    }
}
