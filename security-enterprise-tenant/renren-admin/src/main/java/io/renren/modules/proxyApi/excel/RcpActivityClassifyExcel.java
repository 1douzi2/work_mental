package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 活动分类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpActivityClassifyExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "分类名称", index = 1)
    private String name;
    @ExcelProperty(value = "分类描述", index = 2)
    private String description;
    @ExcelProperty(value = "是否显示", index = 3)
    private String display;
    @ExcelProperty(value = "创建者", index = 4)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 5)
    private Date createDate;
    @ExcelProperty(value = "更新者", index = 6)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 7)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 8)
    private Long tenantCode;
}