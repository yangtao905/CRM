package yt.service;

import java.util.List;

import yt.pojo.BaseDict;

public interface BaseDictService {

	
	List<BaseDict> getBaseDictByCode(String code);

}
