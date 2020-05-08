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
 * Gets information about a specific work team. You can see information such as
 * the create date, the last updated date, membership information, and the work
 * team's Amazon Resource Name (ARN).
 * </p>
 */
public class DescribeWorkteamRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the work team to return a description of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String workteamName;

    /**
     * <p>
     * The name of the work team to return a description of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the work team to return a description of.
     *         </p>
     */
    public String getWorkteamName() {
        return workteamName;
    }

    /**
     * <p>
     * The name of the work team to return a description of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team to return a description of.
     *            </p>
     */
    public void setWorkteamName(String workteamName) {
        this.workteamName = workteamName;
    }

    /**
     * <p>
     * The name of the work team to return a description of.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param workteamName <p>
     *            The name of the work team to return a description of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeWorkteamRequest withWorkteamName(String workteamName) {
        this.workteamName = workteamName;
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
        if (getWorkteamName() != null)
            sb.append("WorkteamName: " + getWorkteamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWorkteamName() == null) ? 0 : getWorkteamName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkteamRequest == false)
            return false;
        DescribeWorkteamRequest other = (DescribeWorkteamRequest) obj;

        if (other.getWorkteamName() == null ^ this.getWorkteamName() == null)
            return false;
        if (other.getWorkteamName() != null
                && other.getWorkteamName().equals(this.getWorkteamName()) == false)
            return false;
        return true;
    }
}
