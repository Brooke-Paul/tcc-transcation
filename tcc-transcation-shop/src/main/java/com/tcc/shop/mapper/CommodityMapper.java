package com.tcc.shop.mapper;

import com.tcc.api.entity.CommodityDetail;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Program Name: CommodityMapper
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

@Mapper
public interface CommodityMapper {

    /**
     * 保存商品详情
     *
     * @param commodityDetail
     * @return
     * @throws Exception
     */
//    @Insert("insert into commoditydetail (commodityId,title,subtitle,picture,type,deleted,price) VALUES (#{commodityId},#{title},#{subtitle},#{picture},#{type},#{deleted},#{price})")
    @InsertProvider(type = CommodityProvider.class, method = "insert")
    int insert(CommodityDetail commodityDetail) throws Exception;


    /**
     * 更新商品详情（静态sql不适用）
     *
     * @param commodityDetail
     * @return
     * @throws Exception
     */
//    @Update("update commoditydetail set title=#{title},subtitle=#{subtitle},picture=#{picture},deleted=#{deleted},price=#{price} where commodityId = #{commodityId}")
    @UpdateProvider(type = CommodityProvider.class, method = "update")
    int update(CommodityDetail commodityDetail) throws Exception;


    /**
     * 删除商品详情
     *
     * @param commodityId
     * @return
     * @throws Exception
     */
//    @Delete("update commoditydetail set deleted=#{deleted} where commodityId = #{commodityId}")
    @DeleteProvider(type = CommodityProvider.class, method = "delete")
    int delete(String commodityId) throws Exception;

    /**
     * 查找商品详情
     *
     * @param commodityId
     * @return
     * @throws Exception
     */
//    @Select("select * from commoditydetail where commodityId = #{commodityId}")
    @SelectProvider(type = CommodityProvider.class, method = "findById")
    CommodityDetail findById(String commodityId) throws Exception;

    /**
     * 按类型查找所有商品（未删除）
     *
     * @param type
     * @return
     * @throws Exception
     */
//    @Select("select * from commoditydetail where type = #{type} and deleted = 0")
    @SelectProvider(type = CommodityProvider.class, method = "findList")
    List<CommodityDetail> findList(Integer type) throws Exception;

}
