package com.gauge.docdocker.service;

import java.util.List;
import  com.gauge.viewmodel.CoolApi;


public interface ICoolApiService {
    public CoolApi get(long id) ;
    public boolean add(CoolApi dept) ;
    public List<CoolApi> list() ;
}
