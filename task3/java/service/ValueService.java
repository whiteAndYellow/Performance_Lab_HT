package service;

import entity.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValueService {
    private final Map<Integer,String> valueMap;


    public ValueService(List<Value> valueList) {
        this.valueMap = new HashMap<>();
        valueList.forEach(v -> valueMap.put(v.getId(),v.getValue()));
    }

    public String getValue(Integer id){
        return valueMap.get(id);
    }


}
