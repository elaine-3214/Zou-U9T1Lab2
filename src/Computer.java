public class Computer {
    //instance variables
    private int screenSize;
    private int memory;
    //constructor
    public Computer (int screenSize, int memory) {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

}
