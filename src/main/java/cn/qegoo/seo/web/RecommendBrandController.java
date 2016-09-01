package cn.qegoo.seo.web;

import cn.qegoo.model.flagship.RecommendBrand;
import cn.qegoo.model.oms.UserFlag;
import cn.qegoo.seo.service.IRecommendBrandService;
import com.github.pagehelper.PageInfo;
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
public class RecommendBrandController {
    @Resource
    private IRecommendBrandService recommendBrandService;


    @RequestMapping("findByRecommendBrandId")
    @ResponseBody
    public RecommendBrand findByRecommendBrandId(int id) {
        RecommendBrand recommendBrand = recommendBrandService.findByRecommendBrandId(id);
        return recommendBrand;
    }

    @RequestMapping("getRecommendBrandListBySupplier")
    @ResponseBody
    public List<RecommendBrand> getRecommendBrandListBySupplier(int supplierId, Integer limit) {
        List<RecommendBrand> list = recommendBrandService.getRecommendBrandListBySupplier(supplierId, limit);
        return list;
    }

    @RequestMapping("updateRecommendBrand")
    @ResponseBody
    public void updateRecommendBrand(String recommendBrand) {
        RecommendBrand recommendBrand1 = JSONUtils.formJSONStr(recommendBrand, RecommendBrand.class);
        recommendBrandService.updateRecommendBrand(recommendBrand1);
    }

    @RequestMapping("insertRecommendBrand")
    @ResponseBody
    public void insertRecommendBrand(String recommendBrand) {
        RecommendBrand recommendBrand1 = JSONUtils.formJSONStr(recommendBrand, RecommendBrand.class);
        recommendBrandService.insertRecommendBrand(recommendBrand1);
    }

    @RequestMapping("uploadBrandImg")
    @ResponseBody
    public void uploadBrandImg(int brandId, String picAddress) {
        recommendBrandService.uploadBrandImg(brandId, picAddress);
    }

    @RequestMapping("findRecommendBrandByCondition")
    @ResponseBody
    public List<RecommendBrand> findByCondition(String recommendBrand) {
        RecommendBrand recommendBrand1 = JSONUtils.formJSONStr(recommendBrand, RecommendBrand.class);
        List<RecommendBrand> list = recommendBrandService.findByCondition(recommendBrand1);
        return list;
    }

    @RequestMapping("pageRecommendBrand")
    @ResponseBody
    public PageInfo<RecommendBrand> page(int supplierId, int currentPage) {
        PageInfo<RecommendBrand> pageInfo = recommendBrandService.page(supplierId, currentPage);
        return pageInfo;
    }

    @RequestMapping("findByUuid")
    @ResponseBody
    public List<UserFlag> findByUuid(String userUuid) {
        List<UserFlag> list = recommendBrandService.findByUuid(userUuid);
        return list;
    }

    @RequestMapping("insertUserFlag")
    @ResponseBody
    public void insertUserFlag(int supplierId, String userUuid) {
        recommendBrandService.insertUserFlag(supplierId, userUuid);
    }
}
