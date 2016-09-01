package cn.qegoo.security.dao;


import cn.qegoo.main.Main;
import cn.qegoo.model.flagship.RecommendPosition;
import cn.qegoo.seo.dao.IRecommendVersionDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 陈猛 on 2016/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Main.class})
public class IRecommendVersionDaoTest {
    @Resource
    private IRecommendVersionDao recommendVersionDao;

    @Test
    public void insertRecommendVersion() {
        RecommendPosition recommendPosition = new RecommendPosition();
        recommendPosition.setStatus("1");
        recommendPosition.setPage("mouser特约店关于mouser");
        recommendPosition.setTitle("Customer Focused Distribution");
        recommendPosition.setContent("Mouser Electronics is a worldwide leading authorized distributor of semiconductors and electronic components for over 500 industry leading suppliers. We specialize in the rapid introduction of new products and technologies for design engineers and buyers. Our extensive product offering includes semiconductors, interconnects, passives, and electromechanical components.");
        recommendPosition.setPosition(1);
        recommendPosition.setSupplierId(94);
        recommendVersionDao.insertRecommendVersion(recommendPosition);
    }

    @Test
    public void findAll() {
        List<RecommendPosition> mouserInfos = recommendVersionDao.findAllVersion(94, null);
        for (RecommendPosition rm : mouserInfos) {
            System.out.println(rm);
        }
    }

    @Test
    public void selectRecommendBrand() {
        RecommendPosition recommendPosition = new RecommendPosition();
      /*  mouserInfo.setClient("推荐品牌");
        mouserInfo.setContent("推荐产品");
        mouserInfo.setPage("mouser特约店首页");*/
//        mouserInfo.setPicture("ssdadd");
        recommendPosition.setStatus("1");
        List<RecommendPosition> mouserInfos = recommendVersionDao.selectRecommendVersion(recommendPosition);
        for (RecommendPosition rm : mouserInfos) {
            System.out.println(rm);
        }
    }

    @Test
    public void updateRecommendBrandById() {
        RecommendPosition mouserInfo = recommendVersionDao.findVersionById(1);
        mouserInfo.setStatus("2");
        recommendVersionDao.updateRecommendVersionById(mouserInfo);
    }

    @Test
    public void findSelectTitle() {
        List<RecommendPosition> list = recommendVersionDao.findSelectTitle("关于贸泽页面");
        System.out.println(list.size());
    }

}
