<%@ page contentType="text/html;charset=UTF-8" %>
<html>
 <head>
      <title>Show Pair Matrix</title>
      <meta name="layout" content="main">
      <link rel="stylesheet" href="${resource(dir: 'css', file: 'matrix')}" />
     <link rel="stylesheet" href="${resource(dir: 'css', file: 'forms')}" />
  </head>

<g:javascript library="jquery" plugin="jquery"/>
      <g:javascript library="usePairMatrix"/>
<g:javascript library="pairMatrixCreate"/>

<script type="text/javascript">
    $(function() {
        pairMatrix("#pair00");
        pairMatrix("#pair01");
        pairMatrix("#pair02");
        pairMatrix("#pair10");
        pairMatrix("#pair11");
        pairMatrix("#pair20");
        createPairMatrix();
    });
</script>

  <h1 class="form-header">Pairing Matrix</h1>
<br><br>
<g:form action="showMatrix" method="post">
    <div class="matrices">
        <div>
          <input type="button"  id="pair00" value="0">
            <g:textField name="pair00" id="pair-00"/>

        <input type="button"  id="pair01" value="0">
        <input type="button"  id="pair02" value="0">
            <g:textField name="prog1" id="prog-1"/>
            </div>
        <br>
        <div>
        <input type="button"  id="pair10" value="0">
        <input type="button"  id="pair11" value="0">
            <g:textField name="prog2" id="prog-2"/>
        </div>
        <br>
        <div>
        <input type="button"  id="pair20" value="0">
            <g:textField name="prog3" id="prog-3"/>
            </div>
        <br>
        <g:textField name="prog4" id="prog-4"/>
     </div>
<br><br>
    <div class="form-submit-area">
<input type="submit" id="update-pair-table" value="update pairing info"/>
    </div>
    </g:form>
</html>