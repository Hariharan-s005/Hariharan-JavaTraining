/**
 * This program demonstrates Command pattern
 *  @author Hariharan Shakthivel 
 */
package commandpattern;


public class RemoteControl
{
    public static void main(String[] args)
    {
       SimpleRemoteControl remote=new SimpleRemoteControl();
       Netflix netflix= new Netflix();
       Spotify spotify= new Spotify();
 
       
        remote.setCommand(new SpotifyOpen(spotify));
        remote.buttonClicked();
        
        remote.setCommand(new SpotifyClose(spotify));
        remote.buttonClicked();
        
        remote.setCommand(new NetflixPlay(netflix));
        remote.buttonClicked();
        
        remote.setCommand(new NetflixExit(netflix));
        remote.buttonClicked();
     }
  }