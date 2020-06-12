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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * A failed resource.
 * </p>
 */
public class Failure implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The reason for the failure.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The details of the failure.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the failed resource.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the failed resource.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the failed resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the failed resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Failure withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     *
     * @return <p>
     *         The reason for the failure.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     *
     * @param reason <p>
     *            The reason for the failure.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reason <p>
     *            The reason for the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Failure withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     *
     * @return <p>
     *         The details of the failure.
     *         </p>
     */
    public String getDetail() {
        return detail;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     *
     * @param detail <p>
     *            The details of the failure.
     *            </p>
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * The details of the failure.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detail <p>
     *            The details of the failure.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Failure withDetail(String detail) {
        this.detail = detail;
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
        if (getArn() != null)
            sb.append("arn: " + getArn() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason() + ",");
        if (getDetail() != null)
            sb.append("detail: " + getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Failure == false)
            return false;
        Failure other = (Failure) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }
}
