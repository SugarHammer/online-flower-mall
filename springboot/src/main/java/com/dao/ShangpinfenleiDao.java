package com.dao;

import com.entity.ShangpinfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinfenleiVO;
import com.entity.view.ShangpinfenleiView;


/**
 * 鲜花分类
 * 
 * @author 
 * @email 
 * @date 2021-03-13 12:49:51
 */
public interface ShangpinfenleiDao extends BaseMapper<ShangpinfenleiEntity> {
	
	List<ShangpinfenleiVO> selectListVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	ShangpinfenleiVO selectVO(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	List<ShangpinfenleiView> selectListView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);

	List<ShangpinfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
	ShangpinfenleiView selectView(@Param("ew") Wrapper<ShangpinfenleiEntity> wrapper);
	
}
