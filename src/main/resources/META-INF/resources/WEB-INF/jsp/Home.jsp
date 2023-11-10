<html>
        <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
         <title>
                Home
         </title>
        </head>

    <body class="container">
    <%@ include file="common/navigation.jspf" %>
        <h2>welcome to home page</h2>
        <h3>your name ${name} </h3>
        <div>
            <a href="ToDoList">click here</a> to view your tasks
        </div>
    </body>



</html>