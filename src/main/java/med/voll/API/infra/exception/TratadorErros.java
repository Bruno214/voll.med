package med.voll.API.infra.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class TratadorErros {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException er){
        var ListErro = er.getFieldErrors();

        return ResponseEntity.badRequest().body(ListErro.stream().map(DadosErroValidacao::new).toList());
    }


    public record DadosErroValidacao(String name, String message) {
        public DadosErroValidacao(FieldError fe) {
            this(fe.getField(), fe.getDefaultMessage());
        }
    }
}
