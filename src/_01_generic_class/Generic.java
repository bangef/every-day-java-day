package _01_generic_class;

public class Generic<T> {
  private T data;

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
