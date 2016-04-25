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

public class FilesController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static FilesController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the FilesController class 
     */
    public static FilesController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new FilesController();
            }
        }
        return instance;
    }

    /**
     * Upload a file to the user's default storage system.
     * @param    fileToUpload    Required parameter: The file to upload
     * @param    append    Optional parameter: Boolean flag indicating this file should be appended to the target file rather than overwriting its contents
     * @param    fileName    Optional parameter: The name of the file after importing. If not specified, the uploaded file name will be used.
     * @param    fileType    Optional parameter: The file format this file is in. Defaults to raw. This will be used in file transform operations.
     * @param    notifications    Optional parameter: The URI to notify when the import is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void uploadFileItemToDefaultSystemAsync(
                final File fileToUpload,
                final Boolean append,
                final String fileName,
                final String fileType,
                final String notifications,
                final String path,
                final APICallBack<FileInfo> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4987387780527776383L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5069482831290981883L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5052853343724707150L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5571907494338848112L;
            {
                    put( "fileToUpload", fileToUpload );
                    put( "append", (null != append) ? append : false );
                    put( "fileName", fileName );
                    put( "fileType", fileType );
                    put( "notifications", notifications );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

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
                            FileInfo result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FileInfo>(){});

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
     * Perform an action on a file or folder.
     * @param    body    Required parameter: The operation to perform. 
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void updateInvokeFileActionOnDefaultSystemAsync(
                final FileAction body,
                final String path,
                final APICallBack<LinkedHashMap<String, Object>> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5714175799652105059L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5620999079585926664L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4693793071489559873L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().putBody(queryUrl, headers, APIHelper.serialize(body));

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
                            LinkedHashMap<String, Object> result = APIHelper.deserialize(((HttpStringResponse)response).getBody());

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
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
     * Deletes a file or folder on the user's default storage system.
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void deleteFileItemOnDefaultSystemAsync(
                final String path,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5419794448945433091L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5152880046043607669L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5717823694236157906L;
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
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
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
     * Upload a file to the given system
     * @param    fileToUpload    Required parameter: The file to upload to the remote system
     * @param    path    Required parameter: The path of the file relative to the user's default storage location.
     * @param    systemId    Required parameter: The unique id of the system on which the data resides.
     * @param    fileName    Optional parameter: The name of the file after importing. If not specified, the uploaded file name will be used.
     * @param    fileType    Optional parameter: The file format this file is in. Defaults to raw. This will be used in file transform operations.
     * @param    notifications    Optional parameter: The URI to notify when the import is complete. This can be an email address or http URL. If a URL is given, a GET will be made to this address. URL templating is supported. Valid template values are: ${NAME}, ${SOURCE_FORMAT}, ${DEST_FORMAT}, ${STATUS}
     * @return	Returns the void response from the API call 
     */
    public void uploadFileItemAsync(
                final File fileToUpload,
                final String path,
                final String systemId,
                final String fileName,
                final String fileType,
                final String notifications,
                final APICallBack<FileInfo> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4727281290261062261L;
            {
                    put( "path", path );
                    put( "systemId", systemId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4931846294661395692L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5528592257012556616L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4994139706143649542L;
            {
                    put( "fileToUpload", fileToUpload );
                    put( "fileName", fileName );
                    put( "fileType", fileType );
                    put( "notifications", notifications );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

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
                            FileInfo result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FileInfo>(){});

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
     * Perform an action on a file or folder.
     * @param    body    Required parameter: The operation to perform. 
     * @param    systemId    Required parameter: The unique id of the system on which the data resides.
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void updateInvokeFileItemActionAsync(
                final FileAction body,
                final String systemId,
                final String path,
                final APICallBack<LinkedHashMap<String, Object>> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5313073323791940334L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5746408888507524646L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5440691668523032623L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "accept", "application/json" );
                    put( "content-type", "application/json; charset=utf-8" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().putBody(queryUrl, headers, APIHelper.serialize(body));

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
                            LinkedHashMap<String, Object> result = APIHelper.deserialize(((HttpStringResponse)response).getBody());

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
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
     * Get a remote directory listing on a specific system.
     * @param    systemId    Required parameter: The unique id of the system on which the data resides.
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void listFileItemsAsync(
                final String systemId,
                final Integer limit,
                final Integer offset,
                final String path,
                final APICallBack<List<FileInfo>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/listings/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5541923094341334837L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4684429718255031108L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4631022641877763330L;
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
                            List<FileInfo> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<FileInfo>>(){});

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
     * Update permissions for a single user on their default storage system.
     * @param    body    Required parameter: The permission add or update. 
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void updateFileItemPermissionsOnDefaultSystemAsync(
                final FilePermissionRequest body,
                final String path,
                final APICallBack<FilePermission> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/pems/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5752003522243121017L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5664145313478615311L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4654361649406417856L;
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
                            FilePermission result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FilePermission>(){});

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
     * Update permissions for a single user.
     * @param    body    Required parameter: The updated permission value
     * @param    systemId    Required parameter: The id of the system on which the file resides
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void updateFileItemPermissionAsync(
                final PermissionRequest body,
                final String systemId,
                final String path,
                final APICallBack<FilePermission> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/pems/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5336598935574146190L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5723807151417787144L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4711152128993789000L;
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
                            FilePermission result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FilePermission>(){});

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
     * Download a file from the user's default storage location.
     * @param    filePath    Required parameter: The path of the file relative to the given system root location.
     * @param    systemId    Required parameter: The system on which the file item resides
     * @param    created    Optional parameter: The date the event occurred
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    status    Optional parameter: The status of the event
     * @return	Returns the void response from the API call 
     */
    public void listFileItemHistoryAsync(
                final String filePath,
                final String systemId,
                final String created,
                final Integer limit,
                final Integer offset,
                final String status,
                final APICallBack<HistoryEvent> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/history/system/{systemId}/{filePath}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5739780576917575343L;
            {
                    put( "filePath", filePath );
                    put( "systemId", systemId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5714199121609658102L;
            {
                    put( "naked", true );
                    put( "created", created );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
                    put( "status", status );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5746198493839623049L;
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
                            HistoryEvent result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<HistoryEvent>(){});

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
     * List event history of a file item on the user's default storage system
     * @param    created    Optional parameter: The date the event occurred
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @param    status    Optional parameter: The event status
     * @return	Returns the void response from the API call 
     */
    public void listFileItemHistoryOnDefaultSystemAsync(
                final String created,
                final Integer limit,
                final Integer offset,
                final String path,
                final String status,
                final APICallBack<List<HistoryEvent>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/history/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5713501018128541156L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4892775362015943645L;
            {
                    put( "naked", true );
                    put( "created", created );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
                    put( "status", status );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4895281221457864024L;
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
                            List<HistoryEvent> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<HistoryEvent>>(){});

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
     * Deletes a file or folder at the specified path on the specified remote system.
     * @param    path    Required parameter: The path of the file relative to the user's default storage location.
     * @param    systemId    Required parameter: The unique id of the system on which the data resides.
     * @return	Returns the void response from the API call 
     */
    public void deleteFileItemAsync(
                final String path,
                final String systemId,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5079227510705176478L;
            {
                    put( "path", path );
                    put( "systemId", systemId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4956706759215144577L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5060644593365917169L;
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
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
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
     * Deletes all permissions on a file except those of the owner.
     * @param    systemId    Required parameter: The id of the system on which the file item lives.
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void deleteClearFileItemPermissionsAsync(
                final String systemId,
                final String path,
                final APICallBack<Object> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/pems/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5718804458425018942L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5218716840875193157L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4687031013643002034L;
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
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
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
     * Download a file from the given system
     * @param    path    Required parameter: The path of the file relative to the user's default storage location.
     * @param    systemId    Required parameter: The unique id of the system on which the data resides.
     * @param    force    Optional parameter: Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download.
     * @return	Returns the void response from the API call 
     */
    public void getDownloadFileItemAsync(
                final String path,
                final String systemId,
                final Boolean force,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5037260201571461030L;
            {
                    put( "path", path );
                    put( "systemId", systemId );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5383662636668943937L;
            {
                    put( "force", (null != force) ? force : false );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5338333149261907126L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            InputStream result = response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(context, result);
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
     * Download a file from the user's default storage location.
     * @param    path    Required parameter: The path of the file relative to the user's default storage location.
     * @param    force    Optional parameter: Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download.
     * @return	Returns the void response from the API call 
     */
    public void getDownloadFileItemOnDefaultSystemAsync(
                final String path,
                final Boolean force,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4766897935626754255L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4984066003139091943L;
            {
                    put( "force", (null != force) ? force : false );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5575231260929280904L;
            {
                    put( "user-agent", "agave-client-sdk" );
                    put( "Authorization", String.format("Bearer %1$s", Configuration.oAuthAccessToken) );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = getClientInstance().get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", context);

                            //handle errors defined at the API level
                            validateResponse(response, context);

                            //extract result from the http response
                            InputStream result = response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(context, result);
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
     * Get a remote directory listing on the user's default storage system
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void listFileItemsOnDefaultSystemAsync(
                final Integer limit,
                final Integer offset,
                final String path,
                final APICallBack<List<FileInfo>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/listings/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5621548828060211684L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5691675371088319018L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5639569576123513363L;
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
                            List<FileInfo> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<FileInfo>>(){});

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
     * List all the share permissions for a file or folder.
     * @param    systemId    Required parameter: The system id
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void listFileItemPermissionsAsync(
                final String systemId,
                final Integer limit,
                final Integer offset,
                final String path,
                final APICallBack<List<FilePermission>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/pems/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5332740123393937645L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5276926168868635907L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4937173319166867099L;
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
                            List<FilePermission> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<FilePermission>>(){});

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
     * List all the share permissions for a file or folder.
     * @param    limit    Optional parameter: The maximum number of results returned from this query
     * @param    offset    Optional parameter: The number of results skipped in the result set returned from this query
     * @param    path    Optional parameter: The path of the file relative to the user's default storage location.
     * @return	Returns the void response from the API call 
     */
    public void listFileItemPermissionsOnDefaultSystemAsync(
                final Integer limit,
                final Integer offset,
                final String path,
                final APICallBack<List<FilePermission>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/pems/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4749317696243677006L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5197861824657021090L;
            {
                    put( "naked", true );
                    put( "limit", (null != limit) ? limit : 100 );
                    put( "offset", (null != offset) ? offset : 0 );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5127725840277456535L;
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
                            List<FilePermission> result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<List<FilePermission>>(){});

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
     * Import file item from a remote URL to the target system
     * @param    body    Required parameter: The import request
     * @param    systemId    Required parameter: The id of the system.
     * @param    path    Optional parameter: The relative or absolute path where the file item should be imported
     * @return	Returns the void response from the API call 
     */
    public void createImportFileItemAsync(
                final FileImportRequest body,
                final String systemId,
                final String path,
                final APICallBack<FileInfo> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/system/{systemId}/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4925827543781059863L;
            {
                    put( "systemId", systemId );
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5022645698442173635L;
            {
                    put( "naked", true );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4995991452564451803L;
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
                            FileInfo result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FileInfo>(){});

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
     * Import file item from a remote URL to the target system
     * @param    body    Required parameter: The import request
     * @param    path    Optional parameter: The relative or absolute path where the file item should be imported
     * @return	Returns the void response from the API call 
     */
    public void createImportFileItemToDefaultSystemAsync(
                final FileImportRequest body,
                final String path,
                final APICallBack<FileInfo> callBack
    ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/files/v2/media/{path}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4713921625242194317L;
            {
                    put( "path", path );
            }});

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4735040217207707969L;
            {
                    put( "naked", "true" );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5681041299597078067L;
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
                            FileInfo result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<FileInfo>(){});

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