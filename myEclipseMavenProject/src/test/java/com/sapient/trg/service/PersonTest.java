package com.sapient.trg.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PersonTest {
	
	private Person person = null;
	
	@BeforeEach
	void setUp() throws Exception {
		person = new Person(1,"Ravi","Kumar",LocalDate.of(1999,11,8),9999999999L);
	}

	@AfterEach
	void tearDown() throws Exception {
		person=null;
	}

	@Disabled
	@Test
	void testPersonIntegerStringStringLocalDateLong() {
		Person person = new Person(1,"Aman","Banerjee",null,null);
		assertThrows(IllegalArgumentException.class, ()-> person.getFirstName());
	}

	@Test
	void testGetPersonId() {
		assertEquals(1, person.getPersonId());
	}

	@Test
	void testSetPersonId() {
		assertNotEquals(2, person.getPersonId());
	}
	
	@Disabled
	@Test
	void testGetFirstName() {
		fail("Not yet implemented");
	}
	
	@Disabled
	@Test
	void testSetFirstName() {
		fail("Not yet implemented");
	}
	
	@Disabled
	@Test
	void testGetLastName() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetLastName() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetBirthdate() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetBirthdate() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testGetMobile() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	void testSetMobile() {
		fail("Not yet implemented");
	}

}
