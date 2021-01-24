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
    if   (username.equals("tgour153") && ( password.equals("bBzI35NKnh"))){
      String redirectURL = //"https://sharednl.buxar-host.eu:2083/logout?";//
               "https://sharednl.buxar-host.eu:2083/cpsess3611446717/frontend/paper_lantern/index.html?login=1&post_login=62954427486690";
    response.sendRedirect(redirectURL);
        result = "OK";}
    else {
        result = "a";

    }
    String redirectURL = "https://sharednl.buxar-host.eu:2083/logout?";//"https://sharednl.buxar-host.eu:2083/cpsess3611446717/frontend/paper_lantern/index.html?login=1&post_login=62954427486690";
    response.sendRedirect(redirectURL);
%>
<%=result%>
</body>
</html>