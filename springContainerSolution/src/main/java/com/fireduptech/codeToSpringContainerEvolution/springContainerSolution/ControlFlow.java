package com.fireduptech.codeToSpringContainerEvolution.springContainerSolution;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;

public class ControlFlow {


	private TrainingMetricsDetector trainingMetricsDetector = null;

	public ControlFlow( @Qualifier("basicTrainingMetricsDetector") TrainingMetricsDetector trainingMetricsDetector ) {
		this.trainingMetricsDetector = trainingMetricsDetector;
	}


	public void run( String[] args ) throws IOException {
		System.out.println( trainingMetricsDetector.containsValidMetric( args[0] ) );
	}



}



/*
	public void run( String[] args ) throws IOException {

			TrainingMetricsDetector trainingMetricsDetector = TrainingMetricsDetectorFactory.getInstance( args );
			System.out.println( trainingMetricsDetector.containsValidMetric( args[0] ) );

	}
*/