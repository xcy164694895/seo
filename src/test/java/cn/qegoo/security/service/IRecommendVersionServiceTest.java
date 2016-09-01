package cn.qegoo.security.service;

import cn.qegoo.main.Main;
import cn.qegoo.model.flagship.RecommendPosition;
import cn.qegoo.seo.service.IRecommendVersionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by 陈猛 on 2016/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Main.class})
public class IRecommendVersionServiceTest {
    @Resource
    private IRecommendVersionService recommendVersionService;

    @Test
    public void findVersionById() {
        System.out.println(recommendVersionService.findVersionById(1));
    }

    @Test
    public void getRecommendPositionListBySupplier() {
        System.out.println(recommendVersionService.getRecommendPositionListBySupplier(91, 10));
    }

    @Test
    public void updateRecommendPosition() {
        RecommendPosition recommendPosition = recommendVersionService.findVersionById(1);
        recommendPosition.setStatus("1");
        recommendVersionService.updateRecommendPosition(recommendPosition);
    }

    @Test
    public void insertRecommendVersion() {
        RecommendPosition recommendPosition = new RecommendPosition();
        recommendPosition.setStatus("1");
        recommendPosition.setPage("mouser特约店关于mouser");
        recommendPosition.setTitle("Customer Focused Distribution");
        recommendPosition.setContent("Mouser Electronics is a worldwide leading authorized distributor of semiconductors and electronic components for over 500 industry leading suppliers. We specialize in the rapid introduction of new products and technologies for design engineers and buyers. Our extensive product offering includes semiconductors, interconnects, passives, and electromechanical components.");
        recommendPosition.setPosition(2);
        recommendPosition.setSupplierId(94);
        recommendVersionService.insertRecommendVersion(recommendPosition);
    }
}
