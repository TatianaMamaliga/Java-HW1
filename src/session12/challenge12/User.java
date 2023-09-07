package session12.challenge12;

import java.util.List;

public abstract class User implements EmailSender {

    private String ldap;
    private String role;

    protected User(String ldap, String role) {
        this.ldap = ldap;
        this.role = role;
    }

    protected User() {

    }

    public String getLdap() {
        return ldap;
    }

    public void setLdap(String ldap) {
        this.ldap = ldap;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void viewMaterialList(List<ConstructionResource> materialList) {
        System.out.println("The materials are: ");
        for (ConstructionResource material : materialList) {
            System.out.println("Resource name: " + material.getName() + ", quantity: " + material.getQuantity());
        }
    }

    public void viewEmployeeList(List<ConstructionCrewMember> employeeList) {
        System.out.println("Employee list: ");
        for (ConstructionCrewMember employee : employeeList) {
            System.out.println("Employee ldap: " + employee.getLdap() + " Employee role: " + employee.getRole());
        }
    }

    public int isTeamLeaderPresent(List<ConstructionCrewMember> employeeList) {
        int counter = 0;
        for (ConstructionCrewMember employee : employeeList) {
            if (employee.getRole().equals("team leader")) {
                counter++;
            }
        }
        return counter;
    }

    public void addEmployeeToList(List<ConstructionCrewMember> employeeList, ConstructionCrewMember crewMember) {
        if (isTeamLeaderPresent(employeeList) <= 1) {
            employeeList.add(crewMember);
        } else {
            System.out.println("Please add a team leader to crew manifest.");
        }
    }

    public void removeEmployeeFromList(List<ConstructionCrewMember> employeeList, ConstructionCrewMember crewMember) {
        if (crewMember.getRole().equals("team leader")){
            System.out.println("Please ensure there is always a team leader on the crew manifest.");
        }
        employeeList.remove(crewMember);
        System.out.println(crewMember.getLdap() + " is now removed from the list.");
    }

    @Override
    public void sendEmail(String sender, String recipient, String message) {
        System.out.println("From: " + sender + "\n To: " + recipient + "\n" + "Message: " + message);
    }
}
