# ToDoApp

[13/11/2023]
## Spring security

springdoc openapi


Internalization -I18n
Accept-language : indicates natural language
en- english
nl- dutch
fr- french

messages.properties
messages_nl.properties   # header format = Accept-langua ge: nl

versioning
1. versioning params
Ex: @Getmapping(path="/person", params="version=1")
2. versioning headers
@Getmapping(path="path/header", headers="X-API-VERSION=1")

	3. uri versioning
	url/v1/person
	url/v2/person
	
	4. Media type versioning
	@Getmapping(path="path/header", produces="application/vnd.company.app-v1+json")
	header format: Accept: application/vnd.company.app-v1+json
	url format: api url/accept

HATEOAS
To return few links along with data , to perform subsequent actions

	Configure HAL support
	
	JSON Hypertext Application Language (HAL) is a convention for defining hypermedia such as links to external resources within JSON or XML code.
	Easy way to hyperlink between resources in your api



Filtering:
1. Static filtering
same filtering across different api's
2. Dynamic filtering
customizing filtering for a bean for specific rest api

@JsonProperty
Customize field names in response   
@JsonProperty("user_name")
private String name;

@JsonIgnore
respective fied ,will not be shown in response

@JsonIgnoreProperties
class level filter..
Ex: @JsonIgnoreProperties("property1","property2",..)

@JsonFilter("#filtername#")
MappingJacksonValue -> filter logic

Spring Boot actuator: provides spring boot's production-ready features
managemnet.endpoints.web.exposure.include=*


## AOP: Aspect oriented programming
it can be used to implement cross cutting concerns
write code once, apply it many classes
2 AOP frameworks
1. spring AOP
2. AspectJ
@Repository
Annotation indicates that class provides mechanism for storage and retrieval, updatec, create, delete operations on logic.

@Before:
executes common code before running a test
@Beforeclass
preferably execute it only once before running all tests
ex: db connection opening and closing
@Pointcut
Identifies method calls to be intercepted
ex: execution("#class package")
@After
do something after a method is executed
@AfterReturing
only when a method executes successfully
@AfterThrowing
when a method throws an exception
@Around
Indicates class has the behaviour before and after the method invocation.
Advice:
defines what code to execute
ex: logging, authentication

ProceedingJoinPoint is an extension for joinPoint that exposes proceed() method. when it's invoked, code execution jumps to the next taget method.

The entire process of executing AOP is also called weaving

## UNIT TESTING WITH JUNIT AND MOCKITO
Test method should be void

	<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.13.2</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.mockito</groupId>
			<artifactId>mockito-all</artifactId>
			<version>1.10.19</version>
			<scope>test</scope>
		</dependency>
	</dependencies>

Suite classes:
Group unit testing classes together to run in single click.
Better way to organise unit testing classes

	@RunWith(Suite.class)
	@Suite.SuiteClasses({Testing.class, class2.class,...})

Stubbing:
sample implementation of particular class, pre defined data
only used for unit testing

If you get ExceptionInInitializerError in the next lecture, Use this dependency instead of mockito-all.
<dependency>
<groupId>org.mockito</groupId>
<artifactId>mockito-core</artifactId>
<version>4.0.0</version>
<scope>test</scope>
</dependency>

Mocks offers more functionality than stubbing
Mockito is used to simplify test development by mocking external dependencies and using them in code.
Mocking is a process of developing the objects that act as the mock or clone of the real objects.
when..thenReturn
given..willReturn

BDDMockito:
writing test cases in natural and human readable language that focuses on behaviour of the application.
3 sections:
1. given - some pre conditions
2. When - an action occurs
3. then - check output/result
		
	
	
