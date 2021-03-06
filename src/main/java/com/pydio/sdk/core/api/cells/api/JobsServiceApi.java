/*
 * Pydio Cells Rest API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pydio.sdk.core.api.cells.api;

import com.google.gson.reflect.TypeToken;
import com.pydio.sdk.core.api.cells.ApiCallback;
import com.pydio.sdk.core.api.cells.ApiClient;
import com.pydio.sdk.core.api.cells.ApiException;
import com.pydio.sdk.core.api.cells.ApiResponse;
import com.pydio.sdk.core.api.cells.Configuration;
import com.pydio.sdk.core.api.cells.Pair;
import com.pydio.sdk.core.api.cells.ProgressRequestBody;
import com.pydio.sdk.core.api.cells.ProgressResponseBody;
import com.pydio.sdk.core.api.cells.model.JobsCtrlCommand;
import com.pydio.sdk.core.api.cells.model.JobsCtrlCommandResponse;
import com.pydio.sdk.core.api.cells.model.JobsDeleteTasksRequest;
import com.pydio.sdk.core.api.cells.model.JobsDeleteTasksResponse;
import com.pydio.sdk.core.api.cells.model.JobsListJobsRequest;
import com.pydio.sdk.core.api.cells.model.RestUserJobRequest;
import com.pydio.sdk.core.api.cells.model.RestUserJobResponse;
import com.pydio.sdk.core.api.cells.model.RestUserJobsCollection;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobsServiceApi {
    private ApiClient apiClient;

    public JobsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for userControlJob
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to encode the request body object
     */
    public com.squareup.okhttp.Call userControlJobCall(JobsCtrlCommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/jobs/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call userControlJobValidateBeforeCall(JobsCtrlCommand body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling userControlJob(Async)");
        }
        

        com.squareup.okhttp.Call call = userControlJobCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send Control Commands to one or many jobs / tasks
     * 
     * @param body  (required)
     * @return JobsCtrlCommandResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public JobsCtrlCommandResponse userControlJob(JobsCtrlCommand body) throws ApiException {
        ApiResponse<JobsCtrlCommandResponse> resp = userControlJobWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send Control Commands to one or many jobs / tasks
     * 
     * @param body  (required)
     * @return ApiResponse&lt;JobsCtrlCommandResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public ApiResponse<JobsCtrlCommandResponse> userControlJobWithHttpInfo(JobsCtrlCommand body) throws ApiException {
        com.squareup.okhttp.Call call = userControlJobValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<JobsCtrlCommandResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send Control Commands to one or many jobs / tasks (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userControlJobAsync(JobsCtrlCommand body, final ApiCallback<JobsCtrlCommandResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = userControlJobValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobsCtrlCommandResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for userCreateJob
     * @param jobName  (required)
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to encode the request body object
     */
    public com.squareup.okhttp.Call userCreateJobCall(String jobName, RestUserJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/jobs/user/{JobName}"
                .replaceAll("\\{" + "JobName" + "\\}", apiClient.escapeString(jobName));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call userCreateJobValidateBeforeCall(String jobName, RestUserJobRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'jobName' is set
        if (jobName == null) {
            throw new ApiException("Missing the required parameter 'jobName' when calling userCreateJob(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling userCreateJob(Async)");
        }
        

        com.squareup.okhttp.Call call = userCreateJobCall(jobName, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a predefined job to be run directly
     * 
     * @param jobName  (required)
     * @param body  (required)
     * @return RestUserJobResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public RestUserJobResponse userCreateJob(String jobName, RestUserJobRequest body) throws ApiException {
        ApiResponse<RestUserJobResponse> resp = userCreateJobWithHttpInfo(jobName, body);
        return resp.getData();
    }

    /**
     * Create a predefined job to be run directly
     * 
     * @param jobName  (required)
     * @param body  (required)
     * @return ApiResponse&lt;RestUserJobResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public ApiResponse<RestUserJobResponse> userCreateJobWithHttpInfo(String jobName, RestUserJobRequest body) throws ApiException {
        com.squareup.okhttp.Call call = userCreateJobValidateBeforeCall(jobName, body, null, null);
        Type localVarReturnType = new TypeToken<RestUserJobResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a predefined job to be run directly (asynchronously)
     * 
     * @param jobName  (required)
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userCreateJobAsync(String jobName, RestUserJobRequest body, final ApiCallback<RestUserJobResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = userCreateJobValidateBeforeCall(jobName, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestUserJobResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for userDeleteTasks
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to encode the request body object
     */
    public com.squareup.okhttp.Call userDeleteTasksCall(JobsDeleteTasksRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/jobs/tasks/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call userDeleteTasksValidateBeforeCall(JobsDeleteTasksRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling userDeleteTasks(Async)");
        }
        

        com.squareup.okhttp.Call call = userDeleteTasksCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Send a control command to clean tasks on a given job
     * 
     * @param body  (required)
     * @return JobsDeleteTasksResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public JobsDeleteTasksResponse userDeleteTasks(JobsDeleteTasksRequest body) throws ApiException {
        ApiResponse<JobsDeleteTasksResponse> resp = userDeleteTasksWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Send a control command to clean tasks on a given job
     * 
     * @param body  (required)
     * @return ApiResponse&lt;JobsDeleteTasksResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public ApiResponse<JobsDeleteTasksResponse> userDeleteTasksWithHttpInfo(JobsDeleteTasksRequest body) throws ApiException {
        com.squareup.okhttp.Call call = userDeleteTasksValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<JobsDeleteTasksResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a control command to clean tasks on a given job (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userDeleteTasksAsync(JobsDeleteTasksRequest body, final ApiCallback<JobsDeleteTasksResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = userDeleteTasksValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobsDeleteTasksResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for userListJobs
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to encode the request body object
     */
    public com.squareup.okhttp.Call userListJobsCall(JobsListJobsRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/jobs/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call userListJobsValidateBeforeCall(JobsListJobsRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling userListJobs(Async)");
        }
        

        com.squareup.okhttp.Call call = userListJobsCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List jobs associated with current user
     * 
     * @param body  (required)
     * @return RestUserJobsCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public RestUserJobsCollection userListJobs(JobsListJobsRequest body) throws ApiException {
        ApiResponse<RestUserJobsCollection> resp = userListJobsWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * List jobs associated with current user
     * 
     * @param body  (required)
     * @return ApiResponse&lt;RestUserJobsCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot decode the response body
     */
    public ApiResponse<RestUserJobsCollection> userListJobsWithHttpInfo(JobsListJobsRequest body) throws ApiException {
        com.squareup.okhttp.Call call = userListJobsValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<RestUserJobsCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List jobs associated with current user (asynchronously)
     * 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userListJobsAsync(JobsListJobsRequest body, final ApiCallback<RestUserJobsCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = userListJobsValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestUserJobsCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
