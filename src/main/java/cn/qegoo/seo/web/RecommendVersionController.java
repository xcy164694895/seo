package cn.qegoo.seo.web;

import cn.qegoo.model.flagship.RecommendPosition;
import cn.qegoo.seo.service.IRecommendVersionService;
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
public class RecommendVersionController {
    @Resource
    private IRecommendVersionService recommendVersionService;

    @RequestMapping("findVersionById")
    @ResponseBody
    public RecommendPosition findVersionById(int id) {
        RecommendPosition recommendPosition = recommendVersionService.findVersionById(id);
        return recommendPosition;
    }

    @RequestMapping("getRecommendPositionListBySupplier")
    @ResponseBody
    public List<RecommendPosition> getRecommendPositionListBySupplier(int supplierId, Integer limit) {
        List<RecommendPosition> list = recommendVersionService.getRecommendPositionListBySupplier(supplierId, limit);
        return list;
    }

    @RequestMapping("updateRecommendPosition")
    @ResponseBody
    public void updateRecommendPosition(String recommendPosition) {
        RecommendPosition recommendPosition1 = JSONUtils.formJSONStr(recommendPosition, RecommendPosition.class);
        recommendVersionService.updateRecommendPosition(recommendPosition1);
    }

    @RequestMapping("insertRecommendVersion")
    @ResponseBody
    public void insertRecommendVersion(String recommendPosition) {
        RecommendPosition recommendPosition1 = JSONUtils.formJSONStr(recommendPosition, RecommendPosition.class);
        recommendVersionService.insertRecommendVersion(recommendPosition1);
    }

    @RequestMapping("findRecommendPositionByCondition")
    @ResponseBody
    public List<RecommendPosition> findByCondition(String recommendPosition) {
        RecommendPosition recommendPosition1 = JSONUtils.formJSONStr(recommendPosition, RecommendPosition.class);
        List<RecommendPosition> list = recommendVersionService.findByCondition(recommendPosition1);
        return list;
    }

    @RequestMapping("pageRecommendPosition")
    @ResponseBody
    public PageInfo<RecommendPosition> page(int supplierId, int currentPage) {
        PageInfo<RecommendPosition> pageInfo = recommendVersionService.page(supplierId, currentPage);
        return pageInfo;
    }

    @RequestMapping("findSelectTitle")
    @ResponseBody
    public List<RecommendPosition> findSelectTitle(String page) {
        List<RecommendPosition> list = recommendVersionService.findSelectTitle(page);
        return list;
    }
}
