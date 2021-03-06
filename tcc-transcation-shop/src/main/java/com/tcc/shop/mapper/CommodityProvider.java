package com.tcc.shop.mapper;

import com.tcc.api.entity.CommodityDetail;
import com.tcc.api.exception.ServiceException;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

/**
 * Program Name: CommdityProvider
 * Description:
 * Created by xuetao on 2020/3/22
 *
 * @author xuetao
 * @version 1.0
 */

public class CommodityProvider {
    private static final String COMMODITYSQL = "commodityId,title,subtitle,picture,type,deleted,price,created,modified";

    /**
     * 保存商品详情
     *
     * @param commodityDetail
     * @return
     * @throws ServiceException
     */

    public String insert(CommodityDetail commodityDetail) throws ServiceException {
        return new SQL() {{
            INSERT_INTO("commoditydetail");
            VALUES("commodityId,title,subtitle,picture,type,deleted,price", "#{commodityId},#{title},#{subtitle},#{picture},#{type},#{deleted},#{price}");
        }}.toString();
    }


    /**
     * 更新商品详情
     *
     * @param commodityDetail
     * @return
     * @throws ServiceException
     */
    public String update(CommodityDetail commodityDetail) throws ServiceException {
        return new SQL() {{
            UPDATE("commoditydetail");
            if (!StringUtils.isEmpty(commodityDetail.getPicture())) {
                SET("picture = #{picture}");
            }
            if (!StringUtils.isEmpty(commodityDetail.getTitle())) {
                SET("title = #{title}");
            }
            if (!StringUtils.isEmpty(commodityDetail.getSubtitle())) {
                SET("subtitle = #{subtitle}");
            }
            if (!StringUtils.isEmpty(commodityDetail.getType())) {
                SET("type = #{type}");
            }
            if (!StringUtils.isEmpty(commodityDetail.getDeleted())) {
                SET("deleted = #{deleted}");
            }
            if (!StringUtils.isEmpty(commodityDetail.getPrice())) {
                SET("price = #{price}");
            }
            WHERE("commodityid = #{commodityId}");
        }}.toString();
    }


    /**
     * 删除商品详情
     *
     * @param commodityId
     * @return
     * @throws ServiceException
     */
    public String delete(String commodityId) throws ServiceException {
        return new SQL() {{
            UPDATE("commoditydetail");
            SET("deleted = 1");
            WHERE("commodityid = #{commodityId}");
        }}.toString();
    }

    /**
     * 查找商品详情
     *
     * @param commodityId
     * @return
     * @throws ServiceException
     */
    public String findById(String commodityId) throws ServiceException {
        return new SQL() {{
            SELECT(COMMODITYSQL);
            FROM("commoditydetail");
            WHERE("commodityid = #{commodityId}");
        }}.toString();
    }

    /**
     * 按类型查找所有商品（未删除）
     *
     * @param type
     * @return
     * @throws ServiceException
     */

    public String findList(Integer type) throws ServiceException {
        return new SQL() {{
            SELECT(COMMODITYSQL);
            FROM("commoditydetail");
            WHERE("type = #{type}");
        }}.toString();
    }
}
