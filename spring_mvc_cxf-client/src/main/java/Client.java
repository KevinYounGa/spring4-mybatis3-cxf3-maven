import com.rain6.cxf.service.Lawyer;
import com.rain6.cxf.service.TestWebService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main (String[] strings){
        String[] s = new String[]{"spring-cxf.xml"};
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-cxf.xml");
        TestWebService testWebService = (TestWebService) classPathXmlApplicationContext.getBean("userClient");
        
        //客户端自定义出拦截器
        /*org.apache.cxf.endpoint.Client client = ClientProxy.getClient(testWebService);
        List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
        outInterceptors.add(new AddUserInterceptor("kevin","123456"));*/
        
        Lawyer lawyer = testWebService.selectByPrimaryKey("143347");
        System.out.println("----------------->>>>>>>>>>>>>>>>>client calling .......");
        System.out.println(lawyer.toString());
    }
}
