/**
 *
 */
package cn.hacz.edu.modules.system.vo;

import io.swagger.annotations.ApiModelProperty;

/**
 * project - GitHub整理 Gitee开源系统
 *
 * @author guod
 * @version 3.0
 * @date 日期:2018年4月20日 时间:上午11:02:17
 * @JDK 1.8
 * @Description 功能模块：
 */
public class JsonList extends Json {
    /**
     * 属性描述：多条数据
     */
    @ApiModelProperty(value = "多条数据", name = "dataRows", example = "")
    private Object dataRows;
    /**
     * 属性描述：总条数
     */
    @ApiModelProperty(value = "总条数", name = "total", example = "")
    private Long total;

    public Object getDataRows() {
        return dataRows;
    }

    public void setDataRows(Object dataRows) {
        this.dataRows = dataRows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
