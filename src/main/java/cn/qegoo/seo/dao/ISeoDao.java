package cn.qegoo.seo.dao;

import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISeoDao {
    /**
     * 获取所有Seo管理信息.
     *
     * @return
     */
    List<SeoManage> findSeoManageAll();

    /**
     * 根据urlName获取Seo管理信息.
     *
     * @param urlName
     * @return
     */
    List<SeoManage> findSeoManageByUrlName(@Param("urlName") String urlName);

    /**
     * 根据id获取一条Seo管理信息.
     *
     * @param id
     * @return
     */
    SeoManage findSeoManageById(@Param("id") int id);

    /**
     * 筛选Seo管理信息(urlName, url, status).
     *
     * @param seoManage
     * @return
     */
    List<SeoManage> filterSeoMagage(@Param("seoManage") SeoManage seoManage);

    /**
     * 获取所有Seo关键字信息.
     *
     * @return
     */
    List<SeoKeyword> findSeoKeywordAll();

    /**
     * 根据keywordName获取Seo关键字信息.
     *
     * @param keywordName
     * @return
     */
    List<SeoKeyword> findSeoKeywordByName(@Param("keywordName") String keywordName);

    /**
     * 根据id获取Seo关键字信息.
     *
     * @param urlId
     * @return
     */
    List<SeoKeyword> findSeoKeywordByUrlId(@Param("urlId") int urlId);

    /**
     * 筛选Seo关键字信息(keywordName， urlId, status).
     *
     * @param seoKeyword
     * @return
     */
    List<SeoKeyword> filterSeoKeyword(@Param("seoKeyword") SeoKeyword seoKeyword);

    /**
     * 获取所有Seo资源信息.
     *
     * @return
     */
    List<SeoResources> findSeoResourcesAll();

    /**
     * 根据searchResources获取Seo资源信息.
     *
     * @param searchResources
     * @return
     */
    List<SeoResources> findSeoResourcesByName(@Param("searchResources") String searchResources);

    /**
     * 根据id获取Seo资源信息.
     *
     * @param urlId
     * @return
     */
    SeoResources findSeoResourcesByUrlId(@Param("urlId") int urlId);

    /**
     * 筛选Seo资源信息(resourcesName, urlId, status).
     *
     * @param seoResources
     * @return
     */
    List<SeoResources> filterSeoResources(@Param("seoResources") SeoResources seoResources);

}
