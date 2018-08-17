package yt.mapper;

import java.util.List;

import yt.pojo.BaseDict;

public interface BaseDictMapper {

	
	List<BaseDict> getBaseDictByCode(String code);
}
