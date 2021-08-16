/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a user under an Amazon Chime <code>AppInstance</code>. The request
 * consists of a unique <code>appInstanceUserId</code> and <code>Name</code> for
 * that user.
 * </p>
 */
public class CreateAppInstanceUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceArn;

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     */
    private String appInstanceUserId;

    /**
     * <p>
     * The user's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String name;

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String metadata;

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstance</code> request.
     *         </p>
     */
    public String getAppInstanceArn() {
        return appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceArn <p>
     *            The ARN of the <code>AppInstance</code> request.
     *            </p>
     */
    public void setAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstance</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceArn <p>
     *            The ARN of the <code>AppInstance</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withAppInstanceArn(String appInstanceArn) {
        this.appInstanceArn = appInstanceArn;
        return this;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @return <p>
     *         The user ID of the <code>AppInstance</code>.
     *         </p>
     */
    public String getAppInstanceUserId() {
        return appInstanceUserId;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @param appInstanceUserId <p>
     *            The user ID of the <code>AppInstance</code>.
     *            </p>
     */
    public void setAppInstanceUserId(String appInstanceUserId) {
        this.appInstanceUserId = appInstanceUserId;
    }

    /**
     * <p>
     * The user ID of the <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[A-Za-z0-9]([A-Za-z0-9\:\-\_\.\@]{0,62}[A-Za-z0-9])?<br/>
     *
     * @param appInstanceUserId <p>
     *            The user ID of the <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withAppInstanceUserId(String appInstanceUserId) {
        this.appInstanceUserId = appInstanceUserId;
        return this;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The user's name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The user's name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user's name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param name <p>
     *            The user's name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The request's metadata. Limited to a 1KB string in UTF-8.
     *         </p>
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The request's metadata. Limited to a 1KB string in UTF-8.
     *            </p>
     */
    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The request's metadata. Limited to a 1KB string in UTF-8.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param metadata <p>
     *            The request's metadata. Limited to a 1KB string in UTF-8.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The token assigned to the user requesting an
     *         <code>AppInstance</code>.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The token assigned to the user requesting an
     *            <code>AppInstance</code>.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The token assigned to the user requesting an <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The token assigned to the user requesting an
     *            <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     *
     * @return <p>
     *         Tags assigned to the <code>AppInstanceUser</code>.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     *
     * @param tags <p>
     *            Tags assigned to the <code>AppInstanceUser</code>.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags assigned to the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tags assigned to the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags assigned to the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAppInstanceUserRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAppInstanceArn() != null)
            sb.append("AppInstanceArn: " + getAppInstanceArn() + ",");
        if (getAppInstanceUserId() != null)
            sb.append("AppInstanceUserId: " + getAppInstanceUserId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceArn() == null) ? 0 : getAppInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getAppInstanceUserId() == null) ? 0 : getAppInstanceUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppInstanceUserRequest == false)
            return false;
        CreateAppInstanceUserRequest other = (CreateAppInstanceUserRequest) obj;

        if (other.getAppInstanceArn() == null ^ this.getAppInstanceArn() == null)
            return false;
        if (other.getAppInstanceArn() != null
                && other.getAppInstanceArn().equals(this.getAppInstanceArn()) == false)
            return false;
        if (other.getAppInstanceUserId() == null ^ this.getAppInstanceUserId() == null)
            return false;
        if (other.getAppInstanceUserId() != null
                && other.getAppInstanceUserId().equals(this.getAppInstanceUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
