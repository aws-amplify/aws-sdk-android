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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

public class GetJobUnlockCodeResult implements Serializable {
    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The
     * <code>UnlockCode</code> value can be accessed for up to 90 days after the
     * job has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String unlockCode;

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The
     * <code>UnlockCode</code> value can be accessed for up to 90 days after the
     * job has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The <code>UnlockCode</code> value for the specified job. The
     *         <code>UnlockCode</code> value can be accessed for up to 90 days
     *         after the job has been created.
     *         </p>
     */
    public String getUnlockCode() {
        return unlockCode;
    }

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The
     * <code>UnlockCode</code> value can be accessed for up to 90 days after the
     * job has been created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param unlockCode <p>
     *            The <code>UnlockCode</code> value for the specified job. The
     *            <code>UnlockCode</code> value can be accessed for up to 90
     *            days after the job has been created.
     *            </p>
     */
    public void setUnlockCode(String unlockCode) {
        this.unlockCode = unlockCode;
    }

    /**
     * <p>
     * The <code>UnlockCode</code> value for the specified job. The
     * <code>UnlockCode</code> value can be accessed for up to 90 days after the
     * job has been created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param unlockCode <p>
     *            The <code>UnlockCode</code> value for the specified job. The
     *            <code>UnlockCode</code> value can be accessed for up to 90
     *            days after the job has been created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJobUnlockCodeResult withUnlockCode(String unlockCode) {
        this.unlockCode = unlockCode;
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
        if (getUnlockCode() != null)
            sb.append("UnlockCode: " + getUnlockCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUnlockCode() == null) ? 0 : getUnlockCode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobUnlockCodeResult == false)
            return false;
        GetJobUnlockCodeResult other = (GetJobUnlockCodeResult) obj;

        if (other.getUnlockCode() == null ^ this.getUnlockCode() == null)
            return false;
        if (other.getUnlockCode() != null
                && other.getUnlockCode().equals(this.getUnlockCode()) == false)
            return false;
        return true;
    }
}
