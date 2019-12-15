package hisense.service;

/**
 * @denCmptId 1289813316826300985
 * @author saasp-de
 * @date today
 */

import com.hisense.bcommon.utils.HiWebResult;
import hisense.pojo.*;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hicloud")
public interface HicloudFeignClient {

    @RequestMapping(value = "//add", method = RequestMethod.POST)
    HiWebResult Hicloudadd(@RequestBody   clz);

}