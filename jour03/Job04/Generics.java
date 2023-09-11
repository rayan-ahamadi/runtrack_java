package Job04;

public class Generics<T> {
    private T elements;

    public Generics(T elements){
        this.elements = elements;
    }

    public T getElements() {
        return elements;
    }

    public void modifElements(T elem){
        elements = elem;
    }

    public static void main(String[] args) {
        Generics gene = new Generics("2");
        System.out.println(gene.getElements());
        gene.modifElements(5);
        System.out.println(gene.getElements());
        System.out.println(gene.getElements().getClass().getName());
    }



}
