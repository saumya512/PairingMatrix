<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <g:layoutHead/>
</head>

<body>
<g:if test="${flash.error}">
    <div id="errorMessage"><span class="flash-message">${flash.error}</span></div>
</g:if>
<g:if test="${flash.message}">
    <div id="status"><span class="flash-message">${flash.message}</span></div>
</g:if>

<div id="header">
<div id="content-wrapper">
    <div id="sidebar">
        <ul>
            <li>
                <ul>
                    <li><g:link controller="programmer" action="create" name="createNewProgrammer">Add Programmer</g:link></li>
                <li><g:link controller="programmer" action="view" name="viewProgrammers">Programmers</g:link></li>
                    <li><g:link controller="pair" action="pairTable" name="viewThePairTable">View Pair Table</g:link></li>
                <li><g:link controller="pair" action="showMatrix" name="showPairMatrix">Pairing Matrix</g:link></li>
                </ul>
            </li>
        </ul>
    </div>
    <div id="main-content"><g:layoutBody/></div>
</div>
</div>
</body>
</html>