package cn.basttg.core.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import com.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.basttg.core.exception.BusinessException;
import cn.basttg.core.exception.ParameterException;
import cn.basttg.core.service.TestService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController extends BaseController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Resource
	private HelloService helloService;

	@Resource
	private TestService testService;
	
	@RequestMapping(value = "/controller.do", method = RequestMethod.GET)
	public void controller(HttpServletResponse response, Integer id) throws Exception {
		switch(id) {
		case 1:
			throw new BusinessException("10", "controller10");
		case 2:
			throw new BusinessException("20", "controller20");
		case 3:
			throw new BusinessException("30", "controller30");
		case 4:
			throw new BusinessException("40", "controller40");
		case 5:
			throw new BusinessException("50", "controller50");
		default:
			throw new ParameterException("Controller Parameter Error");
		}
	}
	
	@RequestMapping(value = "/service.do", method = RequestMethod.GET)
	public void service(HttpServletResponse response, Integer id) throws Exception {
		testService.exception(id);
	}
	
	@RequestMapping(value = "/dao.do", method = RequestMethod.GET)
	public void dao(HttpServletResponse response, Integer id) throws Exception {
		testService.dao(id);
	}
	
	@RequestMapping(value = "/dao2.do", method = RequestMethod.GET)
	@ResponseBody
	public cn.basttg.core.dao.Pram dao2(cn.basttg.core.dao.Pram param) throws Exception {
		logger.info("name="+param.getName());
		param.setName(helloService.hello(param.getName()));
		return param;
	}
}