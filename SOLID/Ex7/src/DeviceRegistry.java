import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeviceRegistry {

    private final List<Object> devices = new ArrayList<>();

    public void add(Object device) {
        devices.add(device);
    }

    public <T> List<T> getByCapability(Class<T> type) {
        return devices.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .collect(Collectors.toList());
    }
}