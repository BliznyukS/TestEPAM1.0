package zadaniya;

public class Madic {
    public static void main (String [] args) {
        MedicalStaff medic = new HeadDoctor ();
        if (medic instanceof Nurse) {
            System.out.println ("Nurse");
        } else if (medic instanceof Doctor) {
            System.out.println ("Doctor");
        } else if (medic instanceof HeadDoctor) {
            System.out.println ("HeadDoctor");
        }
    }
}
class MedicalStaff {}
class Doctor extends MedicalStaff {}
class Nurse extends MedicalStaff {}
class HeadDoctor extends Doctor {}
