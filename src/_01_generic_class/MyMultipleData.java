package _01_generic_class;

public class MyMultipleData<T, S> {
  private T data;
  private S data2;

  public T getData() {
    return this.data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public S getData2() {
    return this.data2;
  }

  public void setData2(S data2) {
    this.data2 = data2;
  }

}
