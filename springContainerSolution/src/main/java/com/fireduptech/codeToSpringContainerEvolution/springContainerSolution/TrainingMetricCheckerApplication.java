package com.fireduptech.codeToSpringContainerEvolution.springContainerSolution;

import java.io.IOException;
import java.lang.Exception;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


// mvn exec:java -Dexec.args="speed:100" -Dmetrics.filename=src/main/java/com/fireduptech/codeToSpringContainerEvolution/springContainerSolution/training.metrics

// NOTE: THIS VERSION REQUIRES THE USE OF SENDING IN THE FILENAME AS A SEPARATE ARGUMENT AS SHOWN ABOVE.

/*
	This started out with moving on from the Factory Solution.
	
	The first step before putting in Spring Container was to put the Control Flow which is currently
  all in the starter main method into its own class called ControlFlow...

  Moving the initialisation to the application starter is bascially your first step towards IoC.
  However your services still depend on  factories and are thus still coupled to the initialisation
  of the other services.

*/


public class TrainingMetricCheckerApplication {

	public static void main( String[] args ) throws Exception {

		System.out.println( "\n\nTraining Metric Checker Application is operational...\n\n" );

		ApplicationContext context = new AnnotationConfigApplicationContext( TrainingMetricsDetectorConfig.class );
		context.getBean( ControlFlow.class ).run( args );

	}

}



/*
NOTE: THIS WAS THE MAIN METHOD AFTER MOVING INITIALISATION INTO CONTROL FLOW CLASS AND
      JUST BEFORE INSTALLING THE SPRING-CONTEXT IN THE POM.XML 

public class TrainingMetricCheckerApplication {

	public static void main( String[] args ) throws IOException {

		System.out.println( "\n\nTraining Metric Checker Application is operational...\n\n" );

		new ControlFlow().run( args );
		
	}

}
*/


/*
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

*/
