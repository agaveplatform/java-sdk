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

public class MonitorsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static MonitorsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the MonitorsController class 
     */
    public static MonitorsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new MonitorsController();
            }
        }
        return instance;
    }

    /**
     * Add a new monitoring task
     * @param    body    Required parameter: The description of the monitoring task to run
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 5068782822069436180L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4651143193226683100L;
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
                                throw new APIException("The service was unable to save the monitor.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 5047346276362687651L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5413711396303337835L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4907089027835842797L;
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
                                throw new APIException("The specified Monitor cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 4705779430090467961L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5177268673932039250L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5402892814154152039L;
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
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 4842282862354497229L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5231240942222766767L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4882636772429989850L;
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
                                throw new APIException("The service was unable to process the request.", context);

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
     * Retrieve checks for a specific monitor
     * @param    monitorId    Required parameter: The id of the monitor
     * @param    endDate    Optional parameter: A timestamp indicating the latest time of the first monitor check in ISO 8601 format
     * @param    limit    Optional parameter: The max number of results.
     * @param    offset    Optional parameter: The number of records to when returning the results. When paginating results, the page number = ceil(offset/limit)
     * @param    result    Optional parameter: A timestamp indicating the latest time of the first monitor check in ISO 8601 format
     * @param    startDate    Optional parameter: A timestamp indicating the earliest time of the first monitor check in ISO 8601 format
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 4965994466640333925L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5417540280344889913L;
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
            private static final long serialVersionUID = 5467529142842681461L;
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
                                throw new APIException("The specified Monitor cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 5088324652865488865L;
            {
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5587798351804666062L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5004005445540934401L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().post(queryUrl, headers, null);

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
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 4668091038459655763L;
            {
                    put( "checkId", checkId );
                    put( "monitorId", monitorId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5143371096474452480L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4764305337986378605L;
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
                                throw new APIException("The specified Monitor cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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
     * @return	Returns the void response from the API call 
     */
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
            private static final long serialVersionUID = 4747330171118631289L;
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
            private static final long serialVersionUID = 4948261488190829504L;
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
                                throw new APIException("The specified Monitor cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to process the request.", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

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