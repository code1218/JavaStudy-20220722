package j20_람다식;

@FunctionalInterface
public interface Add<T> {
	public T add(T x, T y);
}
