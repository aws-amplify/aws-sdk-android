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

public class DescribeHubResult implements Serializable {
    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String hubArn;

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String subscribedAt;

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the Hub resource that was retrieved.
     *         </p>
     */
    public String getHubArn() {
        return hubArn;
    }

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param hubArn <p>
     *            The ARN of the Hub resource that was retrieved.
     *            </p>
     */
    public void setHubArn(String hubArn) {
        this.hubArn = hubArn;
    }

    /**
     * <p>
     * The ARN of the Hub resource that was retrieved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param hubArn <p>
     *            The ARN of the Hub resource that was retrieved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHubResult withHubArn(String hubArn) {
        this.hubArn = hubArn;
        return this;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date and time when Security Hub was enabled in the account.
     *         </p>
     */
    public String getSubscribedAt() {
        return subscribedAt;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subscribedAt <p>
     *            The date and time when Security Hub was enabled in the
     *            account.
     *            </p>
     */
    public void setSubscribedAt(String subscribedAt) {
        this.subscribedAt = subscribedAt;
    }

    /**
     * <p>
     * The date and time when Security Hub was enabled in the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param subscribedAt <p>
     *            The date and time when Security Hub was enabled in the
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHubResult withSubscribedAt(String subscribedAt) {
        this.subscribedAt = subscribedAt;
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
        if (getHubArn() != null)
            sb.append("HubArn: " + getHubArn() + ",");
        if (getSubscribedAt() != null)
            sb.append("SubscribedAt: " + getSubscribedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHubArn() == null) ? 0 : getHubArn().hashCode());
        hashCode = prime * hashCode
                + ((getSubscribedAt() == null) ? 0 : getSubscribedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHubResult == false)
            return false;
        DescribeHubResult other = (DescribeHubResult) obj;

        if (other.getHubArn() == null ^ this.getHubArn() == null)
            return false;
        if (other.getHubArn() != null && other.getHubArn().equals(this.getHubArn()) == false)
            return false;
        if (other.getSubscribedAt() == null ^ this.getSubscribedAt() == null)
            return false;
        if (other.getSubscribedAt() != null
                && other.getSubscribedAt().equals(this.getSubscribedAt()) == false)
            return false;
        return true;
    }
}
