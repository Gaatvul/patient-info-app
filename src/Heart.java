public class Heart extends Organ {

    private static int mheartbeat;

    public Heart(String newName, String newCondition, int newHeartbeat) {
        super(newName, newCondition);
        mheartbeat = newHeartbeat;
    }

    public void setHeartbeat(int newHeartbeat) {
        mheartbeat = newHeartbeat;
    }

    public int getHeartbeat() {
        return mheartbeat;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heartbeat: " + mheartbeat);
    }

}