package com.example.kangning.fragmentframework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import UF.BaseFragment;


public class IndexFragment extends BaseFragment {

    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_index, container, false);
        button = (Button)view.findViewById(R.id.jump);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentFragment(new ConcreteFragment(), BaseFragment.ADD_STACK);
            }
        });
        return view;
    }
}
