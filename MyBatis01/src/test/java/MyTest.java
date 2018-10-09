import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.chinasoft.mapper.PeopleMapper;
import com.chinasoft.pojo.People;

public class MyTest {

	@Test
	public void test()  {
		
		
		try {
			
			//1.加载配置文件
			Reader reader = Resources.getResourceAsReader("mybatis.xml");
			
			//2.得到SqlSessionFactoryBuilder
			SqlSessionFactoryBuilder sfb  =  new SqlSessionFactoryBuilder();
			
			//3.得到sqlsessionfactory
			SqlSessionFactory factory = sfb.build(reader);
			
			//4.得到sqlsession
			SqlSession openSession = factory.openSession();
			
			//5.得到映射器
			PeopleMapper pm = openSession.getMapper(PeopleMapper.class);
			
			ArrayList<People> people = pm.getPeople();
			
			for(int i = 0;i < people.size();i++) {
				System.out.println(people.get(i).getId()+"----"+people.get(i).getPwd());
			}
			openSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
