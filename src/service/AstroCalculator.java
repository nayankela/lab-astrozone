package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.User;

//Type your code
public class AstroCalculator {

	public String findSign(User user) {
		String dateOfBirth = user.getDob();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String ld = LocalDate.parse(dateOfBirth, formatter).format(formatter2);

		LocalDate localDate = LocalDate.parse(ld);
		String astro_sign = "";
		int day = localDate.getDayOfMonth();
		int month = localDate.getMonthValue();

		switch (month) {
		case 1:
			if (day < 20)
				astro_sign = "Capricorn";
			else
				astro_sign = "Aquarius";
			break;
		case 2:
			if (day < 19)
				astro_sign = "Aquarius";
			else
				astro_sign = "Pisces";
			break;
		case 3:
			if (day < 21)
				astro_sign = "Pisces";
			else
				astro_sign = "Aries";
			break;
		case 4:
			if (day < 20)
				astro_sign = "Aries";
			else
				astro_sign = "Taurus";
			break;
		case 5:
			if (day < 21)
				astro_sign = "Taurus";
			else
				astro_sign = "Gemini";
			break;
		case 6:
			if (day < 21)
				astro_sign = "Gemini";
			else
				astro_sign = "Cancer";
			break;
		case 7:
			if (day < 23)
				astro_sign = "Cancer";
			else
				astro_sign = "Leo";
			break;
		case 8:
			if (day < 23)
				astro_sign = "Leo";
			else
				astro_sign = "Virgo";
			break;
		case 9:
			if (day < 23)
				astro_sign = "Virgo";
			else
				astro_sign = "Libra";
			break;
		case 10:
			if (day < 23)
				astro_sign = "Libra";
			else
				astro_sign = "Scorpio";
			break;
		case 11:
			if (day < 22)
				astro_sign = "Scorpio";
			else
				astro_sign = "Sagittarius";
			break;
		case 12:
			if (day < 22)
				astro_sign = "Sagittarius";
			else
				astro_sign = "Capricorn";
			break;
		default:
			System.out.println("Error");
		}

		// Your details Name: FACEPrep. Age: 4 Your Astrology: LEO.
		System.out.println("Your details Name: " + user.getName() + ". Age: " + LocalDate.now().compareTo(localDate)
				+ " Your Astrology: " + astro_sign);
		return astro_sign;
	}
}
