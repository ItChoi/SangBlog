package com.blog.sang.sequence;

import com.blog.sang.sequence.domain.Sequence;

public interface SequenceMapper {
	public Long getCount(String sequenceName);
	public void insert(Sequence sequence);
	public void update(String sequenceName);
}