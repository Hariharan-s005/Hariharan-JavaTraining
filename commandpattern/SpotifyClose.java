package commandpattern;

class SpotifyClose implements Command
{
    Spotify spotify;
    public SpotifyClose(Spotify spotify)
    {
        this.spotify = spotify;
    }
    public void execute()
    {
    	spotify.close();
    }
}