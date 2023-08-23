public class TV  {
    boolean on;
    int channel;
    int volume;

    public void turnOn (boolean actualState) {
        on = true;
    }

    public void turnOff () {
        on = false;
    }

    public void volumeUp () {
        volume ++;
    }

    public void volumeDown () {
        volume --;
    }

    public void changeChannel (int newChannel){
        channel = newChannel;
    }

    public void channelUp () {
        channel ++;
    }

    public void chanelDown () {
        channel --;
    }
}
