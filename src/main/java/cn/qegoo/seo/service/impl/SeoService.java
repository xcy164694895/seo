package cn.qegoo.seo.service.impl;

import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;
import cn.qegoo.seo.dao.ISeoDao;
import cn.qegoo.seo.service.ISeoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SeoService implements ISeoService {

    @Resource
    ISeoDao seoDao;

    @Override
    public List<SeoManage> findSeoManageAll() {
        return seoDao.findSeoManageAll();
    }

    @Override
    public List<SeoManage> findSeoManageByUrlName(String urlName) {
        return seoDao.findSeoManageByUrlName(urlName);
    }

    @Override
    public SeoManage findSeoManageById(int id) {
        return seoDao.findSeoManageById(id);
    }

    @Override
    public List<SeoManage> filterSeoMagage(SeoManage seoManage) {
        return seoDao.filterSeoMagage(seoManage);
    }

    @Override
    public List<SeoKeyword> findSeoKeywordAll() {
        return seoDao.findSeoKeywordAll();
    }

    @Override
    public List<SeoKeyword> findSeoKeywordByName(String keywordName) {
        return seoDao.findSeoKeywordByName(keywordName);
    }

    @Override
    public List<SeoKeyword> findSeoKeywordByUrlId(int urlId) {
        return seoDao.findSeoKeywordByUrlId(urlId);
    }

    @Override
    public List<SeoKeyword> filterSeoKeyword(SeoKeyword seoKeyword) {
        return seoDao.filterSeoKeyword(seoKeyword);
    }

    @Override
    public List<SeoResources> findSeoResourcesAll() {
        return seoDao.findSeoResourcesAll();
    }

    @Override
    public List<SeoResources> findSeoResourcesByName(String searchResources) {
        return seoDao.findSeoResourcesByName(searchResources);
    }

    @Override
    public SeoResources findSeoResourcesByUrlId(int urlId) {
        return seoDao.findSeoResourcesByUrlId(urlId);
    }

    @Override
    public List<SeoResources> filterSeoResources(SeoResources seoResources) {
        return seoDao.filterSeoResources(seoResources);
    }


}
