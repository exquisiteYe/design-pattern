package xyDemo.testWeb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GroupEffectAnalSettingPO {
    /**
     * 字段: id
     * 说明: 自增主键
     */
    private Integer id;

    /**
     * 字段: setting_type
     * 说明: 效果分析分类：1-团长效果分析，2-用户商品分析，3-商品效果分析
     */
    private Integer settingType;

    /**
     * 字段: creator
     * 说明: 创建者
     */
    private String creator;

    /**
     * 字段: query_name
     */
    private String queryName;

    /**
     * 字段: poi_ids
     * 说明: 门店ID, 逗号分隔; 不可为空
     */
    private String poiIds;

    /**
     * 字段: date_cate
     * 说明: 日期分类： 1: 自然日，2：售卖周期
     */
    private Integer dateCate;

    /**
     * 字段: date_type
     * 说明: 日期类型. day, week, month...
     */
    private String dateType;

    /**
     * 字段: start_date
     * 说明: 开始日期. yyyyMMdd
     */
    private Integer startDate;

    /**
     * 字段: end_date
     * 说明: 结束日期. yyyyMMdd
     */
    private Integer endDate;

    /**
     * 字段: coupon_use_start_date
     * 说明: 用券开始日期. yyyyMMdd
     */
    private Integer couponUseStartDate;

    /**
     * 字段: coupon_use_end_date
     * 说明: 用券结束日期. yyyyMMdd
     */
    private Integer couponUseEndDate;

    /**
     * 字段: coupon_get_start_date
     * 说明: 领券开始日期. yyyyMMdd
     */
    private Integer couponGetStartDate;

    /**
     * 字段: coupon_get_end_date
     * 说明: 领券结束日期. yyyyMMdd
     */
    private Integer couponGetEndDate;

    /**
     * 字段: category_ids
     */
    private String categoryIds;

    /**
     * 字段: area_cate
     * 说明: 地区类型归属：1-行政归属，2-网店归属
     */
    private Integer areaCate;

    /**
     * 字段: region_city_or_poi_ids
     */
    private String regionCityOrPoiIds;

    /**
     * 字段: dimension_ids
     */
    private String dimensionIds;

    /**
     * 字段: dimension_filters
     */
    private String dimensionFilters;

    /**
     * 字段: metric_ids
     */
    private String metricIds;

    /**
     * 字段: metric_filters
     */
    private String metricFilters;

    /**
     * 字段: group_ids
     * 说明: 效果分析针对的群的ID, 逗号分隔
     */
    private String groupIds;

    /**
     * 字段: display_settings
     * 说明: 结果展示的设置. JSON格式
     */
    private String displaySettings;

    /**
     * 字段: create_time
     * 说明: 创建时间
     */
    private Date createTime;

    /**
     * 字段: updater
     * 说明: 最近一次更新者
     */
    private String updater;

    /**
     * 字段: update_time
     * 说明: 最近一次更新时间
     */
    private Date updateTime;

    /**
     * 字段: cooperation_type
     * 说明: 添加直营代理参数
     */
    @JsonProperty("cooperationType")
    private CooperationTypeBO cooperationType;

    /**
     * 字段: storage_temperature_level
     * 说明: 温层
     */
    private String storageTemperatureLevel;

    /**
     * 同环比类型
     */
    private String compareType;

    /**
     * 品类组件的标识
     * 0:老品类组件  1:新品类组件
     */
    private Integer cateFlag;


    /**
     * 团长bizids
     * TODO:后续团长与其余主题合并的时候在考虑优化
     */
    private String bizIds;

    /**
     * 标志是否为临时任务
     */
    private Integer taskMetaData;

    private String groupType;
}

