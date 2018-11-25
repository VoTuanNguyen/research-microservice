package com.fpt.feign;

import java.util.Collection;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fpt.model.EmployeeInfo;

@FeignClient(name = "employee-search")
@RibbonClient(name = "employee-search")
public interface EmployeeServiceProxy {
	@RequestMapping("/employee/find/{id}")
	public EmployeeInfo findById(@PathVariable(value = "id") Long id);

	@RequestMapping("/employee/findall")
	public Collection<EmployeeInfo> findAll();
}