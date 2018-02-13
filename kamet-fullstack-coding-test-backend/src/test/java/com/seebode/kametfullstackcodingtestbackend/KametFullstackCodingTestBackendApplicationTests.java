package com.seebode.kametfullstackcodingtestbackend;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = KametFullstackCodingTestBackendApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KametFullstackCodingTestBackendApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(getClass());

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    @Before
    public void before() {

        headers.setAccept(Arrays.asList(APPLICATION_JSON));
        headers.setContentType(MediaType.valueOf(APPLICATION_JSON_UTF8_VALUE));
    }

	@Test
	public void contextLoads() {
	}


    @Test
    public void testForColumn(){

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        String column = "incometaxliability";

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/censusdata/bycolumn/"+column),
                HttpMethod.GET, entity, String.class);


        assertThat(response.getStatusCode(),is(HttpStatus.OK));

    }


    @Test
    public void testFindOne(){

        HttpEntity<String> entity = new HttpEntity<>(null, headers);

        String id = "5a81d7f23f17e7147c187fc9";

        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/censusdata/"+id),
                HttpMethod.GET, entity, String.class);


        assertThat(response.getStatusCode(),is(HttpStatus.OK));

    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

}
