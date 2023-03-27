/**
* Exemplo de uso do padrão Strategy
* Descrição:  O padrão Strategy permite que diferentes algoritmos sejam selecionados em tempo de execução.
* Neste exemplo, a interface SortingStrategy define um método sort() que é implementado pelas classes BubbleSort e QuickSort. 
* A classe Sorter usa um objeto SortingStrategy para executar um algoritmo de classificação em um array de inteiros. 
* O algoritmo de classificação é determinado em tempo de execução, permitindo que diferentes algoritmos sejam selecionados conforme necessário.
*
* @author marcelo Soares
* @since 2023-03-26
*/

public interface SortingStrategy {
    void sort(int[] arr);
}

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        // implementação do algoritmo de Bubble Sort
    }
}

public class QuickSort implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        // implementação do algoritmo de Quick Sort
    }
}

public class Sorter {
    private SortingStrategy sortingStrategy;

    public Sorter(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] arr) {
        sortingStrategy.sort(arr);
    }
}

public class Main {
    public static void main(String[] args) {
        SortingStrategy bubbleSort = new BubbleSort();
        SortingStrategy quickSort = new QuickSort();

        Sorter sorter = new Sorter(bubbleSort);
        sorter.sort(new int[]{5, 4, 3, 2, 1});

        sorter.setSortingStrategy(quickSort);
        sorter.sort(new int[]{5, 4, 3, 2, 1});
    }
}