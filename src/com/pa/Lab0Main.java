package com.pa;

public class Lab0Main {
    public static void main(String[] args) {
        Person person = null;
        Group group = new Group(new Person(0, "Name_0"));
        for (int i = 0; i < 10; i++) {
            person = new Person(i, "Name_" + i);
            try {
                group.addMember(person);
            } catch (GroupException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(group.toString());

        group.changeChief(person);
        System.out.println(group.toString());

        group.deleteMember(new Person(3, "Name_3"));
        System.out.println(group.toString());

    }
}
