<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet">
        <title>
            Create
        </title>
    </head>

    <body>
    <%@ include file="common/navigation.jspf" %>
        <div class="container">
        <h2>Add new Task</h2>

        <form:form method="post" modelAttribute="todo">

        		<fieldset class="mb-3">
        			<form:label path="description">Description</form:label>
        			<form:input type="text" path="description" required="required"/>
        			<form:errors path="description" cssClass="text-warning"/>
        		</fieldset>




        		<form:input type="hidden" path="id"/>

        		<form:input type="hidden" path="done"/>

        		<input type="submit" class="btn btn-success"/>

        	</form:form>


        <script src="webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.4/jquery.min.js"></script>
        </div>

    </body>

</html>