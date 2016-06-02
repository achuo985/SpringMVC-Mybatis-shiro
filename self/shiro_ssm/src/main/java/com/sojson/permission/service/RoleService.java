package com.sojson.permission.service;

import java.util.Map;
import java.util.Set;

import com.sojson.common.model.URole;
import com.sojson.core.mybatis.page.Pagination;
import com.sojson.permission.bo.RolePermissionAllocationBo;

public interface RoleService {

	int deleteByPrimaryKey(Long id);

    int insert(URole record);

    int insertSelective(URole record);

    URole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(URole record);

    int updateByPrimaryKey(URole record);

	Pagination<URole> findPage(Map<String, Object> resultMap, Integer pageNo,
			Integer pageSize);

	Map<String, Object> deleteRoleById(String ids);

	Pagination<RolePermissionAllocationBo> findRoleAndPermissionPage(
			Map<String, Object> resultMap, Integer pageNo, Integer pageSize);

	Set<String> findRoleByUserId(Long userId);

	
}
