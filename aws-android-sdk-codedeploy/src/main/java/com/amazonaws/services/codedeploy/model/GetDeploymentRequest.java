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
 * Gets information about a deployment.
 * </p>
 * <note>
 * <p>
 * The <code>content</code> property of the <code>appSpecContent</code> object
 * in the returned revision is always null. Use
 * <code>GetApplicationRevision</code> and the <code>sha256</code> property of
 * the returned <code>appSpecContent</code> object to get the content of the
 * deployment’s AppSpec file.
 * </p>
 * </note>
 */
public class GetDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique ID of a deployment associated with the IAM user or AWS
     * account.
     * </p>
     */
    private String deploymentId;

    /**
     * <p>
     * The unique ID of a deployment associated with the IAM user or AWS
     * account.
     * </p>
     *
     * @return <p>
     *         The unique ID of a deployment associated with the IAM user or AWS
     *         account.
     *         </p>
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment associated with the IAM user or AWS
     * account.
     * </p>
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment associated with the IAM user or
     *            AWS account.
     *            </p>
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment associated with the IAM user or AWS
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentId <p>
     *            The unique ID of a deployment associated with the IAM user or
     *            AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentRequest withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
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
        if (getDeploymentId() != null)
            sb.append("deploymentId: " + getDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;

        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null
                && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        return true;
    }
}
