package com.blog.sang.common.sequence.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.sang.common.sequence.domain.Sequence;
import com.blog.sang.common.sequence.mapper.SequenceMapper;

@Service
public class SequenceServiceImpl implements SequenceService {
	
	private static final Logger logger = LoggerFactory.getLogger(SequenceServiceImpl.class);
	
	@Autowired
	SequenceMapper sequenceMapper;

	@Override
	public Long getCount(String sequenceName) {
		
		Long count = sequenceMapper.getCount(sequenceName);
		Sequence sequence = new Sequence();
		logger.info("count::: {}", count);
		
		if (count == null || count == 0) {
			count = 1L;
			sequence.setSequenceName(sequenceName);
			sequence.setCount(count);
			sequenceMapper.insert(sequence);
			
			return 1L;
			
		} else {
			count = count + 1L;
			sequence.setCount(count);
			sequence.setSequenceName(sequenceName);
			sequenceMapper.update(sequence);
			
			return count;
		}
		
				
	}

	@Override
	public Long getCount() {
		// TODO::: sequenceId를 통해 다른 시퀀스의 index를 줘야 하는데... 일단 mysql auto_increment 사용... 나중에 바꾸기.
		return getCount("sequenceId"); 
	}
	
}
