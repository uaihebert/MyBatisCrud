package uai.crud;

import org.apache.ibatis.session.SqlSession;
import uai.mapper.CustomerMapper;
import uai.model.Customer;

import java.util.List;

public class ReadMapper extends AbstractCrud {
    public static void main(String[] args) {
        SqlSession session = getOpenedSession();
        try {
            CustomerMapper customerMapper = session.getMapper(CustomerMapper.class);
            Customer customerFound = customerMapper.findById(3);
            System.out.println(customerFound);

            List<Customer> customerList = customerMapper.listAll();
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } finally {
            session.close();
        }
    }
}
