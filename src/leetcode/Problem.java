package leetcode;

public class Problem {

  public static String convertToTitle(int columnNumber) {

    StringBuilder sb = new StringBuilder();
    while (columnNumber > 0) {
      int remainder = columnNumber % 26;
      char digit = byIndex(remainder);
      sb.append(digit);
      columnNumber /= 26;
    }

    return sb.reverse().toString();
  }

  static char byIndex(int value) {
    return (char) ('A' + value-1);
  }

  public static void main(String[] args) {

    System.out.println(convertToTitle(701));

  }
}
