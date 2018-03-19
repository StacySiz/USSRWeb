CREATE TABLE public."USER"
(
  Id SERIAL PRIMARY KEY NOT NULL,
  first_name VARCHAR(150) NOT NULL,
  second_name VARCHAR(150) NOT NULL,
  email VARCHAR(120) NOT NULL,
  country VARCHAR(120) NOT NULL,
  password VARCHAR(150) NOT NULL
);
CREATE UNIQUE INDEX USER_Id_uindex ON public."USER" (Id);
CREATE UNIQUE INDEX USER_email_uindex ON public."USER" (email)
CREATE TABLE public.GAME
(
  Id SERIAL PRIMARY KEY NOT NULL,
  gameTitle VARCHAR(150) NOT NULL,
  genre VARCHAR(150) NOT NULL,
  releaseDate VARCHAR(50),
  company VARCHAR(150) NOT NULL,
  pic VARCHAR(500)
);
CREATE UNIQUE INDEX GAME_Id_uindex ON public.GAME (Id);
CREATE UNIQUE INDEX GAME_gameTitle_uindex ON public.GAME (gameTitle)