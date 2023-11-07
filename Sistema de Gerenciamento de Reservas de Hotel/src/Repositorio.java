public interface Repositorio <T>{
    T adicionar(T item);
    T remover(T item);
    <R> T buscar(R codigo);
}
