package com.springboot.registry;

public interface AdapterService<T> {
	public void process(T request);
}