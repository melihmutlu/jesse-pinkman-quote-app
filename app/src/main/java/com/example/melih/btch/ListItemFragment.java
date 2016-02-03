package com.example.melih.btch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Melih on 8.8.2015.
 */
public class ListItemFragment extends android.support.v4.app.ListFragment {

    Objects obj ;
    FragmentInterface fragmentInterface;

    public ListItemFragment() {
        super();
        obj = new Objects();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_fragment , container , false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fragmentInterface = (FragmentInterface) getActivity();
        ArrayAdapter adapter = new ArrayAdapter(getActivity() , R.layout.list_item , obj.getTitles());
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        fragmentInterface.playSelectedItem(((TextView) v.findViewById(R.id.item_detail)).getText().toString());


    }

    public static ListItemFragment newInstance(){
        ListItemFragment listFrag = new ListItemFragment();

        return  listFrag;
    }

}
