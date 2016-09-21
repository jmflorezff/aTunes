package net.sourceforge.atunes.model.player;

import net.sourceforge.atunes.kernel.modules.repository.audio.AudioFile;

import java.util.Comparator;

/**
 * Compares audio files by duration.
 */
public class PlayListDurationComparator implements Comparator<AudioFile> {
    public static PlayListDurationComparator comparator = new PlayListDurationComparator();

    @Override
    public int compare(AudioFile o1, AudioFile o2) {
        return Long.valueOf(o1.getDuration()).compareTo(o2.getDuration());
    }
}
