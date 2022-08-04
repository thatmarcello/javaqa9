package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    //геттер станции
    public int getCurrentStation() {
        return currentStation;
    }

    //сеттер станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9 || newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //переключение станции вперед
    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    //переключение станции назад
    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }

    //геттер громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    //сеттер громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10 || newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //кнопка "-"
    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //кнопка "+"
    public void turnUpVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }
}
