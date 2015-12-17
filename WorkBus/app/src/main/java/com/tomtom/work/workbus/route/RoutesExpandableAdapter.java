package com.tomtom.work.workbus.route;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.common.base.Optional;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.tomtom.work.workbus.R;
import com.tomtom.work.workbus.route.respons.IntermediateStop;
import com.tomtom.work.workbus.route.respons.RouteSection;
import com.tomtom.work.workbus.route.respons.RoutesList;

import java.util.List;

public class RoutesExpandableAdapter extends ExpandableRecyclerAdapter<RouteViewHolder, RouteStepViewHolder> {

    private final LayoutInflater mInflater;

    /**
     * Primary constructor. Sets up {@link #mParentItemList} and {@link #mItemList}.
     *
     * Changes to {@link #mParentItemList} should be made through add/remove methods in
     * {@link ExpandableRecyclerAdapter}
     *
     * @param parentItemList
     *         List of all {@link ParentListItem} objects to be
     *         displayed in the RecyclerView that this
     *         adapter is linked to
     */
    public RoutesExpandableAdapter(Context context,@NonNull List<? extends ParentListItem> parentItemList) {
        super(parentItemList);
        mInflater = LayoutInflater.from(context);
    }



    @Override
    public RouteViewHolder onCreateParentViewHolder(ViewGroup parentViewGroup) {
        View view = mInflater.inflate(R.layout.list_item_route_parent, parentViewGroup, false);
        return new RouteViewHolder(view);
    }

    @Override
    public RouteStepViewHolder onCreateChildViewHolder(ViewGroup childViewGroup) {
        View view = mInflater.inflate(R.layout.list_item_route_child, childViewGroup, false);
        return new RouteStepViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(RouteViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        RoutesList parent = (RoutesList) parentListItem;
        parentViewHolder.parentTitleTextView.setText(parent.getStartTime() + "-" + parent.getFinishTime() + " Stops:" + parent.getAllStopNum() + " Transfers:" + parent.getNumberOfTransfers());
    }

    @Override
    public void onBindChildViewHolder(RouteStepViewHolder childViewHolder, int position, Object childListItem) {
        RouteSection section = (RouteSection) childListItem;
        childViewHolder.routeStepTime.setText(section.getSectionTime().toString());
        childViewHolder.routeStepTitle.setText(section.getLineType() + " " + Optional.fromNullable(section.getLineName()).or("") + " " + Optional.fromNullable(section.getAgencyName()).or(""));
        String desc = "";
        for (IntermediateStop stop: section.getIntermediateStops()) {
            desc += stop + "\n";
        }
        childViewHolder.routeStepDescr.setText(desc);
    }
}
