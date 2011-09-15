<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Add a Programmer</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />
</head>

<body>

  <h1 class="form-header">Add Programmer</h1>
  <g:form action="save" method="post">
      <br><br>
      <label>Programmer ID</label>
      <g:textField name="programmerId" id="programmer-id"/>
      <br><br>
      <label>Programmer Name</label>
      <g:textField name="programmerName" id="programmer-name"/>
       <br><br>
      <div class="form-submit-area">
          <input type="submit" id="save-programmer-info" value="Save"/>
      </div>
   </g:form>

  </body>
</html>