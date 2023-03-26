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
    public void shouldSetWaveHigher() {
        Radio wave = new Radio();
        wave.setWave(6);
        wave.waveNext(1);

        int expected = 7;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveLower() {
        Radio wave = new Radio();
        wave.setWave(4);
        wave.wavePrev(1);

        int expected = 3;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveToFirst() {
        Radio wave = new Radio();
        wave.setWave(9);
        wave.waveNext(1);

        int expected = 0;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveToLast() {
        Radio wave = new Radio();
        wave.setWave(0);
        wave.wavePrev(1);

        int expected = 9;
        int actual = wave.getWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeSet() {
        Radio volume = new Radio();

        volume.setVolume(8);

        int expected = 8;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeHigher() {
        Radio volume = new Radio();
        volume.setVolume(8);
        volume.volumeUp(1);

        int expected = 9;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeLower() {
        Radio volume = new Radio();
        volume.setVolume(8);
        volume.volumeDown(1);

        int expected = 7;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeOverLimit() {
        Radio volume = new Radio();
        volume.setVolume(10);
        volume.volumeUp(1);

        int expected = 10;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUnderLimit() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.volumeDown(1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}