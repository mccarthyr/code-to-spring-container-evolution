package com.fireduptech.codeToSpringContainerEvolution.nonSpringFactorySolution;

import java.util.List;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.io.IOException;


public class TrainingMetricsDetectorFactory {


	public static TrainingMetricsDetector getInstance( String[] args ) throws IOException {

		List<String> metricWords = new ArrayList<String>();

		if ( args.length == 0 ) {
			System.out.println( "Please enter a training metric word as the first argument" );
		}

		if ( args.length > 2 ) {
			return new ComplicatedTrainingMetricsDetector( args[0], args[1], Integer.parseInt( args[2] ) );
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

		return new BasicTrainingMetricsDetector( metricWords );



	}


}