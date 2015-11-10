
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Новости</title>
</head>
<body>
<h1>Новости</h1>
<p>Вот фрагменты наших четырех самых популярных статей:</p>
<ol>
    <li><jsp:include page="news/Item1.html" flush="true"/></li>
    <li><jsp:include page="news/Item2.html" flush="true"/></li>
    <li><jsp:include page="news/Item3.html" flush="true"/></li>
    <li><jsp:include page="news/Item4.html" flush="true"/></li>
</ol>

</body>
</html>
