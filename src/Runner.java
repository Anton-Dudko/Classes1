import by.epam.lab.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Ivanov Ivan", 1000, 3),
                new BusinessTrip("Petrov Petr", 2000, 4),
                null,
                new BusinessTrip("Fedorov Fedor", 3000, 5),
                new BusinessTrip()
        };

        int maxTotal = 0;
        BusinessTrip maxBusinessTrip = null;

        for (BusinessTrip businessTrip : businessTrips) {
            if(businessTrip == null)
                continue;
            businessTrip.show();
            if(businessTrip.getTotal() > maxTotal){
                maxTotal = businessTrip.getTotal();
                maxBusinessTrip = businessTrip;
            }
        }

        System.out.printf("the most expensive trip: \n");
        maxBusinessTrip.show();

        businessTrips[businessTrips.length - 1].setTransport(1500);

        System.out.printf("total duration of two initial business trips: " + (businessTrips[0].getDays() + businessTrips[1].getDays()) + "\n");

        for (BusinessTrip businessTrip: businessTrips){
            System.out.printf(businessTrip + "\n");
        }

    }
}
