package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 阳光热线-考勤记录
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpLineattendanceExcel {
    @ExcelProperty(value = "异常原因", index = 0)
    private Long id;
    @ExcelProperty(value = "签到时间", index = 1)
    private Date checktime;
    @ExcelProperty(value = "异常日期", index = 2)
    private Date unusualdate;
    @ExcelProperty(value = "异常原因", index = 3)
    private String reason;
    @ExcelProperty(value = "创建人", index = 4)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 5)
    private Date createDate;
    @ExcelProperty(value = "更新人", index = 6)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 7)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 8)
    private Long tenantCode;
}