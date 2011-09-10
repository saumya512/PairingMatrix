<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>View Programmer Details</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />


  %{--<g:javascript library="addProgrammer"/>?--}%

  </head>

  <h1 class="form-header">Programmer : </h1>

  <label>Programmer ID</label>
 <g:form action="show" method="post">
    %{--<g:hiddenField name="programmerId" id="current-id" value="${caseToDisplay.id}"/>--}%
    <g:textField name="programmerId" id="programmer-id" value="${programmerToDisplay.programmerId}"/>
    <label>Programmer Name</label>

    <g:textField name="programmerId" id="programmer-name" value="${programmerToDisplay.programmerName}"/>

    <div class="view-matrx">
          <button id="View-Pairing-Matrix">View Pairing Matrix</button>
      </div>
     </g:form>
</html>