﻿<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>学生选课系统</title>
	</head>
	<body>
		<s:form action="login.action" method="post">
			<table>
				<tr>
					<td colspan="2"><img src="image/head.jpg"></td>
				</tr>
				<tr><s:textfield name="dl.xh" label="学号" size="20"></s:textfield></tr>
				<tr><s:password name="dl.kl" label="口令" size="22"></s:password></tr>
				<tr>
					<td align="left"><input type="submit" value="登录" /></td>
					<td><input type="reset" value="重置" /></td>
				</tr>
			</table>
		</s:form>
	</body>
</html>
