package uai.crud;

import org.apache.ibatis.session.SqlSession;

public class Delete extends AbstractCrud{
    public static void main(String[] args) {
        SqlSession session = getOpenedSession();

        try {
            session.delete("com.uai.CrudQuery.Customer_Delete", 2);

            session.commit();
        } finally {
            session.close();
        }

    }
}
