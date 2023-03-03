package commandpattern;

//class which implements Command interface
class SpotifyClose implements Command
{
    Spotify spotify;  //creates object for Spotify class
    
    //constructor that takes and assigns the object of Spotify Class
    public SpotifyClose(Spotify spotify)
    {
        this.spotify = spotify;
    }
    //method that calls close method on spotify object
    public void execute()
    {
    	spotify.close();
    }
}