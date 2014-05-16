package uai.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import uai.model.Customer;

import java.util.List;

public interface CustomerMapper {

    @Select("select * from customer")
    @Results({
            @Result(property = "socialSecurityNumber", column = "social_security_number")
    })
    public List<Customer> listAll();

    @Select("select * from customer where id = #{id}")
    @Results({
            @Result(property = "socialSecurityNumber", column = "social_security_number")
    })
    public Customer findById(int customerId);
}
