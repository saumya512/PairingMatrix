<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Show Pair Matrix</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'matrix')}" />
     <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />
  </head>

  <h1 class="form-header">Pairing Matrix</h1>
<br><br>
<g:form action="updateMatrix" method="post">
    <div class="matrices">
        <div>
            <g:textField name="pair00" id="pair-00" style="width: 10px" value="0"/>
            <g:textField name="pair01" id="pair-01" style="width: 10px" value="0"/>
            <g:textField name="pair02" id="pair-02" style="width: 10px" value="0"/>
            <g:textField name="prog1" id="prog-1" value="enter programmer name"/>
            </div>
        <br>
        <div>
            <g:textField name="pair10" id="pair-10" style="width: 10px" value="0"/>
            <g:textField name="pair11" id="pair-11" style="width: 10px" value="0"/>
            <g:textField name="prog2" id="prog-2" value="enter programmer name"/>
        </div>
        <br>
        <div>
            <g:textField name="pair20" id="pair-20" style="width: 10px" value="0"/>
            <g:textField name="prog3" id="prog-3" value="enter programmer name"/>
            </div>
        <br>
        <g:textField name="prog4" id="prog-4" value="enter programmer name"/>
     </div>
<br><br>
    <div class="form-submit-area">
<input type="submit" id="update-pair-table" value="update pairing info"/>
    </div>
    </g:form>
</html>