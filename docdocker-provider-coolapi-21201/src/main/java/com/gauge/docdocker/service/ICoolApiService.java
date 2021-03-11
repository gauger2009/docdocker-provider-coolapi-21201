package com.gauge.docdocker.service;

import com.gauge.docdocker.vm.CoolApi;

import java.util.List;



public interface ICoolApiService {
    public CoolApi get(long id) ;
    public boolean add(CoolApi dept) ;
    public List<CoolApi> list() ;
}
