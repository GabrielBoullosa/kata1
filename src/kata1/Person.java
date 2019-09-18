/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Person {
    private final String name;
    private final Date birthday;
    private final static int MILLISECONDS_PER_SECOND = 1000;
    private final static int SECONDS_PER_MINUTE = 60;
    private final static int MINUTE_PER_HOUR = 60;
    private final static int HOURS_PER_DAY = 24;
    private double DAYS_PER_YEAR = 365.25;
    

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAge(){
        Date date = new Date();
        long ms = date.getTime() - birthday.getTime();
        return toYears(ms);
    }
    
    private int toYears(long ms){
        return (int) (ms/MS_PER_YEAR() );
    }
    private double MS_PER_YEAR(){
        return MILLISECONDS_PER_SECOND * SECONDS_PER_MINUTE *
                MINUTE_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
             
    }
}
