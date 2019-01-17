package com.tscloud.address.ui.restful;


import com.tscloud.common.framework.rest.BaseRestServerInterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

public interface IDataUpdateRestServer extends BaseRestServerInterface {

    @GET
    @Path("Adddata")
    @Produces(MediaType.APPLICATION_JSON)
    public String Adddata(@QueryParam("adcode")String adcode,@QueryParam("x") Double x,@QueryParam("y") Double y,@QueryParam("level") Integer Level,@QueryParam("address") String Address,@QueryParam("name")String name,@QueryParam("type") String type);
}
