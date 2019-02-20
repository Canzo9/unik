
/**
 * Write a description of class TimeStamp here.
 *TimeStamp is a class that compares two different times (values).
 *The smaller the value the earlier the time.
 * @author (Irini Canzoniere)
 * @version (20.2.2019)
 */


public class TimeStamp
{
    //@param time idicates a time, the smaller the number the earlier the time
    public int time;

    /**
     * Constructor for objects of class TimeStamp
     * @param time indicates a time, the smaller the number the earlier the time
     */
    public TimeStamp(int time)
    {
        
        this.time = time;

    }

    /**
     *
     * @param other is the TimeStamp we compare with this TimeStamp
     * @return true or false depending on whether the two TimeStamps are equal to each other or not.
     */
    public boolean equalTo(TimeStamp other){
        return this.time == other.time; 
         
    }
    


    /**
      @param other is the TimeStamp we compare with this TimeStamp
      @return a boolean: true if this TimeStamo is greater that the other TimeStamp, false otherwise
    */
    public boolean after(TimeStamp other){
         return this.time > other.time; 
            
    }



    //@param other is the TimeStamp we compare with this TimeStamp
    //@return a boolean: true if this TimeStamo is smaller that the other TimeStamp, false otherwise
    public boolean before(TimeStamp other){
        return this.time < other.time; 
           
}
    //@param other is the TimeStamp we compare with this TimeStamp
    //@return an int: the value indicates the distance between one TimeStamp and the other.
    public int getDurationUntil(TimeStamp other){
        return (this.time - other.time);

}
    //@param other is the TimeStamp we compare with this TimeStamp
    //@return a TimeStamp, returns the TimeStamp with the greater value (the later time)
    public TimeStamp getLater(TimeStamp other){
        if (this.after(other)) {
            return this;
        }else {
            return other;
        }   
    }
    //@param other is the TimeStamp we compare with this TimeStamp
    //@return a TimeStamp, returns the TimeStamp with the smaller value (the earlier time)
    public TimeStamp getEarlier(TimeStamp other){
        if (this.before(other)) {
            return this;
        }else {
            return other;
        }
    }
}
