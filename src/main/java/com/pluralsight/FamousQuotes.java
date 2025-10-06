package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        boolean quoteSelect = true;

        while(quoteSelect) {
            try {

                Scanner sc = new Scanner(System.in);

                String[] quotes = {"Innovation distinguishes between a leader and a follower. - Steve Jobs",
                        "Your most unhappy customers are your greatest source of learning. - Bill Gates",
                        "The most dangerous phrase in the language is, ‘We’ve always done it this way. - Grace Hopper",
                        "Talk is cheap. Show me the code. - Linus Torvalds",
                        "The Web does not just connect machines, it connects people. - Tim Berners-Lee",
                        "Those who can imagine anything, can create the impossible. - Alan Turing",
                        "Simplicity is a great virtue but it requires hard work to achieve it and education to appreciate it. - Edsger W. Dijkstra",
                        "Security is not a product, but a process. - Bruce Schneier",
                        "Always deliver more than expected. - Larry Page",
                        "No more monkeys jumping on the bed. - Dr. Said"
                };

                System.out.println("=====[Famous Quotes in IT]=====");
                System.out.println("");
                System.out.println("(1) Select a quote to read");
                System.out.println("(2) Read a random quote");
                System.out.println("(3) Exit");
                System.out.print("Enter a number 1-3 for menu options: ");
                int menuIndex = sc.nextInt();
                sc.nextLine();

                switch(menuIndex) {
                    case 1:
                        System.out.println("=====[Quote Selection Menu]=====");
                        System.out.println("");
                        System.out.print("Enter a number 1-10 for a famous quote: ");
                        int quoteIndex = sc.nextInt();
                        sc.nextLine();

                        System.out.println(quotes[quoteIndex - 1]);

                        System.out.println("");
                        System.out.println("Would you like to read another quote?");
                        System.out.println("(1) Yes");
                        System.out.println("(2) No");
                        int anotherQuote = sc.nextInt();
                        sc.nextLine();

                        if (anotherQuote == 1) {
                            quoteSelect = true;
                        } else {
                            quoteSelect = false;
                        }

                        break;
                    case 2:
                        int randomIndex = (int) (Math.random() * quotes.length);
                        String randomQuote = quotes[randomIndex];
                        System.out.println(randomQuote);


                        break;
                    case 3:
                        quoteSelect = false;
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error selecting quote, selection might be out of range.");
                System.out.println("Please try again!\n");
            }
        }
    }
}
