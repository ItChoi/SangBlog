package com.blog.sang.sequence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.sang.sequence.domain.Sequence;

@Service
public class SequenceServiceImpl implements SequenceService {
	
	private static final Logger logger = LoggerFactory.getLogger(SequenceServiceImpl.class);
	
	@Autowired
	SequenceMapper sequenceMapper;

	@Override
	public Long getCount(String sequenceName) {
		
		Long count = sequenceMapper.getCount(sequenceName);
		logger.info("count::: {}", count);
		
		/*if (count == 0) {
			// insert
			
			Sequence sequence = new Sequence();
			sequence.setSequenceId(getCount("sequence"));
			sequence.setCount(1L);
			sequence.setSequenceName(sequenceName);
			
			sequenceMapper.insert(sequence);
		} else {
			// update -> count + 1
			sequenceMapper.update(sequenceName);
			
		}*/
		
		return count;
				
	}

	
}