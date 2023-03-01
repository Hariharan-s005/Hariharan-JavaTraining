package commandpattern;

class NetflixExit implements Command
{
	Netflix netflix;
    public NetflixExit(Netflix netflix)
    {
        this.netflix=netflix;
    }
    public void execute()
    {
        netflix.exit();
    }
}