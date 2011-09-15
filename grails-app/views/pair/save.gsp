<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Sorry incomplete Details</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />

      <style type="text/css">
        table,th,td
        {
            border:1px solid black;
        }
      </style>

  </head>

  <h1 class="form-header">Sorry! you did not complete the details!!</h1>
 <g:form controller="programmer" action="view">
     <div class="form-submit-area">
        <input type="submit" id="back" value="back"/>
    </div>
 </g:form>
</html>