package cn.qegoo.seo.service;

import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;

import java.util.List;

public interface ISeoService {
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
    List<SeoManage> findSeoManageByUrlName(String urlName);

    /**
     * 根据id获取一条Seo管理信息.
     *
     * @param id
     * @return
     */
    SeoManage findSeoManageById(int id);

    /**
     * 筛选Seo管理信息(urlName, url, status).
     *
     * @param seoManage
     * @return
     */
    List<SeoManage> filterSeoMagage(SeoManage seoManage);

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
    List<SeoKeyword> findSeoKeywordByName(String keywordName);

    /**
     * 根据id获取Seo关键字信息.
     *
     * @param urlId
     * @return
     */
    List<SeoKeyword> findSeoKeywordByUrlId(int urlId);

    /**
     * 筛选Seo关键字信息(keywordName， urlId, status).
     *
     * @param seoKeyword
     * @return
     */
    List<SeoKeyword> filterSeoKeyword(SeoKeyword seoKeyword);

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
    List<SeoResources> findSeoResourcesByName(String searchResources);

    /**
     * 根据id获取Seo资源信息.
     *
     * @param urlId
     * @return
     */
    SeoResources findSeoResourcesByUrlId(int urlId);

    /**
     * 筛选Seo资源信息(resourcesName, urlId, status).
     *
     * @param seoResources
     * @return
     */
    List<SeoResources> filterSeoResources(SeoResources seoResources);
}
