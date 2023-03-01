package commandpattern;

class Spotify
{
    public void open()
    {
        System.out.println("Welcome to Spotify");
    }
    public void close()
    {
        System.out.println("Exiting Spotify..");
    }
    public void setVolume(int volume)
    {
       System.out.println("Volume set to "+volume);
    }
    public void playSong()
    {
        System.out.println("Playing Song");
                           
    }
    
}