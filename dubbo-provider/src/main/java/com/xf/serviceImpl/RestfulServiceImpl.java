package com.xf.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import com.xf.service.RestfulService;

@Component
@Path("/")
public class RestfulServiceImpl implements RestfulService {
	@Path("/ctx/{id}")
	@Override
	public String testREST(@PathParam("id") Long id) {
		return ""+id;
	}

	@GET
	@Path("/ctx")
	@Produces("application/json")
	@Override
	public Map<String, Object> testREST2() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "1");
		map.put("codeMsg", "success");
		return map;

	}
}
