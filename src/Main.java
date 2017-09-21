public class Main {

    public static void main(String[] args)
    {
        CD cd = new CD();
        cd.setTitle("1984");
        Song song1 = new Song(); song1.setArtist("Van Halen"); song1.setLength(67); song1.setTitle("1984 (Instrumental)");
        Song song2 = new Song(); song2.setArtist("Van Halen"); song2.setLength(244); song2.setTitle("Jump");
        Song song3 = new Song(); song3.setArtist("Van Halen"); song3.setLength(212); song3.setTitle("Panama");
        cd.addSong(song1);
        cd.addSong(song2);
        cd.addSong(song3);
        cd.printLongestTrack();
        cd.printInfo();
    }
}
