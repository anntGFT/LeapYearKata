package org.gft;

public class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    boolean isLeap(){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else
            return false;
    }
}
