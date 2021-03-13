package format.servlet;

public class Modelo {

	public String formatarTexto(String texto, String format) {
		String st = null;

		switch (format) {
		case "upper":
			st = changeCase(texto, format);
			break;
		case "lower":
			st = changeCase(texto, format);
			break;
		case "firstupper":
			st = firstLetterUpper(texto);
			break;
		}

		return st;
	}

	private String changeCase(String texto, String format) {
		String s = null;
		switch (format) {
		case "upper":
			s = texto.toUpperCase();
			break;
		case "lower":
			s = texto.toLowerCase();
			break;
		}
		return s;
	}

	private String firstLetterUpper(String texto) {
		char[] charArray = texto.toCharArray();
		boolean foundSpace = true;

		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = Character.toLowerCase(charArray[i]);

			if (Character.isLetter(charArray[i])) {
				if (foundSpace) {
					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			} else {
				foundSpace = true;
			}
		}
		String s = String.valueOf(charArray);

		return s;
	}
}
