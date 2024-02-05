
import com.entity.Tourist;
import com.exception.AgeLimitException;
import org.springframework.http.ResponseEntity;
import java.util.List;

public interface TouristService {
    Tourist registerTourist(Tourist tourist) throws AgeLimitException;
    
    void deleteTouristByIdService(Long id);

    ResponseEntity<Tourist> fetchTouristByIdService(Long id);

    ResponseEntity<List<Tourist>> fetchTouristByNameService(String name);
}
