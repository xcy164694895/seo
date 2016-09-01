package cn.qegoo.seo.dao;

import cn.qegoo.model.flagship.RecommendPosition;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 陈猛 on 2016/3/4.
 */
public interface IRecommendVersionDao {
    /**
     * 插入一条信息.
     *
     * @param recommendPosition
     */
    void insertRecommendVersion(RecommendPosition recommendPosition);

    /**
     * 查找所有数据.
     */
    List<RecommendPosition> findAllVersion(@Param("supplierId") int supplierId, @Param("limit") Integer limit);

    /**
     * 根据Id查询该推荐品牌详细信息。
     */
    RecommendPosition findVersionById(@Param("id") int recommendVersionId);

    /**
     * 根据某些信息查找数据.
     *
     * @param recommendPosition p
     */
    List<RecommendPosition> selectRecommendVersion(@Param("mouserVersion") RecommendPosition recommendPosition);

    /**
     * 根据id修改相关数据.
     *
     * @param recommendPosition
     */
    void updateRecommendVersionById(@Param("mouserVersion") RecommendPosition recommendPosition);

    /**
     * 查找某个页面上的标题.
     *
     * @param page
     * @return
     */
    List<RecommendPosition> findSelectTitle(@Param("page") String page);
}
