<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>View Pair Details</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />

      <style type="text/css">
        table,th,td
        {
            border:1px solid black;
        }
      </style>

  </head>

  <h1 class="form-header">Pairing Table : </h1>

<table name="pairs" id="pairs">
        <tr>
            <th>Programmer Name</th>
            <th>Pair Name</th>
            <th>Number of times paired</th>
        </tr>
        <g:if test="${pairList?.size > 0}">
        <g:each in="${pairList}">
        <tr name="pairRow" id="pair-row">
            <td><label>${it.programmerName}</label></td>
            <td><label>${it.pairProgrammerName}</label></td>
            <td><label>${it.noOfTimesPaired}</label></td>
        </tr>
        </g:each>
        </g:if>
    </table>


</html>