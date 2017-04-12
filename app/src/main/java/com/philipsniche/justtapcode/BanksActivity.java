package com.philipsniche.justtapcode;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.philipsniche.justtapcode.fragments.BankServicesFragment;
import com.philipsniche.justtapcode.fragments.ServiceFragmentAdapter;
import com.philipsniche.justtapcode.fragments.TelcosServicesFragment;

public class BanksActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // Create an adapter that knows which fragment should be shown on each page
        ServiceFragmentAdapter adapter = new ServiceFragmentAdapter(getSupportFragmentManager());
        adapter.addFragment(new BankServicesFragment(), "GTB");
        adapter.addFragment(new TelcosServicesFragment(), "FIRST BANK");
        adapter.addFragment(new TelcosServicesFragment(), "UBA");
        adapter.addFragment(new TelcosServicesFragment(), "ZENITH");
        adapter.addFragment(new TelcosServicesFragment(), "DIAMOND");

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
    }
}
