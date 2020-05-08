/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an endpoint. Amazon SageMaker frees up all of the resources that were
 * deployed when the endpoint was created.
 * </p>
 * <p>
 * Amazon SageMaker retires any custom KMS key grants associated with the
 * endpoint, meaning you don't need to use the <a href=
 * "http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html"
 * >RevokeGrant</a> API call.
 * </p>
 */
public class DeleteEndpointRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the endpoint that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointName;

    /**
     * <p>
     * The name of the endpoint that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint that you want to delete.
     *         </p>
     */
    public String getEndpointName() {
        return endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint that you want to delete.
     *            </p>
     */
    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the endpoint that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointName <p>
     *            The name of the endpoint that you want to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteEndpointRequest withEndpointName(String endpointName) {
        this.endpointName = endpointName;
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
        if (getEndpointName() != null)
            sb.append("EndpointName: " + getEndpointName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointRequest == false)
            return false;
        DeleteEndpointRequest other = (DeleteEndpointRequest) obj;

        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null
                && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        return true;
    }
}
