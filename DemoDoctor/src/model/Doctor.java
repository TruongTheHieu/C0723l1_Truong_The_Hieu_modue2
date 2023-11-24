package model;

public class Doctor {
    private int idDoctor;
    private String nameDoctor;

    private double ageDoctor;

    private String positionDoctor;

    public Doctor(int idDoctor, String nameDoctor, int ageDoctor, String positionDoctor) {
        this.idDoctor = idDoctor;
        this.nameDoctor = nameDoctor;
        this.ageDoctor = ageDoctor;
        this.positionDoctor = positionDoctor;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public int getAgeDoctor() {
        return (int) ageDoctor;
    }

    public void setAgeDoctor(int ageDoctor) {
        this.ageDoctor = ageDoctor;
    }

    public String getPositionDoctor() {
        return positionDoctor;
    }

    public void setPositionDoctor(String positionDoctor) {
        this.positionDoctor = positionDoctor;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "idDoctor: " + idDoctor +
                ", nameDoctor: " + nameDoctor +
                ", ageDoctor: " + ageDoctor +
                ", positionDoctor: " + positionDoctor +
                '}';
    }
}
