package science.mengxin.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import science.mengxin.didemo.examplebeans.FakeDataSource;
import science.mengxin.didemo.examplebeans.FakeJmsBroker;

/**
 * <p>Date:    22/04/18
 *
 * @author mengxin
 * @version 1.0
 */
@Configuration
// @PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({
  //      @PropertySource("classpath:datasource.properties"),
    //    @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker jmsBroker = new FakeJmsBroker();
        jmsBroker.setUser(jmsUsername);
        jmsBroker.setPassword(jmsPassword);
        jmsBroker.setUrl(jmsUrl);
        return jmsBroker;
    }

}
