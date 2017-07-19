package com.yidusoft.dao;

import com.yidusoft.domain.Aptitude;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/5.
 */
public interface AptitudeDao {

    List<Aptitude> getQueryAll(Aptitude aptitude);

    void insert(Aptitude aptitude);

    void update(Aptitude aptitude);

    Aptitude getById(String id);

    void delete(String id);
}
