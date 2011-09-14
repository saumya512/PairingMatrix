<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>View Programmers</title>
     <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />

     <style type="text/css">
        table,th,td
        {
            border:1px solid black;
        }
     </style>

 </head>

<h1 class="form-header">Programmers : </h1>
 <g:form action="show" method="post">
    <label>Programmer ID</label>
    <g:textField name="programmerId" id="programmer-id"/>
     <br>
     <div class="form-submit-area">
          <input type="submit" id="view-programmer-info" value="View Programmer Info"/>
     </div>
 </g:form>

  <br>
  <br>
<div style="overflow:auto; height:250px; width:300px;">
<table name="programmers" id="programmers">
        <tr>
            <th>Programmer ID</th>
            <th>Programmer Name</th>
        </tr>
        <g:if test="${programmerList?.size > 0}">
        <g:each in="${programmerList}">
        <tr name="programmerRow" id="programmer-row">
            <td><label>${it.programmerId}</label></td>
        <td><label>${it.programmerName}</label></td>
        </tr>
        </g:each>
        </g:if>
    </table>
</div>

</html>