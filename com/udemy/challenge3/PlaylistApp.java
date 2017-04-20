// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

package  com.udemy.challenge3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlaylistApp {

	static LinkedList<Song> playList = new LinkedList<Song>();

	public static void main(String[] args) {

		Album a = new Album("A1");

		a.newSong("abc1", 10);
		a.newSong("abc2", 11);
		a.newSong("abc3", 13);
		a.newSong("abc4", 14);

		Album a1 = new Album("A2");

		a1.newSong("bbb1", 10);
		a1.newSong("abc2", 11);
		a1.newSong("bbb3", 13);
		a1.newSong("bbb4", 14);

		a.addToPlayList("abc1", playList);
		a.addToPlayList("abc3", playList);
		a1.addToPlayList("bbb4", playList);
		a.addToPlayList("abc1", playList);
		a.addToPlayList("abc2", playList);
		a.addToPlayList("bbc2", playList);
		a1.addToPlayList("bbb3", playList);
		a.addToPlayList("bbb1", playList);

		ListIterator<Song> items= playList.listIterator();;
		Scanner in = new Scanner(System.in);
		boolean movingflag=true;

		boolean quit = false;

		while (!quit) {
			int option = in.nextInt();
			

			switch (option) {

			case 1:
				System.out.println(" <--Quit the PlayList--> ");
				quit = true;
				break;
			case 2:
				
				
				if(movingflag==false){
					
					  if(items.hasNext()){
						  items.next();
					  }
					movingflag=true;
					
				}

				if (items.hasNext()) {
					System.out.println(" <--Skip forward to the next song--> "+ items.next());
				}
				else{
					System.out.println("No songs to move forward");
					movingflag=false;
				}
			
				break;

			case 3:
				
				if(movingflag==true){
					 if(items.hasPrevious()){
						 items.previous();
					  }
					movingflag=false;
					
				}
				if (items.hasPrevious()) {
					System.out.println(" <--Skip backwards to a previous song--> "
							+ items.previous());
				}
				else{
					System.out.println("No songs to move previous");
					movingflag=true;
				}
				
				break;
		
			case 4:
				
				if(movingflag){
					if(items.hasPrevious()){
						System.out.println("now playing "+items.next().toString());
						movingflag=false;
					}else{
						System.out.println("we are at starting point");
					}
				}else{
					if(items.hasNext()){
						System.out.println("now playing "+items.next().toString());
						movingflag=true;
					}else{
						System.out.println("we are at starting point");
					}
					
					
					
				}
				
				break;

			case 5:
				
				System.out.println("<--List the songs in playList-->");
				Iterator<Song> x = playList.listIterator();
				while (null != x && x.hasNext()) {

					System.out.println(x.next().toString());
				}
				break;
			case 7:
				printMenu();
				break;
				
			case 6:
				if(playList.size()>0){
					items.remove();
					if(items.hasNext()){
						System.out.println("now playing:"+items.next().toString());
						
					}
					else if(items.hasPrevious()){
					    System.out.println("now playing"+items.previous().toString());
					}
				}
				break;
			
			
			}

		}
		
		

	}
	
	private static void printMenu(){
		
	  System.out.println("Available options");
	  System.out.println("1--to Quit\n"+
	                      "2-to Play next song\n"+
	                      "3--to Play previous songs\n"+
	                      "4-to Play current song\n"+
	                       "5--to list the songs\n"+
	                        "6-- to remove song\n"+
	                        "6-- to print available options\n");
		
		
	}

}
