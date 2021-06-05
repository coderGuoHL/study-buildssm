<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 2021/5/29
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
      a {
        text-decoration: none;
        color: black;
        font-size: 18px;
      }
      h2 {
        width: 180px;
        height: 38px;
        margin: 100px auto;
        text-align: center;
        line-height: 38px;
        background: #ff1493;
        border-radius: 18px;
      }
    </style>
  </head>
  <body>
    <h2>
      <a href="${pageContext.request.contextPath}/book/allBook">跳转到allBook</a>
    </h2>

  </body>
</html>
