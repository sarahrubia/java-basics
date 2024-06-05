public class SmartTV {
  // Atributos que permitem a alteração de estados no método
  boolean isOn = false;
  int channel = 1;
  int volume = 25;

  // Métodos
  public void turnOn() {
    isOn = true;
  }

  public void turnOff() {
    isOn = false;
  }

  public void turnVolumeUp() {
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void turnVolumeDown() {
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);

  }

  public void changeChannel(int newChannel) {
    channel = newChannel;
    System.out.println("Mudando para o canal: " + channel);
  }

  public void changeChannelUp() {
    channel++;
    System.out.println("Mudando para o canal: " + channel);

  }

  public void changeChannelDown() {
    channel--;
    System.out.println("Mudando para o canal: " + channel);
  }
}
