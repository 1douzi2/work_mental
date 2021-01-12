package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 阳关热线-坐席管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpLineseatExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "姓名", index = 1)
    private String name;
    @ExcelProperty(value = "工号", index = 2)
    private String worknum;
    @ExcelProperty(value = "状态 ", index = 3)
    private Integer status;
    @ExcelProperty(value = "员工头像", index = 4)
    private String headimg;
    @ExcelProperty(value = "创建人", index = 5)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 6)
    private Date createDate;
    @ExcelProperty(value = "更新人", index = 7)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 8)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 9)
    private Long tenantCode;
}
