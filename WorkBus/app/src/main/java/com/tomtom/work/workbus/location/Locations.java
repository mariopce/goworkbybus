package com.tomtom.work.workbus.location;

import android.location.Location;

/**
 * Created by mario on 15.12.15.
 */
public class Locations {
    //Util class
    private Locations() {
    }

    public static Location getOrionOfficeLocation(){
        Location l = new Location("orion");
        l.setLatitude(51.7604829);
        l.setLongitude(19.4624497);
        return l;
    }

    public static Location getAgrafOfficeLocation(){
        Location l = new Location("afraf");
        l.setLatitude(51.7590930);
        l.setLongitude(19.449537);
        return l;
    }
    public static Location getMediaOfficeLocation(){
        Location l = new Location("orion");
        l.setLatitude(51.7566488);
        l.setLongitude(19.4435929);
        return l;
    }
}
