package  com.udemy.challenge3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String name;
	private ArrayList<Song> songs;

	public Album(String name) {
		this.name = name;
		this.songs = new ArrayList<Song>();

	}

	public boolean newSong(String title, int duration) {

		if (findSongExist(title) == null) {
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;

	}

	private Song findSongExist(String title) {

		for (Song temp : this.songs) {
			if (temp.getTitle().equals(title)) {

				return temp;
			}
		}

		return null;
	}

	public ArrayList<Song> getAlbums() {
		return songs;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playList) {

		Song existingSong = findSongExist(title);

		if (null != existingSong && playList.indexOf(existingSong) == -1) {

			playList.add(existingSong);
			return true;
		}

		System.out.println("Song with " + title + " not in the album");

		return false;

	}

}
