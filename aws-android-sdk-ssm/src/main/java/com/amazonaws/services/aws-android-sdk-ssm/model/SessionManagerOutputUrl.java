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
package com.amazonaws.services.aws-android-sdk-ssm.model;

import java.io.Serializable;


/**
 * <p>Reserved for future use.</p>
 */
public class SessionManagerOutputUrl implements Serializable {
    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     */
    private String s3OutputUrl;

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     */
    private String cloudWatchOutputUrl;

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @return <p>Reserved for future use.</p>
     */
    public String getS3OutputUrl() {
        return s3OutputUrl;
    }

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @param s3OutputUrl <p>Reserved for future use.</p>
     */
    public void setS3OutputUrl(String s3OutputUrl) {
        this.s3OutputUrl = s3OutputUrl;
    }

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @param s3OutputUrl <p>Reserved for future use.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SessionManagerOutputUrl withS3OutputUrl(String s3OutputUrl) {
        this.s3OutputUrl = s3OutputUrl;
        return this;
    }

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @return <p>Reserved for future use.</p>
     */
    public String getCloudWatchOutputUrl() {
        return cloudWatchOutputUrl;
    }

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @param cloudWatchOutputUrl <p>Reserved for future use.</p>
     */
    public void setCloudWatchOutputUrl(String cloudWatchOutputUrl) {
        this.cloudWatchOutputUrl = cloudWatchOutputUrl;
    }

    /**
     * <p>Reserved for future use.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2083<br/>
     *
     * @param cloudWatchOutputUrl <p>Reserved for future use.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public SessionManagerOutputUrl withCloudWatchOutputUrl(String cloudWatchOutputUrl) {
        this.cloudWatchOutputUrl = cloudWatchOutputUrl;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getS3OutputUrl() != null) sb.append("S3OutputUrl: " + getS3OutputUrl() + ",");
        if (getCloudWatchOutputUrl() != null) sb.append("CloudWatchOutputUrl: " + getCloudWatchOutputUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputUrl() == null) ? 0 : getS3OutputUrl().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchOutputUrl() == null) ? 0 : getCloudWatchOutputUrl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SessionManagerOutputUrl == false) return false;
        SessionManagerOutputUrl other = (SessionManagerOutputUrl)obj;

        if (other.getS3OutputUrl() == null ^ this.getS3OutputUrl() == null) return false;
        if (other.getS3OutputUrl() != null && other.getS3OutputUrl().equals(this.getS3OutputUrl()) == false) return false;
        if (other.getCloudWatchOutputUrl() == null ^ this.getCloudWatchOutputUrl() == null) return false;
        if (other.getCloudWatchOutputUrl() != null && other.getCloudWatchOutputUrl().equals(this.getCloudWatchOutputUrl()) == false) return false;
        return true;
    }
}
