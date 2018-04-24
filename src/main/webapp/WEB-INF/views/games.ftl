
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Games</title>
    <link href="resources/css/games.css" rel="stylesheet" type="text/css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->
</head>
<body>
<#include "fragments/header.ftl">
<div class="container">
<section id="team" class="pb-5">
    <div class="container">
    <#--<p>${game}-->
        <h5 class="section-title h1">Игры</h5>
    <div class="row">
        <!-- Team member -->
<#list allGames as game>
        <div class="col-xs-12 col-sm-6 col-md-4">
                <div class="image-flip" ontouchstart="this.classList.toggle('hover');">

                    <div class="mainflip">
                        <div class="frontside">
                            <div class="card">
                                <div class="card-body text-center">
                                    <#--<p><img class=" img-fluid"-->
                                            <#--src="{'~/storage/' + ${game.image.fileName}}"-->
                                            <#--alt="card image"></p>-->
                                    <h4 class="card-title">${game.gameTitle}</h4>
                                    <p class="card-text">${game.genre}</p>
                                    <a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>
                                </div>
                            </div>
                        </div>
                        <div class="backside">
                            <div class="card">
                                <div class="card-body text-center mt-4">
                                    <h4 class="card-title">${game.gameTitle}</h4>
                                    <p class="card-text">${game.description}</p>
                                    <ul class="list-inline">
                                        <li class="list-inline-item">
                                            <a class="btn btn-warning" href="/addReview">Написать рецензию</a>
                                        <#--<a class="social-icon text-xs-center" target="_blank" href="#">-->
                                                <#--<i class="fa fa-facebook"></i>-->
                                            <#--</a>-->
                                        </li>
                                        <#--<li class="list-inline-item">-->
                                            <#--<a class="social-icon text-xs-center" target="_blank" href="#">-->
                                                <#--<i class="fa fa-twitter"></i>-->
                                            <#--</a>-->
                                        <#--</li>-->
                                        <#--<li class="list-inline-item">-->
                                            <#--<a class="social-icon text-xs-center" target="_blank" href="#">-->
                                                <#--<i class="fa fa-skype"></i>-->
                                            <#--</a>-->
                                        <#--</li>-->
                                        <#--<li class="list-inline-item">-->
                                            <#--<a class="social-icon text-xs-center" target="_blank" href="#">-->
                                                <#--<i class="fa fa-google"></i>-->
                                            <#--</a>-->
                                        <#--</li>-->
                                    <#--</ul>-->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    <#--</#items>-->
</#list>

        </div>
    </div>
</section>
</div>
</body>
<!-- Team -->