package com.fireduptech.codeToSpringContainerEvolution.springContainerFinalSolution;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class TrainingMetricsDetectorConfig {


}




/*

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

*/
