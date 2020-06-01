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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the workgroup with the specified name. The primary workgroup cannot
 * be deleted.
 * </p>
 */
public class DeleteWorkGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     */
    private String workGroup;

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup
     * contains any named queries.
     * </p>
     */
    private Boolean recursiveDeleteOption;

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @return <p>
     *         The unique name of the workgroup to delete.
     *         </p>
     */
    public String getWorkGroup() {
        return workGroup;
    }

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The unique name of the workgroup to delete.
     *            </p>
     */
    public void setWorkGroup(String workGroup) {
        this.workGroup = workGroup;
    }

    /**
     * <p>
     * The unique name of the workgroup to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9._-]{1,128}<br/>
     *
     * @param workGroup <p>
     *            The unique name of the workgroup to delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteWorkGroupRequest withWorkGroup(String workGroup) {
        this.workGroup = workGroup;
        return this;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup
     * contains any named queries.
     * </p>
     *
     * @return <p>
     *         The option to delete the workgroup and its contents even if the
     *         workgroup contains any named queries.
     *         </p>
     */
    public Boolean isRecursiveDeleteOption() {
        return recursiveDeleteOption;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup
     * contains any named queries.
     * </p>
     *
     * @return <p>
     *         The option to delete the workgroup and its contents even if the
     *         workgroup contains any named queries.
     *         </p>
     */
    public Boolean getRecursiveDeleteOption() {
        return recursiveDeleteOption;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup
     * contains any named queries.
     * </p>
     *
     * @param recursiveDeleteOption <p>
     *            The option to delete the workgroup and its contents even if
     *            the workgroup contains any named queries.
     *            </p>
     */
    public void setRecursiveDeleteOption(Boolean recursiveDeleteOption) {
        this.recursiveDeleteOption = recursiveDeleteOption;
    }

    /**
     * <p>
     * The option to delete the workgroup and its contents even if the workgroup
     * contains any named queries.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recursiveDeleteOption <p>
     *            The option to delete the workgroup and its contents even if
     *            the workgroup contains any named queries.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteWorkGroupRequest withRecursiveDeleteOption(Boolean recursiveDeleteOption) {
        this.recursiveDeleteOption = recursiveDeleteOption;
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
        if (getWorkGroup() != null)
            sb.append("WorkGroup: " + getWorkGroup() + ",");
        if (getRecursiveDeleteOption() != null)
            sb.append("RecursiveDeleteOption: " + getRecursiveDeleteOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroup() == null) ? 0 : getWorkGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getRecursiveDeleteOption() == null) ? 0 : getRecursiveDeleteOption().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteWorkGroupRequest == false)
            return false;
        DeleteWorkGroupRequest other = (DeleteWorkGroupRequest) obj;

        if (other.getWorkGroup() == null ^ this.getWorkGroup() == null)
            return false;
        if (other.getWorkGroup() != null
                && other.getWorkGroup().equals(this.getWorkGroup()) == false)
            return false;
        if (other.getRecursiveDeleteOption() == null ^ this.getRecursiveDeleteOption() == null)
            return false;
        if (other.getRecursiveDeleteOption() != null
                && other.getRecursiveDeleteOption().equals(this.getRecursiveDeleteOption()) == false)
            return false;
        return true;
    }
}
