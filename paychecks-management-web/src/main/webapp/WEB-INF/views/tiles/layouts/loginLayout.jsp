<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
 
<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	    <title><tiles:getAsString name="title" /></title>
	    
	    <link href="<c:url value='/static/css/main.css' />" rel="stylesheet"></link>
	    <link href="<c:url value='/static/css/login.css' />" rel="stylesheet"></link>
	</head>
	<body>
        <div class="page-wrap">
	        <div class="page-common-header">
	        	<tiles:insertAttribute name="header" />
	        </div>
	        <div class="page-content">
	        	<tiles:insertAttribute name="body" />
	        </div>
	        <div class="page-common-footer">
	        	<tiles:insertAttribute name="footer" />
	        </div>
        </div>
	</body>
</html>