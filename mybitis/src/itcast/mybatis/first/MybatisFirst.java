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
        //配置文件
        String source="SqlMapConfig.xml";
        InputStream inputstream=null;
        //数据库会话
        SqlSession sqlsession=null;
        //会话工厂
        SqlSessionFactory sqlsessionfactory=null;
        try {
            inputstream = Resources.getResourceAsStream(source);
            //创建一个会话工厂
            sqlsessionfactory=new SqlSessionFactoryBuilder().build(inputstream);
            //利用会话工厂创建一个会话
            sqlsession=sqlsessionfactory.openSession();
            //查询单个记录用selectOne方法
            User user=sqlsession.selectOne("test.findUserById", 12);
            //输出产品信息
            System.out.println(user);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            //关闭会话
            if(sqlsession!=null){
            sqlsession.close();
            }
        }

    }
}
