package uai.crud;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractCrud {
    private static final SqlSessionFactory sqlSessionFactory;

    static {
        String resource = "mybatis.xml";
        InputStream inputStream;

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException("could not load mybatis.xml", e);
        }

        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    protected static Date parseDate(String dateToBeParsed){
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(dateToBeParsed);
        } catch (ParseException e) {
            return null;
        }
    }

    protected static SqlSession getOpenedSession() {
        return sqlSessionFactory.openSession();
    }
}