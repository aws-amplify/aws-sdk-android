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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

public class AssociateS3ResourcesResult implements Serializable {
    /**
     * <p>
     * S3 resources that couldn't be associated with Amazon Macie Classic. An
     * error code and an error message are provided for each failed item.
     * </p>
     */
    private java.util.List<FailedS3Resource> failedS3Resources;

    /**
     * <p>
     * S3 resources that couldn't be associated with Amazon Macie Classic. An
     * error code and an error message are provided for each failed item.
     * </p>
     *
     * @return <p>
     *         S3 resources that couldn't be associated with Amazon Macie
     *         Classic. An error code and an error message are provided for each
     *         failed item.
     *         </p>
     */
    public java.util.List<FailedS3Resource> getFailedS3Resources() {
        return failedS3Resources;
    }

    /**
     * <p>
     * S3 resources that couldn't be associated with Amazon Macie Classic. An
     * error code and an error message are provided for each failed item.
     * </p>
     *
     * @param failedS3Resources <p>
     *            S3 resources that couldn't be associated with Amazon Macie
     *            Classic. An error code and an error message are provided for
     *            each failed item.
     *            </p>
     */
    public void setFailedS3Resources(java.util.Collection<FailedS3Resource> failedS3Resources) {
        if (failedS3Resources == null) {
            this.failedS3Resources = null;
            return;
        }

        this.failedS3Resources = new java.util.ArrayList<FailedS3Resource>(failedS3Resources);
    }

    /**
     * <p>
     * S3 resources that couldn't be associated with Amazon Macie Classic. An
     * error code and an error message are provided for each failed item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedS3Resources <p>
     *            S3 resources that couldn't be associated with Amazon Macie
     *            Classic. An error code and an error message are provided for
     *            each failed item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateS3ResourcesResult withFailedS3Resources(FailedS3Resource... failedS3Resources) {
        if (getFailedS3Resources() == null) {
            this.failedS3Resources = new java.util.ArrayList<FailedS3Resource>(
                    failedS3Resources.length);
        }
        for (FailedS3Resource value : failedS3Resources) {
            this.failedS3Resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * S3 resources that couldn't be associated with Amazon Macie Classic. An
     * error code and an error message are provided for each failed item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedS3Resources <p>
     *            S3 resources that couldn't be associated with Amazon Macie
     *            Classic. An error code and an error message are provided for
     *            each failed item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateS3ResourcesResult withFailedS3Resources(
            java.util.Collection<FailedS3Resource> failedS3Resources) {
        setFailedS3Resources(failedS3Resources);
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
        if (getFailedS3Resources() != null)
            sb.append("failedS3Resources: " + getFailedS3Resources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFailedS3Resources() == null) ? 0 : getFailedS3Resources().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateS3ResourcesResult == false)
            return false;
        AssociateS3ResourcesResult other = (AssociateS3ResourcesResult) obj;

        if (other.getFailedS3Resources() == null ^ this.getFailedS3Resources() == null)
            return false;
        if (other.getFailedS3Resources() != null
                && other.getFailedS3Resources().equals(this.getFailedS3Resources()) == false)
            return false;
        return true;
    }
}
