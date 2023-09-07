package session12.challenge12;

import java.util.List;

public class Admin extends User {

    public Admin(String ldap, String role) {
        super(ldap, role);
    }
    public Manager createUser(String ldap, String role) {
        Manager manager = new Manager();
        manager.setLdap(ldap);
        manager.setRole(role);
        return manager;
    }

    public ConstructionCrewMember createCrewMember(String ldap, String role) {
        ConstructionCrewMember constructionCrewMember = new ConstructionCrewMember();
        constructionCrewMember.setLdap(ldap);
        constructionCrewMember.setRole(role);
        return constructionCrewMember;
    }


    public ConstructionResource createConstructionResource(String name, int quantity, boolean isAdmin) {
        if (isAdmin) {
            ConstructionResource constructionResource = new ConstructionResource();
            constructionResource.setName(name);
            constructionResource.setQuantity(quantity);
            return constructionResource;
        }
        return null;
    }

    public void addResourceToList(List<ConstructionResource> materialsList, ConstructionResource constructionResource) {
        materialsList.add(constructionResource);
    }
}
