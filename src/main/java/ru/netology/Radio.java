package ru.netology;

public class Radio {
    private int wave;
    private int currentVolume;

    public int getWave() {
        return wave;
    }


    public void setWave(int wave) {
        if (wave < 0) {
            return;
        }
        if (wave > 9) {
            return;
        }
        this.wave = wave;
    }

    public void waveNext() {
        if (wave < 9) {
            wave++;
        } else {
            wave = 0;
        }
    }

    public void wavePrev() {
        if (wave > 0) {
            wave--;
        } else {
            wave = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
            return;
        }
    }

}