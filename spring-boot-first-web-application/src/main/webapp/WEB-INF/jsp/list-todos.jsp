<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

    <table class="table table-striped">
        <caption>Your Todos are</caption>
        <thead>
        <tr>
            <th>Description</th>
            <th>Date</th>
            <th>is it Done?</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.desc}</td>
                <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
                <td>${todo.done}</td>
                <td><a type="button" class="btn btn-warning" href="/update-todo?id=${todo.id}">Update</a></td>
                <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

    <br>
    Your Name is: ${name}
    <br>

    <div><a class="button" href="/add-todo">Add ToDo</a></div>
</div>
<script>
    $('#navItemTodos').addClass("active")
</script>
<%@ include file="common/footer.jspf"%>