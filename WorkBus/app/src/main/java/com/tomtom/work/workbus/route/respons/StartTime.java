
package com.tomtom.work.workbus.route.respons;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StartTime {

    @SerializedName("hour")
    @Expose
    private Integer hour;
    @SerializedName("minute")
    @Expose
    private Integer minute;
    @SerializedName("second")
    @Expose
    private Integer second;
    @SerializedName("nano")
    @Expose
    private Integer nano;

    /**
     * 
     * @return
     *     The hour
     */
    public Integer getHour() {
        return hour;
    }

    /**
     * 
     * @param hour
     *     The hour
     */
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public StartTime withHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    /**
     * 
     * @return
     *     The minute
     */
    public Integer getMinute() {
        return minute;
    }

    /**
     * 
     * @param minute
     *     The minute
     */
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public StartTime withMinute(Integer minute) {
        this.minute = minute;
        return this;
    }

    /**
     * 
     * @return
     *     The second
     */
    public Integer getSecond() {
        return second;
    }

    /**
     * 
     * @param second
     *     The second
     */
    public void setSecond(Integer second) {
        this.second = second;
    }

    public StartTime withSecond(Integer second) {
        this.second = second;
        return this;
    }

    /**
     * 
     * @return
     *     The nano
     */
    public Integer getNano() {
        return nano;
    }

    /**
     * 
     * @param nano
     *     The nano
     */
    public void setNano(Integer nano) {
        this.nano = nano;
    }

    public StartTime withNano(Integer nano) {
        this.nano = nano;
        return this;
    }

}
