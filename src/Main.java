public class Main {
    public static void main(String[] args) {
    Mark mark = new Mark("Apple", "A1398","White");

    Screen screen = new Screen(15,"LG display","IPS");

    SSD ssd  = new SSD(512,4);

    RAM ram = new RAM(16,"Crucial");

    VideoKart videoKart = new VideoKart("Intel Iris Pro",2, "Intel");

    USBport usBport = new USBport("3.0", "id489",new String[]{"MegaSafe 2 ", "HDMI ",
            "ThunderBolt 2 ", "USB 3 ", "Headphone ", "SDXC card slot", });
    
    Keyboard keyboard = new Keyboard(true,false,"Scissors");




    }
}