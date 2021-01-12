package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 问题的回答表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2021-01-11
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpSandQuestionAnswerExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "String", index = 1)
    private String answer;
    @ExcelProperty(value = "Date", index = 2)
    private Date time;
    @ExcelProperty(value = "String", index = 3)
    private String name;
    @ExcelProperty(value = "Integer", index = 4)
    private Integer rcpSandQuestionId;
}