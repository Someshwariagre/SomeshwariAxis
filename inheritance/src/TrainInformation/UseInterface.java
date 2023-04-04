package TrainInformation;

public class UseInterface {

        public static CommisionInfo generateCommissionObtained() {
            return ticketObj -> {
                double commission = 0.0;
                switch (ticketObj.getClassType()) {
                    case "1A":
                    case "2A":
                    case "3A":
                        commission = ticketObj.getTicketFare() * 0.1;
                        break;
                    case "SL":
                    case "2S":
                        commission = ticketObj.getTicketFare() * 0.06;
                        break;
                    default:
                        break;
                }
                return commission;
            };
        }

    }
