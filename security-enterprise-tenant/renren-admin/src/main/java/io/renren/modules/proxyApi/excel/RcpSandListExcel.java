package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 沙盘列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-09
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSandListExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "添加人", index = 1)
    private String person;
    @ExcelProperty(value = "预警图标", index = 2)
    private String warningIcon;
    @ExcelProperty(value = "预警等级", index = 3)
    private String warningLevel;
    @ExcelProperty(value = "状态", index = 4)
    private String state;
    @ExcelProperty(value = "创建时间", index = 5)
    private Date time;
    @ExcelProperty(value = "排序", index = 6)
    private Integer sort;
    @ExcelProperty(value = "Long", index = 7)
    private Long tenantCode;
}