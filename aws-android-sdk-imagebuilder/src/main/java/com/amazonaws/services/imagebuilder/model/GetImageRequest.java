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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets an image.
 * </p>
 */
public class GetImageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/(?:(?:(\d+|x)\.(\d+|x)\.(\d+|x))|(?:\d+\.\d+\.\d+/\d+))$<br/>
     */
    private String imageBuildVersionArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/(?:(?:(\d+|x)\.(\d+|x)\.(\d+|x))|(?:\d+\.\d+\.\d+/\d+))$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the image that you want to
     *         retrieve.
     *         </p>
     */
    public String getImageBuildVersionArn() {
        return imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/(?:(?:(\d+|x)\.(\d+|x)\.(\d+|x))|(?:\d+\.\d+\.\d+/\d+))$<br/>
     *
     * @param imageBuildVersionArn <p>
     *            The Amazon Resource Name (ARN) of the image that you want to
     *            retrieve.
     *            </p>
     */
    public void setImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the image that you want to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):image/[a-z0
     * -9-_]+/(?:(?:(\d+|x)\.(\d+|x)\.(\d+|x))|(?:\d+\.\d+\.\d+/\d+))$<br/>
     *
     * @param imageBuildVersionArn <p>
     *            The Amazon Resource Name (ARN) of the image that you want to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImageRequest withImageBuildVersionArn(String imageBuildVersionArn) {
        this.imageBuildVersionArn = imageBuildVersionArn;
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
        if (getImageBuildVersionArn() != null)
            sb.append("imageBuildVersionArn: " + getImageBuildVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageBuildVersionArn() == null) ? 0 : getImageBuildVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImageRequest == false)
            return false;
        GetImageRequest other = (GetImageRequest) obj;

        if (other.getImageBuildVersionArn() == null ^ this.getImageBuildVersionArn() == null)
            return false;
        if (other.getImageBuildVersionArn() != null
                && other.getImageBuildVersionArn().equals(this.getImageBuildVersionArn()) == false)
            return false;
        return true;
    }
}
