package com.rain6.cxf.pojo;

public class Lawyer {
    private String id;

    private String name;

    private String sex;

    private String education;

    private String age;

    private String photo;

    private String certificateNumber;

    private String qualificationNumber;

    private String certificateType;

    private String workDate;

    private String officeId;

    public Lawyer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public String getQualificationNumber() {
        return qualificationNumber;
    }

    public void setQualificationNumber(String qualificationNumber) {
        this.qualificationNumber = qualificationNumber == null ? null : qualificationNumber.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    @Override
    public String toString() {
        return "Lawyer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", age='" + age + '\'' +
                ", photo='" + photo + '\'' +
                ", certificateNumber='" + certificateNumber + '\'' +
                ", qualificationNumber='" + qualificationNumber + '\'' +
                ", certificateType='" + certificateType + '\'' +
                ", workDate='" + workDate + '\'' +
                ", officeId='" + officeId + '\'' +
                '}';
    }
}