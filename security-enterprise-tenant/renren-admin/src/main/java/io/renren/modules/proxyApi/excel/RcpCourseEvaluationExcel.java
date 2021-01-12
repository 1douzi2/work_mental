package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 课程评论
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpCourseEvaluationExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "昵称", index = 1)
    private String userNickname;
    @ExcelProperty(value = "用户名", index = 2)
    private String userName;
    @ExcelProperty(value = "订单编号", index = 3)
    private Integer orderNum;
    @ExcelProperty(value = "课程名称", index = 4)
    private String courseName;
    @ExcelProperty(value = "课程分类", index = 5)
    private String courseCategory;
    @ExcelProperty(value = "评价", index = 6)
    private Double evaluation;
    @ExcelProperty(value = "ip地址", index = 7)
    private String ipAddress;
    @ExcelProperty(value = "评论时间", index = 8)
    private Date createDate;
    @ExcelProperty(value = "是否显示", index = 9)
    private Integer isShow;
    @ExcelProperty(value = "String", index = 10)
    private String creator;
    @ExcelProperty(value = "String", index = 11)
    private String updater;
    @ExcelProperty(value = "Date", index = 12)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 13)
    private Long tenantCode;
}