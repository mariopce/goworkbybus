
package com.tomtom.work.workbus.route.req;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.common.base.Objects;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("org.jsonschema2pojo")
public class Route {

    @SerializedName("from")
    @Expose
    private From from;
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("routingType")
    @Expose
    private String routingType;
    @SerializedName("wheelchairAccessibleTripsOnly")
    @Expose
    private Boolean wheelchairAccessibleTripsOnly;
    @SerializedName("obstacles")
    @Expose
    private List<Obstacle> obstacles = new ArrayList<Obstacle>();

    /**
     * 
     * @return
     *     The from
     */
    public From getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(From from) {
        this.from = from;
    }

    public Route withFrom(From from) {
        this.from = from;
        return this;
    }

    /**
     * 
     * @return
     *     The to
     */
    public To getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(To to) {
        this.to = to;
    }

    public Route withTo(To to) {
        this.to = to;
        return this;
    }

    /**
     * 
     * @return
     *     The dateTime
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * 
     * @param dateTime
     *     The dateTime
     */
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Route withDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    /**
     * 
     * @return
     *     The routingType
     */
    public String getRoutingType() {
        return routingType;
    }

    /**
     * 
     * @param routingType
     *     The routingType
     */
    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public Route withRoutingType(String routingType) {
        this.routingType = routingType;
        return this;
    }

    /**
     * 
     * @return
     *     The wheelchairAccessibleTripsOnly
     */
    public Boolean getWheelchairAccessibleTripsOnly() {
        return wheelchairAccessibleTripsOnly;
    }

    /**
     * 
     * @param wheelchairAccessibleTripsOnly
     *     The wheelchairAccessibleTripsOnly
     */
    public void setWheelchairAccessibleTripsOnly(Boolean wheelchairAccessibleTripsOnly) {
        this.wheelchairAccessibleTripsOnly = wheelchairAccessibleTripsOnly;
    }

    public Route withWheelchairAccessibleTripsOnly(Boolean wheelchairAccessibleTripsOnly) {
        this.wheelchairAccessibleTripsOnly = wheelchairAccessibleTripsOnly;
        return this;
    }

    /**
     * 
     * @return
     *     The obstacles
     */
    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    /**
     * 
     * @param obstacles
     *     The obstacles
     */
    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public Route withObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
        return this;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                      .add("from", from)
                      .add("to", to)
                      .add("dateTime", dateTime)
                      .add("routingType", routingType)
                      .add("wheelchairAccessibleTripsOnly", wheelchairAccessibleTripsOnly)
                      .add("obstacles", obstacles)
                      .toString();
    }
}
