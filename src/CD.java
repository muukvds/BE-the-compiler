public class CD {

    private String title;
    private Song[] songs = new Song[10];

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
}
