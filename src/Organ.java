public class Organ {

    private String mName;
    private String mMedicalCondition;

    public Organ(String newName, String newCondition){

        mName = newName;
        mMedicalCondition = newCondition;
    }

    public void getDetails() {
        System.out.println("Name: " + mName);
        System.out.println("Medical Condition: " + mMedicalCondition);
    }

    public void setCondition(String newCondition) {
        
        mMedicalCondition = newCondition;

    }

    public String getCondition() {
        
        return mMedicalCondition;
    }

    public String getName() {
        return mName;
    }

    public void setName(String newName) {
        mName = newName;
    }
    
}