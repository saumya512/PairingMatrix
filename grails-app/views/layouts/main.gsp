<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <g:javascript library="tabs"/>
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
            <li>Create New..
                <ul>
                    <li><g:link controller="programmer" action="save" name="createNewProgrammer">Programmer</g:link></li>

                </ul>
            </li>
        </ul>
    </div>
    <div id="main-content"><g:layoutBody/></div>
</div>
</div>
</body>
</html>