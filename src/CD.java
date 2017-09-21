public class CD {

    private String title;
    private Song[] songs = new Song[10];

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(Song song)
    {
        boolean songAdded = false;
            for (int i = 0; i < songs.length; i++) {
                if (!songAdded) {
                    if (songs[i] == null) {
                        songs[i] = song;
                        songAdded = true;
                    }
                }
            }
        if (!songAdded) {
            System.out.println("CD is vol");
        }
    }

    public int getLength()
    {
        int totallength=0;
        for (Song song:songs) { totallength += song.getLength(); }
        return totallength;
    }

    public void printLongestTrack()
    {
        Song longgestSong= songs[0];
        int track=0;
        for (int i=0;i< songs.length; i++
             ) {
            if(songs[i].getLength() > longgestSong.getLength()){longgestSong = songs[i]; track=i+1;}

        }

        System.out.println("*** Longest Track on CD: "+title+" ***");
        printTrack(track,longgestSong);
    }

    public void printInfo()
    {
        for(int i=0 ;i < songs.length;i++)
        {
            printTrack(i+1, songs[i]);
        }
    }

    private void printTrack(int track, Song song)
    {
        System.out.println("Track "+track+": "+song.getTitle()+", "+song.getArtist()+", "+song.getLength()+" sec.");
    }
}
