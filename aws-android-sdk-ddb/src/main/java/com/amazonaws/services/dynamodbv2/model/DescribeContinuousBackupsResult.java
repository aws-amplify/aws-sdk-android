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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

public class DescribeContinuousBackupsResult implements Serializable {
    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on
     * the table.
     * </p>
     */
    private ContinuousBackupsDescription continuousBackupsDescription;

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on
     * the table.
     * </p>
     *
     * @return <p>
     *         Represents the continuous backups and point in time recovery
     *         settings on the table.
     *         </p>
     */
    public ContinuousBackupsDescription getContinuousBackupsDescription() {
        return continuousBackupsDescription;
    }

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on
     * the table.
     * </p>
     *
     * @param continuousBackupsDescription <p>
     *            Represents the continuous backups and point in time recovery
     *            settings on the table.
     *            </p>
     */
    public void setContinuousBackupsDescription(
            ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
    }

    /**
     * <p>
     * Represents the continuous backups and point in time recovery settings on
     * the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param continuousBackupsDescription <p>
     *            Represents the continuous backups and point in time recovery
     *            settings on the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContinuousBackupsResult withContinuousBackupsDescription(
            ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
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
        if (getContinuousBackupsDescription() != null)
            sb.append("ContinuousBackupsDescription: " + getContinuousBackupsDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContinuousBackupsDescription() == null) ? 0
                        : getContinuousBackupsDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContinuousBackupsResult == false)
            return false;
        DescribeContinuousBackupsResult other = (DescribeContinuousBackupsResult) obj;

        if (other.getContinuousBackupsDescription() == null
                ^ this.getContinuousBackupsDescription() == null)
            return false;
        if (other.getContinuousBackupsDescription() != null
                && other.getContinuousBackupsDescription().equals(
                        this.getContinuousBackupsDescription()) == false)
            return false;
        return true;
    }
}
