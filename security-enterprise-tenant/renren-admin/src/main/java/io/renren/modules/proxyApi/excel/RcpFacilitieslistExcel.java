package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 设备列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpFacilitieslistExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "设备名称", index = 1)
    private String name;
    @ExcelProperty(value = "设备类型", index = 2)
    private Integer type;
    @ExcelProperty(value = "联接租户", index = 3)
    private Integer connectuser;
    @ExcelProperty(value = "在线设备", index = 4)
    private Integer online;
    @ExcelProperty(value = "状态", index = 5)
    private Integer status;
    @ExcelProperty(value = "创建者", index = 6)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 7)
    private Date createDate;
    @ExcelProperty(value = "更新者", index = 8)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 9)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 10)
    private Long tenantCode;
}