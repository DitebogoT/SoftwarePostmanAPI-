package org.ditebogo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-dev")
public class softwareDeveloperController {

    @GetMapping
    public List<softwareDeveloper> getSoftwareDevs(){
      return List.of(
              new softwareDeveloper(1,"Ditebogo","diditlhakola@gmail.com",
                      List.of("ASP.NET","Python","Django")),

              new softwareDeveloper(2,"Mancoba","MancobaSunday@gmail.com",
              List.of("Java","Tailwind","SQL")));

    }
}
