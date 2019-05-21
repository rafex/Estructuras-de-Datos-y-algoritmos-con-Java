package mx.rafex.cursos.estructuraDeDatosYAlgoritmos.arbolbinario;

import java.util.Optional;

public class TreeTest {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.add(5);
        root.add(15);
        root.add(8);

        Optional<Node> result = root.find(11);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }

        result = root.find(8);
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Value not found");
        }
        System.out.println("Print in order");
        root.printInOrder();
        System.out.println("Print pos order");
        root.printPosOrder();
        System.out.println("Print pre order");
        root.printPreOrder();
    }
}
