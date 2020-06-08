public class Eye extends Organ {

    private String mEyeColour;
    private boolean mIsOpened;

    public Eye(String newName, String newCondition, String newEyeColour, 
            boolean newIsOpened) {
        super(newName, newCondition);
        mEyeColour = newEyeColour;
        mIsOpened = newIsOpened;
    }

    public void closeEye() {
        setIsOpened(false);
        System.out.println("Closing eye...");

    }

    public void openEye() {
        setIsOpened(true);
        System.out.println("Opening eye...");

    }

    public String getColour() {
        return mEyeColour;
    }

    public void setColour(String newEyeColour) {
        mEyeColour = newEyeColour;
    }

    public boolean isOpened() {
        return mIsOpened;
    }

    public void setIsOpened(boolean newIsOpened) {
        mIsOpened = newIsOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Eye Colour: " + getColour());
    }

}