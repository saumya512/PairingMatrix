<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Make Pairing Matrix</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />

      <style type="text/css">
        table,th,td
        {
            border:1px solid black;
        }
      </style>

  </head>

  <h1 class="form-header">Create A Pairing Matrix For 4 Programmers</h1>

    <label><b>Enter Names of : </b></label>
    <br><br>
    <label>Programmer 1</label>
    <br>
    <g:textField name="programmer1" id="programmer-1"/>
    <br><br>
    <label>Programmer 2</label>
    <br>
      <g:textField name="programmer2" id="programmer-2"/>
    <br><br>
    <label>Programmer 3</label>
    <br>
    <g:textField name="programmer3" id="programmer-3"/>
    <br><br>
    <label>Programmer 4</label>
    <br>
    <g:textField name="programmer4" id="programmer-4"/>
    <br><br>
        <input type="submit" id="create-matrix" value="Create Matrix"/>
</html>