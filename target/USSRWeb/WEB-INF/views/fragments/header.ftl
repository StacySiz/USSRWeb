<#assign  security=JspTaglibs["http://www.springframework.org/security/tags"] />
<!DOCTYPE html>
<html lang="en">
<head>
    <th:block th:fragment="head">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title></title>
    <link href="../../../../dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/header.css" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </th:block>
</head>
<body>
<div class="container">
    <#--<div class="span3 well">-->
<div th:fragment="navbar">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark rounded">
    <!--<nav class="navbar  navbar-expand-lg navbar-light rounded" style="background-color:#e80018">-->
    <a class="navbar-brand" href="#">
        <img src="resources/pics/symbol.gif" width="50" height="50" class="d-inline-block align-top" alt="">
        Страна Советов
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar"
            aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>


    <div class="collapse navbar-collapse justify-content-md-center" id="navbar">
        <ul class="navbar-nav">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="dropdown" data-toggle="dropdown" aria-haspopup="true"
                   aria-expanded="false">Платформа</a>
                <div class="dropdown-menu" aria-labelledby="dropdown10">
                    <a class="dropdown-item" href="#">PC</a>
                    <a class="dropdown-item" href="#">Xbox</a>
                    <a class="dropdown-item" href="#">Playstation</a>
                    <a class="dropdown-item" href="#">Switch</a>
                </div>
            </li>
            <!--<a class="nav-link" href="#">Плaтформа <span class="sr-only">(current)</span></a>-->
            <li class="nav-item">
                <a class="nav-link" href="#">Новинки</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Лучшее</a>
            </li>
        </ul>
    </div>

        <@security.authorize access="isAuthenticated()">
            <#--logged in as <@security.authentication property="principal.email" />-->
            <a class="btn btn-outline-danger" href="/logout">Sign Out</a>
        </@security.authorize>
<@security.authorize access="! isAuthenticated()">
    <a class="btn btn-outline-danger" href="/signIn">Sign in</a>
    <a class="btn btn-outline-warning" href="/registration">Registration</a>
</@security.authorize>


<#--<form class="form-inline">-->
<#--<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">-->
<#--<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Поиск</button>-->
<#--</form>-->

</nav>
</div>
    <#--</div>-->
</div>
</body>
</html>