/**
 * This program demonstrates Command pattern
 *  @author Hariharan Shakthivel 
 */
package commandpattern;


public class RemoteControl
{
    public static void main(String[] args)
    {
       SimpleRemoteControl remote=new SimpleRemoteControl();  //creates object for SimpleRemoteControl class
       Netflix netflix= new Netflix();  //creates object for Netflix class
       Spotify spotify= new Spotify();  //creates object for Spotify class
    
        remote.setCommand(new SpotifyOpen(spotify));   //sets command 
        remote.buttonClicked();     //calls buttonClicked() method
        
        remote.setCommand(new SpotifyClose(spotify));  //sets command 
        remote.buttonClicked();     //calls buttonClicked() method
        
        remote.setCommand(new NetflixPlay(netflix));   //sets command 
        remote.buttonClicked();     //calls buttonClicked() method
        
        remote.setCommand(new NetflixExit(netflix));   //sets command 
        remote.buttonClicked();     //calls buttonClicked() method
     }
    
 }