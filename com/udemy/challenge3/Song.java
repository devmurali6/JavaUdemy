package  com.udemy.challenge3;

public class Song {
  
	   private String title;
	   private  int   Duration;
	   
   
	   public Song(String title, int Duration) {
		    this.title = title;
		    this.Duration =Duration;
		   
		} 
	   
	 
		public String getTitle() {
			return title;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
	
		public int getDuration() {
			return Duration;
		}
	
		public void setDuration(int duration) {
			Duration = duration;
		}
		
		public String toString(){
		 
			return title+"--"+Duration;
			
		}
		
	
}
