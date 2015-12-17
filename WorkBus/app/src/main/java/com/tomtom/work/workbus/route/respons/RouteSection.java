
package com.tomtom.work.workbus.route.respons;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("org.jsonschema2pojo")
public class RouteSection {

    @SerializedName("informations")
    @Expose
    private String informations;
    @SerializedName("lineType")
    @Expose
    private String lineType;
    @SerializedName("lineName")
    @Expose
    private Object lineName;
    @SerializedName("lineLongName")
    @Expose
    private Object lineLongName;
    @SerializedName("agencyName")
    @Expose
    private Object agencyName;
    @SerializedName("lineId")
    @Expose
    private Object lineId;
    @SerializedName("tripId")
    @Expose
    private Object tripId;
    @SerializedName("agencyId")
    @Expose
    private Object agencyId;
    @SerializedName("direction")
    @Expose
    private Object direction;
    @SerializedName("asociatedShapes")
    @Expose
    private List<Object> asociatedShapes = new ArrayList<Object>();
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = new ArrayList<Object>();
    @SerializedName("intermediateStops")
    @Expose
    private List<IntermediateStop> intermediateStops = new ArrayList<IntermediateStop>();
    @SerializedName("startLat")
    @Expose
    private String startLat;
    @SerializedName("finishLat")
    @Expose
    private String finishLat;
    @SerializedName("startLng")
    @Expose
    private String startLng;
    @SerializedName("finishLng")
    @Expose
    private String finishLng;
    @SerializedName("sectionTime")
    @Expose
    private SectionTime sectionTime;
    @SerializedName("shortSection")
    @Expose
    private Boolean shortSection;
    @SerializedName("sectionStartStop")
    @Expose
    private SectionStartStop sectionStartStop;
    @SerializedName("sectionFinishStop")
    @Expose
    private SectionFinishStop sectionFinishStop;

    /**
     * 
     * @return
     *     The informations
     */
    public String getInformations() {
        return informations;
    }

    /**
     * 
     * @param informations
     *     The informations
     */
    public void setInformations(String informations) {
        this.informations = informations;
    }

    public RouteSection withInformations(String informations) {
        this.informations = informations;
        return this;
    }

    /**
     * 
     * @return
     *     The lineType
     */
    public String getLineType() {
        return lineType;
    }

