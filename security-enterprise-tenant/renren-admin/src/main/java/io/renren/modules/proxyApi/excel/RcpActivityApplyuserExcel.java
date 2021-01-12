package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 报名用户
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-24
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpActivityApplyuserExcel {
    @ExcelProperty(value = "编号", index = 0)
    private Long id;
    @ExcelProperty(value = "用户名称", index = 1)
    private String username;
    @ExcelProperty(value = "手机号", index = 2)
    private String phone;
    @ExcelProperty(value = "签到状态", index = 3)
    private String status;
    @ExcelProperty(value = "报名时间", index = 4)
    private Date applyTime;
    @ExcelProperty(value = "Long", index = 5)
    private Long tenantCode;
    @ExcelProperty(value = "创建者", index = 6)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 7)
    private Date createDate;
    @ExcelProperty(value = "更新者", index = 8)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 9)
    private Date updateDate;
}