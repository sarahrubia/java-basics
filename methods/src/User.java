public class User {
  public static void main(String[] args) throws Exception {
    SmartTV smartTv = new SmartTV();

    System.out.println("Tv ligada? " + smartTv.isOn);
    smartTv.turnOn();
    System.out.println("Tv ligada? " + smartTv.isOn);

    smartTv.turnOff();
    System.out.println("Tv ligada? " + smartTv.isOn);

    System.out.println("Volume atual: " + smartTv.volume);
    smartTv.turnVolumeUp();
    smartTv.turnVolumeUp();
    smartTv.turnVolumeUp();
    System.out.println("Volume atual: " + smartTv.volume);

    smartTv.turnVolumeDown();
    smartTv.turnVolumeDown();
    System.out.println("Volume atual: " + smartTv.volume);

    System.out.println("Canal atual: " + smartTv.channel);
    smartTv.changeChannel(7);
    System.out.println("Canal atual: " + smartTv.channel);
    smartTv.changeChannelDown();
    System.out.println("Canal atual: " + smartTv.channel);
    smartTv.changeChannelUp();
    System.out.println("Canal atual: " + smartTv.channel);

  }
}
