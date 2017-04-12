package com.philipsniche.justtapcode;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.philipsniche.justtapcode.fragments.MTNFragment;
import com.philipsniche.justtapcode.fragments.ServiceFragmentAdapter;
import com.philipsniche.justtapcode.fragments.TelcosServicesFragment;

public class NetworksActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networks);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        ServiceFragmentAdapter adapter = new ServiceFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new MTNFragment(), "MTN");
        adapter.addFragment(new TelcosServicesFragment(), "GLO");
        adapter.addFragment(new TelcosServicesFragment(), "AIRTEL");
        adapter.addFragment(new TelcosServicesFragment(), "ETISALAT");
        adapter.addFragment(new TelcosServicesFragment(), "VISAFONE");

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);


    }
}
