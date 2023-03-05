
**Spring Configuration can be done in three ways**
1. full xml configuration(where beans are defined in xml)
2. xml component scan with annotations(where componentscan path is given in xml and beans annotated with annotations for object creation)
3. Java configuration(where)

# **Java Configuration for Spring**

**Steps:**
1. Create a java class and annotate as **@Configuration**
2. Add component scanning support: **@ComponentScan**(optional)
3. Read Spring Java configuration class
4. Retrieve bean from Spring container


## **How @Bean works behind the scenes**

For this code:

    @Bean
    public Coach swimCoach() {   
        SwimCoach mySwimCoach = new SwimCoach();   
        return mySwimCoach;
    }

At a high-level, Spring creates a bean component manually. By default the scope is singleton. So any request for a "swimCoach" bean, will get the same instance of the bean since singleton is the default scope.

However, let's break it down line-by-line

_**@Bean**_
The @Bean annotation tells Spring that we are creating a bean component manually. We didn't specify a scope so the default scope is singleton.

_**public Coach swimCoach(){**_
This specifies that the bean will bean id of "swimCoach". The method name determines the bean id. The return type is the Coach interface. This is useful for dependency injection. This can help Spring find any dependencies that implement the Coach interface.
The @Bean annotation will intercept any requests for "swimCoach" bean. Since we didn't specify a scope, the bean scope is singleton. As a result, it will give the same instance of the bean for any requests.

_**SwimCoach mySwimCoach = new SwimCoach();**_
This code will create a new instance of the SwimCoach.

_**return mySwimCoach;**_
This code returns an instance of the swimCoach.


## **FAQ: What is a real-time use case for @Bean?**
Here is a real-time use case of using @Bean:
- You can use @Bean to make an existing third-party class available to your Spring framework application context.
- For example, I was recently working on a global real-time project using Amazon Web Services. The project made use of the Amazon Simple Storage Service (AWS S3). This is remote service that provides object storage in the cloud. You can think of AWS S3 at a high-level as a remote file server for storing files (pdfs, pngs etc).
- Our Spring application needed to integrate with AWS S3 and store pdf documents. Amazon provides an AWS SDK for integrating with AWS S3. Their API provides a class, S3Client. This is a regular Java class that provides a client interface to the AWS S3 service. We needed to share the S3Client object in various services in our Spring application. However, the S3Client does not have the @Component annotation. The S3Client does not use Spring.
- Since the S3Client is part of the AWS framework, we can't modify the source code for the S3Client directly. We can't simply add the @Component annotation to the S3Client source code. As a result, we need an alternative solution.
- But no problem, by using the @Bean annotation, I can wrap this third-party class, S3Client, as a Spring bean. And then once it is wrapped using @Bean, it is as a singleton object and available in our Spring framework application context. I can now easily share this bean in my app using dependency injection and @Autowired. So think of the @Bean annotation was a wrapper / adapter for third-party classes. You want to make the third-party classes available to your Spring framework application context.


    @Bean
    public S3Client remoteClient() {
        // Create an S3 client to connect to AWS S3
        S3Client s3Client = S3Client.builder().region(Region.of(region))
                .credentialsProvider(StaticCredentialsProvider.create(awsCreds)).build();
 
        return s3Client;    
    }


**Injecting values from Properties file**
Steps:
1. Create properties file
2. Load properties file in Spring config
3. Reference values from property file