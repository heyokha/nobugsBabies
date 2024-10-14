package org.example.HwClock;

public class Clock implements Printable{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(String time) {
        String[] timeParts = time.split(":");
        this.hours = Integer.parseInt(timeParts[0]);;
        this.minutes = Integer.parseInt(timeParts[1]);;
        this.seconds = Integer.parseInt(timeParts[2]);;
    }

    public int getHours(){
        return this.hours;
    }

    public int getMinutes(){
        return this.minutes;
    }

    public int getSeconds(){
        return this.seconds;
    }

    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    @Override
    public void readTime() {
        System.out.printf("Текущее время: %02d:%02d:%02d\n", hours, minutes, seconds);
    }
}
