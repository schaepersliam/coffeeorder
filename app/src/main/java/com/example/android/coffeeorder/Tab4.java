package com.example.android.coffeeorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liam2 on 01.10.2017.
 */

public class Tab4 extends android.support.v4.app.Fragment {

    FCViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.type4, container, false);

        viewPager = (FCViewPager)getActivity().findViewById(R.id.container);

        final TextView name = (TextView)rootView.findViewById(R.id.a_name);
        final TextView address = (TextView)rootView.findViewById(R.id.a_adresse);
        final TextView birth = (TextView)rootView.findViewById(R.id.a_geburtstag);
        final TextView quantity = (TextView)rootView.findViewById(R.id.a_quantity);
        final TextView whipped_cream = (TextView)rootView.findViewById(R.id.a_whipped_cream);
        final TextView chocolate = (TextView)rootView.findViewById(R.id.a_chocolate);
        final Button order = rootView.findViewById(R.id.order_button);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VarHelper.resetItems();
                Intent open = new Intent(getActivity(), OrderedActivity.class);
                startActivity(open);
                viewPager.setCurrentItem(0);
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == 3) {
                    name.setText(getResources().getString(R.string.tab4_name) + " " + VarHelper.getFirstName() + " " + VarHelper.getName());
                    address.setText(getResources().getString(R.string.tab4_address) + " " + VarHelper.getStreet() + " " + VarHelper.getHouseNumber());
                    birth.setText(getResources().getString(R.string.birth) + " " + VarHelper.getBirth());
                    quantity.setText(getResources().getString(R.string.quantity) + " " + VarHelper.getQuantity());
                    if (VarHelper.getChocolate() == true) {
                        chocolate.setText(getResources().getString(R.string.chocolate) + ": " + getResources().getString(R.string.yes));
                    } else { chocolate.setText(getResources().getString(R.string.chocolate) + ": " + getResources().getString(R.string.no)); }
                    if (VarHelper.getWhippedCream() == true) {
                        whipped_cream.setText(getResources().getString(R.string.whipped_cream) + ": " + getResources().getString(R.string.yes));
                    } else { whipped_cream.setText(getResources().getString(R.string.whipped_cream) + ": " + getResources().getString(R.string.no)); }
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return rootView;
    }
}