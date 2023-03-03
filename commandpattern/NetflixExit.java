package commandpattern;

//Class which implements Command interface
class NetflixExit implements Command
{
	Netflix netflix;  //object for class Netflix
	
	//constructor that takes and assigns Netflix object
    public NetflixExit(Netflix netflix)
    {
        this.netflix=netflix;
    }
    //execute method that calls exit method on the netflix object
    public void execute()
    {
        netflix.exit();
    }
}