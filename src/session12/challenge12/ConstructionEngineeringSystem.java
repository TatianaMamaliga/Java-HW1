package session12.challenge12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructionEngineeringSystem {

    public static void main(String[] args) {
        List<ConstructionResource> materialsList = new ArrayList<>();
        List<ConstructionCrewMember> employeeList = new ArrayList<>();

        Admin admin = new Admin("RGeorge", "admin");
        Manager manager = admin.createUser("KMelinda", "manager");
        ConstructionCrewMember crewMember1 = admin.createCrewMember("JWilliams", "team member");
        ConstructionCrewMember crewMember2 = admin.createCrewMember("LRains", "team member");
        ConstructionCrewMember crewMember3 = admin.createCrewMember("RBow", "team member");
        ConstructionCrewMember crewMember4 = admin.createCrewMember("RBow", "team leader");

        ConstructionResource cement = admin.createConstructionResource("Cement", 12, true);
        ConstructionResource sand = admin.createConstructionResource("Sand", 20, true);

        admin.addResourceToList(materialsList, cement);
        admin.addResourceToList(materialsList, sand);

        admin.addEmployeeToList(employeeList, crewMember4);
        admin.addEmployeeToList(employeeList, crewMember1);
        admin.addEmployeeToList(employeeList, crewMember2);
        admin.addEmployeeToList(employeeList, crewMember3);

        manager.viewEmployeeList(employeeList);
        manager.removeEmployeeFromList(employeeList, crewMember1);
        manager.promoteEmployee(crewMember2);
        manager.viewEmployeeList(employeeList);

        manager.viewMaterialList(materialsList);

        manager.sendEmail(manager.getLdap(), crewMember2.getLdap(),"Congratulations, you are promoted to team leader.");
        crewMember2.sendEmail(crewMember2.getLdap(), manager.getLdap(), "Thank you!");
    }
}
