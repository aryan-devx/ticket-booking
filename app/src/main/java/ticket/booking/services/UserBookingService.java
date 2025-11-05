package ticket.booking.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Service;
import ticket.booking.entities.User;
import java.util.List;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private final ObjectMapper objectMapper;

    public UserBookingService(){
        objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        loadUsers();
    }
}
