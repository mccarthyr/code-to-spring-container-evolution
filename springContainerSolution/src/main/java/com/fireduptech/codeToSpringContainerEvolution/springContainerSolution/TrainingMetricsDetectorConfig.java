package com.fireduptech.codeToSpringContainerEvolution.springContainerSolution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

import java.nio.file.Files;
import java.nio.file.Paths;


// mvn exec:java -Dexec.args="speed:100" -Dmetrics.filename=src/main/java/com/fireduptech/codeToSpringContainerEvolution/springContainerSolution/training.metrics

@Configuration
public class TrainingMetricsDetectorConfig {

	@Bean
	public TrainingMetricsDetector basicTrainingMetricsDetector( @Value( "${metrics.filename}" ) String filename ) throws IOException {

		List<String> trainingMetrics = new ArrayList<String>();
		trainingMetrics = Files.readAllLines( Paths.get(filename) );
		return new BasicTrainingMetricsDetector( trainingMetrics );

	}
	

	@Bean
	public ControlFlow controlFlow( TrainingMetricsDetector trainingMetricsDetector ) {
		return new ControlFlow( trainingMetricsDetector );
	}


}

