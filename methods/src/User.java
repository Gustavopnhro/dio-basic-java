public class User {
    public static void main(String[] args) {
        TV SmartTv = new TV();

        SmartTv.turnOff();
        SmartTv.changeChannel(100);
        SmartTv.volumeUp();
        SmartTv.channelUp();

        System.out.println("Ligada: " + SmartTv.on);
        System.out.println("Canal: " + SmartTv.channel);
        System.out.println("Volume: " + SmartTv.volume);
    }
}
