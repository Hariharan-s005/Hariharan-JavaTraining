package commandpattern;

class Spotify
{   
	//calls a method that prints a message
    public void open()
    {
        System.out.println("Welcome to Spotify");
    }
   //calls a method that prints a message
    public void close()
    {
        System.out.println("Exiting Spotify..");
    }
    //calls a method that prints a message
    public void setVolume(int volume)
    {
       System.out.println("Volume set to "+volume);
    }
    //calls a method that prints a message
    public void playSong()
    {
        System.out.println("Playing Song");
                           
    }
    
}