package com.dao;

import com.entity.JidiqiyeCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JidiqiyeCollectionView;

/**
 * 基地企业收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface JidiqiyeCollectionDao extends BaseMapper<JidiqiyeCollectionEntity> {

   List<JidiqiyeCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
