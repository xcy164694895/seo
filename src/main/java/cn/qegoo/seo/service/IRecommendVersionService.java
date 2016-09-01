package cn.qegoo.seo.service;

import cn.qegoo.model.flagship.RecommendPosition;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by 陈猛 on 2016/3/4.
 */
public interface IRecommendVersionService {
    /**
     * 根据id查询推荐品牌.
     *
     * @param id 推荐品牌id
     * @return
     */
    RecommendPosition findVersionById(int id);

    /**
     * 获取供应商要展示的推荐品牌.
     *
     * @param supplierId 供应商id
     * @param limit      推荐品牌的个数，当传递null时查询全部
     * @return
     */
    List<RecommendPosition> getRecommendPositionListBySupplier(int supplierId, Integer limit);

    /**
     * 修改该推荐品牌的信息
     *
     * @param recommendPosition
     */
    void updateRecommendPosition(RecommendPosition recommendPosition);

    /**
     * 插入信息
     *
     * @param recommendPosition
     */
    void insertRecommendVersion(RecommendPosition recommendPosition);

    /**
     * 根据推荐品牌id上传品牌的图片
     * @param positionId
     *//*
    void uploadPositionImg(int positionId, String contextAddress);*/

    /**
     * 根据相关的属性筛选符合
     *
     * @param recommendPosition
     * @return
     */
    List<RecommendPosition> findByCondition(RecommendPosition recommendPosition);

    /**
     * 分页获取供应商要展示，默认每页10个
     *
     * @param supplierId  供应商id
     * @param currentPage 当前页
     * @return
     */
    PageInfo<RecommendPosition> page(int supplierId, int currentPage);

    /**
     * 查某页面的具体标题.
     */
    List<RecommendPosition> findSelectTitle(String page);

}
