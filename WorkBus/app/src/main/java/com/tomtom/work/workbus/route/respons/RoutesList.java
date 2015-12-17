
package com.tomtom.work.workbus.route.respons;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RoutesList {

    @SerializedName("startTime")
    @Expose
    private StartTime startTime;
    @SerializedName("finishTime")
    @Expose
    private FinishTime finishTime;
    @SerializedName("longsStart")
    @Expose
    private Object longsStart;
    @SerializedName("latStart")
    @Expose
    private Object latStart;
    @SerializedName("longsFinish")
    @Expose
    private Object longsFinish;
    @SerializedName("latFinish")
    @Expose
    private Object latFinish;
    @SerializedName("numberOfTransfers")
    @Expose
    private Integer numberOfTransfers;
    @SerializedName("routeSections")
    @Expose
    private List<RouteSection> routeSections = new ArrayList<RouteSection>();
    @SerializedName("allStopNum")
    @Expose
    private Integer allStopNum;
    @SerializedName("routeFinishStop")
    @Expose
    private RouteFinishStop routeFinishStop;
    @SerializedName("routeStartStop")
    @Expose
    private RouteStartStop routeStartStop;
    @SerializedName("empty")
    @Expose
    private Boolean empty;

    /**
     * 
     * @return
     *     The startTime
     */
    public StartTime getStartTime() {
        return startTime;
    }

    /**
     * 
     * @param startTime
     *     The startTime
     */
    public void setStartTime(StartTime startTime) {
        this.startTime = startTime;
    }

    public RoutesList withStartTime(StartTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 
     * @return
     *     The finishTime
     */
    public FinishTime getFinishTime() {
        return finishTime;
    }

    /**
     * 
     * @param finishTime
     *     The finishTime
     */
    public void setFinishTime(FinishTime finishTime) {
        this.finishTime = finishTime;
    }

    public RoutesList withFinishTime(FinishTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 
     * @return
     *     The longsStart
     */
    public Object getLongsStart() {
        return longsStart;
    }

    /**
     * 
     * @param longsStart
     *     The longsStart
     */
    public void setLongsStart(Object longsStart) {
        this.longsStart = longsStart;
    }

    public RoutesList withLongsStart(Object longsStart) {
        this.longsStart = longsStart;
        return this;
    }

    /**
     * 
     * @return
     *     The latStart
     */
    public Object getLatStart() {
        return latStart;
    }

    /**
     * 
     * @param latStart
     *     The latStart
     */
    public void setLatStart(Object latStart) {
        this.latStart = latStart;
    }

    public RoutesList withLatStart(Object latStart) {
        this.latStart = latStart;
        return this;
    }

    /**
     * 
     * @return
     *     The longsFinish
     */
    public Object getLongsFinish() {
        return longsFinish;
    }

    /**
     * 
     * @param longsFinish
     *     The longsFinish
     */
    public void setLongsFinish(Object longsFinish) {
        this.longsFinish = longsFinish;
    }

    public RoutesList withLongsFinish(Object longsFinish) {
        this.longsFinish = longsFinish;
        return this;
    }

    /**
     * 
     * @return
     *     The latFinish
     */
    public Object getLatFinish() {
        return latFinish;
    }

    /**
     * 
     * @param latFinish
     *     The latFinish
     */
    public void setLatFinish(Object latFinish) {
        this.latFinish = latFinish;
    }

    public RoutesList withLatFinish(Object latFinish) {
        this.latFinish = latFinish;
        return this;
    }

    /**
     * 
     * @return
     *     The numberOfTransfers
     */
    public Integer getNumberOfTransfers() {
        return numberOfTransfers;
    }

    /**
     * 
     * @param numberOfTransfers
     *     The numberOfTransfers
     */
    public void setNumberOfTransfers(Integer numberOfTransfers) {
        this.numberOfTransfers = numberOfTransfers;
    }

    public RoutesList withNumberOfTransfers(Integer numberOfTransfers) {
        this.numberOfTransfers = numberOfTransfers;
        return this;
    }

    /**
     * 
     * @return
     *     The routeSections
     */
    public List<RouteSection> getRouteSections() {
        return routeSections;
    }

    /**
     * 
     * @param routeSections
     *     The routeSections
     */
    public void setRouteSections(List<RouteSection> routeSections) {
        this.routeSections = routeSections;
    }

    public RoutesList withRouteSections(List<RouteSection> routeSections) {
        this.routeSections = routeSections;
        return this;
    }

    /**
     * 
     * @return
     *     The allStopNum
     */
    public Integer getAllStopNum() {
        return allStopNum;
    }

    /**
     * 
     * @param allStopNum
     *     The allStopNum
     */
    public void setAllStopNum(Integer allStopNum) {
        this.allStopNum = allStopNum;
    }

    public RoutesList withAllStopNum(Integer allStopNum) {
        this.allStopNum = allStopNum;
        return this;
    }

    /**
     * 
     * @return
     *     The routeFinishStop
     */
    public RouteFinishStop getRouteFinishStop() {
        return routeFinishStop;
    }

    /**
     * 
     * @param routeFinishStop
     *     The routeFinishStop
     */
    public void setRouteFinishStop(RouteFinishStop routeFinishStop) {
        this.routeFinishStop = routeFinishStop;
    }

    public RoutesList withRouteFinishStop(RouteFinishStop routeFinishStop) {
        this.routeFinishStop = routeFinishStop;
        return this;
    }

    /**
     * 
     * @return
     *     The routeStartStop
     */
    public RouteStartStop getRouteStartStop() {
        return routeStartStop;
    }

    /**
     * 
     * @param routeStartStop
     *     The routeStartStop
     */
    public void setRouteStartStop(RouteStartStop routeStartStop) {
        this.routeStartStop = routeStartStop;
    }

    public RoutesList withRouteStartStop(RouteStartStop routeStartStop) {
        this.routeStartStop = routeStartStop;
        return this;
    }

    /**
     * 
     * @return
     *     The empty
     */
    public Boolean getEmpty() {
        return empty;
    }

    /**
     * 
     * @param empty
     *     The empty
     */
    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public RoutesList withEmpty(Boolean empty) {
        this.empty = empty;
        return this;
    }

}
