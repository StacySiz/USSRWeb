package ru.itis.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundExc extends RuntimeException{

        protected String entity = "page";

        public NotFoundExc() {
            super();
        }

        public NotFoundExc(String entity) {
            super();
            this.entity = entity;
        }

        public String getEntity(){
            return entity;
        }
    }

