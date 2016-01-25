package com.example.lynxit.rssreader;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class RssFeedActivity extends Activity implements MyListFragment.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rssfeed);
            }

    @Override
    protected void onStart()
    {
        super.onStart();

        Log.d("myMessage","onStart lifecycle method of activity");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("myMessage", "onResume lifecycle method of activity");

    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("myMessage", "onPause lifecycle method of activity");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("myMessage", "onStop lifecycle method of activity");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("myMessage", "onDestroy lifecycle method of activity");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("myMessage", "onRestart lifecycle method of activity");
    }

    @Override
    public void onRssItemSelected(String link) {
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
        fragment.saveText(link);
    }
}
