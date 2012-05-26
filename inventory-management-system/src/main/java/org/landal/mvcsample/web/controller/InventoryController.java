package org.landal.mvcsample.web.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.landal.mvcsample.service.ProductManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * This is a very basic Controller implementation. In Spring Web MVC, the
 * Controller handles the request and returns a ModelAndView - in this case, one
 * named 'hello.jsp' which is also the name of the JSP. The model that this
 * class returns is actually resolved via a ViewResolver. Since we have not
 * explicitly defined a ViewResolver, we are going to be given a default one by
 * Spring that simply forwards to a URL matching the name of the view specified.
 * We will modify this later on. We have also specified a logger so we can
 * verify that we actually got into the handler.
 * 
 * @author alex.landini
 * 
 */
public class InventoryController implements Controller {

	private ProductManager productManager;

	protected final Log logger = LogFactory.getLog(getClass());

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("products", this.productManager.getProducts());
		return new ModelAndView("hello", "model", myModel);
	}

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}
}
