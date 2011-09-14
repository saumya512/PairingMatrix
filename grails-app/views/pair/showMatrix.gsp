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
    <div class="matrices">
        <div>
          <input type="button"  id="pair00" value="0">
        <input type="button"  id="pair01" value="0">
        <input type="button"  id="pair02" value="0">
         <label id="prog1">Programmer1</label>
            </div>
        <br>
        <div>
        <input type="button"  id="pair10" value="0">
        <input type="button"  id="pair11" value="0">
         <label id="prog2">Programmer 2</label>
            </div>
        <br>
        <div>
        <input type="button"  id="pair20" value="0">
                <label id="prog3">Programmer 3</label>
            </div>
        <br>
        <label id="prog4">Programmer 4</label>
     </div>
<br><br>
<input type="submit" id="add-programmers" value="add programmers to matrix"/>
</html>