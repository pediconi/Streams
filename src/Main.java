import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main (String args[]){

        List<Persona> personas = new LinkedList<>();
        List<Persona> mayores21 = new LinkedList<>();


        Persona p1 = new Persona(13,3334534,"Jose");
        Persona p2 = new Persona(8,3334534,"Pepe");
        Persona p3 = new Persona(55,1734534,"Tito");
        Persona p4 = new Persona(27,3895534,"Cachito");

        personas = Arrays.asList(p1,p2,p3,p4);  //agrego a las personas

        System.out.println(String.format("mayores a 21 :%s",personas.stream()
        .filter(persona -> persona.getEdad()>21)     //filtro los mayores a 21
        .collect(Collectors.toList())));      // paso a lista

        System.out.println(String.format("menores a 18 :%s",personas.stream()
                .filter(persona -> persona.getEdad()<18)     //filtro los mayores a 21
                .collect(Collectors.toList())));      // paso a lista

        System.out.println(String.format("mayores a 21 y DNI mayor a 200000 :%s",personas.stream()
                .filter(persona -> persona.getEdad()>21)     //filtro los mayores a 21
                .filter(persona -> persona.getDni()>2000000)
                .collect(Collectors.toList())));      // paso a lista

    }
}
