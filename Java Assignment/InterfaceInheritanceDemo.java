// Interface 1
interface Camera {
    void takePhoto();
}
// Interface 2
interface MusicPlayer {
    void playMusic();
}
// Class implementing both interfaces
class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo clicked!");
    }
    public void playMusic() {
        System.out.println("Music is playing...");
    }
}
// Main class
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.takePhoto();
        s.playMusic();
    }
}
