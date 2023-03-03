package commandpattern;

//Class which implements Command interface
class NetflixPlay implements Command
{
    Netflix netflix;  //object for class Netflix

	//constructor that takes and assigns Netflix object
    public NetflixPlay(Netflix netflix)
    {
       this.netflix=netflix;
    }
    //execute method that calls exit method on the netflix object
    public void execute()
    {
       netflix.play();
    }
}