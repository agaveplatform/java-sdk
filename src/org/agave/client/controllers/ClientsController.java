/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC v2.0 on 04/25/2016
 */
package org.agave.client.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import org.agave.client.http.client.HttpClient;
import org.agave.client.http.client.HttpContext;
import org.agave.client.http.request.HttpRequest;
import org.agave.client.http.response.HttpResponse;
import org.agave.client.http.response.HttpStringResponse;
import org.agave.client.http.client.APICallBack;
import org.agave.client.*;
import org.agave.client.models.*;

public class ClientsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static ClientsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ClientsController class 
     */
    public static ClientsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new ClientsController();
            }
        }
        return instance;
    }

    /**
     * List existing clients
     * @return	Returns the void response from the API call 
     */
    public void listClientsAsync(
                final APICallBack<MultipleClientResponse> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/");
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5066252158464783146L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MultipleClientResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MultipleClientResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Create a new client
     * @param    body    Required parameter: The api client to create
     * @return	Returns the void response from the API call 
     */
    public void addClientAsync(
                final ClientRequest body,
                final APICallBack<SingleClientResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/");
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5214902058010783779L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().postBody(queryUrl, headers, APIHelper.serialize(body));

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies an invalid username format", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 404)
                                throw new APIException("The user profile cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the profile database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            SingleClientResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SingleClientResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Returns a detailed description of a named client.
     * @param    clientName    Required parameter: The name of the client to be deleted
     * @return	Returns the void response from the API call 
     */
    public void getClientAsync(
                final String clientName,
                final APICallBack<MultipleClientResponse> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/{clientName}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5094046165307844883L;
            {
                    put( "clientName", clientName );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5540718678730867676L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MultipleClientResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MultipleClientResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Immediately deletes this client and renders the API keys useless.
     * @param    clientName    Required parameter: The name of the client to be deleted
     * @return	Returns the void response from the API call 
     */
    public void deleteClientAsync(
                final String clientName,
                final APICallBack<EmptyClientResponse> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/{clientName}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4651374480982443039L;
            {
                    put( "clientName", clientName );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5740252376739348093L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().delete(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            EmptyClientResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<EmptyClientResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Add a new API subscription to the given client
     * @param    body    Required parameter: The api client to create
     * @param    clientName    Required parameter: The name of the client to be subscribe to this api
     * @return	Returns the void response from the API call 
     */
    public void addClientAPISubscriptionAsync(
                final ClientSubscriptionRequest body,
                final String clientName,
                final APICallBack<SingleSubscriptionResponse> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/{clientName}/subscriptions");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5104354097264356422L;
            {
                    put( "clientName", clientName );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4794696043983661409L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().postBody(queryUrl, headers, APIHelper.serialize(body));

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            SingleSubscriptionResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SingleSubscriptionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Unsubscribe the client from all APIs
     * @param    apiName    Required parameter: The name of the API to be deleted
     * @param    clientName    Required parameter: The name of the client to be deleted
     * @return	Returns the void response from the API call 
     */
    public void deleteClearClientAPISubscriptionsAsync(
                final String apiName,
                final String clientName,
                final APICallBack<EmptyClientResponse> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/{clientName}/subscriptions");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4703113760857124660L;
            {
                    put( "clientName", clientName );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5056578424470272100L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5121232761060366740L;
            {
                    put( "apiName", apiName );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().delete(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            EmptyClientResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<EmptyClientResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * Lists all APIs to which the client is subscribed
     * @param    clientName    Required parameter: The name of the client to be deleted
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listClientApiSubscriptionsAsync(
                final String clientName,
                final Integer limit,
                final Integer offset,
                final APICallBack<MultipleSubscriptionResponse> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/clients/v2/{clientName}/subscriptions");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4897748076079431723L;
            {
                    put( "clientName", clientName );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5176642581238278271L;
            {
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5559295357734513971L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MultipleSubscriptionResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MultipleSubscriptionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
}