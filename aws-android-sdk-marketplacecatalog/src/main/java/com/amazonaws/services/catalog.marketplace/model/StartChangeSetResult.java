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
package com.amazonaws.services.catalog.marketplace.model;

import java.io.Serializable;


public class StartChangeSetResult implements Serializable {
    /**
     * <p>Unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     */
    private String changeSetId;

    /**
     * <p>The ARN associated to the unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     */
    private String changeSetArn;

    /**
     * <p>Unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @return <p>Unique identifier generated for the request.</p>
     */
    public String getChangeSetId() {
        return changeSetId;
    }

    /**
     * <p>Unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>Unique identifier generated for the request.</p>
     */
    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>Unique identifier generated for the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[\w\-]+$<br/>
     *
     * @param changeSetId <p>Unique identifier generated for the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartChangeSetResult withChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
        return this;
    }

    /**
     * <p>The ARN associated to the unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @return <p>The ARN associated to the unique identifier generated for the request.</p>
     */
    public String getChangeSetArn() {
        return changeSetArn;
    }

    /**
     * <p>The ARN associated to the unique identifier generated for the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param changeSetArn <p>The ARN associated to the unique identifier generated for the request.</p>
     */
    public void setChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
    }

    /**
     * <p>The ARN associated to the unique identifier generated for the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9:*/-]+$<br/>
     *
     * @param changeSetArn <p>The ARN associated to the unique identifier generated for the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StartChangeSetResult withChangeSetArn(String changeSetArn) {
        this.changeSetArn = changeSetArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getChangeSetId() != null) sb.append("ChangeSetId: " + getChangeSetId() + ",");
        if (getChangeSetArn() != null) sb.append("ChangeSetArn: " + getChangeSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getChangeSetArn() == null) ? 0 : getChangeSetArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartChangeSetResult == false) return false;
        StartChangeSetResult other = (StartChangeSetResult)obj;

        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null) return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false) return false;
        if (other.getChangeSetArn() == null ^ this.getChangeSetArn() == null) return false;
        if (other.getChangeSetArn() != null && other.getChangeSetArn().equals(this.getChangeSetArn()) == false) return false;
        return true;
    }
}
