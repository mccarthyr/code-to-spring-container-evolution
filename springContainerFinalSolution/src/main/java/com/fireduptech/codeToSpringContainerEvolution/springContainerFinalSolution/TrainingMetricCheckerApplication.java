package com.fireduptech.codeToSpringContainerEvolution.springContainerFinalSolution;

import java.io.IOException;
import java.lang.Exception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// mvn exec:java -Dexec.args="speed:100" -Dmetrics.filename=src/main/java/com/fireduptech/codeToSpringContainerEvolution/springContainerFinalSolution/training.metrics


/*

  This final version removes most of the code definitions in the TrainingMetricsDetectorConfig class and 
  instead uses more of the Annotations on the actual classes which makes it easier to read. 

*/


public class TrainingMetricCheckerApplication {

	public static void main( String[] args ) throws Exception {

		System.out.println( "\n\nTraining Metric Checker Application is operational...\n\n" );

		ApplicationContext context = new AnnotationConfigApplicationContext( TrainingMetricsDetectorConfig.class );
		context.getBean( ControlFlow.class ).run( args );

	}

}

