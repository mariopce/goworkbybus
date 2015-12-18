package com.tomtom.work.workbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.common.base.Optional;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.tomtom.work.workbus.bus.RoutesResponseEvent;
import com.tomtom.work.workbus.route.RoutesExpandableAdapter;
import com.tomtom.work.workbus.route.respons.RoutesList;

import butterknife.Bind;
import butterknife.ButterKnife;
import timber.log.Timber;

import java.util.List;

public class ShowRoutesFragment extends Fragment {

    public static final String EVENT_KEY = "event";
    private List<RoutesList> routes;
    private RoutesList chooserRoute;

    public static ShowRoutesFragment newInstance(final RoutesResponseEvent event) {
        ShowRoutesFragment f = new ShowRoutesFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putSerializable(EVENT_KEY, event);
        f.setArguments(args);
        Timber.d("Create show routes fragment " + event);
        return f;
    }

    @Bind(R.id.route_recycler_view)
    RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RoutesResponseEvent event = (RoutesResponseEvent) getArguments().getSerializable(EVENT_KEY);
        routes = event.getRoutesLists();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_route_list, container, false);
        ButterKnife.bind(this, fragmentView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        RoutesExpandableAdapter routeExpandableAdapter = new RoutesExpandableAdapter(getActivity(),routes);
        recyclerView.setAdapter(routeExpandableAdapter);
        routeExpandableAdapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {
            @Override
            public void onListItemExpanded(int position) {
                chooserRoute = routes.get(position);
                ((MainActivity)getActivity()).setSendButtonVisibility(View.VISIBLE);
            }

            @Override
            public void onListItemCollapsed(int position) {

            }
        });
        return fragmentView;
    }

    public Optional<String> getChooserFinishTime() {
        if (chooserRoute==null){
            return Optional.absent();
        }
        return Optional.fromNullable(chooserRoute.getFinishTime().toString());
    }
}
