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

public class MetaController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static MetaController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the MetaController class 
     */
    public static MetaController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new MetaController();
            }
        }
        return instance;
    }

    /**
     * List and/or search metadata.
     * @param    q    Required parameter: The query to perform. Traditional MongoDB queries are supported
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listMetadataAsync(
                final String q,
                final Integer limit,
                final Integer offset,
                final APICallBack<List<Metadata>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5126791648150379172L;
            {
                    put( "naked", true );
                    put( "q", q );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4903593243813960109L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID or supplies an invalid JSON query", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified metadata cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            List<Metadata> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<Metadata>>(){});

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
     * Update or Add new Metadata.
     * @param    body    Required parameter: The metadata to add.
     * @return	Returns the void response from the API call 
     */
    public void addMetadataAsync(
                final Metadata body,
                final APICallBack<Metadata> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5497474181762083134L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5687306223038636300L;
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
                                throw new APIException("Raised if a user supplies an invalid form", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Metadata result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Metadata>(){});

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
     * Retrieve Metadata.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void getMetadataAsync(
                final String uuid,
                final APICallBack<Metadata> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956548300247304141L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4874734922367030727L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4903618290404819362L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified metadata cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Metadata result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Metadata>(){});

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
     * Update or Add new Metadata.
     * @param    body    Required parameter: The metadata to update.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void updateMetadataAsync(
                final Metadata body,
                final String uuid,
                final APICallBack<Metadata> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5413945225685883658L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5744315286518582865L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5637509934901781414L;
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
                                throw new APIException("Raised if a user supplies an invalid form", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Metadata result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Metadata>(){});

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
     * Remove Metadata from the system.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void deleteMetadataAsync(
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5724417004569410221L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5692794711992318541L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4676298049047630722L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies no UUID", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Add a new Metadata Schema.
     * @param    body    Required parameter: A valid JSON Schema object
     * @return	Returns the void response from the API call 
     */
    public void addMetadataSchemaAsync(
                final MetadataSchema body,
                final APICallBack<MetadataSchema> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4782084031932444079L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5356385441983218654L;
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
                                throw new APIException("Raised if a user supplies an invalid form or JSON schema", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MetadataSchema result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MetadataSchema>(){});

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
     * Update an existing Metadata Schema.
     * @param    body    Required parameter: A valid JSON Schema object
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void updateMetadataSchemaAsync(
                final PermissionModel body,
                final String uuid,
                final APICallBack<MetadataSchema> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5203278878715964487L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5528548765427063322L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5042165950423128498L;
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
                                throw new APIException("Raised if a user supplies an invalid form or JSON schema", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MetadataSchema result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MetadataSchema>(){});

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
     * Remove Metadata Schema from the system.
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void deleteMetadataSchemaAsync(
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4783645361157763083L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5031947254553652789L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4707068016082308123L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a Schema UUID", context);

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Get the permission ACL for this metadata.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listMetadataPermissionsAsync(
                final String uuid,
                final Integer limit,
                final Integer offset,
                final APICallBack<PermissionModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5322142028224580762L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5441227089947557584L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5438643443831256414L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a metadata UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified metadata cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Add a user permission for the given metadata.
     * @param    body    Required parameter: The metadata permission to update.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void addMetadataPermissionAsync(
                final PermissionModel body,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4855187105382029442L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5387634418947186259L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4716175102139487658L;
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
                                throw new APIException("Raised if a valid metadata UUID is not supplied or if the form is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified user cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Deletes all permissions on the given metadata.
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void deleteClearMetadataPermissionsAsync(
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5436373610047766852L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5513585468402107050L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4662741571614629825L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a metadata UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Get the user permission for this metadata.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void getMetadataPermissionAsync(
                final String username,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5136400798336781178L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5084289777774791501L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5586453867421805425L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a metadata UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified metadata cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Update a user's permission for the given metadata.
     * @param    body    Required parameter: The metadata permission to update.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void updateMetadataPermissionAsync(
                final PermissionModel body,
                final String username,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5299591459802069325L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5392846415373606940L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5662773688818351410L;
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
                                throw new APIException("Raised if a valid metadata UUID is not supplied or if the form is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified user cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Removes user permissions for a user on a given metadata resource.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata item
     * @return	Returns the void response from the API call 
     */
    public void deleteMetadataPermissionAsync(
                final String username,
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/data/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956718727735195302L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5526217116065143873L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4950336515962586014L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a metadata UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified metadata.", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Get the permission for this schema.
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listMetadataSchemaPermissionsAsync(
                final String uuid,
                final Integer limit,
                final Integer offset,
                final APICallBack<List<PermissionModel>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5533739774426916941L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4814472442624136714L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5364791685193008611L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a schema UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified schema cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            List<PermissionModel> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<PermissionModel>>(){});

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
     * Add a user's permission for the given schema.
     * @param    body    Required parameter: The schema permission to update.
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void addMetadataSchemaPermissionAsync(
                final PermissionModel body,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5757299008591583624L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4853039810762375113L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5063892892097731346L;
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
                                throw new APIException("Raised if a valid schema UUID is not supplied or if the form is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified user cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Deletes all permissions on the given schema.
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void deleteClearMetadataSchemaPermissionsAsync(
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4740680027313522555L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5462944543806829259L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5277294693535833605L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a schema UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Get the user permission for this schema.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void getMetadataSchemaPermissionAsync(
                final String username,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4976026573388189019L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5321301991452250052L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5431472885923637981L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a schema UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified schema cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Add or update a user's permission for the given metadata schema.
     * @param    body    Required parameter: The schema permission to update.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void updateMetadataSchemaPermissionAsync(
                final PermissionModel body,
                final String username,
                final String uuid,
                final APICallBack<PermissionModel> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5743860007122054207L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5214294750142906479L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5477528298304656606L;
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
                                throw new APIException("Raised if a valid schema UUID is not supplied or if the form is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 404)
                                throw new APIException("The specified user cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            PermissionModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PermissionModel>(){});

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
     * Deletes all metadata schema permissions on the given metadata.
     * @param    username    Required parameter: The username of the permission owner
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void deleteSchemaPermissionAsync(
                final String username,
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}/pems/{username}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5438459559860739928L;
            {
                    put( "username", username );
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4699451859397542410L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4640551583236924548L;
            {
                    put( "user-agent", "agave-client-sdk" );
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a schema UUID is not supplied or is invalid.", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user or the user is not authorized to access the specified schema.", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the metadata schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //let the caller know of the success
                            callBack.onSuccess(context, context);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Retrieve Metadata Schemata.
     * @param    uuid    Required parameter: The uuid of the metadata schema item
     * @return	Returns the void response from the API call 
     */
    public void getMetadataSchemaAsync(
                final String uuid,
                final APICallBack<MetadataSchema> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5316242907019002959L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5498448226854628144L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5100946697032680949L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a Schema UUID", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            MetadataSchema result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MetadataSchema>(){});

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
     * List and query Metadata Schemata.
     * @param    q    Required parameter: A valid query object defining the search parameters.
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listMetadataSchemaAsync(
                final String q,
                final Integer limit,
                final Integer offset,
                final APICallBack<List<MetadataSchema>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/meta/v2/schemas");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5736428409268271507L;
            {
                    put( "naked", true );
                    put( "q", q );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4714020917878421957L;
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
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a Schema UUID", context);

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the schema database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            List<MetadataSchema> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<MetadataSchema>>(){});

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