public class Main {
    public static void main(String[] args) {
        CPU cpu=new CPU();
        CPU.Ram ram=cpu.new Ram();

        CPU cpu2= new CPU();
        CPU.Processor processor=cpu2.new Processor();

        MotherBoard matherboard = new MotherBoard();
        MotherBoard.USB usb= new MotherBoard.USB();


    }
}

