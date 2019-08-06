package com.blog.sang.common.sequence.mapper;

import com.blog.sang.common.sequence.domain.Sequence;

public interface SequenceMapper {
	public Long getCount(String sequenceName);
	public void insert(Sequence sequence);
	public void update(Sequence sequence);
}
