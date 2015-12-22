
package com.tomtom.work.workbus.route.respons;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Routes {

    @SerializedName("routesList")
    @Expose
    private List<RoutesList> routesList = new ArrayList<RoutesList>();
    @SerializedName("osmTime")
    @Expose
    private Integer osmTime;
    @SerializedName("routingTime")
    @Expose
    private Integer routingTime;
    @SerializedName("alternativerRoutesIndex")
    @Expose
    private Integer alternativerRoutesIndex;
    @SerializedName("nextTime")
    @Expose
    private String nextTime;
    @SerializedName("previousArrivalTime")
    @Expose
    private String previousArrivalTime;
    @SerializedName("nextDate")
    @Expose
    private String nextDate;
    @SerializedName("previousArrivalDate")
    @Expose
    private String previousArrivalDate;

    /**
     * 
     * @return
     *     The routesList
     */
    public List<RoutesList> getRoutesList() {
        return routesList;
    }

    /**
     * 
     * @param routesList
     *     The routesList
     */
    public void setRoutesList(List<RoutesList> routesList) {
        this.routesList = routesList;
    }

    public Routes withRoutesList(List<RoutesList> routesList) {
        this.routesList = routesList;
        return this;
    }

    /**
     * 
     * @return
     *     The osmTime
     */
    public Integer getOsmTime() {
        return osmTime;
    }

    /**
     * 
     * @param osmTime
     *     The osmTime
     */
    public void setOsmTime(Integer osmTime) {
        this.osmTime = osmTime;
    }

    public Routes withOsmTime(Integer osmTime) {
        this.osmTime = osmTime;
        return this;
    }

    /**
     * 
     * @return
     *     The routingTime
     */
    public Integer getRoutingTime() {
        return routingTime;
    }

    /**
     * 
     * @param routingTime
     *     The routingTime
     */
    public void setRoutingTime(Integer routingTime) {
        this.routingTime = routingTime;
    }

    public Routes withRoutingTime(Integer routingTime) {
        this.routingTime = routingTime;
        return this;
    }

    /**
     * 
     * @return
     *     The alternativerRoutesIndex
     */
    public Integer getAlternativerRoutesIndex() {
        return alternativerRoutesIndex;
    }

    /**
     * 
     * @param alternativerRoutesIndex
     *     The alternativerRoutesIndex
     */
    public void setAlternativerRoutesIndex(Integer alternativerRoutesIndex) {
        this.alternativerRoutesIndex = alternativerRoutesIndex;
    }

    public Routes withAlternativerRoutesIndex(Integer alternativerRoutesIndex) {
        this.alternativerRoutesIndex = alternativerRoutesIndex;
        return this;
    }

    /**
     * 
     * @return
     *     The nextTime
     */
    public String getNextTime() {
        return nextTime;
    }

    /**
     * 
     * @param nextTime
     *     The nextTime
     */
    public void setNextTime(String nextTime) {
        this.nextTime = nextTime;
    }

    public Routes withNextTime(String nextTime) {
        this.nextTime = nextTime;
        return this;
    }

    /**
     * 
     * @return
     *     The previousArrivalTime
     */
    public String getPreviousArrivalTime() {
        return previousArrivalTime;
    }

    /**
     * 
     * @param previousArrivalTime
     *     The previousArrivalTime
     */
    public void setPreviousArrivalTime(String previousArrivalTime) {
        this.previousArrivalTime = previousArrivalTime;
    }

    public Routes withPreviousArrivalTime(String previousArrivalTime) {
        this.previousArrivalTime = previousArrivalTime;
        return this;
    }

    /**
     * 
     * @return
     *     The nextDate
     */
    public String getNextDate() {
        return nextDate;
    }

    /**
     * 
     * @param nextDate
     *     The nextDate
     */
    public void setNextDate(String nextDate) {
        this.nextDate = nextDate;
    }

    public Routes withNextDate(String nextDate) {
        this.nextDate = nextDate;
        return this;
    }

    /**
     * 
     * @return
     *     The previousArrivalDate
     */
    public String getPreviousArrivalDate() {
        return previousArrivalDate;
    }

    /**
     * 
     * @param previousArrivalDate
     *     The previousArrivalDate
     */
    public void setPreviousArrivalDate(String previousArrivalDate) {
        this.previousArrivalDate = previousArrivalDate;
    }

    public Routes withPreviousArrivalDate(String previousArrivalDate) {
        this.previousArrivalDate = previousArrivalDate;
        return this;
    }

}
