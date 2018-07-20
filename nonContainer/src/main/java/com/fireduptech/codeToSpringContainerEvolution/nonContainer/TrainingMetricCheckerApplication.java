package com.fireduptech.codeToSpringContainerEvolution.nonContainer;

import java.util.List;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;

/**
 * One of the allowed words must be contained in the first argument sent from the
 * command line which could be the word on its own or as part of a string expression like:
 * "power:100"
 *
 * To run:
 * mvn exec:java -Dexec.args="power:100"
 * Using a file with the allowed words instead:
 * mvn exec:java -Dexec.arguments="speed:100 , src/main/java/com/fireduptech/codeToSpringContainerEvolution/nonContainer/training.metrics"
 * or
 * mvn exec:java -Dexec.args="speed:100 src/main/java/com/fireduptech/codeToSpringContainerEvolution/nonContainer/training.metrics"
 * The first file version is sending a String[] . So arguments separated by a comma.
 * Details from - www.mojohaus.org/exec-maven-plugin/java-mojo.html
 */
public class TrainingMetricCheckerApplication {

	public static void main( String[] args ) throws IOException {

		System.out.println("\n\nTrainingMetricCheckerApplication is operating...\n\n");

		List<String> metricWords = new ArrayList<String>();

		if ( args.length == 0 ) {
			System.out.println( "Please enter a training metric word as the first argument" );
		}

		if ( args.length == 2 ) {
			// get the list of words from the file 
			metricWords = Files.readAllLines( Paths.get( args[1] ) );
		} else {
			// else hardcoded words provided here
			metricWords.add("hr");
			metricWords.add("power");
			metricWords.add("time");
			metricWords.add("distance");
		}

		BasicTrainingMetricsDetector metricDetector = new BasicTrainingMetricsDetector( metricWords );

		System.out.println( metricDetector.containsValidMetric( args[0] ) );


	}
}