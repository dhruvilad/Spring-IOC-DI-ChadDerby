
#  **Annotation based configuration** ########

**Component Scanning**
- Enable component scanning in Spring config file
- Add the @Component Annotation to your Java Classes
- retrieve bean from spring container

![img_16.png](img_16.png)

![img_17.png](img_17.png)

![img_18.png](img_18.png)

- Spring also supports Defaukt Bean IDs
- Default bean id : the class name, make first letter lower-case
    - e.g Class Name is **TennisCoach**  then Default bean Id is **tennisCoach**


**Spring Auto Wiring**
    ![img_19.png](img_19.png)

**Constructor Injection - Autowired Optional?**
- As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary if the target bean only defines one constructor to begin with. 
- However, if several constructors are available, at least one must be annotated to teach the container which one to use.
- https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation
- https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-autowired-annotation