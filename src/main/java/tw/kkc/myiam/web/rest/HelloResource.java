package tw.kkc.myiam.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.kkc.myiam.web.rest.dto.HelloDTO;

@RestController
@RequestMapping("/api")
public class HelloResource {

    private final Logger log = LoggerFactory.getLogger(HelloResource.class);

    @GetMapping("/hello")
    public ResponseEntity<HelloDTO> hello (){
        return new ResponseEntity<>(new HelloDTO("Allen" , 5566L), HttpStatus.OK);
    }

}
