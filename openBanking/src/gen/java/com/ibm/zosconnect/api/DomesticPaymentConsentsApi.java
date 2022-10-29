package com.ibm.zosconnect.api;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.annotation.security.RolesAllowed;

import org.eclipse.microprofile.metrics.*;
import org.eclipse.microprofile.metrics.annotation.*;

@Path("/domestic-payment-consents")
@ApplicationScoped

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-10-29T05:26:50.007Z[UTC]")
public class DomesticPaymentConsentsApi {

    @Context
    private Application application;

    @Context
    private UriInfo uriInfo;

    @Context
    private HttpHeaders headers;

    @Context
    private SecurityContext securityContext;

    @Inject
    com.ibm.zosconnect.engine.Operation operation;

    @Inject
    MetricRegistry metricRegistry;

    @POST
    @Consumes({ "application/json; charset=utf-8", "application/json", "application/jose+jwe" })
    @Produces({ "application/json; charset=utf-8", "application/json", "application/jose+jwe" })
    
    @SimplyTimed(name = "createDomesticPaymentConsentsTime", tags = { "method=POST"}, absolute = true)
    @Counted(name = "createDomesticPaymentConsentsCount", absolute = true)
    public Response createDomesticPaymentConsents(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/domestic-payment-consents");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @GET
    @Path("/{ConsentId}")
    @Produces({ "application/json; charset=utf-8", "application/json", "application/jose+jwe" })
    
    @SimplyTimed(name = "getDomesticPaymentConsentsConsentIdTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "getDomesticPaymentConsentsConsentIdCount", absolute = true)
    public Response getDomesticPaymentConsentsConsentId(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/domestic-payment-consents/{ConsentId}");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }


    @GET
    @Path("/{ConsentId}/funds-confirmation")
    @Produces({ "application/json; charset=utf-8", "application/json", "application/jose+jwe" })
    
    @SimplyTimed(name = "getDomesticPaymentConsentsConsentIdFundsConfirmationTime", tags = { "method=GET"}, absolute = true)
    @Counted(name = "getDomesticPaymentConsentsConsentIdFundsConfirmationCount", absolute = true)
    public Response getDomesticPaymentConsentsConsentIdFundsConfirmation(@Context HttpServletRequest request, String body) {

        com.ibm.zosconnect.engine.OperationRequest opRequest = new com.ibm.zosconnect.engine.OperationRequest(request,
                                                                                                body,
                                                                                                headers,
                                                                                                uriInfo,
                                                                                                securityContext.getUserPrincipal(),
                                                                                                Thread.currentThread().getContextClassLoader(),
                                                                                                "/domestic-payment-consents/{ConsentId}/funds-confirmation");

        opRequest.setMetricRegistry(metricRegistry);

        com.ibm.zosconnect.engine.OperationResponse opResponse = operation.processOperation(opRequest);

        return Response.status(opResponse.getResponseStatus())
                        .entity(opResponse.getBean())
                        .replaceAll(opResponse.getHeaders())
                        .cookie(opResponse.getCookiesArray())
                        .build();
    }

}
