package com.xkazxx.bean;


import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class QueryVO {

    List rows;
    Integer total;

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
