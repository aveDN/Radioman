package ru.netology;

public class Radio {
    private int wave;
    private int volume;

    public int getWave() {
        return wave;
    }

    public int getVolume() {
        return volume;
    }

    public void setWave(int newWave) {
        if (newWave < 0) {
            wave = 9;
            return;
        }
        if (newWave > 9) {
            wave = 0;
            return;
        }
        wave = newWave;
    }

    public void waveNext(int next) {
        next = wave + 1;
        setWave(next);
    }

    public void wavePrev(int previous) {
        previous = wave - 1;
        setWave(previous);
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }

    public void volumeUp(int volUp) {
        volUp = volume + 1;
        setVolume(volUp);
    }

    public void volumeDown(int volDn) {
        volDn = volume - 1;
        setVolume(volDn);
    }
}