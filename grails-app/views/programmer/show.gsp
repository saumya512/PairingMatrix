<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>View Programmer Details</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />

      <style type="text/css">
        table,th,td
        {
            border:1px solid black;
        }
      </style>

  </head>

  <h1 class="form-header">Programmer : </h1>
  <label>Programmer Id : </label>
    <label id="prog-id">${programmerToDisplay.programmerId}</label>
<br>
  <label>Programmer Name : </label>
<label id="prog-name">${programmerToDisplay.programmerName}</label>
<br><br><br>
<h1>Add Pairs :</h1>
<g:form controller="pair" action="save" method="POST">
    <br>
    <label>Programmer Name</label>
    <g:textField name="programmersName" id="programmer-name"/>
    <br><br>
    <label>Pair Programmer Name</label>
    <br>
      <g:textField name="pairsName" id="pair-name"/>
    <br>
    <label>No of times paired</label>
    <br>
      <g:textField name="noOfTimesTheyPaired" id="times-paired"/>
    <br>
    <div class="form-submit-area">
        <input type="submit" id="save" value="save"/>
    </div>
</g:form>

<br>
<br>

</html>