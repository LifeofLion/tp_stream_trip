import exo.*;
import factory.TripFactory;
import models.Trip;

import java.util.List;

void main() {
    List<Trip> trips = TripFactory.generateTrips(10);


    System.out.println("\n--- Partie 1 ---\n");

    Partie1 p1 = new Partie1();
    System.out.println("Long & expensive: " + p1.longAndExpensiveTrips(trips) + "\n\n");
    System.out.println("Bad trips: " + p1.badTrips(trips) + "\n\n");
    System.out.println("Recent trips: " + p1.recentTrips(trips) + "\n\n");


    System.out.println("\n--- Partie 2 ---\n");

    Partie2 p2 = new Partie2();
    System.out.println("Count by city: " + p2.countByCity(trips) + "\n\n");
    System.out.println("Revenue by driver: " + p2.revenueByDriver(trips) + "\n\n");
    System.out.println("Avg duration by city: " + p2.avgDurationByCity(trips) + "\n\n");


    System.out.println("\n--- Partie 3 ---\n");

    Partie3 p3 = new Partie3();
    System.out.println("Top 10 expensive: " + p3.top10ExpensiveTrips(trips) + "\n\n");
    System.out.println("Best trip: " + p3.bestTrip(trips) + "\n\n");
}