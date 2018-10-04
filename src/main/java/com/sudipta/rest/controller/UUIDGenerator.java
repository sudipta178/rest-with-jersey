package com.sudipta.rest.controller;

import com.sudipta.rest.service.IGenerateUUID;
import com.sudipta.rest.service.impl.GenerateUUID;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/adduuid")
public class UUIDGenerator {

    private IGenerateUUID generateUUID;

    public UUIDGenerator() {
        generateUUID = new GenerateUUID();
    }

    @GET
    @Path("/{jsonid}")
    public Response addUUID(@PathParam("jsonid") String jsonid) {
        StringBuilder outputBuilder = new StringBuilder();
        try {
            if (null == jsonid) {
                throw new IllegalArgumentException("Invalid json id");
            }

            outputBuilder.append(jsonid).append("-").append(generateUUID.getUUID());

        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }
        return Response.status(Response.Status.OK).entity(outputBuilder.toString()).build();
    }

}
