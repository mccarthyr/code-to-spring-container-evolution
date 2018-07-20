# code-to-spring-container-evolution

Shows basic code design using 4 directories, in order of:

- nonContainer
- nonSpringFactorySolution
- springContainerSolution
- springContainerFinalSolution

Beginning with a standalone Java application starter where the main method houses all the control flow, initialisation and components (a service called 'BasicTrainingMetricsDetector' in this case). 

Then it goes on to using a Factory method approach that decouples the service implementation by having service classes implement a common interface and all service components and initialisation is moved out of the main method and into the Factory.

The next step is to move to full Inversion of Control (IoC) and bring in the Spring Container to take control of creating services. This will take over application initialisation, allow the removal of the Factory and provide a means of loading services at runtime. This will introduce an @Configuration class that defines the services as beans (@Bean). In Spring a class that is made available through the Spring Application Context is referred to as a Bean. A Bean is uniquely marked by its ID (name) and type (class). 

The only real difference between the 'springContainerSolution' and 'springContainerFinalSolution' code is that the latter takes advantage of more annotations like @Service and removes all the config definition out of the main @Configuration class and into the service classes themselves. 






