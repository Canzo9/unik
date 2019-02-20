
/**
 * TimeInterval compares two different time intervals.
 *
 * @author (Irini Canzonie)
 * @version (20.02.2019)
 */
public class TimeInterval
{
    /**
     * @param begin, is a TimeStamp
     * @param end, is a TimeStamp
     */
    TimeStamp begin;
    TimeStamp end;


    /**
     * Constructor for objects of class TimeInterval
     * @param begin, is a TimeStamp
     * @param end, is a TimeStamp
     */
    public TimeInterval(TimeStamp begin, TimeStamp end)
    {
        // initialise instance variables
        this.begin=begin;
        this.end=end;
    }


    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return a boolean, true if the two TimeIntervals are equal, false otherwise
     * 
     */
    public boolean equalTo(TimeInterval other){
        if (( this.begin.equalTo(other.begin )) && (this.end.equalTo(other.end ))){
            return true;
        }
          else return false;
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval 
     * @return boolean, true if this TimeInterval comes earlier than the other TimeInterval
     */
     public boolean before(TimeInterval other){
        if( this.end.after(other.begin )){
        return false;
        }
        else return true;
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return a boolean, true if this TimeInterval comes after the other TimeInterval
     */
     public boolean after(TimeInterval other){
        if ( this.begin.before(other.end)){
        return false;
        }
        else return true;
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval meets the begining of the other TimeInterval
     */
    public boolean meetsBeginOf(TimeInterval other){
        if ( this.end.time == ( other.begin.time - 1 )){
            return true;
        }
            else return false;
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval meets the end of the other TimeInterval
     */
    public boolean meetsEndOf(TimeInterval other){
        if ( this.begin.time == ( other.end.time + 1 )){
            return true;
        }
            else return false;
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval overlaps the begining of the other TimeInterval
     */
    public boolean overlapsBeginOf(TimeInterval other){
        return ( this.end.time - 1 ) == other.begin.time;
    }
    


    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval overlaps the end of the other TimeInterval
     */
    public boolean overlapsEndOf(TimeInterval other){
        return this.begin.time == ( other.end.time - 1);
    }


      
    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval is during the second TimeInterval 
     */  
    public boolean during(TimeInterval other){
        return (( this.begin.time > other.begin.time )
            && ( this.end.time < other.end.time ));
    }
      

    /** @param other, is a TimeInterval that will be compared with this TimeInterval
     *  @return boolean, true if the other TimeInterval is during this TimeInterval (inverse of during method)
     */
    public boolean contains(TimeInterval other){
        return (( this.begin.time < other.begin.time )
            && ( this.end.time > other.end.time ));
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if the other TimeInterval starts with this TimeInterval and is contained within it
     */
    public boolean starts(TimeInterval other){
        return (( this.begin.time == other.begin.time )
            && ( this.end.time < other.end.time ));
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval starts with the other TimeInterval and is contained within it (inverse of the starts methos)
     */
    public boolean startedBy(TimeInterval other){
        return (( this.begin.time == other.begin.time )
            && ( this.end.time > other.end.time ));
    }



    /**
     * @param other, is a TimeStamp that will be compared with this TimeInterval
     * @return boolean, true if the other TimeInterval ends with this TimeInterval and is contained by it (other TimeInterval is smaller than this TimeInterval)
     */
    public boolean finishes(TimeInterval other){
        return (( this.begin.time > other.begin.time )
            && ( this.end.time == other.end.time ));
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval ends with the other TimeInterval and is contained by it (this TimeInterval is smaller than other TimeInterval)
     */        
    public boolean finishedBy(TimeInterval other){
        return (( this.begin.time < other.end.time )
            && ( this.end.time == other.end.time ));
    }



    /**
     * @param other, is a TimeInterval that will be compared with the other TimeInterval 
     * @return boolean, true if this TimeInterval intersects the other TimeInterval
     */
    public boolean intersects(TimeInterval other){
        { return this.overlapsBeginOf(other)
            || this.overlapsEndOf(other)
            || this.equalTo(other)
            || this.during(other)
            || this.contains(other)
            || this.starts(other)
            || this.startedBy(other)
            || this.finishes(other)
            || this.finishedBy(other);
        }
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return boolean, true if this TimeInterval is disjointed from the other TimeInterval
     */
    public boolean disjoint(TimeInterval other){
        return this.after(other) || this.before(other)
        || this.meetsBeginOf(other) || this.meetsEndOf(other);
    }



    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return TimeInterval, returns TimeInterval between two TimeIntervals that intersect
     */
  /**  public TimeInterval getIntersection(TimeInterval other){
        if(this.intersects(other)){
          TimeInterval ti = new TimeInterval(this.after(other),this.before(other));
            return ti;
        }else{
            return null;
        }
    }
    */


    /**
     * @param other, is a TimeInterval that will be compared with this TimeInterval
     * @return TimeInterval, return TimeInterval of the hull between two TimeIntervals
     */
   /** public TimeInterval getHull(TimeInterval other){
       return TimeInterval(this.begin.getEarlier(other), 
        this.end.getLater(other));
   }
   */

}










