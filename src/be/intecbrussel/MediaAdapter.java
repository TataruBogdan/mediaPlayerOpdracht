package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    protected AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            setAdvancedMusicPlayer(new Mp4Player());
        }else if (audioType.equalsIgnoreCase("vlc")){
            setAdvancedMusicPlayer(new VlcPlayer());
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }

    public AdvancedMediaPlayer getAdvancedMusicPlayer() {
        return advancedMusicPlayer;
    }

    public void setAdvancedMusicPlayer(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }


}


