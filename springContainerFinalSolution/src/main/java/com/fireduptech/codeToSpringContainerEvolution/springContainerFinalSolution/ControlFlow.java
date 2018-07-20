package com.fireduptech.codeToSpringContainerEvolution.springContainerFinalSolution;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;


@Component
public class ControlFlow {


	private TrainingMetricsDetector trainingMetricsDetector = null;

	public ControlFlow( @Qualifier("basicTrainingMetricsDetector") TrainingMetricsDetector trainingMetricsDetector ) {
		this.trainingMetricsDetector = trainingMetricsDetector;
	}


	public void run( String[] args ) throws IOException {
		System.out.println( trainingMetricsDetector.containsValidMetric( args[0] ) );
	}



}


