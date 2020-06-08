public class Patient {

    private int mPatientAge;
    private String mPatientName;
    private Eye mPatientLeftEye;
    private Eye mPatientRightEye;
    private Skin mPatientSkin;
    private Stomach mPatientStomach;
    private Heart mPatientHeart;

    public Patient(int patientAge, String patientName, Eye patientLeftEye, Eye patientRightEye,
                    Skin patientSkin, Stomach patientStomach, Heart patientHeart) {

        this.mPatientAge = patientAge;
        this.mPatientName = patientName;
        this.mPatientLeftEye = patientLeftEye;
        this.mPatientRightEye = patientRightEye;
        this.mPatientSkin = patientSkin;
        this.mPatientStomach = patientStomach;
        this.mPatientHeart = patientHeart;

    }

    public int getPatientAge() {
        return mPatientAge;
    }

    public void setPatientAge(int mPatientAge) {
        this.mPatientAge = mPatientAge;
    }

    public String getPatientName() {
        return mPatientName;
    }

    public void setPatientName(String mPatientName) {
        this.mPatientName = mPatientName;
    }

    public Eye getmPatientLeftEye() {
        return mPatientLeftEye;
    }

    public void setmPatientLeftEye(Eye mPatientLeftEye) {
        this.mPatientLeftEye = mPatientLeftEye;
    }

    public Eye getmPatientRightEye() {
        return mPatientRightEye;
    }

    public void setmPatientRightEye(Eye mPatientRightEye) {
        this.mPatientRightEye = mPatientRightEye;
    }

    public Skin getmPatientSkin() {
        return mPatientSkin;
    }

    public void setmPatientSkin(Skin mPatientSkin) {
        this.mPatientSkin = mPatientSkin;
    }

    public Stomach getmPatientStomach() {
        return mPatientStomach;
    }

    public void setmPatientStomach(Stomach mPatientStomach) {
        this.mPatientStomach = mPatientStomach;
    }

    public Heart getmPatientHeart() {
        return mPatientHeart;
    }

    public void setmPatientHeart(Heart mPatientHeart) {
        this.mPatientHeart = mPatientHeart;
    }

}