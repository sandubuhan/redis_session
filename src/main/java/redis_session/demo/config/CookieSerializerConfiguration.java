package redis_session.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * @Author sandu
 * @Date 2022-04-23 22:52
 */
@Configuration
public class CookieSerializerConfiguration {
    /**
     * 在主域中储存Cookie，子域中共享Cookie
     */
    @Bean
    public CookieSerializer cookieSerializer() {

        // 默认 Cookie 序列化
        DefaultCookieSerializer defaultCookieSerializer = new DefaultCookieSerializer();

        // Cookie名字，默认为 SESSION
        defaultCookieSerializer.setCookieName("SESSION");

        // 域，这允许跨子域共享cookie，默认设置是使用当前域。
//        defaultCookieSerializer.setDomainName("xuxiaowei.com.cn");

        // Cookie的路径。
        defaultCookieSerializer.setCookiePath("/");

        return defaultCookieSerializer;
    }
}
