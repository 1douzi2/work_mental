package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 课程举报
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpCourseReportExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "举报人", index = 1)
    private String reporter;
    @ExcelProperty(value = "Date", index = 2)
    private Date createDate;
    @ExcelProperty(value = "举报对象", index = 3)
    private String reportTarget;
    @ExcelProperty(value = "状态", index = 4)
    private Integer status;
    @ExcelProperty(value = "处理结果", index = 5)
    private String result;
    @ExcelProperty(value = "举报内容", index = 6)
    private String content;
    @ExcelProperty(value = "联系电话", index = 7)
    private String phone;
    @ExcelProperty(value = "处理人", index = 8)
    private String dealer;
    @ExcelProperty(value = "处理时间", index = 9)
    private Date dealTime;
    @ExcelProperty(value = "处理备注", index = 10)
    private String remark;
    @ExcelProperty(value = "String", index = 11)
    private String creator;
    @ExcelProperty(value = "String", index = 12)
    private String updater;
    @ExcelProperty(value = "Date", index = 13)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 14)
    private Long tenantCode;
}