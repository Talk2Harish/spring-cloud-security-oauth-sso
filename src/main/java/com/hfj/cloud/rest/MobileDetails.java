package com.hfj.cloud.rest;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hfj.cloud.model.Mobile;
/**
 * @author HFJ
 *
 */
@RestController
public class MobileDetails {

	Set<Mobile> mobile = new HashSet<Mobile>();
	@RequestMapping(value = "/viewAll")
	public Collection<Mobile> mobileDetail() {
		if (ObjectUtils.isEmpty(mobile)) {
			mobile.add(new Mobile(1, "samsung", "M30"));
			mobile.add(new Mobile(2, "Nokia", "1100"));
		}
		return mobile;
	}

	@RequestMapping(value = "/private")
	public Collection<Mobile> mobileDetail2() {
		if (ObjectUtils.isEmpty(mobile)) {
			mobile.add(new Mobile(3, "vivo", "V30"));
			mobile.add(new Mobile(4, "Mi", "redmi7"));
		}
		return mobile;
	}
	
}
