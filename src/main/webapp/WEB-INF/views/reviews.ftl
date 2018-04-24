<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Рецензии</title>
    <link href="resources/css/reviews.css" rel="stylesheet" type="text/css">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <#--<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>-->

    <!------ Include the above in your HEAD tag ---------->
</head>
<body>
<#include "fragments/header.ftl">
<div class="container">
    <section id="team" class="pb-5">
        <div class="container">
            <h5 class="section-title h1">Рецензии</h5>
            <div class="row">
            <#list allReviews as review>
                <#--<#list allAuthors as author>-->
                    <div class="col-xs-12 col-sm-6 col-md-4">
                    <div class="image-flip" ontouchstart="this.classList.toggle('hover');">

                    <div class="mainflip">
                        <div class="frontside">
                            <div class="card">
                                <div class="card-body text-center">
                                <#--<p><img class=" img-fluid"-->
                                <#--src="{'~/storage/' + ${game.image.fileName}}"-->
                                <#--alt="card image"></p>-->
                                    <h4 class="card-title">${review.reviewName}</h4>
                                    <#--<p class="card-text">by ${author.firstName} ${author.secondName} </p>-->
                                    <p class="card-text">by ${review.user.firstName} ${review.user.secondName} </p>
                                    <p class="card-text">${review.score}/10</p>
                                    <p>
                                    <#--<div class="container">-->
                                        <#--<div class="row">-->
                                            <#--<div class="col-md-3 col-sm-6">-->

                                            <#--</div>-->
                                                <#--</div>-->
                                            <#--</div>-->
                                    </p>
                                        <#--<a href="#" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i></a>-->
                                        </div>
                                    </div>
                                </div>
                                <div class="backside">
                                    <div class="card">
                                        <div class="card-body text-center mt-4">
                                            <h4 class="card-title">${review.reviewName}</h4>
                                            <p class="card-text">${review.description}</p>
                                            <ul class="list-inline">
                                                <li class="list-inline-item">
                                                    <a class="btn btn-warning" href="#">Читать полностью</a>
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
                <#--</#list>-->
            </#list>
            </div>
            </div>
    </section>
</div>
</body>
<!-- Team -->