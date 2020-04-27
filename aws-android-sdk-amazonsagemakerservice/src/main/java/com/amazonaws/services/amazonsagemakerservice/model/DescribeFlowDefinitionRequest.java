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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns information about the specified flow definition.
 * </p>
 */
public class DescribeFlowDefinitionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     */
    private String flowDefinitionName;

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @return <p>
     *         The name of the flow definition.
     *         </p>
     */
    public String getFlowDefinitionName() {
        return flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The name of the flow definition.
     *            </p>
     */
    public void setFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
    }

    /**
     * <p>
     * The name of the flow definition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](-*[a-z0-9])*<br/>
     *
     * @param flowDefinitionName <p>
     *            The name of the flow definition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFlowDefinitionRequest withFlowDefinitionName(String flowDefinitionName) {
        this.flowDefinitionName = flowDefinitionName;
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
        if (getFlowDefinitionName() != null)
            sb.append("FlowDefinitionName: " + getFlowDefinitionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlowDefinitionName() == null) ? 0 : getFlowDefinitionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowDefinitionRequest == false)
            return false;
        DescribeFlowDefinitionRequest other = (DescribeFlowDefinitionRequest) obj;

        if (other.getFlowDefinitionName() == null ^ this.getFlowDefinitionName() == null)
            return false;
        if (other.getFlowDefinitionName() != null
                && other.getFlowDefinitionName().equals(this.getFlowDefinitionName()) == false)
            return false;
        return true;
    }
}
