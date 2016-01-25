package com.example.lynxit.rssreader;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by farhina on 22/01/2016.
 */
public class MyListFragment extends Fragment {

    private OnItemSelectedListener listener;
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_rsslist_overview,container,false);
        Button button = (Button) view.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });

        Log.d("myMessage", "onCreateView lifecycle method of myListFragment");
        return view;
    }

    public interface  OnItemSelectedListener{
        public void onRssItemSelected(String url);
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if(context instanceof  OnItemSelectedListener){
            listener = (OnItemSelectedListener) context;
        }else
        {
            throw new ClassCastException(context.toString()+"must implement MyListFragment.OnItemSelectedListener");
        }
        Log.d("myMessage", "onAttach lifecycle method of myListFragment");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        Log.d("myMessage", "onActivityCreated lifecycle method of myListFragment");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState)
    {
        super.onViewStateRestored(savedInstanceState);

        Log.d("myMessage", "onViewStateRestored lifecycle method of myListFragment");
    }

    @Override
    public void onStart()
    {
        super.onStart();

        Log.d("myMessage", "onStart lifecycle method of myListFragment");
    }

    @Override
    public void onResume()
    {
        super.onResume();

        Log.d("myMessage", "onResume lifecycle method of myListFragment");
    }

    @Override
    public void onPause()
    {
        super.onPause();

        Log.d("myMessage", "onPause lifecycle method of myListFragment");
    }

    @Override
    public void onStop()
    {
        super.onStop();

        Log.d("myMessage", "onStop lifecycle method of myListFragment");
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();

        Log.d("myMessage", "onDestroyView lifecycle method of myListFragment");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();

        Log.d("myMessage", "onDestroy lifecycle method of myListFragment");
    }

    @Override
    public void onDetach()
    {
        super.onDetach();

        Log.d("myMessage", "onDetach lifecycle method of myListFragment");
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("myMessage", "onCreate lifecycle method of myListFragment");

    }
    //Triggers update of the details fragment
    public void updateDetail(){
        String newTime = String.valueOf(System.currentTimeMillis());
        listener.onRssItemSelected(newTime);
    }

}
