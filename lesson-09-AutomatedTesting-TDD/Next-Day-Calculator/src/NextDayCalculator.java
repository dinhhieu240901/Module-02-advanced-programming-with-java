import java.time.LocalDate;

public class NextDayCalculator {

  public static int[] nextDate(int day, int month, int year) {
    int[] result = new int[3];
    result[0] = day;
    result[1] = month;
    result[2] = year;
    int lastDayInMonth;
    lastDayInMonth = isLeapYear(month, year);

    dayInMonth(day, month, year, lastDayInMonth, result);
    return result;
  }

  public static void dayInMonth(
    int day,
    int month,
    int year,
    int lastDayInMonth,
    int[] result
  ) {
    if (day < lastDayInMonth) {
      result[0] = day + 1;
    } else if (day == lastDayInMonth) {
      result[0] = 1;
      if (month < 12) {
        result[1] = month + 1;
      } else {
        result[1] = 1;
        result[2] = year + 1;
      }
    } else {
      throw new RuntimeException("Invalid day");
    }
  }

  public static int isLeapYear(int month, int year) {
    int lastDayInMonth;

    switch (month) {
      case 2:
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          return 29;
        } else {
          return 28;
        }
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      default:
        if (month < 1 || month > 12) {
          throw new RuntimeException("Invalid Month");
        } else {
          lastDayInMonth = 31;
        }
    }
    return lastDayInMonth;
  }
}
