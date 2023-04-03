package com.lionbite.rs;

import com.lionbite.business.UserManager;
import com.lionbite.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserResource {
    @GET
    @Path("/{id}")
    public Response getUser(@PathParam("id") Long id) {
        User user = UserManager.get(id);

        if(user == null){
            return  Utility.buildNotFoundResponse();
        }
        return Utility.buildOkResponse(user);
    }

    @POST
    @Path("/")
    @Consumes("application/json")
    public Response insertUser(User user) {


        return Utility.buildOkResponse(UserManager.save(user));
    }
}
