<%
session.invalidate();
session = request.getSession();
response.sendRedirect("indexout.jsp");
%>