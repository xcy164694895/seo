package cn.qegoo.security.dao;

import cn.qegoo.main.Main;
import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;
import cn.qegoo.seo.dao.ISeoDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Main.class})
public class SeoDaoTest {

    @Resource
    private ISeoDao seoDao;


    @Test
    public void testSeoManage() {
        List<SeoManage> list = seoDao.findSeoManageAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");
        List<SeoManage> list2 = seoDao.findSeoManageByUrlName("%页%");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("---------------------");
        SeoManage list3 = seoDao.findSeoManageById(20);
        System.out.println(list3);

        System.out.println("---------------------");
        SeoManage seoManage = new SeoManage();
        seoManage.setUrlName("登陆页面");
        seoManage.setUrl("/user/go_login");
        seoManage.setStatus("2");
        List<SeoManage> list4 = seoDao.filterSeoMagage(seoManage);
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }

    @Test
    public void testSeoKeyword() {
        List<SeoKeyword> list = seoDao.findSeoKeywordAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");
        List<SeoKeyword> list2 = seoDao.findSeoKeywordByName("%dfs%");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("---------------------");
        List<SeoKeyword> list3 = seoDao.findSeoKeywordByUrlId(20);
        System.out.println(list3);

        System.out.println("---------------------");
        SeoKeyword seoKeyword = new SeoKeyword();
        seoKeyword.setKeywordName("sdfs");
        seoKeyword.setUrlId(20);
        seoKeyword.setStatus("1");
        List<SeoKeyword> list4 = seoDao.filterSeoKeyword(seoKeyword);
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }

    @Test
    public void testSeoResources() {
        List<SeoResources> list = seoDao.findSeoResourcesAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");
        List<SeoResources> list2 = seoDao.findSeoResourcesByName("dhsajfsdfj");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("---------------------");
        SeoResources list3 = seoDao.findSeoResourcesByUrlId(20);
        System.out.println(list3);

        System.out.println("---------------------");
        SeoResources seoResources = new SeoResources();
        seoResources.setResourcesName("dhsajfsdfj");
        ;
        seoResources.setUrlId(20);
        seoResources.setStatus("1");
        List<SeoResources> list4 = seoDao.filterSeoResources(seoResources);
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }

}
