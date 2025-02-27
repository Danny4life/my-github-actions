package com.osiki.github_actions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GithubActionsApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void testAddTwoNumbers(){

		assertEquals(5, GithubActionsApplication.add(3, 2));
	}

}
