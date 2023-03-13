package be.intecbrussel;

public class AudioPlayer implements MediaPlayer {

    protected MediaAdapter mediaAdapter ;

    public AudioPlayer() {

        this.mediaAdapter = new MediaAdapter(AudioType.MP3.toString());
    }

    @Override
    public void play(String audioType, String fileName) {

        mediaAdapter = new MediaAdapter(audioType);

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + audioType + " file . Name: " + fileName);
        } else if (audioType.equalsIgnoreCase(AudioType.MP4.toString()) ||
        audioType.equalsIgnoreCase(AudioType.VLC.toString())){
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media " + audioType + " format not supported") ;
        }

    }
}
