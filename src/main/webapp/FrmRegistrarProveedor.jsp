<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Proveedores</title>
</head>
<body bgcolor="#564f3d">
	<h1 align="center" style="color: white;">Registrar Proveedor</h1>

	<table align="center" border="2">
		<form method="post" action="ControladorProveedor">
			<tr>
				<td>Proveedor</td>
				<td><input type="text" name="proveedor"></td>
			</tr>
			<tr>
				<td>RUC</td>
				<td><input type="text" name="ruc"></td>
			</tr>
			<tr>
				<td>Razon Social</td>
				<td><input type="text" name="rsocial"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="correo"></td>
			</tr>
			<tr>
				<td>Fecha de Registro</td>
				<td><input type="text" name="fecha"></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="registrar"></td>
			</tr>
		</form>
	</table>

</body>
</html>