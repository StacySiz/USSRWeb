<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html;charset=windows-1251"/>

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Game form</title>
    <link href="../../../../dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/registration.css" rel="stylesheet" type="text/css">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
</head>

<body class="text-center">

<form name="addReview" class="form-signin" method="post" action="/addReview">
    <#--<img src="resources/pics/review.jpg" alt="" width="174" height="254">-->

    <h1 class="h3 mb-3 font-weight-normal">Рецензия</h1>
    <!--<label for="firstName">First name </label>-->
    <input type=text id="firstName" name="reviewName" class="form-control" placeholder="Заголовок рецензии">
    <input type=text id="firstName" name="gameTitle" class="form-control" placeholder="Название игры">

    <label for="exampleFormControlTextarea1">Текст рецензии</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="10" name="description"></textarea>

        <#--<div class="form-group">-->
        <label for="formControlSelect">Оценка по десятибальной</label>
    <select class="form-control" id="formControlSelect" name="score">
        <option value="1">1</option>
        <option value="2"> 2 </option>
        <option value="3"> 3 </option>
        <option value="4"> 4 </option>
        <option value="5"> 5 </option>
        <option value="6"> 6 </option>
        <option value="7"> 7 </option>
        <option value="8"> 8 </option>
        <option value="9"> 9 </option>
        <option value="10"> 10 </option>
    </select>
        <#--</div>-->

    <button class="btn btn-lg btn-success btn-block" type="submit" id="gameAdd">Отправить рецензию</button>
</form>
</body>
</html>