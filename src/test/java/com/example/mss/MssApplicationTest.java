package com.example.mss;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
//@ActiveProfiles(profiles = {"local"})
@SpringBootTest
class MssApplicationTest {

	private WebApplicationContext wac;

	@Test
	void contextLoads() {
	}

	private MockMvc mockMvck;

	@Before
	public void before(){
		mockMvck = MockMvcBuilders.webAppContextSetup(this.wac)
				.alwaysDo(MockMvcResultHandlers.print())
				.build();
	}

	@Test
	public void test_인코딩() throws Exception {
/*
		UrlEntity request = UrlEntity.builder().originUrl("www.naver.com").build();
		UrlEntity madeEntity = service.getShortenUrlEntity(request.getOriginUrl());
		Assert.assertEquals(madeEntity.getCount(), is(0));
 */}

}
