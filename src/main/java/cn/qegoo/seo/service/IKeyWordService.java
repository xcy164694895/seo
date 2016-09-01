package cn.qegoo.seo.service;

import cn.qegoo.model.searchKeyWords.SearchKeyWord;
import com.github.pagehelper.PageInfo;

import java.util.Date;


/**
 * Created by xcy
 * on 2016/9/1.
 * 料号搜索记录管理service
 */
public interface IKeyWordService {
    /**
     * 获取所有的料号搜索记录
     * @param currentPage 页码
     * @return PageInfo<SearchKeyWord>
     */
    PageInfo<SearchKeyWord> getAll(int currentPage);

    /**
     * 根据关键字获取料号搜索记录
     * @param keyWord 关键字
     * @param currentPage 页码
     * @return PageInfo<SearchKeyWord>
     */
    PageInfo<SearchKeyWord> getRecordByKeyWord(String keyWord,int currentPage);

    /**
     * 根据时间获取料号搜索记录
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @return PageInfo<SearchKeyWord>
     */
    PageInfo<SearchKeyWord> getRecordByTime(Date startTime,Date endTime,int currentPage);

    /**
     * 根据关键字是否匹配料号的状态获取记录
     * @param status 是否匹配相关料号的状态码，0表示未匹配，1表示匹配到
     * @param currentPage 页码
     * @return PageInfo<SearchKeyWord>
     */
    PageInfo<SearchKeyWord> getRecordByStatus(String status,int currentPage);

    /**
     * 新增关键字搜索记录
     * @param searchKeyWord 料号搜索记录
     */
    void saveRecord(SearchKeyWord searchKeyWord);

    /**
     * 更新纪录
     * @param searchKeyWord 料号搜索记录
     */
    void updateRecord(SearchKeyWord searchKeyWord);

}
