package io.renren.modules.proxyApi.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 视频课程
 *
 * @author Mark sunlightcs@gmail.com
 * @since 3.0 2020-11-25
 */
@Data
@ContentRowHeight(20)
@HeadRowHeight(20)
@ColumnWidth(25)
public class RcpVideoCourseExcel {
    @ExcelProperty(value = "Integer", index = 0)
    private Integer id;
    @ExcelProperty(value = "课程主题", index = 1)
    private String title;
    @ExcelProperty(value = "副标题", index = 2)
    private String secondTitle;
    @ExcelProperty(value = "封面图片", index = 3)
    private String imgUrl;
    @ExcelProperty(value = "分类id", index = 4)
    private Integer categoryId;
    @ExcelProperty(value = "是否推荐", index = 5)
    private Integer isRecommend;
    @ExcelProperty(value = "是否显示", index = 6)
    private Integer isShow;
    @ExcelProperty(value = "视频地址", index = 7)
    private String videoUrl;
    @ExcelProperty(value = "上架状态", index = 8)
    private Integer shelfStatus;
    @ExcelProperty(value = "价格", index = 9)
    private BigDecimal price;
    @ExcelProperty(value = "目录", index = 10)
    private String menu;
    @ExcelProperty(value = "详情", index = 11)
    private String detail;
    @ExcelProperty(value = "分类名称", index = 12)
    private String categoryName;
    @ExcelProperty(value = "Date", index = 13)
    private Date createDate;
    @ExcelProperty(value = "String", index = 14)
    private String creator;
    @ExcelProperty(value = "String", index = 15)
    private String updater;
    @ExcelProperty(value = "Date", index = 16)
    private Date updateDate;
    @ExcelProperty(value = "Long", index = 17)
    private Long tenantCode;
}