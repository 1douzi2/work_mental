package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 阳光热线-档案管理-来访者管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpLinevisitorslistExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "来访者姓名", index = 1)
    private String name;
    @ExcelProperty(value = "开始访问时间", index = 2)
    private Date starttime;
    @ExcelProperty(value = "结束访问时间", index = 3)
    private Date endtime;
    @ExcelProperty(value = "客服工号", index = 4)
    private String servicenum;
    @ExcelProperty(value = "状态0正常 1异常", index = 5)
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