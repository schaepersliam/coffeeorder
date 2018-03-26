package com.example.android.coffeeorder;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by liam2 on 01.10.2017.
 */

public class Tab1 extends  Fragment{

    FCViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.type1, container, false);

        viewPager = (FCViewPager)getActivity().findViewById(R.id.container);

        Button plus = rootView.findViewById(R.id.plus_button);
        Button minus = rootView.findViewById(R.id.minus_button);
        Button next = rootView.findViewById(R.id.next_tab1);
        final TextView text = rootView.findViewById(R.id.count);
        text.setText(VarHelper.getQuantity() + "");
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (VarHelper.getPrice() == 100) {
                    Toast toast = Toast.makeText(getActivity(), "Quantity is too high!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Log.v("Test", "Succeeded!");
                    VarHelper.setQuantity(VarHelper.getQuantity() + 1);
                    VarHelper.setPrice(VarHelper.getPrice() + 2.50);
                    text.setText(VarHelper.getQuantity() + "");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (VarHelper.getQuantity() == 1) {
                    Toast toast = Toast.makeText(getActivity(), "Quantity is too low!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    VarHelper.setQuantity(VarHelper.getQuantity() - 1);
                    text.setText(VarHelper.getQuantity() + "");
                    VarHelper.setPrice(VarHelper.getPrice() - 2.50);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        return rootView;
    }
}
