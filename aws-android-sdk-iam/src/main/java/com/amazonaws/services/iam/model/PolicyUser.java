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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a user that a managed policy is attached to.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>ListEntitiesForPolicy</a> operation.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
 * </p>
 */
public class PolicyUser implements Serializable {
    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String userName;

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     */
    private String userId;

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name (friendly name, not ARN) identifying the user.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name (friendly name, not ARN) identifying the user.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param userName <p>
     *            The name (friendly name, not ARN) identifying the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyUser withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @return <p>
     *         The stable and unique string identifying the user. For more
     *         information about IDs, see <a href=
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *         >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param userId <p>
     *            The stable and unique string identifying the user. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The stable and unique string identifying the user. For more information
     * about IDs, see <a href=
     * "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     * >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 128<br/>
     * <b>Pattern: </b>[\w]+<br/>
     *
     * @param userId <p>
     *            The stable and unique string identifying the user. For more
     *            information about IDs, see <a href=
     *            "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html"
     *            >IAM Identifiers</a> in the <i>IAM User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PolicyUser withUserId(String userId) {
        this.userId = userId;
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyUser == false)
            return false;
        PolicyUser other = (PolicyUser) obj;

        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
