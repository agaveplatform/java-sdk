/*
 * Agave
 *
 * This file was automatically generated for Agave Platform Client SDK by APIMATIC BETA v2.0 on 05/20/2016
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

public class MonitorsController extends BaseController {
    /**
     * Initialize the base controller using the given http client
     */
    public MonitorsController() {
        super();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client */
    public MonitorsController(HttpClient _client) {
        super(_client);
    }

    /**
     * Add a new monitoring task
     * @param    body    Required parameter: The description of the monitoring task to run
	 * @return	Returns the MonitoringTaskDetails response from the API call*/
    public void addMonitoringTasksAsync(
            final MonitoringTaskSummary body,
            final APICallBack<MonitoringTaskDetails> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5205312193205183004L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4691785654755943968L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.postBody(queryUrl, headers, APIHelper.serialize(body));

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies an invalid form", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to save the monitor.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            MonitoringTaskDetails result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MonitoringTaskDetails>(){});

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
     * Retrieve a specific monitor.
     * @param    monitorId    Required parameter: The id of the monitor
	 * @return	Returns the MonitoringTaskDetails response from the API call*/
    public void getMonitoringTaskAsync(
            final String monitorId,
            final APICallBack<MonitoringTaskDetails> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4642130549008987302L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5333911668755082139L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5731726984214629372L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 404)
                                throw new APIException("The specified Monitor cannot be found", 404, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            MonitoringTaskDetails result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MonitoringTaskDetails>(){});

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
     * Updates an existing monitor.
     * @param    body    Required parameter: The description of the app to add or update. This can be either a file upload or json posted to the request body.
     * @param    monitorId    Required parameter: The id of the monitor to update
	 * @return	Returns the MonitoringTaskDetails response from the API call*/
    public void updateMonitoringTaskAsync(
            final MonitoringTaskSummary body,
            final String monitorId,
            final APICallBack<MonitoringTaskDetails> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5641854949776007235L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4816385183992524853L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5659487489739272489L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.postBody(queryUrl, headers, APIHelper.serialize(body));

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies an invalid form", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            MonitoringTaskDetails result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MonitoringTaskDetails>(){});

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
     * Deletes a monitor.
     * @param    monitorId    Required parameter: The id of the monitor to delete
	 * @return	Returns the void response from the API call*/
    public void deleteMonitoringTaskAsync(
            final String monitorId,
            final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5231880133251303080L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5087759106673745329L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5308814316435586257L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.delete(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies no UUID", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

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
     * Retrieve checks for a specific monitor
     * @param    monitorId    Required parameter: The id of the monitor
     * @param    endDate    Optional parameter: A timestamp indicating the latest time of the first monitor check in ISO 8601 format
     * @param    limit    Optional parameter: The max number of results.
     * @param    offset    Optional parameter: The number of records to when returning the results. When paginating results, the page number = ceil(offset/limit)
     * @param    result    Optional parameter: A timestamp indicating the latest time of the first monitor check in ISO 8601 format
     * @param    startDate    Optional parameter: A timestamp indicating the earliest time of the first monitor check in ISO 8601 format
	 * @return	Returns the List<MonitoringTaskCheck> response from the API call*/
    public void listMonitoringTaskChecksAsync(
            final String monitorId,
            final String endDate,
            final Integer limit,
            final Integer offset,
            final MonitorCheckResultTypeEnum result,
            final String startDate,
            final APICallBack<List<MonitoringTaskCheck>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}/checks");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4679232681803533692L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5406004417943951951L;
            {
                    put( "naked", true );
                    put( "endDate", endDate );
                    put( "limit", (null != limit) ? limit : 250 );
                    put( "offset", (null != offset) ? offset : 0 );
                    put( "result", (null != result) ? result.value() : null );
                    put( "startDate", startDate );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5382147128663930714L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID or supplies an invalid JSON query", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 404)
                                throw new APIException("The specified Monitor cannot be found", 404, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            List<MonitoringTaskCheck> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<MonitoringTaskCheck>>(){});

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
     * Forces a monitor check to run.
     * @param    monitorId    Required parameter: The id of the monitor
	 * @return	Returns the MonitoringTaskDetails response from the API call*/
    public void createForceMonitoringTaskCheckAsync(
            final String monitorId,
            final APICallBack<MonitoringTaskDetails> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}/checks");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5629620123770413973L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5457829992428303253L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5495579343853895494L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user supplies an invalid form", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            MonitoringTaskDetails result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MonitoringTaskDetails>(){});

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
     * Retrieve a specific monitor check
     * @param    checkId    Required parameter: The id of the monitor check
     * @param    monitorId    Required parameter: The id of the monitor
	 * @return	Returns the MonitoringTaskCheck response from the API call*/
    public void getMonitoringTaskCheckAsync(
            final String checkId,
            final String monitorId,
            final APICallBack<MonitoringTaskCheck> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/{monitorId}/checks/{checkId}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5154730955873139633L;
            {
                    put( "checkId", checkId );
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5517463585376440293L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4783536691178792017L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 404)
                                throw new APIException("The specified Monitor cannot be found", 404, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            MonitoringTaskCheck result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<MonitoringTaskCheck>(){});

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
     * Retrieve Monitor for a specific resource.
     * @param    active    Optional parameter: Filter by monitors that are active or inactive.
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    target    Optional parameter: The target system to search for.
	 * @return	Returns the List<MonitoringTaskSummary> response from the API call*/
    public void listMonitoringTasksAsync(
            final String active,
            final Integer limit,
            final Integer offset,
            final String target,
            final APICallBack<List<MonitoringTaskSummary>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/monitors/v2/");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5581697844523778470L;
            {
                    put( "naked", true );
                    put( "active", (null != active) ? active : "true" );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
                    put( "target", target );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4688165178150040146L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if (responseCode == 400)
                                throw new APIException("Raised if a user does not supply a UUID or supplies an invalid JSON query", 400, response.getRawBody());

                            else if (responseCode == 401)
                                throw new APIException("Raised if the user is not authorized.", 401, response.getRawBody());

                            else if (responseCode == 403)
                                throw new APIException("Failed to authenticate the user", 403, response.getRawBody());

                            else if (responseCode == 404)
                                throw new APIException("The specified Monitor cannot be found", 404, response.getRawBody());

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", 500, response.getRawBody());

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            List<MonitoringTaskSummary> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<MonitoringTaskSummary>>(){});

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