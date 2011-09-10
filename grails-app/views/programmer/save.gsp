<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Add a Programmer</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />


  %{--<g:javascript library="addProgrammer"/>?--}%

  </head>

  <body>

  <h1 class="form-header">Add Programmer</h1>
  <g:form action="save" method="post">
      <label>Programmer ID</label>
      <g:textField name="programmerId" id="programmer-id"/>
      <label>Programmer Name</label>
      <g:textField name="programmerName" id="programmer-name"/>

      <div class="form-submit-area">
          <input type="submit" id="save-programmer-info" value="Save"/>

      </div>

      <div class="view-matrx">
          <button id="View-Pairing-Matrix">View Pairing Matrix</button>
      </div>

   </g:form>
  </body>
</html>