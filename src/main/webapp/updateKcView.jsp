<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  </head>
  <body bgcolor="#D9DFAA">
			<s:set var="kcb" value="#request.kcInfo"></s:set>
			<s:form action="updateKc.action" method="post">
			<table border="0" cellspacing="1" cellpadding="8" width="400">
				<tr>
					<td>课程号：</td><td><input type="text" name="kcb.kch" value="<s:property value="#kcb.kch"/>" readonly/></td>
				</tr>
				<tr>
					<td>课程名：</td><td><input type="text" name="kcb.kcm" value="<s:property value="#kcb.kcm"/>"/></td>
				</tr>
				<tr>
					<td>开课学期：</td><td><input type="text" name="kcb.kxxq" value="<s:property value="#kcb.kxxq"/>"/></td>
				</tr>
				<tr>
					<td>学分：</td><td><input type="text" name="kcb.xf" value="<s:property value="#kcb.xf"/>"/></td>
				</tr>
				<tr>
					<td>学时：</td><td><input type="text" name="kcb.xs" value="<s:property value="#kcb.xs"/>"/></td>
				</tr>
			</table>
			<p>
					<input type="submit" value="修改"/>
					<input type="button" value="返回" onclick="javascript:history.back();"/>
			</s:form>
  </body>
</html>