    /**
     * 
     * @param lineType
     *     The lineType
     */
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public RouteSection withLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }

    /**
     * 
     * @return
     *     The lineName
     */
    public Object getLineName() {
        return lineName;
    }

    /**
     * 
     * @param lineName
     *     The lineName
     */
    public void setLineName(Object lineName) {
        this.lineName = lineName;
    }

    public RouteSection withLineName(Object lineName) {
        this.lineName = lineName;
        return this;
    }

    /**
     * 
     * @return
     *     The lineLongName
     */
    public Object getLineLongName() {
        return lineLongName;
    }

    /**
     * 
     * @param lineLongName
     *     The lineLongName
     */
    public void setLineLongName(Object lineLongName) {
        this.lineLongName = lineLongName;
    }

    public RouteSection withLineLongName(Object lineLongName) {
        this.lineLongName = lineLongName;
        return this;
    }

    /**
     * 
     * @return
     *     The agencyName
     */
    public Object getAgencyName() {
        return agencyName;
    }

    /**
     * 
     * @param agencyName
     *     The agencyName
     */
    public void setAgencyName(Object agencyName) {
        this.agencyName = agencyName;
    }

    public RouteSection withAgencyName(Object agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 
     * @return
     *     The lineId
     */
    public Object getLineId() {
        return lineId;
    }

    /**
     * 
     * @param lineId
     *     The lineId
     */
    public void setLineId(Object lineId) {
        this.lineId = lineId;
    }

    public RouteSection withLineId(Object lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * 
     * @return
     *     The tripId
     */
    public Object getTripId() {
        return tripId;
    }

    /**
     * 
     * @param tripId
     *     The tripId
     */
    public void setTripId(Object tripId) {
        this.tripId = tripId;
    }

    public RouteSection withTripId(Object tripId) {
        this.tripId = tripId;
        return this;
    }

    /**
     * 
     * @return
     *     The agencyId
     */
    public Object getAgencyId() {
        return agencyId;
    }

    /**
     * 
     * @param agencyId
     *     The agencyId
     */
    public void setAgencyId(Object agencyId) {
        this.agencyId = agencyId;
    }

    public RouteSection withAgencyId(Object agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 
     * @return
     *     The direction
     */
    public Object getDirection() {
        return direction;
    }

    /**
     * 
     * @param direction
     *     The direction
     */
    public void setDirection(Object direction) {
        this.direction = direction;
    }

    public RouteSection withDirection(Object direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 
     * @return
     *     The asociatedShapes
     */
    public List<Object> getAsociatedShapes() {
        return asociatedShapes;
    }

    /**
     * 
     * @param asociatedShapes
     *     The asociatedShapes
     */
    public void setAsociatedShapes(List<Object> asociatedShapes) {
        this.asociatedShapes = asociatedShapes;
    }

    public RouteSection withAsociatedShapes(List<Object> asociatedShapes) {
        this.asociatedShapes = asociatedShapes;
        return this;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    public List<Object> getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public RouteSection withAttributes(List<Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * 
     * @return
     *     The intermediateStops
     */
    public List<IntermediateStop> getIntermediateStops() {
        return intermediateStops;
    }

    /**
     * 
     * @param intermediateStops
     *     The intermediateStops
     */
    public void setIntermediateStops(List<IntermediateStop> intermediateStops) {
        this.intermediateStops = intermediateStops;
    }

    public RouteSection withIntermediateStops(List<IntermediateStop> intermediateStops) {
        this.intermediateStops = intermediateStops;
        return this;
    }

    /**
     * 
     * @return
     *     The startLat
     */
    public String getStartLat() {
        return startLat;
    }

    /**
     * 
     * @param startLat
     *     The startLat
     */
    public void setStartLat(String startLat) {
        this.startLat = startLat;
    }

    public RouteSection withStartLat(String startLat) {
        this.startLat = startLat;
        return this;
    }

    /**
     * 
     * @return
     *     The finishLat
     */
    public String getFinishLat() {
        return finishLat;
    }

    /**
     * 
     * @param finishLat
     *     The finishLat
     */
    public void setFinishLat(String finishLat) {
        this.finishLat = finishLat;
    }

    public RouteSection withFinishLat(String finishLat) {
        this.finishLat = finishLat;
        return this;
    }

    /**
     * 
     * @return
     *     The startLng
     */
    public String getStartLng() {
        return startLng;
    }

    /**
     * 
     * @param startLng
     *     The startLng
     */
    public void setStartLng(String startLng) {
        this.startLng = startLng;
    }

    public RouteSection withStartLng(String startLng) {
        this.startLng = startLng;
        return this;
    }

    /**
     * 
     * @return
     *     The finishLng
     */
    public String getFinishLng() {
        return finishLng;
    }

    /**
     * 
     * @param finishLng
     *     The finishLng
     */
    public void setFinishLng(String finishLng) {
        this.finishLng = finishLng;
    }

    public RouteSection withFinishLng(String finishLng) {
        this.finishLng = finishLng;
        return this;
    }

    /**
     * 
     * @return
     *     The sectionTime
     */
    public SectionTime getSectionTime() {
        return sectionTime;
    }

    /**
     * 
     * @param sectionTime
     *     The sectionTime
     */
    public void setSectionTime(SectionTime sectionTime) {
        this.sectionTime = sectionTime;
    }

    public RouteSection withSectionTime(SectionTime sectionTime) {
        this.sectionTime = sectionTime;
        return this;
    }

    /**
     * 
     * @return
     *     The shortSection
     */
    public Boolean getShortSection() {
        return shortSection;
    }

    /**
     * 
     * @param shortSection
     *     The shortSection
     */
    public void setShortSection(Boolean shortSection) {
        this.shortSection = shortSection;
    }

    public RouteSection withShortSection(Boolean shortSection) {
        this.shortSection = shortSection;
        return this;
    }

    /**
     * 
     * @return
     *     The sectionStartStop
     */
    public SectionStartStop getSectionStartStop() {
        return sectionStartStop;
    }

    /**
     * 
     * @param sectionStartStop
     *     The sectionStartStop
     */
    public void setSectionStartStop(SectionStartStop sectionStartStop) {
        this.sectionStartStop = sectionStartStop;
    }

    public RouteSection withSectionStartStop(SectionStartStop sectionStartStop) {
        this.sectionStartStop = sectionStartStop;
        return this;
    }

    /**
     * 
     * @return
     *     The sectionFinishStop
     */
    public SectionFinishStop getSectionFinishStop() {
        return sectionFinishStop;
    }

    /**
     * 
     * @param sectionFinishStop
     *     The sectionFinishStop
     */
    public void setSectionFinishStop(SectionFinishStop sectionFinishStop) {
        this.sectionFinishStop = sectionFinishStop;
    }

    public RouteSection withSectionFinishStop(SectionFinishStop sectionFinishStop) {
        this.sectionFinishStop = sectionFinishStop;
        return this;
    }

}
