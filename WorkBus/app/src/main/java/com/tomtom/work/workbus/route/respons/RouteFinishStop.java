
package com.tomtom.work.workbus.route.respons;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
public class RouteFinishStop implements Serializable{

    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("stopDepartureTime")
    @Expose
    private String stopDepartureTime;
    @SerializedName("stopArrivalTime")
    @Expose
    private String stopArrivalTime;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("informations")
    @Expose
    private Object informations;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("date")
    @Expose
    private String date;

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public RouteFinishStop withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * @return
     *     The street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 
     * @param street
     *     The street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public RouteFinishStop withStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * 
     * @return
     *     The stopDepartureTime
     */
    public String getStopDepartureTime() {
        return stopDepartureTime;
    }

    /**
     * 
     * @param stopDepartureTime
     *     The stopDepartureTime
     */
    public void setStopDepartureTime(String stopDepartureTime) {
        this.stopDepartureTime = stopDepartureTime;
    }

    public RouteFinishStop withStopDepartureTime(String stopDepartureTime) {
        this.stopDepartureTime = stopDepartureTime;
        return this;
    }

    /**
     * 
     * @return
     *     The stopArrivalTime
     */
    public String getStopArrivalTime() {
        return stopArrivalTime;
    }

    /**
     * 
     * @param stopArrivalTime
     *     The stopArrivalTime
     */
    public void setStopArrivalTime(String stopArrivalTime) {
        this.stopArrivalTime = stopArrivalTime;
    }

    public RouteFinishStop withStopArrivalTime(String stopArrivalTime) {
        this.stopArrivalTime = stopArrivalTime;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    public RouteFinishStop withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The informations
     */
    public Object getInformations() {
        return informations;
    }

    /**
     * 
     * @param informations
     *     The informations
     */
    public void setInformations(Object informations) {
        this.informations = informations;
    }

    public RouteFinishStop withInformations(Object informations) {
        this.informations = informations;
        return this;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    public RouteFinishStop withLng(String lng) {
        this.lng = lng;
        return this;
    }

    /**
     * 
     * @return
     *     The lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    public RouteFinishStop withLat(String lat) {
        this.lat = lat;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public RouteFinishStop withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The company
     */
    public Object getCompany() {
        return company;
    }

    /**
     * 
     * @param company
     *     The company
     */
    public void setCompany(Object company) {
        this.company = company;
    }

    public RouteFinishStop withCompany(Object company) {
        this.company = company;
        return this;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    public RouteFinishStop withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The date
     */
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    public RouteFinishStop withDate(String date) {
        this.date = date;
        return this;
    }

}
