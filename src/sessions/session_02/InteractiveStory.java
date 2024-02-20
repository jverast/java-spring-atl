package sessions.session_02;

import sessions.Session;

public class InteractiveStory extends Session {
    private int option = 0;
    private final String[] storytelling = {
        "En una noche estrellada, te encuentras en un bosque misterioso:",
        "Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. All llegar a la cabaña, te das cuenta de que hay dos puertas:",
        "Al abrir la puerta de la izquierda, te encuentras con una habitación de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!.",
        "Al abrir la puerta de la derecha, te ves forzado a cerrarla porque ves innumerables escenas que jamás habías visto en tu vida. Luego de muchos años, estas escenas vienen a tu mente solo para darte cuenta de que no tuviste el valor de entrar en busca de nuevas aventuras."
    };

    private final String[][] options = {
        {
            "1. Exploras la oscuridad en busca de la fuente de un susurro escalofriante",
            "2. Sigues el sendero iluminado hacia una pequeña cabaña acogedora"
        },
        {
            "1. Entras por la puerta de la izquierda",
            "2. Optas por la puerta de la derecha"
        }
    };

    public void getStorytelling() {
        int option = this.option;
        switch (option) {
            case 0:
                printStoryAndOptions(0);
                option = getOption();
                break;
            case 1:
                break;
            case 2:
                printStoryAndOptions(1);
                option = getOption() + 2;
                break;
            case 3:
                System.out.println(this.storytelling[2]);
                break;
            case 4:
                System.out.println(this.storytelling[3]);
        }

        System.out.print("\n");
        setStorytelling(option);
    }

    private int getOption() {
        this.getData("El usuario escoge: ");

        if(!this.input.matches("[12]")) {
            System.exit(1);
        }

        return Integer.parseInt(this.input);
    }

    public void setStorytelling(int option) {
        if(this.option == option ) {
            System.exit(0);
        }

        this.option = option;
        getStorytelling();
    }

    private void printStoryAndOptions(int index) {
        System.out.println(this.storytelling[index]);
        for(int i = 0; i < this.options.length; i ++) {
            System.out.println(this.options[index][i]);
        }
    }
}
