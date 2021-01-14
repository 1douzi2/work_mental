package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * 沙具模型选择
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-12
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSandModelChooseExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "String", index = 1)
    private String name;
    @ExcelProperty(value = "Integer", index = 2)
    private Integer sort;
    @ExcelProperty(value = "Integer", index = 3)
    private Integer rcpSandTableModelId;
}