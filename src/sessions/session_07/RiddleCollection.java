package sessions.session_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiddleCollection {
    private final List<Riddle> riddles = new ArrayList<>();

    public RiddleCollection() {
        riddles.addAll(Arrays.asList(
           new Riddle("Si la tienes, la buscas; si no la tienes ni la buscas ni la quieres", "pulga"),
           new Riddle("Me llegan las cartas y no sé leer y, aunque me las trago, no mancho el papel.", "buzón"),
           new Riddle("Es pequeña como una pera, pero alumbra la casa entera.", "bombilla"),
           new Riddle("Redondo redondo, como un queso tierno, y al darle un mordisco, chorrean los dientes.", "manzana"),
           new Riddle("Mi picadura es dañina, mi cuerpo insignificante, pero el néctar que yo doy, os lo coméis al instante.", "abeja"),
           new Riddle("Soy redonda pero no soy pelota, soy verde pero no soy hierba, soy roja pero no soy fuego, aunque tengo semillas negras como el carbón.", "sandía"),
           new Riddle("Cógeme con cuidado, pues soy muy chiquitita. Cuando me siembras me transformo en plantita", "semilla"),
           new Riddle("¿Qué cosa es? ¿Qué cosa es? Que corre mucho y no tiene pies.", "viento")
        ));
    }

    public List<Riddle> getRiddles() {
        return riddles;
    }
}
