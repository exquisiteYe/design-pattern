package xyDemo.testWeb;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Slf4j
public class CooperationTypeBO {
    @JsonProperty("cooperationTypeCode")
    private List<Integer> cooperationTypeCode;

    @JsonProperty("businessTypeCode")
    private List<Integer> businessTypeCode;
}
