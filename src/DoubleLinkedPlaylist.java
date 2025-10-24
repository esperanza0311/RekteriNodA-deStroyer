public class DoubleLinkedPlaylist {
    public song head;
    public song tail;
    public song current;


    public void addSong(String title){
        song songs=new song(String title);
        if (head==null){
            head=tail=current=songs;
        }else{
            tail.next=songs;
            songs.previous=tail;
            tail=songs;
        }
    }
    public void nextSong(){
        if(current!=null && current.next==null){
            current=current.next;
            System.out.println("<<NS:Now Playing:>>,"+current.next);
        }else{
            System.out.println("End of playlistt.");
        }
    }
    public void previousSong(){
        if (current!=null && current.previous!=null){
            current=current.previous;
            System.out.println("<<NS:Now Playing:>>,"+current);
        }else{
            System.out.println("Start of playlist");
        }
    }
}
