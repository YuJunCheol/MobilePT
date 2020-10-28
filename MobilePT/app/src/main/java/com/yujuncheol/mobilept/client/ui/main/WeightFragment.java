package com.yujuncheol.mobilept.client.ui.main;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import com.yujuncheol.mobilept.client.R;

import java.util.ArrayList;

public class WeightFragment extends Fragment {

    private LineChart lineChart;

    ArrayList<Entry> entry_chart = new ArrayList<>();

    public WeightFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_weight, container, false);

        lineChart = (LineChart) root.findViewById(R.id.chart);//layout의 id
        LineData chartData = new LineData();

        chartData.calcMinMaxY(0,180);

        for(int i=0;i<30; i++) {
            entry_chart.add(new Entry(i, 100 ));
        }


        LineDataSet lineDataSet = new LineDataSet(entry_chart, "꺽은선1");
        chartData.addDataSet(lineDataSet);

        lineChart.setData(chartData);

        lineChart.invalidate();


        return root;
    }
}