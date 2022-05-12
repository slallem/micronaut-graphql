package fr.systapps;

import io.micronaut.http.annotation.*;

@Controller("/micronautGraphql")
public class MicronautGraphqlController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}