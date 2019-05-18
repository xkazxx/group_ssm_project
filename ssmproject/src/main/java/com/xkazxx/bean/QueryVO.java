package com.xkazxx.bean;

import java.io.Serializable;
import java.util.List;

public class QueryVO{

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
