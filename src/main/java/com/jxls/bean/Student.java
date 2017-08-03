package com.jxls.bean;

/**
 * Created by lenovo on 2017/8/3.
 */
public class Student {
    private String stuName;
    private int stuAge;
    private int stuSex;
    private String stuNum;

    public Student(String stuName, int stuAge, int stuSex, String stuNum) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getStuSex() {
        return stuSex;
    }

    public void setStuSex(int stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuSex=" + stuSex +
                ", stuNum='" + stuNum + '\'' +
                '}';
    }
}
