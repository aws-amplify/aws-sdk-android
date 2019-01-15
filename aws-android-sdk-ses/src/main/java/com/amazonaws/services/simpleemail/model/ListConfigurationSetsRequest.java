/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a list of the configuration sets associated with your Amazon SES
 * account in the current AWS Region. For information about using configuration
 * sets, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Monitoring Your Amazon SES Sending Activity</a> in the <i>Amazon SES
 * Developer Guide.</i>
 * </p>
 * <p>
 * You can execute this operation no more than once per second. This operation
 * will return up to 1,000 configuration sets each time it is run. If your
 * Amazon SES account has more than 1,000 configuration sets, this operation
 * will also return a NextToken element. You can then execute the
 * <code>ListConfigurationSets</code> operation again, passing the
 * <code>NextToken</code> parameter and the value of the NextToken element to
 * retrieve additional results.
 * </p>
 */
public class ListConfigurationSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A token returned from a previous call to
     * <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * A token returned from a previous call to
     * <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     *
     * @return <p>
     *         A token returned from a previous call to
     *         <code>ListConfigurationSets</code> to indicate the position of
     *         the configuration set in the configuration set list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to
     * <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     *
     * @param nextToken <p>
     *            A token returned from a previous call to
     *            <code>ListConfigurationSets</code> to indicate the position of
     *            the configuration set in the configuration set list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to
     * <code>ListConfigurationSets</code> to indicate the position of the
     * configuration set in the configuration set list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token returned from a previous call to
     *            <code>ListConfigurationSets</code> to indicate the position of
     *            the configuration set in the configuration set list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationSetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     *
     * @return <p>
     *         The number of configuration sets to return.
     *         </p>
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     *
     * @param maxItems <p>
     *            The number of configuration sets to return.
     *            </p>
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The number of configuration sets to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The number of configuration sets to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListConfigurationSetsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConfigurationSetsRequest == false)
            return false;
        ListConfigurationSetsRequest other = (ListConfigurationSetsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
