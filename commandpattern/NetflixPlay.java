package commandpattern;

class NetflixPlay implements Command
{
    Netflix netflix;
    public NetflixPlay(Netflix netflix)
    {
       this.netflix=netflix;
    }
    public void execute()
    {
       netflix.play();
    }
}