package com.codegym.baitap.DemergingQueue;

public class Student {
  private String name;
  private String gender;
  private String birthDate;

  public Student(String name, String gender, String birthDate) {
    this.name = name;
    this.gender = gender;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }
  public int getYear(){
    return Integer.parseInt(birthDate.split("-")[2]);
  }
  public int getMonth() {
    return Integer.parseInt(birthDate.split("-")[1]);
  }
  public int getDay() {
    return Integer.parseInt(birthDate.split("-")[0]);
  }
}