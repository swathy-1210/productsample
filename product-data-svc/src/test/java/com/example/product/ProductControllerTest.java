
  package com.example.product;
  
  import static
  org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
  import static
  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
  
  import org.junit.jupiter.api.Test; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
  import org.springframework.boot.test.context.SpringBootTest; import
  org.springframework.http.MediaType; import
  org.springframework.test.context.ContextConfiguration; import
  org.springframework.test.web.servlet.MockMvc; import
  org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
  
  
  @SpringBootTest
  
  @ContextConfiguration
  
  @AutoConfigureMockMvc public class ProductControllerTest {
  
  @Autowired private MockMvc mvc;
  
  @Test public void getHello() throws Exception {
  mvc.perform(MockMvcRequestBuilders.get("/product/123").accept(MediaType.
  APPLICATION_JSON)) .andExpect(status().isOk());
  /*.andExpect(content().string("{\n" + "    \"id\": \"13860428\",\n" +
  "    \"name\": \"The Big Lebowski (Blu-ray) (Widescreen)\",\n" +
  "    \"details\": null,\n" + "    \"listofinfo\": null,\n" +
  "    \"comments\": null\n" + "}")); */
  }
 }
 