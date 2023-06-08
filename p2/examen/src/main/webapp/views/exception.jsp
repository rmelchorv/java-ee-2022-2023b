<%@ page isErrorPage="true" %>
  
<% 
  out.print("Error Message: ");  
  out.print(exception.getMessage());
%>
<br>
<% 
  out.print("Error Cause: ");  
  out.print(exception.getCause());
%>
