package com.springboot.registry;

public interface ServiceRegistry {
	public <T> AdapterService<T> getService(String serviceName);
}
