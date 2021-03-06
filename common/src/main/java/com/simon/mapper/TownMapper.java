package com.simon.mapper;

import com.simon.common.mapper.CrudMapper;
import com.simon.model.Town;
import com.simon.provider.TownProvider;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
import java.util.Map;

/**
* @author SimonSun
* @date 2019-04-25
**/
public interface TownMapper extends CrudMapper<Town> {
    /**
     * 使用Map查询
     * @param map 查询条件
     * @return 结果列表
     */
    @Override
    @ResultMap("BaseResultMap")
    @SelectProvider(type = TownProvider.class, method = "getList")
    List<Town> getList(Map<String, Object> map);
}