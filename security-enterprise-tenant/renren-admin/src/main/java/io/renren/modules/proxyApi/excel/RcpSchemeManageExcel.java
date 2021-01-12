package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 方案管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSchemeManageExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "方案名称", index = 1)
    private String name;
    @ExcelProperty(value = "用户id", index = 2)
    private Long userid;
    @ExcelProperty(value = "用户名称", index = 3)
    private String username;
    @ExcelProperty(value = "训练次数", index = 4)
    private Integer traintimes;
    @ExcelProperty(value = "创建者", index = 5)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 6)
    private Date createDate;
    @ExcelProperty(value = "更新者", index = 7)
    private String updater;
    @ExcelProperty(value = "更新日期", index = 8)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 9)
    private Long tenantCode;
}