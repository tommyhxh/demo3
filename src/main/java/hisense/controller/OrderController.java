package hisense.controller;
/**
 * @cmptId 1320640060193767672
 * @dmId 1320648113257447672
 * @author saasp-de
 * @date today
 */
import hisense.service.OrderService;
import com.hisense.orm.resource.BaseController;
import hisense.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<Order>{

    @Autowired
    OrderService orderService;

}
