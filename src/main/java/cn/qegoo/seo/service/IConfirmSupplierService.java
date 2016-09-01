package cn.qegoo.seo.service;

import cn.qegoo.model.searchKeyWords.ConfirmSupplier;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.Date;

/**
 * Created by xcy
 * on 2016/9/1.
 * 待确认供应商service
 */
public interface IConfirmSupplierService {
    /**
     * 获取所有的待确认供应商记录
     * @param currentPage 页码
     * @return PageInfo<ConfirmSupplier>
     */
    PageInfo<ConfirmSupplier> getAll(int currentPage);

    /**
     * 根据待确认供应商名称获取记录
     * @param cSupplierName 供应商名称
     * @param currentPage 页码
     * @return
     */
    PageInfo<ConfirmSupplier> getRecordByCSupplierName(String cSupplierName,int currentPage);

    /**
     * 根据时间获取记录
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @param currentPage 页码
     * @return  PageInfo<ConfirmSupplier>
     */
    PageInfo<ConfirmSupplier> getRecordByDate(Date startTime,Date endTime,int currentPage);

    /**
     * 根据供应商类型获取记录
     * @param type 供应商类型（0:供应商；1：制造商）
     * @param currentPage 页码
     * @return PageInfo<ConfirmSupplier>
     */
    PageInfo<ConfirmSupplier> getRecordByType(Integer type,int currentPage);

    /**
     * 根据处理状态获取记录
     * @param status 处理状态（0：未处理；1：处理中；2：可抓取；3：不能抓取）
     * @param currentPage 页码
     * @return PageInfo<ConfirmSupplier>
     */
    PageInfo<ConfirmSupplier> getRecordByStatus(Integer status,int currentPage);

    /**
     * 新增记录
     * @param confirmSupplier 待确认供应商记录
     */
    void saveRecord(ConfirmSupplier confirmSupplier);

    /**
     * 更新记录
     * @param confirmSupplier 待确认供应商记录
     */
    void update(ConfirmSupplier confirmSupplier);
}
