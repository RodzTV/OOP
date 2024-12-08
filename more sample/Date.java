public class Date{
    private int year, month,day; // attributes
    public Date(int year, int month, int day){ // constructor
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /* settes and getters  */
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    //toString method
    public String toString(){
        return String.format("%02d/%02d/%04d",month,day,year);
    }

    //setDate method to change the value of the 3 attributes
    public void setData(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
}