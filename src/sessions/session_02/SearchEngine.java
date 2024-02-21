package sessions.session_02;

import sessions.Session;

public class SearchEngine extends Session {
    private String url;

    public SearchEngine(int option) {
        switch(option) {
            case 1:
                this.getData("País: ");
                this.url = "https://www.google.com/maps/search/";
                break;
            case 2:
                this.getData("Celebrity name: ");
                this.url = "https://twitter.com/search?q=";
                break;
            case 3:
                this.getData("Phone: ");
                this.url = "https://api.whatsapp.com/send?phone=";
        }
    }

    public String generateLink() {
        return this.url + this.input;
    }
}
