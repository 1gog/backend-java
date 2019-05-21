package appdev.org.testcicd;


// import javafx.application.Application;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;


//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class LivnessProbeTest {

    @Autowired
    private WebApplicationContext wac;
    //private MockMvc mockMvc;

    //@Autowired
    //private LivnessProbe controller;
    @Test
    public void isController() throws Exception
    {
        // assertThat(controller).isNotNull();
        assertTrue(true);
    }

    // simple test
    @Test
    public void contextLoad() throws Exception{

    }
    /*@Test
    public void Test01() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }*/

    // test Livness controller get default message
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void greetingDefaultMessage() throws Exception {
        assertThat(this.testRestTemplate.getForObject("http://localhost:" + port + "/api/test", String.class )).contains("api test ok");
    }




}
