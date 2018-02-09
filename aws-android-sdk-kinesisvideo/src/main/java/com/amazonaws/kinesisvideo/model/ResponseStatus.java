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

public class ResponseStatus {
    private final String protocol;
    private final int statusCode;
    private final String reason;
    
    ResponseStatus(ResponseStatusBuilder builder) {
        this.protocol = builder.protocol;
        this.statusCode = builder.statusCode;
        this.reason = builder.reason;
    }
    
    public static ResponseStatusBuilder builder() {
        return new ResponseStatusBuilder();
    }
    
    public static class ResponseStatusBuilder {
        private String protocol;
        private int statusCode;
        private String reason;
        
        ResponseStatusBuilder() { }
        
        public ResponseStatusBuilder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        
        public ResponseStatusBuilder statusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        
        public ResponseStatusBuilder reason(String reason) {
            this.reason = reason;
            return this;
        }
        
        public ResponseStatus build() {
            return new ResponseStatus(this);
        }
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ResponseStatus [protocol=" + protocol + ", statusCode=" + statusCode + ", reason=" + reason + ", super=" + super.toString() + "]";
    }
    /**
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }
    /**
     * @return the statusCode
     */
    public int getStatusCode() {
        return statusCode;
    }
    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }
}
