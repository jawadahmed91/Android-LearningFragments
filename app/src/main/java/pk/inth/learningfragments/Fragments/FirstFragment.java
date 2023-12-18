package pk.inth.learningfragments.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pk.inth.learningfragments.R;
import pk.inth.learningfragments.SecondActivity;

public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }

    TextView tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_first, container, false);

        tv = view.findViewById(R.id.tvFirstFragment);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}