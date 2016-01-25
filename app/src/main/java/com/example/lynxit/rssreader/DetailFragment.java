package com.example.lynxit.rssreader;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by farhina on 22/01/2016.
 */
public class DetailFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_rssitem_detail,container,false);
        Log.d("myMessage","onCreateView life cycle method of DetailFragment");
        return view;
    }
    @Override
    public void onAttach(Context context)
    {
        super.onAttach(context);
        Log.d("myMessage", "onAttach life cycle method of DetailFragment");
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d("myMessage", "onCreate life cycle method of DetailFragment");
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        Log.d("myMessage", "onActivityCreated life cycle method of DetailFragment");
    }
    @Override
    public void onViewStateRestored(Bundle savedInstanceState)
    {
        super.onViewStateRestored(savedInstanceState);
        Log.d("myMessage", "onViewStateRestored life cycle method of DetailFragment");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("myMessage", "onStart life cycle method of DetailFragment");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("myMessage", "onResume life cycle method of DetailFragment");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("myMessage", "onPause life cycle method of DetailFragment");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("myMessage", "onStop life cycle method of DetailFragment");
    }
    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        Log.d("myMessage", "onDestroyView life cycle method of DetailFragment");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("myMessage", "onDestroy life cycle method of DetailFragment");
    }
    @Override
    public void onDetach()
    {
        super.onDetach();
        Log.d("myMessage", "onDestroy life cycle method of DetailFragment");
    }


    public void saveText(String url){
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(url);
    }
}
