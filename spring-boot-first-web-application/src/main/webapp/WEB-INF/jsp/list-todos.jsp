<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Todo list for ${name}</title>
</head>
<body>

    <H1>Your Todos</H1>

    <table>
        <caption>Your Todos are</caption>
        <thead>
            <tr>
                <th>Description</th>
                <th>Date</th>
                <th>is it Done?</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                </tr>
            </c:forEach>
        </tbody>

    </table>

    <br>
    Your Name is: ${name}
    <br>
    Add ToDo:
    <a href="/add-todo">Add ToDo</a>
</body>
</html>