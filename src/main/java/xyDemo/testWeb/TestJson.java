package xyDemo.testWeb;


import com.alibaba.fastjson.JSONObject;

public class TestJson {
    public static void main(String[] args) {
        String settingContent = "{\n" +
                "\t\"settingType\": 2,\n" +
                "\t\"queryName\": \"用户效果分析测试-1\",\n" +
                "\t\"poiIds\": \"\",\n" +
                "\t\"dateCate\": 1,\n" +
                "\t\"dateType\": \"day\",\n" +
                "\t\"startDate\": 20220127,\n" +
                "\t\"endDate\": 20220127,\n" +
                "\t\"areaCate\": 6,\n" +
                "\t\"regionCityOrPoiIds\": \"{\\\"cityDistrictIds\\\":[\\\"-1\\\"],\\\"cityIds\\\":[\\\"-1\\\"],\\\"provinceIds\\\":[\\\"-1\\\"],\\\"regionOrgIds\\\":[\\\"-1\\\"]}\",\n" +
                "\t\"dimensionIds\": \"dt\",\n" +
                "\t\"dimensionFilters\": \"{\\\"relation\\\":\\\"and\\\",\\\"labels\\\":[]}\",\n" +
                "\t\"metricIds\": \"arpu\",\n" +
                "\t\"metricFilters\": \"{\\\"relation\\\":\\\"and\\\",\\\"labels\\\":[]}\",\n" +
                "\t\"displaySettings\": \"{\\\"tableSettings\\\":[],\\\"tableInfo\\\":{}}\",\n" +
                "\t\"compareType\": \"DAY_LINK_RELATIVE_RATIO\",\n" +
                "\t\"taskMetaData\": 0,\n" +
                "\t\"cooperationType\": {\n" +
                "\t\t\"cooperationTypeCode\": [2],\n" +
                "\t\t\"businessTypeCode\": [-1]\n" +
                "\t}\n" +
                "}";
        GroupEffectAnalSettingPO settingPO = JSONObject.parseObject(settingContent, GroupEffectAnalSettingPO.class);

    }

    public void noUse(){}

}

