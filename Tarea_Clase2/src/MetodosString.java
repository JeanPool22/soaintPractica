public class MetodosString {
    public static void main(String[] args) {
        String fraseOne = "Colombia";
        String fraseTwo = "15894633";

        // Método Equals
        boolean a = fraseOne.equals(fraseTwo) ? true : false;
        System.out.println("a: " + a);

        // Métodos join
        String b = fraseOne.join(" ", "Amarillo", "Azul", "Rojo");
        System.out.println("b: " + fraseOne + " " + b);

        // Método toUpperCase
        String c = fraseOne.toUpperCase();
        System.out.println("c: " + c);

        // Método replace
        String d = fraseOne.replace('C', 'P');
        System.out.println("d: " + d);

        // Método Integer.parseInt
        int e = Integer.parseInt(fraseTwo);
        System.out.println("e: " + e);

        // Método toCharArray
        char[] f = fraseOne.toCharArray();
        System.out.println(f);

        // Método substring
        String g = fraseOne.substring(1, 4);
        System.out.println("g: " + g);

        // Método startsWith
        boolean h = fraseTwo.startsWith("2");
        System.out.println("h: " + h);

        // Método isEmpty
        boolean i = fraseOne.isEmpty();
        System.out.println("i: " + i);

        // Método replaceAll
        String j = fraseOne.replaceAll(fraseOne, "España");
        System.out.println("j: " + j);
    }
}
