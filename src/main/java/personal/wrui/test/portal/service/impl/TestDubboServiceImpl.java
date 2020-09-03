package personal.wrui.test.portal.service.impl;

import org.springframework.stereotype.Service;

import personal.wrui.test.portal.service.ITestDubboService;

@Service
public class TestDubboServiceImpl implements ITestDubboService {

	public String testDubbo(String caller) {
		return "hi " + caller + "my name is test";
	}

}
