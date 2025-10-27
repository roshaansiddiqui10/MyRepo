import javax.swing.*;
import java.sql.Date;

public class BookFlightCommand implements Command {
    private DashboardPanel dashboard;
    private Flight flight;
    private String flightClass;
    private Date travelDate;
    private String paymentMethod;
    private String username;

    public BookFlightCommand(DashboardPanel dashboard, Flight flight, String flightClass, Date travelDate, String paymentMethod, String username) {
        this.dashboard = dashboard;
        this.flight = flight;
        this.flightClass = flightClass;
        this.travelDate = travelDate;
        this.paymentMethod = paymentMethod;
        this.username = username;
    }

    @Override
    public void execute() {
        JFrame confirmationFrame = dashboard.handleBookingConfirmation();
        dashboard.showPinVerificationPanel(confirmationFrame, "1234", flight, flightClass, username, travelDate);
    }
}
