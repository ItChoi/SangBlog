package com.blog.sang.sequence.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.sang.sequence.domain.Sequence;
import com.blog.sang.sequence.mapper.SequenceMapper;

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
			sequence.setSequenceId(1L);
			sequence.setSequenceName(sequenceName);
			System.out.println("1count: " + count);
			sequence.setCount(count);
			sequenceMapper.insert(sequence);
			
			return 1L;
			
		} else {
			count = count + 1L;
			System.out.println("2count: " + count);
			sequence.setCount(count);
			sequenceMapper.update(sequence);
			
			return count;
		}
		
				
	}

	@Override
	public Long getCount() {
		// 새로운 시퀀스 id가 생겨날 때 index 용도.... (오토인클리먼트)
		long count = getCount("sequenceId");
		
		return count; 
	}
	
}
