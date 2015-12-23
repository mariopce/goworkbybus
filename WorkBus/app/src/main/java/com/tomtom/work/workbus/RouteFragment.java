package com.tomtom.work.workbus;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tomtom.work.workbus.route.respons.RoutesList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the interface
 * to handle interaction events.
 * Use the {@link RouteFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RouteFragment extends Fragment {

    private static final String ARG_PARAM_ROUTE_LIST = "ARG_PARAM_ROUTE_LIST";
    private List<RoutesList> routeList;

    public RouteFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            routeList = (List<RoutesList>) getArguments().getSerializable(ARG_PARAM_ROUTE_LIST);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_route, container, false);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param routes
     *        Our routes
     *
     * @return A new instance of fragment RouteFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RouteFragment newInstance(ArrayList<RoutesList> routes) {
        RouteFragment fragment = new RouteFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM_ROUTE_LIST, routes);
        fragment.setArguments(args);
        return fragment;
    }
}
