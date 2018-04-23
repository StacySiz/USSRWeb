<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Profile</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link href="resources/css/profile.css" rel="stylesheet" type="text/css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<#include "fragments/header.ftl">
<#--<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>-->
<div class="container">
    <div class="span3 well">
        <center>
            <a href="#aboutModal" data-toggle="modal" data-target="#myModal"><img src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbezqZpEuwGSvitKy3wrwnth5kysKdRqBW54cAszm_wiutku3R" name="aboutme" width="140" height="140" class="img-circle"></a>
            <#--<h3>Joe Sixpack</h3>-->
            <div class="fb-profile-text">
                <h1>${user.getFirstName()}</h1>
                <div class="media-body">
                    <span class="label label-default">Игроман</span>
                    <span class="label label-success">100 обзоров</span>
                    <span class="label label-warning">Выслуга лет</span>
                    <span class="label label-info">Опытный критик</span>
                </div>
                <p>Играю в игры со времен СССР</p>
            </div>
            <#--<em>click my face for more</em>-->
        </center>
    </div>
<#--<div class="container">-->
<#--<div class="fb-profile">-->
<#--<img align="left" class="fb-image-lg" src="resources/pics/ussr-profile-theme.png" alt="Profile image example"/>-->
<#--<img align="left" class="fb-image-profile thumbnail" src="resources/pics/anon.png"  alt="Profile image example"/>-->
    <#--</div>-->
<#--</div>-->
</body>
</html>