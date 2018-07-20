package com.fireduptech.codeToSpringContainerEvolution.nonContainer;

import java.util.List;
import java.util.ArrayList;

public class BasicTrainingMetricsDetector {

	private List<String> allowedTrainingMetricWords = new ArrayList<String>();

	public BasicTrainingMetricsDetector( List<String> enteredTrainingMetricsWords ) {
		
		this.allowedTrainingMetricWords = enteredTrainingMetricsWords;

	}

	public boolean containsValidMetric( String value ) {

		for ( String metric: this.allowedTrainingMetricWords ) {
			if ( value.toLowerCase().contains( metric ) ) {
				return true;
			}
		}

		return false;
	}


}