/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.model;

import java.io.InputStream;
import java.util.Map;

/**
 * Response object which is parsed from the http response to status line, headers and the body.
 */
public class Response {

    /**
     * Status line with status code and reason. Eg :400, 404, etc
     */
    private final ResponseStatus responseStatus;

    /**
     * Key value pair of all the headers in the response.
     */
    private final Map<String, String> responseHeaders;

    /**
     * Response body as string if the response contains text response.
     */
    private final String responseBody;

    /**
     * Response as the raw input stream.
     */
    private final InputStream responsePayload;
    
    Response(ResponseBuilder builder) {
        this.responseStatus = builder.responseStatus;
        this.responseHeaders = builder.responseHeaders;
        this.responseBody = builder.responseBody;
        this.responsePayload = builder.responsePayload;
    }
    
    public static ResponseBuilder builder() {
        return new ResponseBuilder();
    }

    public static class ResponseBuilder {
        private ResponseStatus responseStatus;
        private Map<String, String> responseHeaders;
        private String responseBody;
        private InputStream responsePayload;
        
        ResponseBuilder() { }
        
        public ResponseBuilder responseStatus(ResponseStatus responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }
        
        public ResponseBuilder responseHeaders(Map<String, String> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        
        public ResponseBuilder responseBody(String responseBody) {
            this.responseBody = responseBody;
            return this;
        }
        
        public ResponseBuilder responsePayload(InputStream responsePayload) {
            this.responsePayload = responsePayload;
            return this;
        }
        
        public Response build() {
            return new Response(this);
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Response [responseStatus=" + responseStatus + ", responseHeaders=" + responseHeaders + ", super=" + super.toString() + "]";
    }

    /**
     * @return the responseStatus
     */
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    /**
     * @return the responseHeaders
     */
    public Map<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * @return the responseBody
     */
    public String getResponseBody() {
        return responseBody;
    }

    /**
     * @return the responsePayload
     */
    public InputStream getResponsePayload() {
        return responsePayload;
    }
}
