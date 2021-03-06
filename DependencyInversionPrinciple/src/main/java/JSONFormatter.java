import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// Formats message to JSON format.
public class JSONFormatter implements Formatter
{
    public String format(Message message) throws FormatException
    {
        // This is used for JSON serialization.
        ObjectMapper mapper = new ObjectMapper().findAndRegisterModules();

        try
        {
            return mapper.writeValueAsString(message);
        }
        catch (JsonProcessingException e)
        {
            e.printStackTrace();
            throw new FormatException(e);
        }
    }

}
