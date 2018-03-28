package com.example.android.coffeeorder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import static com.example.android.coffeeorder.R.layout.type2;

/**
 * Created by liam2 on 01.10.2017.
 */

public class Tab2 extends android.support.v4.app.Fragment{

    FCViewPager viewPager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(type2, container, false);

        viewPager = getActivity().findViewById(R.id.container);

        final CheckBox topping_1 = rootView.findViewById(R.id.topping_whippedcream);
        final CheckBox topping_2 = rootView.findViewById(R.id.topping_chocolate);
        final Button next = rootView.findViewById(R.id.next_tab2);
        topping_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (topping_1.isChecked()) {
                    VarHelper.setWhippedCream(true);
                    VarHelper.setPrice(VarHelper.getPrice() + 1.50);
                } else {
                    VarHelper.setWhippedCream(false);
                    VarHelper.setPrice(VarHelper.getPrice() - 1.50);
                }
            }
        });
        topping_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (topping_2.isChecked()) {
                    VarHelper.setChocolate(true);
                    VarHelper.setPrice(VarHelper.getPrice() + 1.50);
                } else {
                    VarHelper.setChocolate(false);
                    VarHelper.setPrice(VarHelper.getPrice() - 1.50);
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

        return rootView;
    }
}
