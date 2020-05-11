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


public class DescribeCodeReviewResult implements Serializable {
    /**
     * <p> Information about the code review. </p>
     */
    private CodeReview codeReview;

    /**
     * <p> Information about the code review. </p>
     *
     * @return <p> Information about the code review. </p>
     */
    public CodeReview getCodeReview() {
        return codeReview;
    }

    /**
     * <p> Information about the code review. </p>
     *
     * @param codeReview <p> Information about the code review. </p>
     */
    public void setCodeReview(CodeReview codeReview) {
        this.codeReview = codeReview;
    }

    /**
     * <p> Information about the code review. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeReview <p> Information about the code review. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DescribeCodeReviewResult withCodeReview(CodeReview codeReview) {
        this.codeReview = codeReview;
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
        if (getCodeReview() != null) sb.append("CodeReview: " + getCodeReview());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeReview() == null) ? 0 : getCodeReview().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCodeReviewResult == false) return false;
        DescribeCodeReviewResult other = (DescribeCodeReviewResult)obj;

        if (other.getCodeReview() == null ^ this.getCodeReview() == null) return false;
        if (other.getCodeReview() != null && other.getCodeReview().equals(this.getCodeReview()) == false) return false;
        return true;
    }
}
