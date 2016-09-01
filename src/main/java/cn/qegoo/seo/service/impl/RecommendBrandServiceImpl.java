package cn.qegoo.seo.service.impl;

import cn.qegoo.model.flagship.RecommendBrand;
import cn.qegoo.model.oms.UserFlag;
import cn.qegoo.seo.dao.IMouserFlagInfoDao;
import cn.qegoo.seo.service.IRecommendBrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lhp on 2016/3/2.
 */
@Service("recommendBrandService")
public class RecommendBrandServiceImpl implements IRecommendBrandService {

    @Resource
    private IMouserFlagInfoDao mouserFlagInfoDao;

    @Override
    public RecommendBrand findByRecommendBrandId(int id) {
        return mouserFlagInfoDao.findById(id);
    }

    @Override
    public List<RecommendBrand> getRecommendBrandListBySupplier(int supplierId, Integer limit) {
        return mouserFlagInfoDao.findAll(supplierId, limit);
    }

    @Override
    public void updateRecommendBrand(RecommendBrand recommendBrand) {
        mouserFlagInfoDao.updateRecommendBrandById(recommendBrand);
    }

    @Override
    public void insertRecommendBrand(RecommendBrand recommendBrand) {
        mouserFlagInfoDao.insertRecommendBrand(recommendBrand);
    }

    @Override
    public void uploadBrandImg(int brandId, String newPicAddress) {
        //TODO 上传图片，调用上传接口，将图片上传到指定的服务器，并返回新的地址


        //修改db相关的路径
        RecommendBrand recommendBrand = this.findByRecommendBrandId(brandId);
        recommendBrand.setPicture(newPicAddress);
        updateRecommendBrand(recommendBrand);
    }

    @Override
    public List<RecommendBrand> findByCondition(RecommendBrand recommendBrand) {
        return mouserFlagInfoDao.selectRecommendBrand(recommendBrand);
    }

    @Override
    public PageInfo<RecommendBrand> page(int supplierId, int currentPage) {
        PageHelper.startPage(currentPage, 10);
        List<RecommendBrand> recommendBrandList = this.getRecommendBrandListBySupplier(supplierId, null);
        PageInfo<RecommendBrand> pageInfo = new PageInfo<>(recommendBrandList);
        return pageInfo;
    }

    @Override
    public List<UserFlag> findByUuid(String userUuid) {
        return mouserFlagInfoDao.findByUuid(userUuid);
    }

    @Override
    public void insertUserFlag(int supplierId, String userUuid) {
        mouserFlagInfoDao.insertUserFlag(supplierId, userUuid);
    }

}
