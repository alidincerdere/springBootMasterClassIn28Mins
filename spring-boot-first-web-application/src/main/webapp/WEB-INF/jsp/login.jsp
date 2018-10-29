<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <div class="row">
        <font color="red"> ${message} </font>
    </div>
    <div class="row">
        <form method="post">
            Name: <input type="text" name="name"/>
            Password: <input type="password" name="password"/>
            <input type="submit"/>
        </form>
    </div>
</div>
<script>
    $('#navItemHome').addClass("active")
</script>
<%@ include file="common/footer.jspf" %>