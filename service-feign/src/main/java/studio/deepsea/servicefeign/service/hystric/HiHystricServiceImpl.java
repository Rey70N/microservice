package studio.deepsea.servicefeign.service.hystric;

import org.springframework.stereotype.Component;
import studio.deepsea.servicefeign.service.HiService;

/***
 * @author Reyton
 */
@Component
public class HiHystricServiceImpl implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
