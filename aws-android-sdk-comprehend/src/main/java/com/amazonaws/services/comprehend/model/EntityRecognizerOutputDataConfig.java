/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Output data configuration.
 * </p>
 */
public class EntityRecognizerOutputDataConfig implements Serializable {
    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel
     * statistics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String flywheelStatsS3Prefix;

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel
     * statistics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The Amazon S3 prefix for the data lake location of the flywheel
     *         statistics.
     *         </p>
     */
    public String getFlywheelStatsS3Prefix() {
        return flywheelStatsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel
     * statistics.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param flywheelStatsS3Prefix <p>
     *            The Amazon S3 prefix for the data lake location of the
     *            flywheel statistics.
     *            </p>
     */
    public void setFlywheelStatsS3Prefix(String flywheelStatsS3Prefix) {
        this.flywheelStatsS3Prefix = flywheelStatsS3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 prefix for the data lake location of the flywheel
     * statistics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param flywheelStatsS3Prefix <p>
     *            The Amazon S3 prefix for the data lake location of the
     *            flywheel statistics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EntityRecognizerOutputDataConfig withFlywheelStatsS3Prefix(String flywheelStatsS3Prefix) {
        this.flywheelStatsS3Prefix = flywheelStatsS3Prefix;
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
        if (getFlywheelStatsS3Prefix() != null)
            sb.append("FlywheelStatsS3Prefix: " + getFlywheelStatsS3Prefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFlywheelStatsS3Prefix() == null) ? 0 : getFlywheelStatsS3Prefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EntityRecognizerOutputDataConfig == false)
            return false;
        EntityRecognizerOutputDataConfig other = (EntityRecognizerOutputDataConfig) obj;

        if (other.getFlywheelStatsS3Prefix() == null ^ this.getFlywheelStatsS3Prefix() == null)
            return false;
        if (other.getFlywheelStatsS3Prefix() != null
                && other.getFlywheelStatsS3Prefix().equals(this.getFlywheelStatsS3Prefix()) == false)
            return false;
        return true;
    }
}
