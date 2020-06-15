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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Links a user's account to a third-party skill provider. If this API operation
 * is called by an assumed IAM role, the skill being linked must be a private
 * skill. Also, the skill must be owned by the AWS account that assumed the IAM
 * role.
 * </p>
 */
public class PutSkillAuthorizationRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must
     * be populated in the AuthorizationResult map to establish the
     * authorization.
     * </p>
     */
    private java.util.Map<String, String> authorizationResult;

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     */
    private String skillId;

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String roomArn;

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must
     * be populated in the AuthorizationResult map to establish the
     * authorization.
     * </p>
     *
     * @return <p>
     *         The authorization result specific to OAUTH code grant output.
     *         "Code” must be populated in the AuthorizationResult map to
     *         establish the authorization.
     *         </p>
     */
    public java.util.Map<String, String> getAuthorizationResult() {
        return authorizationResult;
    }

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must
     * be populated in the AuthorizationResult map to establish the
     * authorization.
     * </p>
     *
     * @param authorizationResult <p>
     *            The authorization result specific to OAUTH code grant output.
     *            "Code” must be populated in the AuthorizationResult map to
     *            establish the authorization.
     *            </p>
     */
    public void setAuthorizationResult(java.util.Map<String, String> authorizationResult) {
        this.authorizationResult = authorizationResult;
    }

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must
     * be populated in the AuthorizationResult map to establish the
     * authorization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizationResult <p>
     *            The authorization result specific to OAUTH code grant output.
     *            "Code” must be populated in the AuthorizationResult map to
     *            establish the authorization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSkillAuthorizationRequest withAuthorizationResult(
            java.util.Map<String, String> authorizationResult) {
        this.authorizationResult = authorizationResult;
        return this;
    }

    /**
     * <p>
     * The authorization result specific to OAUTH code grant output. "Code” must
     * be populated in the AuthorizationResult map to establish the
     * authorization.
     * </p>
     * <p>
     * The method adds a new key-value pair into AuthorizationResult parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into AuthorizationResult.
     * @param value The corresponding value of the entry to be added into
     *            AuthorizationResult.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSkillAuthorizationRequest addAuthorizationResultEntry(String key, String value) {
        if (null == this.authorizationResult) {
            this.authorizationResult = new java.util.HashMap<String, String>();
        }
        if (this.authorizationResult.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.authorizationResult.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuthorizationResult.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public PutSkillAuthorizationRequest clearAuthorizationResultEntries() {
        this.authorizationResult = null;
        return this;
    }

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @return <p>
     *         The unique identifier of a skill.
     *         </p>
     */
    public String getSkillId() {
        return skillId;
    }

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The unique identifier of a skill.
     *            </p>
     */
    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    /**
     * <p>
     * The unique identifier of a skill.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>(^amzn1\.ask\.skill\.[0-9a-f\-]{1,200})|(^amzn1\.echo-sdk-
     * ams\.app\.[0-9a-f\-]{1,200})<br/>
     *
     * @param skillId <p>
     *            The unique identifier of a skill.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSkillAuthorizationRequest withSkillId(String skillId) {
        this.skillId = skillId;
        return this;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The room that the skill is authorized for.
     *         </p>
     */
    public String getRoomArn() {
        return roomArn;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The room that the skill is authorized for.
     *            </p>
     */
    public void setRoomArn(String roomArn) {
        this.roomArn = roomArn;
    }

    /**
     * <p>
     * The room that the skill is authorized for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param roomArn <p>
     *            The room that the skill is authorized for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutSkillAuthorizationRequest withRoomArn(String roomArn) {
        this.roomArn = roomArn;
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
        if (getAuthorizationResult() != null)
            sb.append("AuthorizationResult: " + getAuthorizationResult() + ",");
        if (getSkillId() != null)
            sb.append("SkillId: " + getSkillId() + ",");
        if (getRoomArn() != null)
            sb.append("RoomArn: " + getRoomArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAuthorizationResult() == null) ? 0 : getAuthorizationResult().hashCode());
        hashCode = prime * hashCode + ((getSkillId() == null) ? 0 : getSkillId().hashCode());
        hashCode = prime * hashCode + ((getRoomArn() == null) ? 0 : getRoomArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutSkillAuthorizationRequest == false)
            return false;
        PutSkillAuthorizationRequest other = (PutSkillAuthorizationRequest) obj;

        if (other.getAuthorizationResult() == null ^ this.getAuthorizationResult() == null)
            return false;
        if (other.getAuthorizationResult() != null
                && other.getAuthorizationResult().equals(this.getAuthorizationResult()) == false)
            return false;
        if (other.getSkillId() == null ^ this.getSkillId() == null)
            return false;
        if (other.getSkillId() != null && other.getSkillId().equals(this.getSkillId()) == false)
            return false;
        if (other.getRoomArn() == null ^ this.getRoomArn() == null)
            return false;
        if (other.getRoomArn() != null && other.getRoomArn().equals(this.getRoomArn()) == false)
            return false;
        return true;
    }
}
