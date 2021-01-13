/*
 * Homework, 'Java Core' module in LOGOS IT Academy
 * Lesson 09 Exception, Java Code Convention
 * task 01
 */

package task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Application about months and seasons
 * 
 * @author Markiian
 * 
 *         version 1.0
 * 
 */

public class Menu {

	static void menu() {
		System.out.println("Натисніть 1, щоб перевірити, чи є такий місяць");
		System.out.println("Натисніть 2, щоб вивести місяці, які належать одній і тій самій порі року");
		System.out.println("Натисніть 3, щоб вивести місяці з однаковою кількістю днів");
		System.out.println("Натисніть 4, щоб вивести місяці, які мають меншу кількість днів");
		System.out.println("Натисніть 5, щоб вивести місяці, які мають більшу кількість днів");
		System.out.println("Натисніть 6, щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7, щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8, щоб вивести на екран місяці, які мають парну кількість днів");
		System.out.println("Натисніть 9, щоб вивести на екран місяці, які мають непарну кількість днів");
		System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* arrays for Seasons and Months for for-loops */
		// Seasons[] masSea = Seasons.values();
		// Months[] masMon = Months.values();

		List<Seasons> liSea = new ArrayList<>();
		List<Months> liMon = new ArrayList<>();

		if (!liSea.isEmpty()) {
			liSea.clear();
		} else {
			Collections.addAll(liSea, Seasons.values());
		}

		if (!liMon.isEmpty()) {
			liMon.clear();
		} else {
			Collections.addAll(liMon, Months.values());
		}

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = isMonthPresent(liMon, month); // method that checks presence of the month

				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "2": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months m : liMon) {

					if (m.getSeasons().name().equals(season)) {

						flag = true;
					}
				}

				if (flag) {
					Seasons se = Seasons.valueOf(season);
				}
				for (Months mo : liMon) {
					if (mo.getSeasons().name().equalsIgnoreCase(season)) {
						System.out.println(mo);
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "3": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : liMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : liMon) {
						if (mb.getDays() == m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "4": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : liMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : liMon) {
						if (mb.getDays() < m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "5": {
				System.out.println("Enter the month: ");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : liMon) {
					if (ma.name().equals(month)) {
						System.out.println("This month have " + ma.getDays() + " days;");
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					for (Months mb : liMon) {
						if (mb.getDays() > m.getDays()) {
							System.out.println(mb.name() + " - " + mb.getDays() + " days;");
						}
					}
				}
				incorrectMonth(month, flag);
				System.out.println();

				break;
			}
			case "6": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(liSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == (liSea.size() - 1)) {
						ordinal = 0;
						System.out.println(liSea.get(ordinal).toString());
					} else {
						System.out.println(liSea.get(ordinal + 1).toString());
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "7": {
				System.out.println("Enter the season: ");
				scanner = new Scanner(System.in);
				String season = scanner.next().toUpperCase();

				boolean flag = isSeasonPresent(liSea, season);

				if (flag) {
					Seasons seas = Seasons.valueOf(season);
					int ordinal = seas.ordinal();

					if (ordinal == 0) {
						ordinal = (liSea.size() - 1);
						System.out.println(liSea.get(ordinal).toString());
					} else {
						System.out.println(liSea.get(ordinal - 1).toString());
					}
				}

				incorrectSeason(season, flag);
				System.out.println();

				break;
			}
			case "8": {

				for (Months m : liMon) {
					if ((m.getDays() % 2) == 0) {
						System.out.println(
								"This month has an even number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;

			}
			case "9": {
				for (Months m : liMon) {
					if ((m.getDays() % 2) != 0) {
						System.out.println(
								"This month has an odd number of days: " + m.name() + " - " + m.getDays() + " days");
					}
				}
				System.out.println();

				break;
			}
			case "10": {
				System.out.println("Enter the month");
				scanner = new Scanner(System.in);
				String month = scanner.next().toUpperCase();

				boolean flag = false;

				for (Months ma : liMon) {
					if (ma.name().equals(month)) {
						flag = true;
					}

				}

				if (flag) {
					Months m = Months.valueOf(month);

					if ((m.getDays() % 2) == 0) {
						System.out.println("Month " + month + " has an even number of days;");

					} else {
						System.out.println("Month " + month + " has an odd number of days;");
					}

				}

				incorrectMonth(month, flag);
				System.out.println();

				break;
			}

			}
		}
	}

	// method that reports absence of the season

	private static void incorrectSeason(String season, boolean flag) {
		if (flag) {
			season = season;
		} else {
			try {
				throw new WrongInputConsoleParametersException();
			} catch (WrongInputConsoleParametersException a) {
				System.out.println("This season doesn`t exist, enter the correct season;");
			} finally {
				System.out.println("The program continues to run...");
			}
		}
	}

	// method that reports absence of the month

	private static void incorrectMonth(String month, boolean flag) {
		if (flag) {
			month = month;
		} else {
			try {
				throw new WrongInputConsoleParametersException();
			} catch (WrongInputConsoleParametersException a) {
				System.out.println("This month doesn`t exist, enter the correct month;");
			} finally {
				System.out.println("The program continues to run...");
			}
		}
	}

	// method that checks presence of the season

	private static boolean isSeasonPresent(List<Seasons> liSea, String season) {

		boolean flag = false;

		for (Seasons s : liSea) {

			if (s.toString().equals(season)) {
				System.out.println("Season exist");
				flag = true;
			}
		}
		return flag;
	}

	// method that checks presence of the month

	private static boolean isMonthPresent(List<Months> liMon, String month) {

		boolean flag = false;

		for (Months m : liMon) {

			if (m.toString().equals(month)) {
				System.out.println("Month exist");
				flag = true;
			}
		}
		return flag;
	}
}