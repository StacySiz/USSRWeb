
<html lang="ru">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Content-Type" content="text/html;charset=windows-1251" />

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Game form</title>
    <link href="../../../../dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/registration.css" rel="stylesheet" type="text/css">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<body class="text-center">
<h1></h1>

<form name="regForm" class="form-signin" method="post" action="/addGame">
    <img src="resources/pics/symbol.gif" alt="" width="144" height="144">

    <h1 class="h3 mb-3 font-weight-normal">Данные о игре</h1>
    <!--<label for="firstName">First name </label>-->
    <input type=text id="firstName" name="gameTitle" class="form-control" placeholder="Название игры">

    <input type=text id="secondName" name="genre" class="form-control" placeholder="Жанр">

    <input type=text id="country" name="releaseDate" class="form-control" placeholder="Дата выпуска">

    <input type="text" id="inputEmail" name="company" class="form-control" placeholder="Компания" required autofocus>

    <label for="platform">Выберите платформу</label>
    <div id="platform">
    <select name="platform" class="custom-select">
        <option>Xbox</option>
        <option>PlayStation</option>
        <option>PC</option>
        <option>Switch</option>
    </select>
    </div>

    <div id="table">
    <label for="platform">Выберите связь с таблицей</label>
    <select name="table" class="custom-select">
        <option >OneToOne</option>
        <option value="1">ManyToOne</option>
        <option value="2">OneToMany</option>
        <option value="3">ManyToMany</option>
    </select>
    </div>

    <button class="btn btn-lg btn-success btn-block" type="submit" id="gameAdd">Добавить игру</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</form>

</body>
</html>