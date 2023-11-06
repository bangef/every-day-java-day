package learn.statis;

// import learn.statis.utils.MathUtils;
import static learn.statis.utils.MathUtils.sum;
import static learn.statis.Application.PROCESSORS;

public class App {

  public static void main(String[] args) {
    /**
     * Static field
     */
    System.out.printf("Phi: %s%n", Constants.PI);
    System.out.printf("String: %s%n", Constants.APPLICATION);
    /**
     * Static method
     */
    // System.out.printf("Hasil dari 1 + 2 + 3 + 4 adalah %s%n", MathUtils.sum(1, 2,
    // 3, 4));
    System.out.printf("Hasil dari 1 + 2 + 3 + 4 adalah %s%n", sum(1, 2, 3, 4));
    /**
     * Static Inner Class
     */
    Country.Province province = new Country.Province();
    province.setName("Jawa Barat");
    System.out.printf(province.getName());
    /**
     * Static Block
     */
    // System.out.printf("Static Block - Processors: %s%n", Application.PROCESSORS);
    System.out.printf("Static Block - Processors: %s%n", PROCESSORS);
  }
}
