package _01_generic_class;

public class MyData<T> {
  private T data;

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

}
