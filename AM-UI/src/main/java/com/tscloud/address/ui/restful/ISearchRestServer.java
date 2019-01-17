package com.tscloud.address.ui.restful;

import com.tscloud.common.framework.rest.BaseRestServerInterface;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.awt.*;

public interface ISearchRestServer extends BaseRestServerInterface {

    @GET
    @Path("SearchById")
    @Produces(MediaType.APPLICATION_JSON)
    public String SearchById(@QueryParam("addrId")Integer SearchId);
}
