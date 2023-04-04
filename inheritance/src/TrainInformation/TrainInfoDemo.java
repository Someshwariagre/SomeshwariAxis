package TrainInformation;


import java.util.Scanner;
import static TrainInformation.UseInterface.generateCommissionObtained;

public class TrainInfoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n = sc.nextInt();
        Ticket[] tickets = new Ticket[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Details of Passenger " + (i+1) + ":");
            System.out.println("Enter the pnr no:");
            long pnrNo = sc.nextLong();
            System.out.println("Enter passenger name:");
            String passengerName = sc.next();
            System.out.println("Enter seat no:");
            int seatNo = sc.nextInt();
            System.out.println("Enter class type:");
            String classType = sc.next();
            System.out.println("Enter ticket fare:");
            double ticketFare = sc.nextDouble();
            Ticket ticket = new Ticket(pnrNo, passengerName, seatNo, classType, ticketFare);
            tickets[i] = ticket;
        }
        CommisionInfo commisionInfo = generateCommissionObtained();
        double totalCommission = 0.0;
        for (Ticket ticket : tickets) {
            double commission = commisionInfo.calculateCommissionAmount(ticket);
            totalCommission += commission;
        }
        System.out.println("Commision Obtained");
        System.out.printf("Commission Obtained per each person: Rs. %.2f", totalCommission);
        sc.close();
    }
}


