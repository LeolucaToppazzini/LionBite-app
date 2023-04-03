package com.lionbite.rs;



import com.lionbite.business.GenericException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class GenericExceptionMapper implements ExceptionMapper<GenericException> {
    @Override
    public Response toResponse(GenericException e) {
        return Utility.buildServerError(e.getMessage());
    }
}
