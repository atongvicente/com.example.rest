package com.example.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/*define the root path*/
@Path("/v1/status")
public class V1_status {
	
	private static final String api_version = "00.01.00";
	
	@GET /*it permits to know what to do*/
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
		return "<p>Java Web Service</p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion(){
		return "<p>Version</p>" + api_version;
	}
}
