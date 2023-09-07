package session12.challenge12;

public class ConstructionCrewMember implements EmailSender{

    private String ldap;
    private String role;

    public ConstructionCrewMember() {
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

    @Override
    public void sendEmail(String sender, String recipient, String message) {
        System.out.println("From: " + sender + "\n To: " + ldap + "\n" + "Message: " + message);
    }
}
