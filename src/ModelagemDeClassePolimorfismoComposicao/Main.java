public class Main {
    public static void main(String[] args) {
        // Criar alguns países
        Pais brasil = new Pais("BRA", "Brasil", 2092818278, 85157167.049);
        Pais Venezuela = new Pais("VEN", "Venezuela", 442131041, 271280400);
        Pais Canada = new Pais("CAN", "Canadá", 346912351, 176212315);
        Pais China = new Pais("CHI", "China", 685453326, 406712352);

        // Definir as fronteiras dos países
        brasil.getFronteiras().add(Venezuela);
        brasil.getFronteiras().add(Canada);
        brasil.getFronteiras().add(China);

        Venezuela.getFronteiras().add(brasil);
        Canada.getFronteiras().add(brasil);
        China.getFronteiras().add(brasil);


        boolean VenezuelaVizinho = brasil.Vizinho(Venezuela);
        System.out.println("A Venezuela é vizinha do Brasil? " + VenezuelaVizinho);

        // Calcular a densidade populacional do Brasil
        double densidadePopulacionalBrasil = brasil.calcularDensidadePopulacional();
        System.out.println("Densidade populacional do Brasil: " + densidadePopulacionalBrasil + " hab/km²");
    }
}