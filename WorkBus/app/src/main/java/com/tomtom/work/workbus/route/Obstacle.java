
package com.tomtom.work.workbus.route;

import javax.annotation.Generated;

import com.google.common.base.Objects;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Obstacle {

    @SerializedName("lat")
    @Expose
    private Integer lat;
    @SerializedName("lng")
    @Expose
    private Integer lng;

    /**
     * 
     * @return
     *     The lat
     */
    public Integer getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Obstacle withLat(Integer lat) {
        this.lat = lat;
        return this;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public Integer getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(Integer lng) {
        this.lng = lng;
    }

    public Obstacle withLng(Integer lng) {
        this.lng = lng;
        return this;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add("lat", lat)
                      .add("lng", lng)
                      .toString();
    }
}
