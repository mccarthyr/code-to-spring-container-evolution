package com.fireduptech.codeToSpringContainerEvolution.nonSpringFactorySolution;

import java.io.IOException;


// mvn exec:java -Dexec.args="speed:100 src/main/java/com/fireduptech/codeToSpringContainerEvolution/nonSpringFactorySolution/training.metrics"
// mvn exec:java -Dexec.args="power:100"

/*
  When working with factories and multiple inplementations of a service, you will create
  a common interface which each of the implementations must extend.

  By using factories, you have multiple options of how to get parameters:
  - pass a global config object along, the main part of the application is responsible for creating it
  - each factory has its own config files
  - using static code blocks and hard-wired parameters

	

*/


public class TrainingMetricCheckerApplication {

	public static void main( String[] args ) {

		System.out.println( "\n\nTraining Metric Checker Application is operational...\n\n" );

		try {

			TrainingMetricsDetector trainingMetricsDetector = TrainingMetricsDetectorFactory.getInstance( args );
			System.out.println( trainingMetricsDetector.containsValidMetric( args[0] ) );

		} catch ( IOException ioe ) {
			System.out.println( ioe.getMessage() );
		}
		
	}

}

