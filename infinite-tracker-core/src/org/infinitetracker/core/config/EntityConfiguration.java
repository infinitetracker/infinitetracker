package org.infinitetracker.core.config;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component("EntityConfiguration")
public class EntityConfiguration implements ApplicationContextAware{
	
	private ApplicationContext mContext;
	private Map<String, Class<?>> mMap;
	private ApplicationContext mApplicationContext;
	private Resource[] entityContexts;;
	@javax.annotation.Resource
	private Set<String> mEntityContexts;
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		mContext = context;
		mMap = new HashMap<String, Class<?>>();
	}
	
	@PostConstruct
	public void configureItems(){
		final Set<Resource> resources = new LinkedHashSet<Resource>();
		if(mEntityContexts != null && !mEntityContexts.isEmpty()){
			for(String location : mEntityContexts){
				resources.add(mContext.getResource(location));
			}
		}
		if(entityContexts != null){
			for(Resource resource : entityContexts){
				resources.add(resource);
			}
		}
		entityContexts = resources.toArray(new Resource[resources.size()]);
		mApplicationContext = new GenericXmlApplicationContext(entityContexts);
	}
	
	public Class<?> lookupEntityClass(String beanId) {
        Class<?> clazz;
        if (mMap.containsKey(beanId)) {
            clazz = mMap.get(beanId);
        } else {
            Object object = mApplicationContext.getBean(beanId);
            clazz = object.getClass();
            mMap.put(beanId, clazz);
        }
        return clazz;
    }
	
	public String[] getEntityBeanNames() {
    	return mApplicationContext.getBeanDefinitionNames();
    }
	
	@SuppressWarnings("unchecked")
	public <T> Class<T> lookupEntityClass(String beanId, Class<T> resultClass) {
        Class<T> clazz;
        if (mMap.containsKey(beanId)) {
            clazz = (Class<T>) mMap.get(beanId);
        } else {
            Object object = mApplicationContext.getBean(beanId);
            clazz = (Class<T>) object.getClass();
            mMap.put(beanId, clazz);
        }
        return clazz;
    }
	
	public Object createEntityInstance(String beanId) {
        Object bean = mApplicationContext.getBean(beanId);
        return bean;
    }
	
	@SuppressWarnings("unchecked")
	public <T> T createEntityInstance(String beanId, Class<T> resultClass) {
        T bean = (T) mApplicationContext.getBean(beanId);
        return bean;
    }
	
	public Resource[] getEntityContexts() {
		return entityContexts;
	}
	
	public void setEntityContexts(Resource[] entityContexts) {
		this.entityContexts = entityContexts;
	}
}
