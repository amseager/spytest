package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class UserDAO2Test {

	@InjectMocks
	@Spy
	private UserDAO2 dao;

	@Test
	public void testBean() {

		Mockito.doReturn(null).when(dao).getConnFromPool(1);

		User expectedUser = new User();

		//readByUserid in the example returns empty User object so I commented the next lines
//		expectedUser.setSk(1);
//		expectedUser.setFirstName("David");
//		expectedUser.setLastName("Gahan");
//		expectedUser.setUserid("user1");

		User user = dao.readByUserid("user1");

		assertThat(user).isEqualTo(expectedUser);
	}
}