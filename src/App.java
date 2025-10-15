public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Por favor, introduzca un número entero: "));
        System.out.printf("La última cifra del número introducido es el %d.", num  % 10);
    }
}
