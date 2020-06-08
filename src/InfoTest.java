import java.util.Scanner;

public class InfoTest {
    public static void main(String[] args) throws Exception {

        Patient tom = new Patient(25, "Tom", new Eye("Left Eye", "Myopia", "Blue", true),
                new Eye("Right Eye", "None", "Blue", true),
                new Skin("Skin", "Burned"),
                new Stomach("Stomach", "PUD"),
                new Heart("Heart", "None", 65));

        String menu = "\nChoose an Organ:\n    1: Left Eye\n    2: Right Eye\n"
                + "    3: Heart\n    4: Stomach\n    5: Skin\n    6: Quit";

        System.out.println(tom.getPatientName());
        System.out.println(tom.getPatientAge());
        

        Scanner input = new Scanner(System.in);

        while(true) {


            System.out.println(menu);
            int choice = input.nextInt();

            switch (choice){

                case 1:
                    tom.getmPatientLeftEye().getDetails();
                    if(tom.getmPatientLeftEye().isOpened()){
                        System.out.println("   1. Close eye");
                        if (input.nextInt() == 1) {
                            tom.getmPatientLeftEye().closeEye();
                        }
                    } else {
                        System.out.println("   1. Open eye");
                        if (input.nextInt() == 1) {
                            tom.getmPatientLeftEye().openEye();
                        }
                    }
                    continue;

                case 2:
                    tom.getmPatientRightEye().getDetails();
                    if(tom.getmPatientRightEye().isOpened()){
                        System.out.println("   1. Close eye");
                        if (input.nextInt() == 1) {
                            tom.getmPatientRightEye().closeEye();
                        }
                    } else {
                        System.out.println("   1. Open eye");
                        if (input.nextInt() == 1) {
                            tom.getmPatientRightEye().openEye();
                        }
                    }
                    continue;

                case 3:
                    tom.getmPatientHeart().getDetails();
                    System.out.println("   1. Update heartbeat");
                    if (input.nextInt() == 1) {
                        System.out.println("Enter new heartbeat: ");
                        tom.getmPatientHeart().setHeartbeat(input.nextInt());;
                        System.out.println("Heartbeat update to: " + 
                                tom.getmPatientHeart().getHeartbeat());
                    } else continue;
                    continue;
                
                case 4:
                    tom.getmPatientStomach().getDetails();
                    System.out.println("   1. Digest");
                    if (input.nextInt() == 1) {
                        tom.getmPatientStomach().doDigest();
                    } else continue;
                    continue;

                case 5:
                    tom.getmPatientSkin().getDetails();
                    continue;

                case 6:
                    System.out.println("Goodbye " + tom.getPatientName());
                    input.close();
                    break;

                default:
                    System.out.println("Invalid Option, please try again");
                    continue;
            }
            
        

        }

    } // END OF Main

}
