package cn.qegoo.seo.web;

import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;
import cn.qegoo.seo.service.ISeoService;
import dev.xwolf.framework.common.json.JSONUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by liuf on 2016/8/3.
 */
@Controller
public class SeoController {

    @Resource
    private ISeoService seoService;

    @RequestMapping("filterSeoMagage")
    @ResponseBody
    public List<SeoManage> filterSeoMagage(String seoManage) {
        SeoManage seoManage1 = JSONUtils.formJSONStr(seoManage, SeoManage.class);
        List<SeoManage> list = seoService.filterSeoMagage(seoManage1);
        return list;
    }

    @RequestMapping("findSeoManageAll")
    @ResponseBody
    public List<SeoManage> findSeoManageAll() {
        List<SeoManage> list = seoService.findSeoManageAll();
        return list;
    }

    @RequestMapping("findSeoManageByUrlName")
    @ResponseBody
    public List<SeoManage> findSeoManageByUrlName(String urlName) {
        List<SeoManage> list = seoService.findSeoManageByUrlName(urlName);
        return list;
    }

    @RequestMapping("findSeoManageById")
    @ResponseBody
    public SeoManage findSeoManageById(int id) {
        SeoManage seoManage = seoService.findSeoManageById(id);
        return seoManage;
    }

    @RequestMapping("findSeoKeywordAll")
    @ResponseBody
    public List<SeoKeyword> findSeoKeywordAll() {
        List<SeoKeyword> list = seoService.findSeoKeywordAll();
        return list;
    }


    @RequestMapping("findSeoKeywordByName")
    @ResponseBody
    public List<SeoKeyword> findSeoKeywordByName(String keywordName) {
        List<SeoKeyword> list = seoService.findSeoKeywordByName(keywordName);
        return list;
    }

    @RequestMapping("findSeoKeywordByUrlId")
    @ResponseBody
    public List<SeoKeyword> findSeoKeywordByUrlId(int urlId) {
        List<SeoKeyword> list = seoService.findSeoKeywordByUrlId(urlId);
        return list;
    }


    @RequestMapping("filterSeoKeyword")
    @ResponseBody
    public List<SeoKeyword> filterSeoKeyword(String seoKeyword) {
        SeoKeyword seoKeyword1 = JSONUtils.formJSONStr(seoKeyword, SeoKeyword.class);
        List<SeoKeyword> list = seoService.filterSeoKeyword(seoKeyword1);
        return list;
    }

    @RequestMapping("findSeoResourcesAll")
    @ResponseBody
    public List<SeoResources> findSeoResourcesAll() {
        List<SeoResources> list = seoService.findSeoResourcesAll();
        return list;
    }

    @RequestMapping("findSeoResourcesByName")
    @ResponseBody
    public List<SeoResources> findSeoResourcesByName(String searchResources) {
        List<SeoResources> list = seoService.findSeoResourcesByName(searchResources);
        return list;
    }

    @RequestMapping("findSeoResourcesByUrlId")
    @ResponseBody
    public SeoResources findSeoResourcesByUrlId(int urlId) {
        SeoResources seoResources = seoService.findSeoResourcesByUrlId(urlId);
        return seoResources;
    }


    @RequestMapping("filterSeoResources")
    @ResponseBody
    public List<SeoResources> filterSeoResources(String seoResources) {
        SeoResources seoResources1 = JSONUtils.formJSONStr(seoResources, SeoResources.class);
        List<SeoResources> list = seoService.filterSeoResources(seoResources1);
        return list;
    }
}
