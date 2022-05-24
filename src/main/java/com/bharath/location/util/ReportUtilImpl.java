package com.bharath.location.util;

import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePieChart(String path, List<Object[]> data) {
		PieDataset dataset= new DefaultPieDataset();
		
		ChartFactory.createPieChart3D("Location Type Report", dataset);
	}

}
