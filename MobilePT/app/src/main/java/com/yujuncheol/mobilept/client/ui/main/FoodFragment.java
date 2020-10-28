package com.yujuncheol.mobilept.client.ui.main;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.dinuscxj.progressbar.CircleProgressBar;
import com.yujuncheol.mobilept.client.R;
public class FoodFragment extends Fragment {

    private static final String DEFAULT_PATTERN = "%d%%";
    CircleProgressBar circleProgressBar;
    private Context mContext;
    ProgressBar pro;
    Button btn;
    EditText edt;
    TextView tv;
    Thread work = null;
    int i=0;


    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_food, container, false);

        circleProgressBar=root.findViewById(R.id.cpb_circlebar);

        circleProgressBar.setProgress(70);

        return root;
    }
}
