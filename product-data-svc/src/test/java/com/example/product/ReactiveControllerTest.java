
  package com.example.product;
  
  
  
  
  
	/* import static org.mockito.Mockito.times;
	 
	 import java.util.ArrayList; import java.util.List;
	 
	 import org.junit.Before; import org.junit.jupiter.api.Test; import
	 org.junit.jupiter.api.extension.ExtendWith; import org.mockito.Mockito;
	 import org.springframework.beans.factory.annotation.Autowired; import
	 org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest; import
	 org.springframework.boot.test.mock.mockito.MockBean; import
	 org.springframework.context.ApplicationContext; import
	 org.springframework.context.annotation.Import; import
	 org.springframework.test.context.ContextConfiguration; import
	 org.springframework.test.context.junit.jupiter.SpringExtension; import
	 org.springframework.test.web.reactive.server.WebTestClient;
	 
	 import com.example.springboot.controller.HelloController; import
	 com.example.springboot.models.Listofinfo; import
	 com.example.springboot.models.Mydomain; import
	 com.example.springboot.repository.MyDomainReactiveRepository;
	 
	 import reactor.core.publisher.Mono;
	 
	 
	 @WebFluxTest(controllers = HelloController.class)
	 
	 @ExtendWith( SpringExtension.class )
	 
	 //@RunWith(SpringRunner.class) //@ContextConfiguration(classes =
	 Application.class)
	 
	 @Import(Application.class)
	 
	 
	 public class ReactiveControllerTest {
	 
	 
	 @MockBean MyDomainReactiveRepository repository;
	 
	 @Autowired ApplicationContext context;
	 
	 
	 @Autowired private WebTestClient webTestClient;
	 
	 @Before public void setup() { this.webTestClient = WebTestClient
	 .bindToApplicationContext(this.context) .configureClient() .build(); }
	 
	 
	 @Test void testCreateEmployee() { Employee employee = new Employee();
	 employee.setId(1); employee.setName("Test"); employee.setSalary(1000);
	 
	 Mockito.when(repository.save(employee)).thenReturn(Mono.just(employee));
	 
	 webClient.post() .uri("/create") .contentType(MediaType.APPLICATION_JSON)
	 .body(BodyInserters.fromObject(employee)) .exchange()
	 .expectStatus().isCreated();
	 
	 Mo ckito.verify(repository, times(1)).save(employee); }
	 
	 
	 @Test void testGetEmployeesByName() { Employee employee = new Employee();
	 employee.setId(1); employee.setName("Test"); employee.setSalary(1000);
	 
	 List<Employee> list = new ArrayList<Employee>(); list.add(employee);
	 
	 Flux<Employee> employeeFlux = Flux.fromIterable(list);
	 
	 Mockito .when(repository.findByName("Test")) .thenReturn(employeeFlux);
	 
	 webClient.get().uri("/name/{name}", "Test") .header(HttpHeaders.ACCEPT,
	 "application/json") .exchange() .expectStatus().isOk()
	 .expectBodyList(Employee.class);
	 
	 Mockito.verify(repository, times(1)).findByName("Test"); }
	 
	 
	 @Test void testGetMyDomainId() { Listofinfo listofinfo = Listofinfo.builder()
	 .listid("123") .listname("info123") .listpurpose("123 info") .build();
	 List<Listofinfo> listofinfolist = new ArrayList<Listofinfo>();
	 listofinfolist.add(listofinfo);
	 
	 Mydomain mydomain = Mydomain.builder().id("123") .listofinfo(listofinfolist)
	 .name("123") .details("this is my sample domain")
	 .comments("couchbase researching samples").build() ; System.out.
	 println("Test reactor class:::::::::::::::::::::::::::::::::::::::::::");
	 
	 Mockito .when(repository.findById("123")) .thenReturn(Mono.just(mydomain));
	 
	 webTestClient.get().uri("/mydomain/reactive/{id}", "123") .exchange()
	 .expectStatus().isOk() .expectBody() .jsonPath("$.name").isNotEmpty()
	 .jsonPath("$.id").isEqualTo("123") .jsonPath("$.name").isEqualTo("123")
	 .jsonPath("$.details").isNotEmpty();
	 
	 Mockito.verify(repository, times(1)).findById("123"); }
	 
	 
	 @Test void testDeleteEmployee() { Mono<Void> voidReturn = Mono.empty();
	 Mockito .when(repository.deleteById(1)) .thenReturn(voidReturn);
	 
	 webClient.get().uri("/delete/{id}", 1) .exchange() .expectStatus().isOk(); }
	 
	 }
	 */
  
  
  
  
  import org.junit.jupiter.api.Test; import
  org.junit.jupiter.api.extension.ExtendWith; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.context.SpringBootTest; import
  org.springframework.http.MediaType; import
  org.springframework.test.context.junit.jupiter.SpringExtension; import
  org.springframework.test.web.reactive.server.WebTestClient;
  
  @ExtendWith(SpringExtension.class)
  
  @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
  
  public class ReactiveControllerTest {
  
  @Autowired private WebTestClient webTestClient;
  
  @Test public void testMyDomainReactive() { webTestClient
  .get().uri("/product/123") .accept(MediaType.APPLICATION_JSON) .exchange()
  .expectStatus().isOk()
  .expectBody(String.class).toString().contains("hehhhh"); } }
 