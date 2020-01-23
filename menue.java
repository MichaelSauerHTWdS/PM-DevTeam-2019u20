/*
 * Dieses kleine Java-Programm erzeugt ein sehr einfaches
 * Konsolen-Menü und dient dazu die Arbeitsweise eines RCS
 * zu erklären.
 * Autor(en): Michael Sauer
 * Datum:     03.01.2014
 * Datum:     28.11.2014 //fuer Veraenderung zu demonstrieren
 * Compile:   javac menue.java
 * Execute:   java menu
 *
 * Testzeile fuer push aus KI-Labor cmd-Client
 */

import java.util.Scanner;

public class menue{

        public static void main(String[] args) {
        	final int PROGRAMMENDE=0;
        	final int MICHAEL_SAUER=1;
			final int MIKE_SOUR=2;
            final int STUDER_MAVERICK= 3;
			final int LAURA_WAGNER = 4;
			final int LUKAS_ROTH=5;

        	boolean isEnde=false;

		String[] textfeld={"Ciao",
				"Michael Sauer",
				"Mike Sour",
				"Maverick Studer",
				"Laura Wagner",
				"Lukas Roth"};

        	while(!isEnde){
                	Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println(textfeld[0]);
                                	isEnde=true;
                        	break;
                        	case MICHAEL_SAUER:
                                	System.out.println("Michael Sauer");
                        	break;
                        	case MIKE_SOUR:
                                	System.out.println("Mike Sour");
                        	break;
							case STUDER_MAVERICK:
									System.out.println("Studer Maverick");
							break;
							case LAURA_WAGNER:
                                    System.out.println("Laura Wagner");
                            break;
							case LUKAS_ROTH:
                                    System.out.println("Lukas Roth");
                            break;

                        default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        	}
	}
}
