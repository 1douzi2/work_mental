package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 阳光热线-工单管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-26
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpLineorderExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "姓名", index = 1)
    private String name;
    @ExcelProperty(value = "年龄", index = 2)
    private Integer age;
    @ExcelProperty(value = "性别 0男 1女", index = 3)
    private Integer sex;
    @ExcelProperty(value = "手机号", index = 4)
    private String telephone;
    @ExcelProperty(value = "详情描述", index = 5)
    private String desciption;
    @ExcelProperty(value = "工单类型", index = 6)
    private String type;
    @ExcelProperty(value = "负责人姓名", index = 7)
    private String chargename;
    @ExcelProperty(value = "受理人工号", index = 8)
    private String acceptnum;
    @ExcelProperty(value = "工单状态 0未处理 1已处理", index = 9)
    private Integer status;
    @ExcelProperty(value = "创建人", index = 10)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 11)
    private Date createDate;
    @ExcelProperty(value = "更新人", index = 12)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 13)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 14)
    private Long tenantCode;
}