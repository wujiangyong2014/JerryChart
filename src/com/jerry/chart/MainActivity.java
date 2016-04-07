package com.jerry.chart;

import java.util.ArrayList;
import java.util.List;

import com.jerry.chart.entity.ChartData;
import com.jerry.chart.view.JerryChartView;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	private JerryChartView jcv, jcv2,jcv3, jcv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		jcv = (JerryChartView) findViewById(R.id.jcv);
		jcv2 = (JerryChartView) findViewById(R.id.jcv2);
		jcv3 = (JerryChartView) findViewById(R.id.jcv3);
		jcv4 = (JerryChartView) findViewById(R.id.jcv4);

		List<ChartData> datas = new ArrayList<>();

		ChartData cd0 = new ChartData(0xffF0868A, 0.70f, 0xffffffff, false);
		ChartData cd1 = new ChartData(0xffF48533, 0.20f, 0xffffffff, false);
		ChartData cd2 = new ChartData(0xffE0E4CD, 0.10f, 0xff898989, true);
		datas.add(cd0);
		datas.add(cd1);
		datas.add(cd2);
		
		List<ChartData> datas2 = new ArrayList<>();

		ChartData cd02 = new ChartData(0xffA89C8E, 0.05f, 0xffffffff, false);
		ChartData cd12 = new ChartData(0xffF0E1B6, 0.40f, 0xff898989, false);
		ChartData cd22 = new ChartData(0xffF1BBB9, 0.30f, 0xffffffff, false);
		ChartData cd32 = new ChartData(0xffE58485, 0.25f, 0xffffffff, false);
		datas2.add(cd02);
		datas2.add(cd12);
		datas2.add(cd22);
		datas2.add(cd32);
		
		jcv.setData(datas);
		jcv2.setData(datas2);
		
		jcv3.setData(datas2);
		jcv4.setData(datas);
	}
	public void aa(View v){
		String url="mqqwpa://im/chat?chat_type=wpa&uin=1239560291";  
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
	}
}
