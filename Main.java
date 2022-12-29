class Main {
  public static void main(String[] args) {
    

 TV tv = new TV();
 TV tv1 = new TV(23,11);

  System.out.println("Channel:"+ tv.channel);
  System.out.println("Volume:"+ tv.volume);

    tv.turnOff();
    tv.turnOn();
    tv.setChannel(46);
    tv.setVolume(5);
    
  System.out.println("Channel:"+ tv.channel);
  System.out.println("Volume:"+ tv.volume);     

    tv.channelDown();
    tv.volumeDown();
    System.out.println("Channel:"+ tv.channel);
  System.out.println("Volume:"+ tv.volume);
    System.out.println(" TV is on?"+ tv.isOn);
    
    
    //Test your class here
  }
}
  
