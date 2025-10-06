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
                System.out.print("Enter a number 1-10 for a famous quote: ");
                int quoteIndex = sc.nextInt();
                sc.nextLine();

                System.out.println(quotes[quoteIndex - 1]);

                quoteSelect = false;

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error selecting quote, selection might be out of range.");
                System.out.println("Please try again!\n");
            }
        }

    }
}
