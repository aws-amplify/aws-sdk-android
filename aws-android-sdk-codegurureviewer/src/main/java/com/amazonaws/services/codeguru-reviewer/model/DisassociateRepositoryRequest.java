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
package com.amazonaws.services.codeguru-reviewer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Removes the association between Amazon CodeGuru Reviewer and a repository.</p>
 */
public class DisassociateRepositoryRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The Amazon Resource Name (ARN) identifying the association.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     */
    private String associationArn;

    /**
     * <p>The Amazon Resource Name (ARN) identifying the association.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @return <p>The Amazon Resource Name (ARN) identifying the association.</p>
     */
    public String getAssociationArn() {
        return associationArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) identifying the association.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param associationArn <p>The Amazon Resource Name (ARN) identifying the association.</p>
     */
    public void setAssociationArn(String associationArn) {
        this.associationArn = associationArn;
    }

    /**
     * <p>The Amazon Resource Name (ARN) identifying the association.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:aws[^:\s]*:codeguru-reviewer:[^:\s]+:[\d]{12}:[a-z-]+:[\w-]+$<br/>
     *
     * @param associationArn <p>The Amazon Resource Name (ARN) identifying the association.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DisassociateRepositoryRequest withAssociationArn(String associationArn) {
        this.associationArn = associationArn;
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
        if (getAssociationArn() != null) sb.append("AssociationArn: " + getAssociationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationArn() == null) ? 0 : getAssociationArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisassociateRepositoryRequest == false) return false;
        DisassociateRepositoryRequest other = (DisassociateRepositoryRequest)obj;

        if (other.getAssociationArn() == null ^ this.getAssociationArn() == null) return false;
        if (other.getAssociationArn() != null && other.getAssociationArn().equals(this.getAssociationArn()) == false) return false;
        return true;
    }
}
