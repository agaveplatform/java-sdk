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

public class NotificationsController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static NotificationsController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the NotificationsController class 
     */
    public static NotificationsController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new NotificationsController();
            }
        }
        return instance;
    }

    /**
     * Add new notification.
     * @param    body    Required parameter: The notification to add.
     * @return	Returns the void response from the API call 
     */
    public void addNotificationAsync(
                final NotificationRequest body,
                final APICallBack<Notification> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/notifications/v2/");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5215748917917221622L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5596754989807264014L;
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
                                throw new APIException("The service was unable to query the notification database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Notification result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Notification>(){});

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
     * Retrieve notification for a specific resource.
     * @param    associatedUuid    Required parameter: The uuid of the associated resource. All notifications for this resource visible to the user will be returned.
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @return	Returns the void response from the API call 
     */
    public void listNotificationsAsync(
                final String associatedUuid,
                final Integer limit,
                final Integer offset,
                final APICallBack<List<Notification>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/notifications/v2/");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5164881251618302903L;
            {
                    put( "associatedUuid", associatedUuid );
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5105769494004861661L;
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
                                throw new APIException("The specified notification cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the notification database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            List<Notification> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<Notification>>(){});

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
     * Retrieve notification.
     * @param    uuid    Required parameter: The uuid of the notification item
     * @return	Returns the void response from the API call 
     */
    public void getNotificationAsync(
                final String uuid,
                final APICallBack<Notification> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/notifications/v2/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5702207636080219474L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4933709454610190324L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4662818871223096896L;
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
                                throw new APIException("The specified notification cannot be found", context);

                            else if (responseCode == 500)
                                throw new APIException("The service was unable to query the notification database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Notification result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Notification>(){});

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
     * Update existing notification.
     * @param    body    Required parameter: The notification to update.
     * @param    uuid    Required parameter: The uuid of the notification item
     * @return	Returns the void response from the API call 
     */
    public void updateNotificationAsync(
                final NotificationRequest body,
                final String uuid,
                final APICallBack<Notification> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/notifications/v2/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4674442772857268994L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5496508949103642180L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5127702618635320951L;
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
                                throw new APIException("The service was unable to query the notification database", context);

                            else if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            Notification result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<Notification>(){});

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
     * Remove notification from the system.
     * @param    uuid    Required parameter: The uuid of the notification item
     * @return	Returns the void response from the API call 
     */
    public void deleteNotificationAsync(
                final String uuid,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/notifications/v2/{uuid}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5515284298045440846L;
            {
                    put( "uuid", uuid );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5709840114447617894L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4883257975658107941L;
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
                                throw new APIException("The service was unable to query the notification database", context);

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
        
}