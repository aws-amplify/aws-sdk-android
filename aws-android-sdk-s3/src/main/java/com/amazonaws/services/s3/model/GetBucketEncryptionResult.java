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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetBucketEncryptionResult implements Serializable {
    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the default server-side-encryption configuration.
     *         </p>
     */
    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     *
     * @param serverSideEncryptionConfiguration <p>
     *            Specifies the default server-side-encryption configuration.
     *            </p>
     */
    public void setServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * Specifies the default server-side-encryption configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serverSideEncryptionConfiguration <p>
     *            Specifies the default server-side-encryption configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketEncryptionResult withServerSideEncryptionConfiguration(
            ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
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
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: "
                    + getServerSideEncryptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getServerSideEncryptionConfiguration() == null) ? 0
                        : getServerSideEncryptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketEncryptionResult == false)
            return false;
        GetBucketEncryptionResult other = (GetBucketEncryptionResult) obj;

        if (other.getServerSideEncryptionConfiguration() == null
                ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(
                        this.getServerSideEncryptionConfiguration()) == false)
            return false;
        return true;
    }
}
