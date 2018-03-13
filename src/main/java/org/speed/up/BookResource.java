package org.speed.up;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("books")
public class BookResource
{
	@Produces("text/plain")
	@GET
	public String getGreetings()
	{
		return "Hello,JS";
	}

}