package commandpattern;


class SpotifyOpen implements Command
{
	 Spotify spotify;
     public SpotifyOpen(Spotify spotify)
     {
         this.spotify=spotify;
     }
     public void execute()
     {
    	 spotify.open();
    	 spotify.playSong();
    	 spotify.setVolume(20);
     }
}
