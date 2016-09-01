package cn.qegoo.seo.service.impl;

import cn.qegoo.model.flagship.RecommendPosition;
import cn.qegoo.seo.dao.IRecommendVersionDao;
import cn.qegoo.seo.service.IRecommendVersionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈猛 on 2016/3/4.
 */
@Service("recommendVersionService")
public class RecommendVersionServiceImpl implements IRecommendVersionService {
    @Resource
    private IRecommendVersionDao recommendVersionDao;

    @Override
    public RecommendPosition findVersionById(int id) {
        return recommendVersionDao.findVersionById(id);
    }

    @Override
    public List<RecommendPosition> getRecommendPositionListBySupplier(int supplierId, Integer limit) {
        return recommendVersionDao.findAllVersion(supplierId, limit);
    }

    @Override
    public void updateRecommendPosition(RecommendPosition recommendPosition) {
        recommendVersionDao.updateRecommendVersionById(recommendPosition);
    }

    @Override
    public void insertRecommendVersion(RecommendPosition recommendPosition) {
        recommendVersionDao.insertRecommendVersion(recommendPosition);
    }

    /* @Override
     public void uploadPositionImg(int positionId, String contextAddress) {

     }
 */
    @Override
    public List<RecommendPosition> findByCondition(RecommendPosition recommendPosition) {

        return recommendVersionDao.selectRecommendVersion(recommendPosition);
    }

    @Override
    public PageInfo<RecommendPosition> page(int supplierId, int currentPage) {
        PageHelper.startPage(currentPage, 10);
        List<RecommendPosition> recommendPositionList = this.getRecommendPositionListBySupplier(supplierId, null);
        PageInfo<RecommendPosition> pageInfo = new PageInfo<>(recommendPositionList);
        return pageInfo;
    }

    @Override
    public List<RecommendPosition> findSelectTitle(String page) {
        return recommendVersionDao.findSelectTitle(page);
    }
}
