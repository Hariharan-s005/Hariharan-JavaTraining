package commandpattern;

class SimpleRemoteControl
{
    Command slot;  //creates object for Command class
    
    //sets the commmand class object value
    public void setCommand(Command command)
    {     
        slot=command;    
    } 
    //calls execute() method on the command oject
    public void buttonClicked()
    {
        slot.execute();
    }
}