package ru.netology.radio;

public class Radio {
    private int countStation;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.countStation = 10;
    }

    public Radio(int countStation) {
       this.countStation = countStation;
    }


    //геттер станции
    public int getCurrentStation() {
        return currentStation;
    }

    //сеттер станции
    public void setCurrentStation(int currentStation) {
        if (currentStation > countStation - 1 || currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    //переключение станции вперед
    public void nextStation() {
        if (currentStation < countStation - 1) {
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
            currentStation = countStation - 1;
        }
    }

    //геттер громкости
    public int getCurrentVolume() {

        return currentVolume;
    }

    //сеттер громкости
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100 || currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    //кнопка "-"
    public void turnDownVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    //кнопка "+"
    public void turnUpVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
}
