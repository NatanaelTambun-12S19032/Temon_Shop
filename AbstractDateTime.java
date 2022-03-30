/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temonshop;

/**
 *
 * @author Natanael Tambun
 */
public class AbstractDateTime {
    protected int year;
    protected int month;
    protected int date;
    protected int hour;
    protected int minunte;
    protected int second;

    public AbstractDateTime(int _year, int _month, int _date, int _hour, int _minute, int _second) {
        this.year = _year;
        this.month = _month;
        this.date = _date;
        this.hour = _hour;
        this.minunte = _minute;
        this.second = _second;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDate() {
        return this.date;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minunte;
    }

    public int getSecond() {
        return this.second;
    }
    
}
