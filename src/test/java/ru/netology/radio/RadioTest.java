package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelOverMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(12);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetChannelLessZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expextred = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expextred, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLessZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationNext() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.nextStation();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationPrev() {
        Radio radio = new Radio();

        radio.setCurrentStation(2);
        radio.previousStation();

        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationToFirstIfMaxNow() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeStationToMaxIfNowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolueUp() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.turnUpVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeVolueDown() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.turnDownVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeOverAllowed() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.turnUpVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeLowerAllowed() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}
