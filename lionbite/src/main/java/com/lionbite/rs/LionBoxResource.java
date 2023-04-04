package com.lionbite.rs;

import com.lionbite.business.BoxManager;
import com.lionbite.business.UserManager;
import com.lionbite.dao.BoxDao;
import com.lionbite.model.LionBox;
import com.lionbite.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/boxes")
public class LionBoxResource {
    @GET
    @Path("/")
    public Response getBoxes() {
        List<LionBox> boxes = BoxManager.getAll();
        return Utility.buildOkResponse(boxes);
    }

    @POST
    @Path("/")
    @Consumes("application/json")
    public Response insertBox(LionBox lionBox) {


        return Utility.buildOkResponse(BoxManager.save(lionBox));
    }
}
