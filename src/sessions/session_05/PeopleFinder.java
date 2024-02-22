package sessions.session_05;

import sessions.Session;
import java.util.ArrayList;
import java.util.List;

public class PeopleFinder extends Session {
    private final String[] persons = {
        "Raul Alejandro Torres Valdivia",
        "Maria Garcia Perez",
        "Juan Carlos Ramirez Lopez",
        "Laura Martinez Rodriguez",
        "Pedro Sanchez Fernandez",
        "Ana Jimenez Garcia",
        "Luisa Perez Gomez",
        "Carlos Perez Ramirez",
        "Elena Fernandez Martinez",
        "Javier Gonzalez Lopez"
    };
    private final String search;

    public PeopleFinder() {
        this.search = getSearch();
    }

    private List<String> searchPerson(String search) {
        List<String> result = new ArrayList<>();
        for (String person : this.persons) {
            if (person.toLowerCase().contains(search.toLowerCase())) {
                result.add(person);
            }
        }
        return result;
    }

    public void showResult() {
        List<String> result = searchPerson(this.search);
        if(result.isEmpty()) {
            System.out.println("Sorry, no matches were found");
            System.exit(1);
        }
        System.out.println(result.size() + " result(s) found: " + result);
    }

    private String getSearch() {
        getData("Search: ");
        return this.input;
    }
}
