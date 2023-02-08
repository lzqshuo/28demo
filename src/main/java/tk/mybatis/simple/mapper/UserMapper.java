package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tk.mybatis.simple.model.SysRole;
import tk.mybatis.simple.model.SysUser;

public interface UserMapper {
SysUser selectById(Long id);
List<SysUser> selectAll();
List<SysRole> selectRolesByUserId(Long userId);
//int insert(SysUser sysUser);
int insert2(SysUser sysUser);
int updateById(SysUser sysUser);
int deleteById(SysUser sysUser);
List<SysRole> selectRolesByUserId2(@Param("userId")Long userId,@Param("enabled")Integer enabled);
}
