package com.hackerrank.test.some_interview_questions.cerner;

/**
 * Created by jackalhan on 10/14/17.
 */
public class Person {

    private String nameSurname;
    private int age;
    private Address address;

    Person(String nameSurname, int age, Address address) {
        this.nameSurname = nameSurname;
        this.address = address;
        this.age = age;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return this.address;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (age != person.age)
            return false;
        if (nameSurname != null ? !nameSurname.equals(person.nameSurname) : person.nameSurname != null)
            return false;
        return address != null ? address.equals(person.address) : person.address == null;
    }

    @Override public int hashCode() {
        int result = nameSurname != null ? nameSurname.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

}
