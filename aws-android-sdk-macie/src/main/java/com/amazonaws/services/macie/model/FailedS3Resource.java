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

/**
 * <p>
 * Includes details about the failed S3 resources.
 * </p>
 */
public class FailedS3Resource implements Serializable {
    /**
     * <p>
     * The failed S3 resources.
     * </p>
     */
    private S3Resource failedItem;

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     */
    private String errorCode;

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     */
    private String errorMessage;

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     *
     * @return <p>
     *         The failed S3 resources.
     *         </p>
     */
    public S3Resource getFailedItem() {
        return failedItem;
    }

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     *
     * @param failedItem <p>
     *            The failed S3 resources.
     *            </p>
     */
    public void setFailedItem(S3Resource failedItem) {
        this.failedItem = failedItem;
    }

    /**
     * <p>
     * The failed S3 resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedItem <p>
     *            The failed S3 resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedS3Resource withFailedItem(S3Resource failedItem) {
        this.failedItem = failedItem;
        return this;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @return <p>
     *         The status code of a failed item.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @param errorCode <p>
     *            The status code of a failed item.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The status code of a failed item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10<br/>
     *
     * @param errorCode <p>
     *            The status code of a failed item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedS3Resource withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @return <p>
     *         The error message of a failed item.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param errorMessage <p>
     *            The error message of a failed item.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message of a failed item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     *
     * @param errorMessage <p>
     *            The error message of a failed item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FailedS3Resource withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getFailedItem() != null)
            sb.append("failedItem: " + getFailedItem() + ",");
        if (getErrorCode() != null)
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("errorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedItem() == null) ? 0 : getFailedItem().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedS3Resource == false)
            return false;
        FailedS3Resource other = (FailedS3Resource) obj;

        if (other.getFailedItem() == null ^ this.getFailedItem() == null)
            return false;
        if (other.getFailedItem() != null
                && other.getFailedItem().equals(this.getFailedItem()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
