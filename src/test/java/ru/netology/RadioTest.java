package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {

    @Test
    public void shouldSetWave() {
        Radio wave = new Radio();

        wave.setWave(9);

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessMinWave() {
        Radio wave = new Radio();

        wave.setWave(-1);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetLessMaxWave() {
        Radio wave = new Radio();

        wave.setWave(11);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveHigher() {
        Radio wave = new Radio();
        wave.setWave(6);
        wave.waveNext();

        int expected = 7;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveLower() {
        Radio wave = new Radio();
        wave.setWave(4);
        wave.wavePrev();

        int expected = 3;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveToFirst() {
        Radio wave = new Radio();
        wave.setWave(9);
        wave.waveNext();

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveToLast() {
        Radio wave = new Radio();
        wave.setWave(0);
        wave.wavePrev();

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(9);
        currentVolume.increaseVolume();

        int expected = 10;
        int actual = currentVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(1);
        currentVolume.decreaseVolume();

        int expected = 0;
        int actual = currentVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessThanMinVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(0);
        currentVolume.decreaseVolume();

        int expected = 0;
        int actual = currentVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLessThanMaxVolume() {
        Radio currentVolume = new Radio();
        currentVolume.setCurrentVolume(10);
        currentVolume.increaseVolume();

        int expected = 10;
        int actual = currentVolume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}