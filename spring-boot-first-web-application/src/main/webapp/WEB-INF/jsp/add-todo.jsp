<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Your First Web App</title>
    <link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
    <link href="webjars/bootstrap-datepicker/1.8.0/css/bootstrap-datepicker.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form:form method="post" modelAttribute="todo">
        <form:hidden path="id"/>
        <fieldset class="form-group">
            <form:label path="desc">Description</form:label>
            <form:input path="desc" type="text" class="form-control" required="required"/>
            <form:errors path="desc" cssClass="text-warning"></form:errors>
        </fieldset>
        <fieldset class="form-group">
            <form:label path="targetDate">Target Date</form:label>
            <form:input path="targetDate" type="text" class="form-control" required="required"/>
            <form:errors path="targetDate" cssClass="text-warning"></form:errors>
        </fieldset>
        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
</div>
<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.8.0/js/bootstrap-datepicker.min.js"></script>
<script>
    $("#targetDate").datepicker({
        format:'dd/mm/yyyy'
    });
</script>
</body>
</html>