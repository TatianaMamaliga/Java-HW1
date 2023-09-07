package session12.challenge12;

public class Manager extends User {
    public Manager() {
    }

    public void promoteEmployee(ConstructionCrewMember crewMember) {
        if (crewMember.getRole().equals("team member")) {
            crewMember.setRole("team leader");
            System.out.println(crewMember.getLdap() + " role is changed to team leader.");
        } else {
            System.out.println("Employee is already team leader / not eligible for promotion.");
        }
    }
}
