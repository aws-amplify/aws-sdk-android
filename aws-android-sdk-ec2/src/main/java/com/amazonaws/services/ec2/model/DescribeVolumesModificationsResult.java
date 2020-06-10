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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class DescribeVolumesModificationsResult implements Serializable {
    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     */
    private java.util.List<VolumeModification> volumesModifications;

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     *
     * @return <p>
     *         Information about the volume modifications.
     *         </p>
     */
    public java.util.List<VolumeModification> getVolumesModifications() {
        return volumesModifications;
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     *
     * @param volumesModifications <p>
     *            Information about the volume modifications.
     *            </p>
     */
    public void setVolumesModifications(
            java.util.Collection<VolumeModification> volumesModifications) {
        if (volumesModifications == null) {
            this.volumesModifications = null;
            return;
        }

        this.volumesModifications = new java.util.ArrayList<VolumeModification>(
                volumesModifications);
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumesModifications <p>
     *            Information about the volume modifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsResult withVolumesModifications(
            VolumeModification... volumesModifications) {
        if (getVolumesModifications() == null) {
            this.volumesModifications = new java.util.ArrayList<VolumeModification>(
                    volumesModifications.length);
        }
        for (VolumeModification value : volumesModifications) {
            this.volumesModifications.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volume modifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumesModifications <p>
     *            Information about the volume modifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsResult withVolumesModifications(
            java.util.Collection<VolumeModification> volumesModifications) {
        setVolumesModifications(volumesModifications);
        return this;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     *
     * @return <p>
     *         Token for pagination, null if there are no more results
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     *
     * @param nextToken <p>
     *            Token for pagination, null if there are no more results
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token for pagination, null if there are no more results
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Token for pagination, null if there are no more results
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVolumesModificationsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getVolumesModifications() != null)
            sb.append("VolumesModifications: " + getVolumesModifications() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumesModifications() == null) ? 0 : getVolumesModifications().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumesModificationsResult == false)
            return false;
        DescribeVolumesModificationsResult other = (DescribeVolumesModificationsResult) obj;

        if (other.getVolumesModifications() == null ^ this.getVolumesModifications() == null)
            return false;
        if (other.getVolumesModifications() != null
                && other.getVolumesModifications().equals(this.getVolumesModifications()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
