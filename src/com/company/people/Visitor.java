package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends People {
    private int groupSize;
    private String allergies;
    private boolean membership;
    private String homeAddress;

    protected List<Visitor> visitors = new ArrayList<>();

    public Visitor() {

    }

    public Visitor(int age, String name, char gender, String race, int groupSize, boolean membership, String homeAddress) {
        super(age, name, gender, race);
        this.groupSize = groupSize;
        this.membership = membership;
        this.homeAddress = homeAddress;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean hasMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void addVisitor(Visitor object) {
        visitors.add(object);
        System.out.println(object.getName() + " has been added");
    }

    public void viewVisitors() {
        for (int i = 0; i < visitors.size(); i++) {
            System.out.println("Name: " + visitors.get(i).getName() + "; " + "Age: " + visitors.get(i).getAge() + "; "
                    + "Gender: " + visitors.get(i).getGender() + "; " + "Race: " + visitors.get(i).getRace() + "; " + "GroupSize: " + visitors.get(i).getGroupSize()
                    + "; " + "Membership: " + visitors.get(i).hasMembership() + "; " + "HomeAddress: " + visitors.get(i).getHomeAddress());
        }
    }
}
