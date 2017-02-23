package com.qjy.open.service.impl.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qjy.open.dao.sys.LogMapper;
import com.qjy.open.entity.sys.Log;
import com.qjy.open.service.sys.LogService;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper logDao;
	
	@Override
	@Transactional
	public int insert(Log record) {
		return logDao.insert(record);
	}

}
