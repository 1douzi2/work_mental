package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 沙盘详情(关联等级、图片、问题)
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSandDetailExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "Integer", index = 1)
    private Integer tenantCode;
    @ExcelProperty(value = "Integer", index = 2)
    private Integer person;
    @ExcelProperty(value = "创作时间", index = 3)
    private Date createTime;
    @ExcelProperty(value = "所用时间", index = 4)
    private String usedTime;
    @ExcelProperty(value = "沙具数量", index = 5)
    private Integer toysNum;
    @ExcelProperty(value = "移动次数", index = 6)
    private Integer moveNum;
    @ExcelProperty(value = "视频地址", index = 7)
    private String mvUrl;
}