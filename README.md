Implement the given TV class.

Your class should have the following:

3 instance variables:

channel – represents channels in the range 1-120. 

volume - represents the volume in the range 1-50. 

isOn – represents if the TV is on or off. It should be of type boolean and be assigned a default value false;



2 Constructors:

 - no-arg constructor that sets values of channel and volume to 1, and isOn to false.

- constructor that has 2 parameters, that initializes the variables channel and volume;



8 instance methods (All of them should have void return type). Please implement the logic of the methods based  on the given descrption :

turnOn() : Turns the TV on.

turnOff() : Turns the TV off.

setChannel(int newChannel) : if the TV is on and the channel is in the range between 1 and 120, both inclusive, set the channel to the newChannel.

setVolume(int newVolumeLevel) : if the TV is on and the volume is in the range between 1 and 50, both inclusive, set the volume to the newVolume.

channelUp() : if the TV is on and the channel is less than 120, increase the channel by one.

channelDown() : if the TV is on and the channel is more than 1, decrease the channel by one.

volumeUp() : if the TV is on and the volume is less than 50, increase the volume by one.

volumeDown() : if the TV is on and the volume is more than 1, decrease the volume by one.

 

Once your TV class is ready, test your TV class in the Main class:

                1.Create 2 TV objects using different constructors.

                2.Call the methods of the TV class by turning the TV on, changing the channel, changing the volume, etc.

                3.Print out the values of instance variables. 