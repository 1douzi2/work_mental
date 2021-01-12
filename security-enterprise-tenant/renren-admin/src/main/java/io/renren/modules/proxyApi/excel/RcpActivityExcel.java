package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.util.Date;

/**
 * 活动列表
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpActivityExcel {
    @ExcelProperty(value = "id", index = 0)
    private Long id;
    @ExcelProperty(value = "活动名称", index = 1)
    private String name;
    @ExcelProperty(value = "分类id", index = 2)
    private String classifyId;
    @ExcelProperty(value = "活动状态", index = 3)
    private String actStatus;
    @ExcelProperty(value = "报名状态", index = 4)
    private String applyStatus;
    @ExcelProperty(value = "创建者", index = 5)
    private String creator;
    @ExcelProperty(value = "创建时间", index = 6)
    private Date createDate;
    @ExcelProperty(value = "更新者", index = 7)
    private String updater;
    @ExcelProperty(value = "更新时间", index = 8)
    private Date updateDate;
    @ExcelProperty(value = "报名人数", index = 9)
    private Integer applyNum;
    @ExcelProperty(value = "浏览人数", index = 10)
    private Integer visitorNum;
    @ExcelProperty(value = "活动开始时间", index = 11)
    private Date actStartTime;
    @ExcelProperty(value = "活动结束时间", index = 12)
    private Date actEndTime;
    @ExcelProperty(value = "报名开始时间", index = 13)
    private Date applyStartTime;
    @ExcelProperty(value = "报名结束时间", index = 14)
    private Date applyEndTime;
    @ExcelProperty(value = "详细描述", index = 15)
    private String description;
    @ExcelProperty(value = "Long", index = 16)
    private Long tenantCode;
    @ExcelProperty(value = "活动海报", index = 17)
    private String image;
    @ExcelProperty(value = "参与专家团队", index = 18)
    private String expertTeam;
    @ExcelProperty(value = "省", index = 19)
    private String province;
    @ExcelProperty(value = "市", index = 20)
    private String city;
    @ExcelProperty(value = "区", index = 21)
    private String area;
    @ExcelProperty(value = "详细地址", index = 22)
    private String detailedLocation;
}