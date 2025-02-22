package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JidichanpinLiuyanEntity;
import java.util.Map;

/**
 * 基地产品留言 服务类
 * @author 
 * @since 2021-04-19
 */
public interface JidichanpinLiuyanService extends IService<JidichanpinLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}