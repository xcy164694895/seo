package cn.qegoo.seo.dao;

import cn.qegoo.model.flagship.RecommendBrand;
import cn.qegoo.model.oms.UserFlag;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 陈猛 on 2016/3/1.
 */
public interface IMouserFlagInfoDao {
    /**
     * 插入一条信息.
     *
     * @param mouserInfo
     */
    void insertRecommendBrand(RecommendBrand mouserInfo);

    /**
     * 查找所有数据.
     */
    List<RecommendBrand> findAll(@Param("supplierId") int supplierId, @Param("limit") Integer limit);

    /**
     * 根据推荐品牌Id查询该推荐品牌详细信息。
     */
    RecommendBrand findById(@Param("id") int recommendBrandId);

    /**
     * 根据某些信息查找数据.
     *
     * @param mouserInfo
     */
    List<RecommendBrand> selectRecommendBrand(@Param("mouserInfo") RecommendBrand mouserInfo);

    /**
     * 根据id修改相关数据.
     *
     * @param mouserInfo
     */
    void updateRecommendBrandById(@Param("mouserInfo") RecommendBrand mouserInfo);

    /**
     * 根据用户uuid查找相关数据.
     *
     * @param userUuid
     */
    List<UserFlag> findByUuid(@Param("uuid") String userUuid);

    /**
     * 插入相应的特约店管理信息.
     *
     * @param supplierId
     * @param userUuid
     */
    void insertUserFlag(@Param("supplierId") int supplierId, @Param("userUuid") String userUuid);

}
