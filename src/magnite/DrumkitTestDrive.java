package magnite;

public class DrumkitTestDrive {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();


        if (d.snare == true){
            d.playSnare();
        }


    }
}
