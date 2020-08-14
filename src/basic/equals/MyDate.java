package basic.equals;

/**
 * @author: hqweay
 * @description: TODO
 * Created on 8/12/20 2:39 PM
 */
public class MyDate {
  private int year = 1970;
  private int month = 1;
  private int day = 1;

  public MyDate() {
  }

  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String toString() {
    return this.year + " 年 " + this.month + " 月 " + this.day + " 日 ";
  }

  // 覆盖 equals() 必须覆盖 hashCode()
  @Override
  public int hashCode() {
    return (this.year + this.month + this.day) ^ this.year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (this.hashCode() != o.hashCode()) {
      return false;
    }
    if (o instanceof MyDate) {
      MyDate obj = (MyDate) o;
      if (obj.year == this.year && obj.month == this.month && obj.day == this.day) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    MyDate myDate1 = new MyDate(2011, 2, 12);
    MyDate myDate2 = new MyDate(2012, 2, 12);
    MyDate myDate3 = new MyDate(2012, 2, 12);
    System.out.println(myDate1.equals(myDate2));
    System.out.println(myDate2.equals(myDate3));
    System.out.println(myDate2.equals(myDate2));

    System.out.println(myDate1.hashCode());
  }
}
