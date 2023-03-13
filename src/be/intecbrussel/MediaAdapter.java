package be.intecbrussel;

public class MediaAdapter implements MediaPlayer{

    protected AdvancedMediaPlayer advancedMusicPlayer;

    // parametrul este un string aici
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(AudioType.MP4.toString())) {
            setAdvancedMusicPlayer(new Mp4Player());
        }else if (audioType.equalsIgnoreCase(AudioType.VLC.toString())){
            setAdvancedMusicPlayer(new VlcPlayer());
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(AudioType.VLC.toString())) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase(AudioType.MP4.toString())) {
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


