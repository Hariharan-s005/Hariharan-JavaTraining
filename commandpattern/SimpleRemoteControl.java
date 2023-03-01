package commandpattern;

class SimpleRemoteControl
{
    Command slot;  
    public void setCommand(Command command)
    {     
        slot=command;    
    } 
    public void buttonClicked()
    {
        slot.execute();
    }
}