package com.company;

/**
 * Created by Dudaizhong on 2016/4/18.
 */
public class Student {

    public int Sno;
    public String name;
    public String sex;
    public int age;
    public String Sinst;

    public Student() {
    }

    public Student(int sno, String name, String sex, int age, String sinst) {
        Sno = sno;
        this.name = name;
        this.sex = sex;
        this.age = age;
        Sinst = sinst;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSinst() {
        return Sinst;
    }

    public void setSinst(String sinst) {
        Sinst = sinst;
    }


    @Override
    public String toString() {
        return "Student{" +
                "Sno=" + Sno +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", Sinst='" + Sinst + '\'' +
                '}';
    }
}
