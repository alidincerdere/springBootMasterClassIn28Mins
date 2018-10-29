<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    Welcome ${name} <a href="/list-todos">Click here to manage your todos </a>
</div>
<script>
    $('#navItemHome').addClass("active")
</script>
<%@ include file="common/footer.jspf"%>