<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Todo list for ${name}</title>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <table class="table table-striped">
        <caption>Your Todos are</caption>
        <thead>
        <tr>
            <th>Description</th>
            <th>Date</th>
            <th>is it Done?</th>
            <th>Delete</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
                <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

    <br>
    Your Name is: ${name}
    <br>

    <div><a class="button" href="/add-todo">Add ToDo</a></div>


    <script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</div>
</body>
</html>