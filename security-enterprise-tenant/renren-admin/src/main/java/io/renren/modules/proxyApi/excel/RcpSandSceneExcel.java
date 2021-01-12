package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;

/**
 * 沙盘场景维护
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-12-28
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSandSceneExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "场景名称", index = 1)
    private String sceneName;
    @ExcelProperty(value = "场景图片", index = 2)
    private String scenePic;
    @ExcelProperty(value = "状态", index = 3)
    private String enable;
}