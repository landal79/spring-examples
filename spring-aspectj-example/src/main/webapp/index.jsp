<%@ page language="java"
	import="org.springframework.web.context.WebApplicationContext, org.springframework.web.context.support.WebApplicationContextUtils, org.landal.aspectjspring.services.GreetingService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<% 
WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
GreetingService greetingService = (GreetingService) webApplicationContext.getBean("greetingService");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>
		Test service invoked and greets you by saying :
		<%=greetingService.sayHello()%></h1>
</body>
</html>
