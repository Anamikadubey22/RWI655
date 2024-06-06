package june6;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();

        sb.append("Anu, ");
        sb.append("Happiness");
        System.out.println("Initial string: " + sb.toString());

        sb.insert(7, "Coding ");
        System.out.println("After insertion: " + sb.toString());

        sb.delete(7, 14);
        System.out.println("After deletion: " + sb.toString());

        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());

        sb.replace(0, 6, "Welcome");
        System.out.println("After replacement: " + sb.toString());

        sb.insert(0, "Greetings, ");
        System.out.println("After inserting at the beginning: " + sb.toString());
    }
}