package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 视频课程分类
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpCourseClassifyExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "分类图标", index = 1)
    private String img;
    @ExcelProperty(value = "分类名称", index = 2)
    private String categoryName;
    @ExcelProperty(value = "Date", index = 3)
    private Date createDate;
    @ExcelProperty(value = "是否显示", index = 4)
    private Integer isShow;
    @ExcelProperty(value = "分类排序", index = 5)
    private Integer sortNum;
    @ExcelProperty(value = "String", index = 6)
    private String creator;
    @ExcelProperty(value = "String", index = 7)
    private String updater;
    @ExcelProperty(value = "Date", index = 8)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 9)
    private Long tenantCode;
}