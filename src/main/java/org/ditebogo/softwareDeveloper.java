package org.ditebogo;

import java.util.ArrayList;
import java.util.List;

public class softwareDeveloper {
    public Integer ID;
    public String name;
    public  String email;
    List<String> techStack  = new ArrayList<>();

    public softwareDeveloper(Integer ID, String name, String email, List<String> techStack) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.techStack = techStack;
    }


}
