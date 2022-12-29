public class TV{
  int channel;
  int volume;
  boolean isOn;

  public TV(){
    channel = 1;
    volume = 1;
    isOn = false;
  }
    public TV(final int channel, final int volume){
    this.channel = channel;
    this.channel = volume;
    
  }
  public void turnOn(){
    isOn = true;
    System.out.println("TV is  turn on.");
    
  }
    public void turnOff(){
    isOn = false;
    System.out.println("TV is  turn off.");
}
    public void setChannel(final int newChannel){
    if(isOn == true && channel >= 1 && channel     <= 120){
      channel = newChannel;
    }
    }
      public void setVolume(final int newVolumeLevel){
      if(isOn == true && volume >= 1 && volume     <= 120){
      volume = newVolumeLevel;
      }
      }
        public void channelUP(){
      if(isOn == true && channel < 120){
        channel ++;
        
      }
        }  
          public void channelDown(){
      if(isOn == true && channel > 1){
        channel --;
     
    }
         }
    public void volumeUP(){
      if(isOn == true && volume < 50){
        volume ++;
     
    }
         }
    public void volumeDown(){
      if(isOn == true && volume > 1){
        volume --;
      }
    }

}