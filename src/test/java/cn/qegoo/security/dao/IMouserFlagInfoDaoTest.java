package cn.qegoo.security.dao;

import cn.qegoo.main.Main;
import cn.qegoo.model.flagship.RecommendBrand;
import cn.qegoo.model.oms.UserFlag;
import cn.qegoo.seo.dao.IMouserFlagInfoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈猛 on 2016/3/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Main.class})
public class IMouserFlagInfoDaoTest {
    @Resource
    private IMouserFlagInfoDao mouserFlagInfoDao;

    @Test
    public void insertRecommendBrand() {
        RecommendBrand mouserInfo = new RecommendBrand();
        mouserInfo.setSupplierId(94);
        mouserInfo.setContent("推荐产品");
        mouserInfo.setPage("mouser特约店首页");
        mouserInfo.setPicture("ssdadd");
        mouserFlagInfoDao.insertRecommendBrand(mouserInfo);
    }

    @Test
    public void findAll() {
        List<RecommendBrand> mouserInfos = mouserFlagInfoDao.findAll(94, null);
        for (RecommendBrand m : mouserInfos) {
            System.out.println(m);
        }
    }

    @Test
    public void selectRecommendBrand() {
        RecommendBrand mouserInfo = new RecommendBrand();
      /*  mouserInfo.setClient("推荐品牌");
        mouserInfo.setContent("推荐产品");
        mouserInfo.setPage("mouser特约店首页");*/
//        mouserInfo.setPicture("ssdadd");
        mouserInfo.setStatus("1");
        List<RecommendBrand> mouserInfos = mouserFlagInfoDao.selectRecommendBrand(mouserInfo);
        for (RecommendBrand m : mouserInfos) {
            System.out.println(m);
        }
    }

    @Test
    public void updateRecommendBrandById() {
        RecommendBrand mouserInfo = mouserFlagInfoDao.findById(1);
        mouserInfo.setStatus("2");
        mouserInfo.setMfsName("ddddddd");
        mouserFlagInfoDao.updateRecommendBrandById(mouserInfo);
    }

    @Test
    public void findByUuid() {
        List<UserFlag> uf = mouserFlagInfoDao.findByUuid("c6e25c027b6941cea38bac231d2a335e");
        for (UserFlag userFlag : uf) {
            System.out.println(userFlag);
        }
    }

    @Test
    public void insertUserFlag() {
        mouserFlagInfoDao.insertUserFlag(93, "c6e25c027b6941cea38bac231d2a335e");
    }
}
