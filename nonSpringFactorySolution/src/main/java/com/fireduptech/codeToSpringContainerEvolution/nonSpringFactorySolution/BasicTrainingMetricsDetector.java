package com.fireduptech.codeToSpringContainerEvolution.nonSpringFactorySolution;

import java.util.List;
import java.util.ArrayList;


public class BasicTrainingMetricsDetector implements TrainingMetricsDetector {

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