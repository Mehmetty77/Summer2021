package day22dateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {
    public static void main(String[] args) {
        
        // you are gonna use date to learn how long does ittak eto run a block of codde o
        // to name your screenshots 
        // to put inside your reports
        
        //how to create Date object
        //LocalDate currentDate = new LocalDate();
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        
        System.out.println(currentDate.plusDays(5));
        System.out.println(currentDate.plusMonths(2));
        System.out.println(currentDate.plusYears(5));
        
        System.out.println(currentDate.plusDays(-5));
        System.out.println(currentDate.minusDays(5));
        
        //tomorrow
        LocalDate tomorrow = currentDate.plusDays(1);
        System.out.println("tomorrow: "+tomorrow);
        
        //yesterday
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("yesterday: "+yesterday);
        
        //please print 2 years+ 3 months+15 days later
        //method chaining
        System.out.println(currentDate.plusYears(2).plusMonths(3).plusDays(15));
        
        //Please print 5 months+ 27 days before
        System.out.println(currentDate.minusMonths(5).minusDays(27));
        
        
        //how to print just the value of year
        System.out.println(currentDate.getYear());
        
        //how to print just the value of month
        System.out.println(currentDate.getMonth());
        System.out.println(currentDate.getMonthValue());
        
        //get the day
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getDayOfYear());
        System.out.println(currentDate.getDayOfWeek());
        
        
        //to create a specific date
        LocalDate date1 = LocalDate.of(1995, 3, 3);
        System.out.println(date1);
        System.out.println(date1.getDayOfWeek());
        
        //compare 2 dates
        System.out.println(currentDate.isAfter(date1));//true
        System.out.println(currentDate.isBefore(date1));//false
        
        
        
        
        //yyyy-MM-dd====> default format
        //Please use upper case M for month. Do not use lower case. It is for minute
        
        LocalDate currentDate1 = LocalDate.now();
        System.out.println("before formatting: "+currentDate1);
        
        //to format our date we use DateTime Formatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println("after formatting: "+dateTimeFormatter.format(currentDate1));
        
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("after formatting: "+dateTimeFormatter1.format(currentDate1));
        
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        System.out.println("after formatting: "+dateTimeFormatter2.format(currentDate1));
        
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("after formatting: "+dateTimeFormatter3.format(currentDate1));
        
        System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3)));
        System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3).plusDays(11)));
        
       
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        
        DateTimeFormatter timeFormatter=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(timeFormatter.format(currentTime));
     
        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(1992,3,27);
        
        Period mamisAge=Period.between(d2, d1);
        
        int age=Period.between(d2, d1).getYears();
        System.out.println(age);
        
        
    }
}
