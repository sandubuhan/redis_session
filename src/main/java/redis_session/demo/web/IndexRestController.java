package redis_session.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-04-23 22:11
 */
@RestController
public class IndexRestController {

    @RequestMapping
    public Map<String, Object> index(HttpServletRequest request) {
        Map<String, Object> map     = new HashMap<>();
        HttpSession         session = request.getSession();
        String              id      = session.getId();
        map.put("sessionId", id);
        return map;
    }
}
