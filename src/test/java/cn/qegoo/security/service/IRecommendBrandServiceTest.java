package cn.qegoo.security.service;

import cn.qegoo.main.Main;
import cn.qegoo.model.oms.UserFlag;
import cn.qegoo.seo.service.IRecommendBrandService;
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
public class IRecommendBrandServiceTest {
    @Resource
    private IRecommendBrandService recommendBrandService;

    @Test
    public void testPage() {
        System.out.println(recommendBrandService.page(94, 1));
    }

    @Test
    public void findByUuid() {
        List<UserFlag> uf = recommendBrandService.findByUuid("c6e25c027b6941cea38bac231d2a335e");
        for (UserFlag userFlag : uf) {
            System.out.println(userFlag);
        }
    }

    @Test
    public void insertUserFlag() {
        recommendBrandService.insertUserFlag(93, "c6e25c027b6941cea38bac231d2a335e");
    }
}
