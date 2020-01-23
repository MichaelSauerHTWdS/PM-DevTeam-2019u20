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
			final int YANNIC_HECKMANN=6;
			final int TOMAS_MANN=7;
			final int YANI_DIAGNE=8;
		    final int ANNIKA_MENDEN=9;
		    final int MORITZ_SIEGEL = 10;
			final int TOMAS_MANN=11;
			final int JAN_EHRHARDT = 12;
          	final int TIM_LORSON=13;
            final int JOHANNES_ORTH = 14;
            final int ALTMEYER_JULIAN = 15;
            final int AHMAD_RAJOUB = 16;
            final int JOHANNES_ORTH = 17;
            final int ALTMEYER_JULIAN = 18;
	        final int ARNE_KREUZ = 19;
		final int PHILIPPE_ALTMEIER = 20;
        	boolean isEnde=false;

		String[] textfeld={"Ciao",
				"Michael Sauer",
				"Mike Sour",
				"Maverick Studer",
				"Tomas Mann",
				"Laura Wagner",
				"Lukas Roth",
				"Annika Menden",
				"Moritz Siegel",
				"Lukas Roth",
				"Yannic Heckmann",
				"Yani Diagne",
                "Moritz Siegel",
				"Tomas Mann",
				"Jan Ehrhardt",
		        "Tim Lorson",
                "Julian Altmeyer",
			"Ahmad Rajoub",
				"Philippe Altmeier"
        };

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
				case ANNIKA_MENDEN:
					System.out.println("Annika Menden");
			    break;
                            case YANNIC_HECKMANN:
                                	System.out.println("Yannic Heckmann");
		
                            break;
                            case KIEFER_DAVID:
                            	    System.out.println("Kiefer David");
                            break;
							case YANI_DIAGNE:
                                	System.out.println("Yani Diagne");
							break;
                            case MORITZ_SIEGEL:
                                    System.out.println("Moritz Siegel");
                            break;
							case TOMAS_MANN:
									System.out.println("Tomas Mann");
							break;
							case JAN_EHRHARDT:
									System.out.println("Jan Ehrhardt");
							break;
							case TIM_LORSON:
									System.out.println("Tim Lorson");
                            break;
                            case AHMAD_RAJOUB:
                                System.out.println("Ahmad Rajoub");
                            break;                            case JOHANNES_ORTH:
                            System.out.println("Jan Ehrhardt");

                            case ALTMEYER_JULIAN:
                            System.out.println("Julian Altmeyer");

                            break;
                            case ARNE_KREUZ:
                            		System.out.println("Arne Kreuz");
							break;
							case PHILIPPE_ALTMEIER:
                            		System.out.println("Philippe Altmeier");
                            break;
                        	default:
									System.out.println("Fehler: Kenne ich nicht!");
                	}
        	}
	}
}
