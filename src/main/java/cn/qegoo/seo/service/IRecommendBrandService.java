package cn.qegoo.seo.service;

import cn.qegoo.model.flagship.RecommendBrand;
import cn.qegoo.model.oms.UserFlag;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by lhp on 2016/3/2.
 */
public interface IRecommendBrandService {

    /**
     * 根据id查询数据.
     *
     * @param id 文本id
     * @return
     */
    RecommendBrand findByRecommendBrandId(int id);

    /**
     * 获取供应商要展示的推荐品牌.
     *
     * @param supplierId 供应商id
     * @param limit      推荐品牌的个数，当传递null时查询全部
     * @return
     */
    List<RecommendBrand> getRecommendBrandListBySupplier(int supplierId, Integer limit);

    /**
     * 修改该推荐品牌的信息
     *
     * @param recommendBrand
     */
    void updateRecommendBrand(RecommendBrand recommendBrand);

    /**
     * 插入推荐品牌信息
     *
     * @param recommendBrand
     */
    void insertRecommendBrand(RecommendBrand recommendBrand);

    /**
     * 根据推荐品牌id上传品牌的图片
     *
     * @param brandId
     */
    void uploadBrandImg(int brandId, String picAddress);

    /**
     * 根据推荐品牌相关的属性筛选符合的品牌列表
     *
     * @param recommendBrand
     * @return
     */
    List<RecommendBrand> findByCondition(RecommendBrand recommendBrand);

    /**
     * 分页获取供应商要展示的推荐品牌，默认每页10个
     *
     * @param supplierId  供应商id
     * @param currentPage 当前页
     * @return
     */
    PageInfo<RecommendBrand> page(int supplierId, int currentPage);

    /**
     * 根据用户uuid查找相关数据.
     *
     * @param userUuid
     */
    List<UserFlag> findByUuid(String userUuid);

    /**
     * 插入相应的特约店管理信息.
     *
     * @param supplierId
     * @param userUuid
     */
    void insertUserFlag(int supplierId, String userUuid);

}
