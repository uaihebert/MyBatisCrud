package uai.crud;

import org.apache.ibatis.session.SqlSession;
import uai.model.Customer;

import java.util.List;

public class Read extends AbstractCrud {
    public static void main(String[] args) {
        SqlSession session = getOpenedSession();
        try {
            Customer customerFound = session.selectOne("com.uai.CrudQuery.Customer_FindById", 3);
            System.out.println(customerFound);

            List<Customer> customerList = session.selectList("com.uai.CrudQuery.Customer_ListALL");
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } finally {
            session.close();
        }
    }
}
