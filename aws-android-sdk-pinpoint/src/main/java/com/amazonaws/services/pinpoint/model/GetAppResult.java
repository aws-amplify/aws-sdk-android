/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetAppResult implements Serializable {
    /**
     * Application Response.
     */
    private ApplicationResponse applicationResponse;

    /**
     * Application Response.
     *
     * @return Application Response.
     */
    public ApplicationResponse getApplicationResponse() {
        return applicationResponse;
    }

    /**
     * Application Response.
     *
     * @param applicationResponse Application Response.
     */
    public void setApplicationResponse(ApplicationResponse applicationResponse) {
        this.applicationResponse = applicationResponse;
    }

    /**
     * Application Response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationResponse Application Response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAppResult withApplicationResponse(ApplicationResponse applicationResponse) {
        this.applicationResponse = applicationResponse;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationResponse() != null)
            sb.append("ApplicationResponse: " + getApplicationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationResponse() == null) ? 0 : getApplicationResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppResult == false)
            return false;
        GetAppResult other = (GetAppResult) obj;

        if (other.getApplicationResponse() == null ^ this.getApplicationResponse() == null)
            return false;
        if (other.getApplicationResponse() != null
                && other.getApplicationResponse().equals(this.getApplicationResponse()) == false)
            return false;
        return true;
    }
}
