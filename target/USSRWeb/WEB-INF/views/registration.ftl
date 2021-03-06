﻿<#import "/spring.ftl" as spring/>
<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html;charset=windows-1251" />

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Registration</title>
    <link href="../../../../dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/registration.css" rel="stylesheet" type="text/css">

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<body class="text-center">
<h1></h1>
<form name="regForm" class="form-signin" method="post" action="/registration">
    <img src="resources/pics/symbol.gif" alt="" width="144" height="144">

    <h1 class="h3 mb-3 font-weight-normal">Регистрация</h1>
<#if (error)??>
<#--<#list error as error>-->
    <#--${error}-->
<#--</#list>-->
<#--<@spring.message '${error}'/>-->
${error}
</#if>
    <#--<span class="error">${error}</span>-->
    <br>
    <!--<label for="firstName">First name </label>-->
    <input type=text id="firstName" name="firstName" class="form-control" placeholder="Ваше имя">
    <input type=text id="secondName" name="secondName" class="form-control" placeholder="Ваша фамилия" >

    <input type=text id="country" name="country" class="form-control" placeholder="Страна">


    <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Электроная почта" required autofocus>

    <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Пароль" required >

    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="18year"> Я достиг 18 лет
        </label>
    </div>
    <button class="btn btn-lg btn-success btn-block" type="submit">Зарегистрировать</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>

</body>
</html>