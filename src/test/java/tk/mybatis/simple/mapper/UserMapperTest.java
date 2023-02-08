package tk.mybatis.simple.mapper;
import org.junit.Test;

import junit.framework.Assert;

import java.util.Date;
import java.util.List;
import tk.mybatis.simple.mapper.UserMapper;
import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

import org.apache.ibatis.session.SqlSession;
public class UserMapperTest extends BaseMapperTest {
@SuppressWarnings("deprecation")
@Test
public void testSelectById(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		SysUser user=userMapper.selectById(1l);
		Assert.assertNotNull(user);
		Assert.assertEquals("admin", user.getUserName());
		
		
	}finally{
		sqlSession.close();
	}
}
@SuppressWarnings("deprecation")
@Test
public void testSelectAll(){
	SqlSession sqlSession=getSqlSession();
	
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<SysUser> userList=userMapper.selectAll();
		Assert.assertNotNull(userList);
		Assert.assertTrue(userList.size()>0);
		
	}finally{
		
		sqlSession.close();
	}
}

@SuppressWarnings("deprecation")
@Test
public void testSelectRolesByUserId(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<SysRole> userList=userMapper.selectRolesByUserId(1L);
		Assert.assertNotNull(userList);
		Assert.assertTrue(userList.size()>0);
		
	}finally{
		
		sqlSession.close();
	}
	
}

@SuppressWarnings("deprecation")
@Test
public void testSelectRolesByUserId2(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<SysRole> userList=userMapper.selectRolesByUserId2(1L,1);
		Assert.assertNotNull(userList);
		Assert.assertTrue(userList.size()>0);
		
	}finally{
		
		sqlSession.close();
	}
	
}
//@SuppressWarnings("deprecation")
//@Test
//public void testInsert(){
//	SqlSession sqlSession=getSqlSession();
//	try{
//		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
//		SysUser user=new SysUser();
//		user.setUserName("test6");
//		user.setUserPassword("12345678");
//		user.setUserEmail("38431000@qq.com");
//		user.setUserInfo("test info");
//		user.setHeadImg(new byte[]{1,2,3});
//		user.setCreateTime(new Date());
//		int result=userMapper.insert(user);
//		Assert.assertEquals(1,result);
//		System.out.println(user.getId());
//		
//	}finally{
//		sqlSession.commit();
//		sqlSession.close();
//	}	
//	
//	
//}
@SuppressWarnings("deprecation")
@Test
public void testInsert2(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		SysUser user=new SysUser();
		user.setUserName("test5");
		user.setUserPassword("12345678");
		user.setUserEmail("38431000@qq.com");
		user.setUserInfo("test info");
		user.setHeadImg(new byte[]{1,2,3});
		user.setCreateTime(new Date());
		int result=userMapper.insert2(user);
		Assert.assertEquals(1,result);
		System.out.println(user.getId());
		
	}finally{
		sqlSession.commit();
		sqlSession.close();
	}	
	
	
}
@SuppressWarnings("deprecation")
@Test
public void testUpdateById(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		SysUser user=userMapper.selectById(1009L);
		user.setUserName("伟大的卢志群");
		
		int result=userMapper.updateById(user);
		
		System.out.println(user.getId());
		
	}finally{
		sqlSession.commit();
		sqlSession.close();
	}	
	
	
}
@SuppressWarnings("deprecation")
@Test
public void deleteById(){
	SqlSession sqlSession=getSqlSession();
	try{
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		SysUser user=userMapper.selectById(1009L);
		
		int result=userMapper.deleteById(user);
		
		
		
	}finally{
		sqlSession.commit();
		sqlSession.close();
	}	
	
	
}
}
