<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String result;
    String username = request.getParameter("j_username");
    String password = request.getParameter("j_password");
    if(username.equals("qwe") && password.equals("qwe"))
        result = "Hello, qwe";
    else {
        result = "a";
        String redirectURL = "http://localhost:8012/errorlogin.jsp";
        response.sendRedirect(redirectURL);
    }
%>
<%=result%>
</body>
</html>