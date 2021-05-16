public class genericClass<T> {

    private T t;


    /*
     * 泛型类中的方法
     * */
    public T setT(T t) {
        return t;
    }

    /*
     * 泛型方法
     * */
    public <E> E getT(E t) {
        return t;
    }
}
