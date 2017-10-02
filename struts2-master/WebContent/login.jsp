<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="./css/style.css">
<title>Log in</title>
</head>
<body>

<div class="login">
<hgroup class="heading">
<h1 class="major">Sign in</h1>
</hgroup>

    <form action="LoginAction">

      <div class="input-group input-group-lg">
        <span class="input-group-addon"><i class="fa fa-user"></i></span>
        <s:textfield name="name" class="form-control" placeholder="Username" />
          </div>

        <div class="input-group input-group-lg">
          <span class="input-group-addon"><i class="fa fa-lock"></i></span>
          <s:password name="password" class="form-control" placeholder="Password" />
        </div>

        <s:submit class="btn" />
       </form>

</div>
 </body>
</html>