<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@page import="java.util.*" %>
    <%@page import="model.TblProveedorcl2" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Principal</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">Listado de Proveedores</h1>

<h2 align="center">
<a href="ControladorProveedor?accion=Registrar" style="text-decoration: none">Registrar proveedor</a></h2>

<table align="center" border="2">

<tr>

<td>Codigo</td>
<td>Proveedor</td>
<td>RUC</td>
<td>Razon Social</td>
<td>Correo</td>
<td>Fecha Reg.</td>
<td colspan="2" align="center">Acciones</td>

</tr>

<%
List<TblProveedorcl2> listadoproveedor=(List<TblProveedorcl2>)request.getAttribute("listado");
 //aplicamos una condicion
 if(listadoproveedor!=null){
	 
	 //aplicamos el bucle for
	 for(TblProveedorcl2 prod:listadoproveedor){
%>

<tr><td><%=prod.getIdproveedorcl2() %>
</td>

<td><%=prod.getNomproveecl2() %>
</td>

<td><%=prod.getRucproveecl2() %>
</td>

<td><%=prod.getRsocialproveecl2() %>
</td>

<td><%=prod.getEmailproveecl2() %>
</td>

<td><%=prod.getFeingproveecl2() %>
</td>

<td><a href="ControladorProveedor?accion=Modificar&cod=<%=prod.getIdproveedorcl2() %>"  
style="text-decoration: none">ACTUALIZAR</a></td>
<td><a href="ControladorProveedor?accion=Eliminar&cod=<%=prod.getIdproveedorcl2() %>"  
style="text-decoration: none">ELIMINAR</a></td>
</tr>
<%
	 } //fin del bucle
	%>
	 <% 
 }//fin de condicion
 %>


</table>

</body>
</html>