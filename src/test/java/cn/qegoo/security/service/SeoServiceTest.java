package cn.qegoo.security.service;

import cn.qegoo.main.Main;
import cn.qegoo.model.seo.SeoKeyword;
import cn.qegoo.model.seo.SeoManage;
import cn.qegoo.model.seo.SeoResources;
import cn.qegoo.seo.service.ISeoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Main.class})
public class SeoServiceTest {

    @Resource
    private ISeoService seoService;


    @Test
    public void testSeoManage() {
        List<SeoManage> list = seoService.findSeoManageAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//
//		System.out.println("---------------------");
//		List<SeoManage> list2 = seoService.findSeoManageByUrlName("%页%");
//		for(int i=0;i<list2.size();i++){
//			System.out.println(list2.get(i));
//		}
//
//		System.out.println("---------------------");
//		SeoManage list3 = seoService.findSeoManageById(20);
//		System.out.println(list3);

        System.out.println("---------------------");
//		SeoManage seoManage = new SeoManage();
//		seoManage.setUrlName("登陆页面");
//		seoManage.setUrl("http://192.168.3.211:8081/");
//		seoManage.setStatus("2");
//		List<SeoManage> list4 = seoService.filterSeoMagage(seoManage);
//		for(int i=0;i<list4.size();i++){
//			System.out.println(list4.get(i));
//		}
    }

    @Test
    public void testSeoKeyword() {
        List<SeoKeyword> list = seoService.findSeoKeywordAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");
        List<SeoKeyword> list2 = seoService.findSeoKeywordByName("%dfs%");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("---------------------");
        List<SeoKeyword> list3 = seoService.findSeoKeywordByUrlId(20);
        System.out.println(list3);

        System.out.println("---------------------");
        SeoKeyword seoKeyword = new SeoKeyword();
        seoKeyword.setKeywordName("sdfs");
        seoKeyword.setUrlId(20);
        seoKeyword.setStatus("1");
        List<SeoKeyword> list4 = seoService.filterSeoKeyword(seoKeyword);
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }

    @Test
    public void testSeoResources() {
        List<SeoResources> list = seoService.findSeoResourcesAll();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------");
        List<SeoResources> list2 = seoService.findSeoResourcesByName("dhsajfsdfj");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        System.out.println("---------------------");
        SeoResources list3 = seoService.findSeoResourcesByUrlId(20);
        System.out.println(list3);

        System.out.println("---------------------");
        SeoResources seoResources = new SeoResources();
        seoResources.setResourcesName("dhsajfsdfj");
        ;
        seoResources.setUrlId(20);
        seoResources.setStatus("1");
        List<SeoResources> list4 = seoService.filterSeoResources(seoResources);
        for (int i = 0; i < list4.size(); i++) {
            System.out.println(list4.get(i));
        }
    }


}
