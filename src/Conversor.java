import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {

    private static final String API_KEY = "879f2c9538a49cf1e41e65c3";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static void main(String[] args) {
        int opcion = 0;


        System.out.println("**********************************************************");
        System.out.println("\n🌟 ¡Bienvenido al Futuro de las Finanzas! Convierte tus monedas de forma fácil y rápida. 🌟\n");


        String menu = """
                1) Dólar --> Peso chileno
                2) Peso chileno --> Dólar
                3) Dólar --> Peso argentino
                4) Peso argentino --> Dólar
                5) Dólar --> Real brasileño
                6) Real brasileño --> Dólar  
                7) Peso Colombiano --> Dólar
                8) Dólar --> Peso Colombiano
                10) Peso mexicano--> Dólar
                11) Dólar -->Peso mexicano
                12) Salir 
                """;


        System.out.println("**********************************************************\n");

        Scanner teclado = new Scanner(System.in);
        while (true) {
            // Muestra opciones al usuario
            System.out.println(menu);
            System.out.println("\nPor favor, elija una opción:\n");
            System.out.println("\n**********************************************************\n");

            // Verifica si la entrada es un número entero
            if (!teclado.hasNextInt()) {
                System.out.println("\nPor favor, ingrese un número válido.\n");
                System.out.println("\n");
                teclado.next(); // Limpiar el buffer
                continue; // Volver al inicio del bucle
            }

            opcion = teclado.nextInt();

            if (opcion == 12) {
                System.out.println("\n**********************************************************\n");
                System.out.println("Gracias por usar el Conversor de Monedas. ¡Hasta la próxima!");
                System.out.println("\n**********************************************************\n");
                break;
            }

            // Validar que la opción esté en el rango permitido
            if (opcion < 1 || opcion > 11) {

                System.out.println("\n**********************************************************\n");
                System.out.println("Opción no válida. Por favor, elija un número entre 1 y 12.");
                System.out.println("\n**********************************************************\n");
                continue; // Volver al inicio del bucle
            }

            // Pedimos el valor a convertir
            System.out.println("\n**********************************************************\n");
            System.out.println("Ingrese la cantidad a convertir: ");
            System.out.println("\n**********************************************************\n");
            double valor = teclado.nextDouble();


            try {
                switch (opcion) {
                    case 1:
                        convertirMoneda("USD", "CLP", valor);
                        break;
                    case 2:
                        convertirMoneda("CLP", "USD", valor);
                        break;
                    case 3:
                        convertirMoneda("USD", "ARS", valor);
                        break;
                    case 4:
                        convertirMoneda("ARS", "USD", valor);
                        break;
                    case 5:
                        convertirMoneda("USD", "BRL", valor);
                        break;
                    case 6:
                        convertirMoneda("BRL", "USD", valor);
                        break;
                    case 7:
                        convertirMoneda("COP", "USD", valor);
                        break;
                    case 8:
                        convertirMoneda("USD", "COP", valor);
                        break;
                    case 9:
                        convertirMoneda("USD", "COP", valor);
                        break;
                    case 10:
                        convertirMoneda("MXN", "USD", valor);
                        break;
                    case 11:
                        convertirMoneda("USD", "MXN", valor);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, elija un número entre 1 y 12.");
                }
            } catch (IOException | InterruptedException e) {
                System.out.println("\n**********************************************************\n");
                System.out.println("Ha ocurrido un error al realizar la conversión: " + e.getMessage());
                System.out.println("\n**********************************************************\n");
            }
        }
        teclado.close();
    }

    public static void convertirMoneda (String from, String to, double valor) throws IOException, InterruptedException {
        String url = API_URL + from;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        MonedaUtil monedaUtil = new MonedaUtil();
        double tasa = monedaUtil.obtenerTasaConversion(response.body(), to);

        double resultado = valor * tasa;

        System.out.println("\n**********************************************************\n");
        System.out.println("El valor" + " " + valor + " " + "(" + from + ")" + " " + "corresponde al valor según la tasa de cambio actual. -->" + " " + resultado + " " + "(" + to + ")\n");
        System.out.println("\n**********************************************************\n");
    }

}
