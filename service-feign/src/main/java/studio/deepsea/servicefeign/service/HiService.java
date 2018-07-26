package studio.deepsea.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import studio.deepsea.servicefeign.service.hystric.HiHystricServiceImpl;

/***
 * @author Reyton
 */
@SuppressWarnings("ALL")
@FeignClient(value = "service-hi", fallback = HiHystricServiceImpl.class)
public interface HiService {

    /***
     * 调用Servce-Hi服务的hi方法
     * @param name 名字
     * @return 返回字符串
     */
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
