
import com.entity.Tourist;
import com.exception.AgeLimitException;


public interface TouristService {
    Tourist registerTourist(Tourist tourist) throws AgeLimitException;
}
