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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes resources linked to an external ID.
 * </p>
 */
public class DeleteResourcesByExternalIdRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation
     * stack ID) that is linked to one or more CodeDeploy resources.
     * </p>
     */
    private String externalId;

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation
     * stack ID) that is linked to one or more CodeDeploy resources.
     * </p>
     *
     * @return <p>
     *         The unique ID of an external resource (for example, a
     *         CloudFormation stack ID) that is linked to one or more CodeDeploy
     *         resources.
     *         </p>
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation
     * stack ID) that is linked to one or more CodeDeploy resources.
     * </p>
     *
     * @param externalId <p>
     *            The unique ID of an external resource (for example, a
     *            CloudFormation stack ID) that is linked to one or more
     *            CodeDeploy resources.
     *            </p>
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The unique ID of an external resource (for example, a CloudFormation
     * stack ID) that is linked to one or more CodeDeploy resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param externalId <p>
     *            The unique ID of an external resource (for example, a
     *            CloudFormation stack ID) that is linked to one or more
     *            CodeDeploy resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteResourcesByExternalIdRequest withExternalId(String externalId) {
        this.externalId = externalId;
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
        if (getExternalId() != null)
            sb.append("externalId: " + getExternalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcesByExternalIdRequest == false)
            return false;
        DeleteResourcesByExternalIdRequest other = (DeleteResourcesByExternalIdRequest) obj;

        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        return true;
    }
}
