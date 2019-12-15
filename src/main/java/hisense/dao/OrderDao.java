package hisense.dao;
/**
 * @cmptId 1320640060193767672
 * @dmId 1320648113257447672
 * @author saasp-de
 * @date today
 */
import com.hisense.orm.dao.BaseDao;
import hisense.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrderDao extends BaseDao<Order> {
}