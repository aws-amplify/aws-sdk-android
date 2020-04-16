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
 * Details about a Lambda layer version.
 * </p>
 */
public class AwsLambdaLayerVersionDetails implements Serializable {
    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     * <code>java8</code> | <code>java11</code> | <code>python2.7</code> |
     * <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code>
     * | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> |
     * <code>go1.x</code> | <code>ruby2.5</code> | <code>provided</code>
     * </p>
     */
    private java.util.List<String> compatibleRuntimes;

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example,
     * 2018-11-27T15:10:45.123+0000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String createdDate;

    /**
     * <p>
     * The version number.
     * </p>
     *
     * @return <p>
     *         The version number.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     *
     * @param version <p>
     *            The version number.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The version number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaLayerVersionDetails withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     * <code>java8</code> | <code>java11</code> | <code>python2.7</code> |
     * <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code>
     * | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> |
     * <code>go1.x</code> | <code>ruby2.5</code> | <code>provided</code>
     * </p>
     *
     * @return <p>
     *         The layer's compatible runtimes. Maximum number of 5 items.
     *         </p>
     *         <p>
     *         Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     *         <code>java8</code> | <code>java11</code> | <code>python2.7</code>
     *         | <code>python3.6</code> | <code>python3.7</code> |
     *         <code>python3.8</code> | <code>dotnetcore1.0</code> |
     *         <code>dotnetcore2.1</code> | <code>go1.x</code> |
     *         <code>ruby2.5</code> | <code>provided</code>
     *         </p>
     */
    public java.util.List<String> getCompatibleRuntimes() {
        return compatibleRuntimes;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     * <code>java8</code> | <code>java11</code> | <code>python2.7</code> |
     * <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code>
     * | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> |
     * <code>go1.x</code> | <code>ruby2.5</code> | <code>provided</code>
     * </p>
     *
     * @param compatibleRuntimes <p>
     *            The layer's compatible runtimes. Maximum number of 5 items.
     *            </p>
     *            <p>
     *            Valid values: <code>nodejs10.x</code> |
     *            <code>nodejs12.x</code> | <code>java8</code> |
     *            <code>java11</code> | <code>python2.7</code> |
     *            <code>python3.6</code> | <code>python3.7</code> |
     *            <code>python3.8</code> | <code>dotnetcore1.0</code> |
     *            <code>dotnetcore2.1</code> | <code>go1.x</code> |
     *            <code>ruby2.5</code> | <code>provided</code>
     *            </p>
     */
    public void setCompatibleRuntimes(java.util.Collection<String> compatibleRuntimes) {
        if (compatibleRuntimes == null) {
            this.compatibleRuntimes = null;
            return;
        }

        this.compatibleRuntimes = new java.util.ArrayList<String>(compatibleRuntimes);
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     * <code>java8</code> | <code>java11</code> | <code>python2.7</code> |
     * <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code>
     * | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> |
     * <code>go1.x</code> | <code>ruby2.5</code> | <code>provided</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleRuntimes <p>
     *            The layer's compatible runtimes. Maximum number of 5 items.
     *            </p>
     *            <p>
     *            Valid values: <code>nodejs10.x</code> |
     *            <code>nodejs12.x</code> | <code>java8</code> |
     *            <code>java11</code> | <code>python2.7</code> |
     *            <code>python3.6</code> | <code>python3.7</code> |
     *            <code>python3.8</code> | <code>dotnetcore1.0</code> |
     *            <code>dotnetcore2.1</code> | <code>go1.x</code> |
     *            <code>ruby2.5</code> | <code>provided</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaLayerVersionDetails withCompatibleRuntimes(String... compatibleRuntimes) {
        if (getCompatibleRuntimes() == null) {
            this.compatibleRuntimes = new java.util.ArrayList<String>(compatibleRuntimes.length);
        }
        for (String value : compatibleRuntimes) {
            this.compatibleRuntimes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The layer's compatible runtimes. Maximum number of 5 items.
     * </p>
     * <p>
     * Valid values: <code>nodejs10.x</code> | <code>nodejs12.x</code> |
     * <code>java8</code> | <code>java11</code> | <code>python2.7</code> |
     * <code>python3.6</code> | <code>python3.7</code> | <code>python3.8</code>
     * | <code>dotnetcore1.0</code> | <code>dotnetcore2.1</code> |
     * <code>go1.x</code> | <code>ruby2.5</code> | <code>provided</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleRuntimes <p>
     *            The layer's compatible runtimes. Maximum number of 5 items.
     *            </p>
     *            <p>
     *            Valid values: <code>nodejs10.x</code> |
     *            <code>nodejs12.x</code> | <code>java8</code> |
     *            <code>java11</code> | <code>python2.7</code> |
     *            <code>python3.6</code> | <code>python3.7</code> |
     *            <code>python3.8</code> | <code>dotnetcore1.0</code> |
     *            <code>dotnetcore2.1</code> | <code>go1.x</code> |
     *            <code>ruby2.5</code> | <code>provided</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaLayerVersionDetails withCompatibleRuntimes(
            java.util.Collection<String> compatibleRuntimes) {
        setCompatibleRuntimes(compatibleRuntimes);
        return this;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example,
     * 2018-11-27T15:10:45.123+0000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The date that the version was created, in ISO 8601 format. For
     *         example, 2018-11-27T15:10:45.123+0000.
     *         </p>
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example,
     * 2018-11-27T15:10:45.123+0000.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdDate <p>
     *            The date that the version was created, in ISO 8601 format. For
     *            example, 2018-11-27T15:10:45.123+0000.
     *            </p>
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date that the version was created, in ISO 8601 format. For example,
     * 2018-11-27T15:10:45.123+0000.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param createdDate <p>
     *            The date that the version was created, in ISO 8601 format. For
     *            example, 2018-11-27T15:10:45.123+0000.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsLambdaLayerVersionDetails withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
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
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getCompatibleRuntimes() != null)
            sb.append("CompatibleRuntimes: " + getCompatibleRuntimes() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCompatibleRuntimes() == null) ? 0 : getCompatibleRuntimes().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsLambdaLayerVersionDetails == false)
            return false;
        AwsLambdaLayerVersionDetails other = (AwsLambdaLayerVersionDetails) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getCompatibleRuntimes() == null ^ this.getCompatibleRuntimes() == null)
            return false;
        if (other.getCompatibleRuntimes() != null
                && other.getCompatibleRuntimes().equals(this.getCompatibleRuntimes()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }
}
