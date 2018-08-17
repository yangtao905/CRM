package yt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yt.mapper.BaseDictMapper;
import yt.pojo.BaseDict;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	@Autowired
	private BaseDictMapper baseDictMapper;
	
	@Override
	public List<BaseDict> getBaseDictByCode(String code) {
		return baseDictMapper.getBaseDictByCode(code);
	}

}
