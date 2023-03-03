package commandpattern;

//class that implements the Command interface
class SpotifyOpen implements Command
{
	 Spotify spotify;  //creates object for Spotify class
	 
	//constructor that takes and assigns the object of Spotify Class
     public SpotifyOpen(Spotify spotify)
     {
         this.spotify=spotify;
     }
     //method that calls open, playSong and setVolume method on spotify object
     public void execute()
     {
    	 spotify.open();
    	 spotify.playSong();
    	 spotify.setVolume(20);
     }
}
