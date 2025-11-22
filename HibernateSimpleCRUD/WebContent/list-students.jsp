<%@ page import="java.util.*, entity.Student" %>
<html><body><h2>Students</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Action</th></tr>
<%
List<Student> list = (List<Student>) request.getAttribute("students");
for(Student s : list){
%>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getEmail()%></td>
<td><a href="delete?id=<%=s.getId()%>">Delete</a></td>
</tr>
<% } %>
</table>
</body></html>