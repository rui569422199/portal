package personal.wrui.test.portal.dubbo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.alibaba.dubbo.config.annotation.Service;

import personal.wrui.test.portal.dubbo.service.ITestRmiDubboService;
import personal.wrui.test.portal.service.ITestDubboService;

@Service(interfaceClass=ITestRmiDubboService.class,retries=2,timeout=50000)
public class TestRmiDubboServiceImpl implements ITestRmiDubboService{

	@Autowired@Lazy
	private ITestDubboService testDubboService;
	

	public String testdubbo(String msg) {
		return testDubboService.testDubbo(msg);
	}

}
