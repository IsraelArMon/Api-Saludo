package neoris.saludo.api.exception;

import java.util.Date;

import org.postgresql.util.PSQLException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import neoris.saludo.api.response.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(PSQLException.class)
	public ResponseEntity<ErrorDetails> handlePsqlException(PSQLException exception, WebRequest webRequest){
		
		ErrorDetails errorDetails = new ErrorDetails("900","SALUDO DUPLICADO TIPO DE SALUDO EXISTENTE");
		return new ResponseEntity<>(errorDetails,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
