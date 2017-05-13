package test;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.Utility;
@Controller
public class SubscriptionController {
	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	 String subscribe(HttpServletRequest request) {

	String orderDetails = getOrderDetails(request);
	String truncatedOrderDetails =Utility.truncate(orderDetails, 250);
	//log(truncatedOrderDetails);
	return truncatedOrderDetails;
	}

	private String getOrderDetails(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	}
