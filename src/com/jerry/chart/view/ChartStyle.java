package com.jerry.chart.view;

public enum ChartStyle {
	/**
	 * 扇形
	 */
	FANSHAPE(0),
	/**
	 * 环形
	 */
	ANNULAR(1);
	private int style;
	private ChartStyle(int style){
		this.style=style;
	}
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
	
}
