package com.huihuang.entity;

public class Student {
    private Integer useId;
    private String useName;
    private String passWord;

    public Student() {
    }

    public Student(Integer useId, String useName, String passWord) {
        this.useId = useId;
        this.useName = useName;
        this.passWord = passWord;
    }

    public Integer getUseId() {
        return useId;
    }

    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "useId=" + useId +
                ", useName='" + useName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
