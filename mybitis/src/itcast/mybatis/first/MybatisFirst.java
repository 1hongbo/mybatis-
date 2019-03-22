package itcast.mybatis.first;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import itcast.mybatis.po.User;
public class MybatisFirst {
	@Test
    public void findUserByIdTest() {
        //�����ļ�
        String source="SqlMapConfig.xml";
        InputStream inputstream=null;
        //���ݿ�Ự
        SqlSession sqlsession=null;
        //�Ự����
        SqlSessionFactory sqlsessionfactory=null;
        try {
            inputstream = Resources.getResourceAsStream(source);
            //����һ���Ự����
            sqlsessionfactory=new SqlSessionFactoryBuilder().build(inputstream);
            //���ûỰ��������һ���Ự
            sqlsession=sqlsessionfactory.openSession();
            //��ѯ������¼��selectOne����
            User user=sqlsession.selectOne("test.findUserById", 12);
            //�����Ʒ��Ϣ
            System.out.println(user);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //�رջỰ
            if(sqlsession!=null){
            sqlsession.close();
            }
        }

    }
}
