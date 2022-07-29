
import java.io.File;         // import java.io.File
import java.io.IOException;   // for IOException
import java.util.Scanner;
import javax.sound.sampled.*;  // for AudioSystem

public class audio_player {

 public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
  
  Scanner scanner = new Scanner(System.in);

  // Try and catch has been written by myself, yop handle file not found exception
  try{
  File file = new File("D:/my download folder/Good Day.wav");
  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); // create an audio input stream from the file
  Clip clip = AudioSystem.getClip();  // create a clip to play the audio input stream
  clip.open(audioStream);    // open the clip to play the audio input stream
  
  String response = "";
 
  
  while(!response.equals("Q")) {
   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
   System.out.print("Enter your choice: ");
   
   response = scanner.next();
   response = response.toUpperCase();
   
   switch(response) {
    case ("P"): clip.start();
    break;
    case ("S"): clip.stop();
    break;
    case ("R"): clip.setMicrosecondPosition(0);
    break;
    case ("Q"): clip.close();
    break;
    default: System.out.println("Not a valid response");
   }
   
  }
  System.out.println("Byeeee!"); 
 }
 catch(Exception e){
  System.out.println("Error playing audio file / file not found");
 }
}}