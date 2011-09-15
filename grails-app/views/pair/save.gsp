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

     <g:javascript library="jquery-1.6.1"/>
     <g:javascript library="clickBackButton"/>

     <script type="text/javascript">
     $(function() {
         returnToView("#back");
     });
     </script>

  </head>

  <h1 class="form-header">Sorry! you did not complete the details!!</h1>
<g:form controller="programmer" action="view" method="POST" id="backForm">
     <div class = "form-submit-area">
        <button id="back">back</button>
    </div>
    </g:form>
</html>