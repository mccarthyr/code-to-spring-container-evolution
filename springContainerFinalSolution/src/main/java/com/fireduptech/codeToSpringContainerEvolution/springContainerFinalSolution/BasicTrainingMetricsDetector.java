package com.fireduptech.codeToSpringContainerEvolution.springContainerFinalSolution;

import java.util.List;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;


@Service
public class BasicTrainingMetricsDetector implements TrainingMetricsDetector {


	private List<String> allowedTrainingMetricWords = new ArrayList<String>();


	public BasicTrainingMetricsDetector( @Value( "${metrics.filename}" ) String filename ) throws IOException {
		
		this.allowedTrainingMetricWords = Files.readAllLines( Paths.get( filename ) );

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



/*
	public BasicTrainingMetricsDetector( List<String> enteredTrainingMetricsWords ) {
		
		this.allowedTrainingMetricWords = enteredTrainingMetricsWords;

	}
*/