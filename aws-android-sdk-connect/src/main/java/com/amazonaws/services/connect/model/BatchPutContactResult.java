/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class BatchPutContactResult implements Serializable {
    /**
     * <p>
     * List of requests for which contact was successfully created.
     * </p>
     */
    private java.util.List<SuccessfulRequest> successfulRequestList;

    /**
     * <p>
     * List of requests for which contact creation failed.
     * </p>
     */
    private java.util.List<FailedRequest> failedRequestList;

    /**
     * <p>
     * List of requests for which contact was successfully created.
     * </p>
     *
     * @return <p>
     *         List of requests for which contact was successfully created.
     *         </p>
     */
    public java.util.List<SuccessfulRequest> getSuccessfulRequestList() {
        return successfulRequestList;
    }

    /**
     * <p>
     * List of requests for which contact was successfully created.
     * </p>
     *
     * @param successfulRequestList <p>
     *            List of requests for which contact was successfully created.
     *            </p>
     */
    public void setSuccessfulRequestList(
            java.util.Collection<SuccessfulRequest> successfulRequestList) {
        if (successfulRequestList == null) {
            this.successfulRequestList = null;
            return;
        }

        this.successfulRequestList = new java.util.ArrayList<SuccessfulRequest>(
                successfulRequestList);
    }

    /**
     * <p>
     * List of requests for which contact was successfully created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulRequestList <p>
     *            List of requests for which contact was successfully created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutContactResult withSuccessfulRequestList(
            SuccessfulRequest... successfulRequestList) {
        if (getSuccessfulRequestList() == null) {
            this.successfulRequestList = new java.util.ArrayList<SuccessfulRequest>(
                    successfulRequestList.length);
        }
        for (SuccessfulRequest value : successfulRequestList) {
            this.successfulRequestList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of requests for which contact was successfully created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulRequestList <p>
     *            List of requests for which contact was successfully created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutContactResult withSuccessfulRequestList(
            java.util.Collection<SuccessfulRequest> successfulRequestList) {
        setSuccessfulRequestList(successfulRequestList);
        return this;
    }

    /**
     * <p>
     * List of requests for which contact creation failed.
     * </p>
     *
     * @return <p>
     *         List of requests for which contact creation failed.
     *         </p>
     */
    public java.util.List<FailedRequest> getFailedRequestList() {
        return failedRequestList;
    }

    /**
     * <p>
     * List of requests for which contact creation failed.
     * </p>
     *
     * @param failedRequestList <p>
     *            List of requests for which contact creation failed.
     *            </p>
     */
    public void setFailedRequestList(java.util.Collection<FailedRequest> failedRequestList) {
        if (failedRequestList == null) {
            this.failedRequestList = null;
            return;
        }

        this.failedRequestList = new java.util.ArrayList<FailedRequest>(failedRequestList);
    }

    /**
     * <p>
     * List of requests for which contact creation failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedRequestList <p>
     *            List of requests for which contact creation failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutContactResult withFailedRequestList(FailedRequest... failedRequestList) {
        if (getFailedRequestList() == null) {
            this.failedRequestList = new java.util.ArrayList<FailedRequest>(
                    failedRequestList.length);
        }
        for (FailedRequest value : failedRequestList) {
            this.failedRequestList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of requests for which contact creation failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedRequestList <p>
     *            List of requests for which contact creation failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchPutContactResult withFailedRequestList(
            java.util.Collection<FailedRequest> failedRequestList) {
        setFailedRequestList(failedRequestList);
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
        if (getSuccessfulRequestList() != null)
            sb.append("SuccessfulRequestList: " + getSuccessfulRequestList() + ",");
        if (getFailedRequestList() != null)
            sb.append("FailedRequestList: " + getFailedRequestList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSuccessfulRequestList() == null) ? 0 : getSuccessfulRequestList().hashCode());
        hashCode = prime * hashCode
                + ((getFailedRequestList() == null) ? 0 : getFailedRequestList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutContactResult == false)
            return false;
        BatchPutContactResult other = (BatchPutContactResult) obj;

        if (other.getSuccessfulRequestList() == null ^ this.getSuccessfulRequestList() == null)
            return false;
        if (other.getSuccessfulRequestList() != null
                && other.getSuccessfulRequestList().equals(this.getSuccessfulRequestList()) == false)
            return false;
        if (other.getFailedRequestList() == null ^ this.getFailedRequestList() == null)
            return false;
        if (other.getFailedRequestList() != null
                && other.getFailedRequestList().equals(this.getFailedRequestList()) == false)
            return false;
        return true;
    }
}
