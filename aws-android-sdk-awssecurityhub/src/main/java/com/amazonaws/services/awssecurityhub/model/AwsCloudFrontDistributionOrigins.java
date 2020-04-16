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
 * A complex type that contains information about origins and origin groups for
 * this distribution.
 * </p>
 */
public class AwsCloudFrontDistributionOrigins implements Serializable {
    /**
     * <p>
     * A complex type that contains origins or origin groups for this
     * distribution.
     * </p>
     */
    private java.util.List<AwsCloudFrontDistributionOriginItem> items;

    /**
     * <p>
     * A complex type that contains origins or origin groups for this
     * distribution.
     * </p>
     *
     * @return <p>
     *         A complex type that contains origins or origin groups for this
     *         distribution.
     *         </p>
     */
    public java.util.List<AwsCloudFrontDistributionOriginItem> getItems() {
        return items;
    }

    /**
     * <p>
     * A complex type that contains origins or origin groups for this
     * distribution.
     * </p>
     *
     * @param items <p>
     *            A complex type that contains origins or origin groups for this
     *            distribution.
     *            </p>
     */
    public void setItems(java.util.Collection<AwsCloudFrontDistributionOriginItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<AwsCloudFrontDistributionOriginItem>(items);
    }

    /**
     * <p>
     * A complex type that contains origins or origin groups for this
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains origins or origin groups for this
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionOrigins withItems(AwsCloudFrontDistributionOriginItem... items) {
        if (getItems() == null) {
            this.items = new java.util.ArrayList<AwsCloudFrontDistributionOriginItem>(items.length);
        }
        for (AwsCloudFrontDistributionOriginItem value : items) {
            this.items.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains origins or origin groups for this
     * distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param items <p>
     *            A complex type that contains origins or origin groups for this
     *            distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsCloudFrontDistributionOrigins withItems(
            java.util.Collection<AwsCloudFrontDistributionOriginItem> items) {
        setItems(items);
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
        if (getItems() != null)
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionOrigins == false)
            return false;
        AwsCloudFrontDistributionOrigins other = (AwsCloudFrontDistributionOrigins) obj;

        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }
}
