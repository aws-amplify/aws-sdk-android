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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the account that was not processed.
 * </p>
 */
public class Result implements Serializable {
    /**
     * <p>
     * An AWS account ID of the account that was not processed.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The reason that the account was not processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String processingResult;

    /**
     * <p>
     * An AWS account ID of the account that was not processed.
     * </p>
     *
     * @return <p>
     *         An AWS account ID of the account that was not processed.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * An AWS account ID of the account that was not processed.
     * </p>
     *
     * @param accountId <p>
     *            An AWS account ID of the account that was not processed.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * An AWS account ID of the account that was not processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            An AWS account ID of the account that was not processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The reason that the account was not processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The reason that the account was not processed.
     *         </p>
     */
    public String getProcessingResult() {
        return processingResult;
    }

    /**
     * <p>
     * The reason that the account was not processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param processingResult <p>
     *            The reason that the account was not processed.
     *            </p>
     */
    public void setProcessingResult(String processingResult) {
        this.processingResult = processingResult;
    }

    /**
     * <p>
     * The reason that the account was not processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param processingResult <p>
     *            The reason that the account was not processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Result withProcessingResult(String processingResult) {
        this.processingResult = processingResult;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getProcessingResult() != null)
            sb.append("ProcessingResult: " + getProcessingResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getProcessingResult() == null) ? 0 : getProcessingResult().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Result == false)
            return false;
        Result other = (Result) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getProcessingResult() == null ^ this.getProcessingResult() == null)
            return false;
        if (other.getProcessingResult() != null
                && other.getProcessingResult().equals(this.getProcessingResult()) == false)
            return false;
        return true;
    }
}
