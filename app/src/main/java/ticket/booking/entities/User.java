package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashpassword;
    private List<Ticket> ticketsBooked;
    private String userId;

    // construstor
    public User(String name, String password, String hashpassword, List<Ticket> ticketsBooked, String userId) {
        this.name = name;
        this.password = password;
        this.hashpassword = hashpassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }

    public User() {
    }


    // getter
    public String getHashpassword() {
        return hashpassword;
    }
    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }
    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }

    public void printTickets(){
//        System.out.println("Debugged User.java -> printTickets()");
        if(ticketsBooked.isEmpty()){
            System.out.println("No tickets booked yet!");
            return;
        }else {
            for (Ticket ticket : ticketsBooked) {
                System.out.println(ticket.getTicketInfo());
            }
        }
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setHashpassword(String hashpassword) {
        this.hashpassword = hashpassword;
    }
    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
