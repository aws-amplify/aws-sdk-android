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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetWorkflowResult implements Serializable {
    /**
     * <p>
     * The resource metadata for the workflow.
     * </p>
     */
    private Workflow workflow;

    /**
     * <p>
     * The resource metadata for the workflow.
     * </p>
     *
     * @return <p>
     *         The resource metadata for the workflow.
     *         </p>
     */
    public Workflow getWorkflow() {
        return workflow;
    }

    /**
     * <p>
     * The resource metadata for the workflow.
     * </p>
     *
     * @param workflow <p>
     *            The resource metadata for the workflow.
     *            </p>
     */
    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    /**
     * <p>
     * The resource metadata for the workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workflow <p>
     *            The resource metadata for the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetWorkflowResult withWorkflow(Workflow workflow) {
        this.workflow = workflow;
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
        if (getWorkflow() != null)
            sb.append("Workflow: " + getWorkflow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflow() == null) ? 0 : getWorkflow().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWorkflowResult == false)
            return false;
        GetWorkflowResult other = (GetWorkflowResult) obj;

        if (other.getWorkflow() == null ^ this.getWorkflow() == null)
            return false;
        if (other.getWorkflow() != null && other.getWorkflow().equals(this.getWorkflow()) == false)
            return false;
        return true;
    }
}
