/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Creates or updates an app.
 */
public class CreateAppRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Application Request.
     */
    private CreateApplicationRequest createApplicationRequest;

    /**
     * Application Request.
     *
     * @return Application Request.
     */
    public CreateApplicationRequest getCreateApplicationRequest() {
        return createApplicationRequest;
    }

    /**
     * Application Request.
     *
     * @param createApplicationRequest Application Request.
     */
    public void setCreateApplicationRequest(CreateApplicationRequest createApplicationRequest) {
        this.createApplicationRequest = createApplicationRequest;
    }

    /**
     * Application Request.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createApplicationRequest Application Request.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppRequest withCreateApplicationRequest(
            CreateApplicationRequest createApplicationRequest) {
        this.createApplicationRequest = createApplicationRequest;
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
        if (getCreateApplicationRequest() != null)
            sb.append("CreateApplicationRequest: " + getCreateApplicationRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCreateApplicationRequest() == null) ? 0 : getCreateApplicationRequest()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppRequest == false)
            return false;
        CreateAppRequest other = (CreateAppRequest) obj;

        if (other.getCreateApplicationRequest() == null
                ^ this.getCreateApplicationRequest() == null)
            return false;
        if (other.getCreateApplicationRequest() != null
                && other.getCreateApplicationRequest().equals(this.getCreateApplicationRequest()) == false)
            return false;
        return true;
    }
}
