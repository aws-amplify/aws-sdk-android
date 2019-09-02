/**
 * COPYRIGHT:
 * <p>
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.kinesisvideo.model;

public class ResponseStatus {
    private final String protocol;
    private final int statusCode;
    private final String reason;

    ResponseStatus(final String protocol, final int statusCode, final String reason) {
        this.protocol = protocol;
        this.statusCode = statusCode;
        this.reason = reason;
    }


    public static class ResponseStatusBuilder {
        private String protocol;
        private int statusCode;
        private String reason;

        ResponseStatusBuilder() {
        }

        public ResponseStatusBuilder protocol(final String protocol) {
            this.protocol = protocol;
            return this;
        }

        public ResponseStatusBuilder statusCode(final int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ResponseStatusBuilder reason(final String reason) {
            this.reason = reason;
            return this;
        }

        public ResponseStatus build() {
            return new ResponseStatus(protocol, statusCode, reason);
        }

        @Override
        public String toString() {
            return "ResponseStatus.ResponseStatusBuilder(protocol=" + this.protocol + ", statusCode=" + this.statusCode + ", reason=" + this.reason + ")";
        }
    }

    public static ResponseStatusBuilder builder() {
        return new ResponseStatusBuilder();
    }

    public String getProtocol() {
        return this.protocol;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getReason() {
        return this.reason;
    }

    @Override
    public String toString() {
        return "ResponseStatus(protocol=" + this.getProtocol() + ", statusCode=" + this.getStatusCode() + ", reason=" + this.getReason() + ")";
    }
}
