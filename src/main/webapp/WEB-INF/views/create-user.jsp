<%--
  Created by IntelliJ IDEA.
  User: Дмитрий
  Date: 09.08.2016
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link href="<c:url value="/resources/home.css" />" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>


</head>

<body>


<form:form method="POST" modelAttribute="user"
           class="box login">


    <fieldset class="boxBody">


        <form:label path="username">
            <spring:message code="username"/>
        </form:label>
        <form:input path="username"/>


        <form:label path="password">
            <spring:message code="password"/>
        </form:label>


        <form:password path="password"/>

        <c:if test="${not empty message}">
            <span style="float: right" class="error">${message}</span>
        </c:if>

        <c:if test="${not empty flowRequestContext.messageContext.allMessages}">
            <ul class="red_messages">
                <c:forEach items="${flowRequestContext.messageContext.allMessages}"
                           var="message">
                    <li>${message.text}</li>
                </c:forEach>
            </ul>
        </c:if>
    </fieldset>

    <footer>


        <input type="submit" class="btnLogin"
               value="<spring:message code="cancel" />" name="_eventId_cancel">

        <input type="submit" class="btnLogin"
               value="<spring:message code="create" />" name="_eventId_submit">




    </footer>


</form:form>


</body>
</html>