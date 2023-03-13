package be.intecbrussel;

public class AudioPlayer implements MediaPlayer {

    protected MediaAdapter mediaAdapter ;

    public AudioPlayer() {

    }

    @Override
    public void play(String audioType, String fileName) {

        //

        if (audioType.equalsIgnoreCase(AudioType.MP3.toString())) {
            System.out.println("Playing " + audioType + " file . Name: " + fileName);
        } else if (audioType.equalsIgnoreCase(AudioType.MP4.toString()) ||
        audioType.equalsIgnoreCase(AudioType.VLC.toString())){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media " + audioType + " format not supported") ;
        }

    }
}
