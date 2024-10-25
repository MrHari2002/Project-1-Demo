package com.revature.P1Demo;

import com.revature.models.DTOs.IncomingPetDTO;
import com.revature.models.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class P1DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	//TestRestTemplate test for our PetController------------------------------------

	//RestTemplate lets us send HTTP requests FROM OUR JAVA SERVER
		//TestRestTemplate is a subclass that we can use for Testing

	@Test
	public void testInsertPet(){

		//Instantiate a new TestRestTemplate object
		TestRestTemplate restTemplate = new TestRestTemplate();

		//Create a new IncomingPetDTO to use in our test
		IncomingPetDTO petDTO = new IncomingPetDTO("Dog", "Fido", 1);

		//Send a POST request to /pets and save the returned Pet to run our tests on
		                    //{verb}ForObject  //URL, Request Body, Response Type
		Pet p = restTemplate.postForObject("http://localhost:7777/pets", petDTO, Pet.class);

		//basic tests, make sure our Pet object came back as expected
		assertNotNull(p);
		assertNotEquals(p.getPetId(), 0);
		assertEquals(p.getSpecies(), "Dog");

		//Let's do asserts on the ResponseEntity as well

		ResponseEntity<Pet> response = restTemplate.postForEntity("http://localhost:7777/pets", petDTO, Pet.class);

		//Now we can test what status code comes back too!
		assertEquals("201 CREATED", response.getStatusCode().toString());

	}

	//HEY what if I DON'T want to send real requests that manipulate our real DB?
	//We can use MockMVC instead of TestRestTemplate



}
