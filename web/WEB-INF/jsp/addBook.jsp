<%--
  Created by IntelliJ IDEA.
  User: MSI
  Date: 2021/6/1
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="clo-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="bkname">书籍名称</label>
                <input name="bookName" type="text" class="form-control" id="bkname" required>
            </div>
            <div class="form-group">
                <label for="bkcount">书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" id="bkcount" required>
            </div>
            <div class="form-group">
                <label for="detail">书籍名称</label>
                <input name="detail" type="text" class="form-control" id="detail" required>
            </div>

            <button type="submit" class="btn btn-default">Submit</button>
        </form>


</div>
</body>
</html>
