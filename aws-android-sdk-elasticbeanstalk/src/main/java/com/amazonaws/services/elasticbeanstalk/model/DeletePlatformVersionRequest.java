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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes the specified version of a custom platform.
 * </p>
 */
public class DeletePlatformVersionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     */
    private String platformArn;

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     *
     * @return <p>
     *         The ARN of the version of the custom platform.
     *         </p>
     */
    public String getPlatformArn() {
        return platformArn;
    }

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     *
     * @param platformArn <p>
     *            The ARN of the version of the custom platform.
     *            </p>
     */
    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the version of the custom platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformArn <p>
     *            The ARN of the version of the custom platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeletePlatformVersionRequest withPlatformArn(String platformArn) {
        this.platformArn = platformArn;
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
        if (getPlatformArn() != null)
            sb.append("PlatformArn: " + getPlatformArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePlatformVersionRequest == false)
            return false;
        DeletePlatformVersionRequest other = (DeletePlatformVersionRequest) obj;

        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null
                && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        return true;
    }
}
