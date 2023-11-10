<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <title>
            StatusCheck
        </title>
    </head>

    <body>
    <%@ include file="common/navigation.jspf" %>
        <div class="container">
        <h2>Track your status</h2>
        <h3>ToDo's List : </h3>
        <table class="table">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>targetdate</th>
                    <th>status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.targetdate}</td>
                    <td>${todo.done}</td>
                    <td><a href="delete?id=${todo.id}" class="btn btn-warning">Delete</a></td>
                    <td><a href="update?id=${todo.id}" class="btn btn-warning">update</a></td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="AddToDo" class="btn btn-success">Add ToDo</a>
        <script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
        </div>

    </body>

</html>