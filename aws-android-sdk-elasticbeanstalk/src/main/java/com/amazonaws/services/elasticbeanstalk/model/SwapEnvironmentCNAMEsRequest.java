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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Swaps the CNAMEs of two environments.
 * </p>
 */
public class SwapEnvironmentCNAMEsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentId</code>, you must specify the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     */
    private String sourceEnvironmentId;

    /**
     * <p>
     * The name of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentName</code>, you must specify the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String sourceEnvironmentName;

    /**
     * <p>
     * The ID of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentId</code> with the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     */
    private String destinationEnvironmentId;

    /**
     * <p>
     * The name of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentName</code> with the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     */
    private String destinationEnvironmentName;

    /**
     * <p>
     * The ID of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentId</code>, you must specify the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     *
     * @return <p>
     *         The ID of the source environment.
     *         </p>
     *         <p>
     *         Condition: You must specify at least the
     *         <code>SourceEnvironmentID</code> or the
     *         <code>SourceEnvironmentName</code>. You may also specify both. If
     *         you specify the <code>SourceEnvironmentId</code>, you must
     *         specify the <code>DestinationEnvironmentId</code>.
     *         </p>
     */
    public String getSourceEnvironmentId() {
        return sourceEnvironmentId;
    }

    /**
     * <p>
     * The ID of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentId</code>, you must specify the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     *
     * @param sourceEnvironmentId <p>
     *            The ID of the source environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>SourceEnvironmentID</code> or the
     *            <code>SourceEnvironmentName</code>. You may also specify both.
     *            If you specify the <code>SourceEnvironmentId</code>, you must
     *            specify the <code>DestinationEnvironmentId</code>.
     *            </p>
     */
    public void setSourceEnvironmentId(String sourceEnvironmentId) {
        this.sourceEnvironmentId = sourceEnvironmentId;
    }

    /**
     * <p>
     * The ID of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentId</code>, you must specify the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEnvironmentId <p>
     *            The ID of the source environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>SourceEnvironmentID</code> or the
     *            <code>SourceEnvironmentName</code>. You may also specify both.
     *            If you specify the <code>SourceEnvironmentId</code>, you must
     *            specify the <code>DestinationEnvironmentId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SwapEnvironmentCNAMEsRequest withSourceEnvironmentId(String sourceEnvironmentId) {
        this.sourceEnvironmentId = sourceEnvironmentId;
        return this;
    }

    /**
     * <p>
     * The name of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentName</code>, you must specify the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the source environment.
     *         </p>
     *         <p>
     *         Condition: You must specify at least the
     *         <code>SourceEnvironmentID</code> or the
     *         <code>SourceEnvironmentName</code>. You may also specify both. If
     *         you specify the <code>SourceEnvironmentName</code>, you must
     *         specify the <code>DestinationEnvironmentName</code>.
     *         </p>
     */
    public String getSourceEnvironmentName() {
        return sourceEnvironmentName;
    }

    /**
     * <p>
     * The name of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentName</code>, you must specify the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param sourceEnvironmentName <p>
     *            The name of the source environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>SourceEnvironmentID</code> or the
     *            <code>SourceEnvironmentName</code>. You may also specify both.
     *            If you specify the <code>SourceEnvironmentName</code>, you
     *            must specify the <code>DestinationEnvironmentName</code>.
     *            </p>
     */
    public void setSourceEnvironmentName(String sourceEnvironmentName) {
        this.sourceEnvironmentName = sourceEnvironmentName;
    }

    /**
     * <p>
     * The name of the source environment.
     * </p>
     * <p>
     * Condition: You must specify at least the <code>SourceEnvironmentID</code>
     * or the <code>SourceEnvironmentName</code>. You may also specify both. If
     * you specify the <code>SourceEnvironmentName</code>, you must specify the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param sourceEnvironmentName <p>
     *            The name of the source environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>SourceEnvironmentID</code> or the
     *            <code>SourceEnvironmentName</code>. You may also specify both.
     *            If you specify the <code>SourceEnvironmentName</code>, you
     *            must specify the <code>DestinationEnvironmentName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SwapEnvironmentCNAMEsRequest withSourceEnvironmentName(String sourceEnvironmentName) {
        this.sourceEnvironmentName = sourceEnvironmentName;
        return this;
    }

    /**
     * <p>
     * The ID of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentId</code> with the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     *
     * @return <p>
     *         The ID of the destination environment.
     *         </p>
     *         <p>
     *         Condition: You must specify at least the
     *         <code>DestinationEnvironmentID</code> or the
     *         <code>DestinationEnvironmentName</code>. You may also specify
     *         both. You must specify the <code>SourceEnvironmentId</code> with
     *         the <code>DestinationEnvironmentId</code>.
     *         </p>
     */
    public String getDestinationEnvironmentId() {
        return destinationEnvironmentId;
    }

    /**
     * <p>
     * The ID of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentId</code> with the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     *
     * @param destinationEnvironmentId <p>
     *            The ID of the destination environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>DestinationEnvironmentID</code> or the
     *            <code>DestinationEnvironmentName</code>. You may also specify
     *            both. You must specify the <code>SourceEnvironmentId</code>
     *            with the <code>DestinationEnvironmentId</code>.
     *            </p>
     */
    public void setDestinationEnvironmentId(String destinationEnvironmentId) {
        this.destinationEnvironmentId = destinationEnvironmentId;
    }

    /**
     * <p>
     * The ID of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentId</code> with the
     * <code>DestinationEnvironmentId</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationEnvironmentId <p>
     *            The ID of the destination environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>DestinationEnvironmentID</code> or the
     *            <code>DestinationEnvironmentName</code>. You may also specify
     *            both. You must specify the <code>SourceEnvironmentId</code>
     *            with the <code>DestinationEnvironmentId</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SwapEnvironmentCNAMEsRequest withDestinationEnvironmentId(String destinationEnvironmentId) {
        this.destinationEnvironmentId = destinationEnvironmentId;
        return this;
    }

    /**
     * <p>
     * The name of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentName</code> with the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @return <p>
     *         The name of the destination environment.
     *         </p>
     *         <p>
     *         Condition: You must specify at least the
     *         <code>DestinationEnvironmentID</code> or the
     *         <code>DestinationEnvironmentName</code>. You may also specify
     *         both. You must specify the <code>SourceEnvironmentName</code>
     *         with the <code>DestinationEnvironmentName</code>.
     *         </p>
     */
    public String getDestinationEnvironmentName() {
        return destinationEnvironmentName;
    }

    /**
     * <p>
     * The name of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentName</code> with the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param destinationEnvironmentName <p>
     *            The name of the destination environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>DestinationEnvironmentID</code> or the
     *            <code>DestinationEnvironmentName</code>. You may also specify
     *            both. You must specify the <code>SourceEnvironmentName</code>
     *            with the <code>DestinationEnvironmentName</code>.
     *            </p>
     */
    public void setDestinationEnvironmentName(String destinationEnvironmentName) {
        this.destinationEnvironmentName = destinationEnvironmentName;
    }

    /**
     * <p>
     * The name of the destination environment.
     * </p>
     * <p>
     * Condition: You must specify at least the
     * <code>DestinationEnvironmentID</code> or the
     * <code>DestinationEnvironmentName</code>. You may also specify both. You
     * must specify the <code>SourceEnvironmentName</code> with the
     * <code>DestinationEnvironmentName</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 40<br/>
     *
     * @param destinationEnvironmentName <p>
     *            The name of the destination environment.
     *            </p>
     *            <p>
     *            Condition: You must specify at least the
     *            <code>DestinationEnvironmentID</code> or the
     *            <code>DestinationEnvironmentName</code>. You may also specify
     *            both. You must specify the <code>SourceEnvironmentName</code>
     *            with the <code>DestinationEnvironmentName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SwapEnvironmentCNAMEsRequest withDestinationEnvironmentName(
            String destinationEnvironmentName) {
        this.destinationEnvironmentName = destinationEnvironmentName;
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
        if (getSourceEnvironmentId() != null)
            sb.append("SourceEnvironmentId: " + getSourceEnvironmentId() + ",");
        if (getSourceEnvironmentName() != null)
            sb.append("SourceEnvironmentName: " + getSourceEnvironmentName() + ",");
        if (getDestinationEnvironmentId() != null)
            sb.append("DestinationEnvironmentId: " + getDestinationEnvironmentId() + ",");
        if (getDestinationEnvironmentName() != null)
            sb.append("DestinationEnvironmentName: " + getDestinationEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceEnvironmentId() == null) ? 0 : getSourceEnvironmentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceEnvironmentName() == null) ? 0 : getSourceEnvironmentName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationEnvironmentId() == null) ? 0 : getDestinationEnvironmentId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationEnvironmentName() == null) ? 0 : getDestinationEnvironmentName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SwapEnvironmentCNAMEsRequest == false)
            return false;
        SwapEnvironmentCNAMEsRequest other = (SwapEnvironmentCNAMEsRequest) obj;

        if (other.getSourceEnvironmentId() == null ^ this.getSourceEnvironmentId() == null)
            return false;
        if (other.getSourceEnvironmentId() != null
                && other.getSourceEnvironmentId().equals(this.getSourceEnvironmentId()) == false)
            return false;
        if (other.getSourceEnvironmentName() == null ^ this.getSourceEnvironmentName() == null)
            return false;
        if (other.getSourceEnvironmentName() != null
                && other.getSourceEnvironmentName().equals(this.getSourceEnvironmentName()) == false)
            return false;
        if (other.getDestinationEnvironmentId() == null
                ^ this.getDestinationEnvironmentId() == null)
            return false;
        if (other.getDestinationEnvironmentId() != null
                && other.getDestinationEnvironmentId().equals(this.getDestinationEnvironmentId()) == false)
            return false;
        if (other.getDestinationEnvironmentName() == null
                ^ this.getDestinationEnvironmentName() == null)
            return false;
        if (other.getDestinationEnvironmentName() != null
                && other.getDestinationEnvironmentName().equals(
                        this.getDestinationEnvironmentName()) == false)
            return false;
        return true;
    }
}
