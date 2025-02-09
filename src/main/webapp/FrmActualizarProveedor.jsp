<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Proveedores</title>
</head>
<body bgcolor="#564f3d">
	<h1 align="center">Actualizar Proveedor</h1>
	
	<form method="post" action="ControladorProveedor">

	<table align="center" border="2">

	<!-- recuperamos valores que vienen del controlador -->
	<%
	String codigo=request.getAttribute("codigo").toString();
	String proveedor=(request.getAttribute("proveedor")!=null)?request.getAttribute("proveedor").toString():"";
	String ruc=(request.getAttribute("ruc")!=null)?request.getAttribute("ruc").toString():"";
	String rsocial=(request.getAttribute("rsocial")!=null)?request.getAttribute("rsocial").toString():"";
	String correo=(request.getAttribute("correo")!=null)?request.getAttribute("correo").toString():"";
	String fecha=(request.getAttribute("fecha")!=null)?request.getAttribute("fecha").toString():"";
	
	%>

		<input type="hidden" name="codigo" value="<%=codigo%>">

			<tr>
				<td>Proveedor</td>
				<td><input type="text" name="proveedor" value="<%=proveedor%>"></td>
			</tr>
			<tr>
				<td>RUC</td>
				<td><input type="text" name="ruc" value="<%=ruc%>"></td>
			</tr>
			<tr>
				<td>Razon Social</td>
				<td><input type="text" name="rsocial" value="<%=rsocial%>"></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td><input type="text" name="correo" value="<%=correo%>"></td>
			</tr>
								
			<tr>
				<td>Fecha de Registro</td>
				<td><input type="text" name="fecha" value="<%=fecha%>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="actualizar"></td>
			</tr>




	</table>
	</form>

</body>
</html>