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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>CancelSteps</a> operation.
 * </p>
 */
public class CancelStepsResult implements Serializable {
    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified
     * cancel requests for each <code>StepID</code> specified.
     * </p>
     */
    private java.util.List<CancelStepsInfo> cancelStepsInfoList;

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified
     * cancel requests for each <code>StepID</code> specified.
     * </p>
     *
     * @return <p>
     *         A list of <a>CancelStepsInfo</a>, which shows the status of
     *         specified cancel requests for each <code>StepID</code> specified.
     *         </p>
     */
    public java.util.List<CancelStepsInfo> getCancelStepsInfoList() {
        return cancelStepsInfoList;
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified
     * cancel requests for each <code>StepID</code> specified.
     * </p>
     *
     * @param cancelStepsInfoList <p>
     *            A list of <a>CancelStepsInfo</a>, which shows the status of
     *            specified cancel requests for each <code>StepID</code>
     *            specified.
     *            </p>
     */
    public void setCancelStepsInfoList(java.util.Collection<CancelStepsInfo> cancelStepsInfoList) {
        if (cancelStepsInfoList == null) {
            this.cancelStepsInfoList = null;
            return;
        }

        this.cancelStepsInfoList = new java.util.ArrayList<CancelStepsInfo>(cancelStepsInfoList);
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified
     * cancel requests for each <code>StepID</code> specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cancelStepsInfoList <p>
     *            A list of <a>CancelStepsInfo</a>, which shows the status of
     *            specified cancel requests for each <code>StepID</code>
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsResult withCancelStepsInfoList(CancelStepsInfo... cancelStepsInfoList) {
        if (getCancelStepsInfoList() == null) {
            this.cancelStepsInfoList = new java.util.ArrayList<CancelStepsInfo>(
                    cancelStepsInfoList.length);
        }
        for (CancelStepsInfo value : cancelStepsInfoList) {
            this.cancelStepsInfoList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>CancelStepsInfo</a>, which shows the status of specified
     * cancel requests for each <code>StepID</code> specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cancelStepsInfoList <p>
     *            A list of <a>CancelStepsInfo</a>, which shows the status of
     *            specified cancel requests for each <code>StepID</code>
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelStepsResult withCancelStepsInfoList(
            java.util.Collection<CancelStepsInfo> cancelStepsInfoList) {
        setCancelStepsInfoList(cancelStepsInfoList);
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
        if (getCancelStepsInfoList() != null)
            sb.append("CancelStepsInfoList: " + getCancelStepsInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCancelStepsInfoList() == null) ? 0 : getCancelStepsInfoList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelStepsResult == false)
            return false;
        CancelStepsResult other = (CancelStepsResult) obj;

        if (other.getCancelStepsInfoList() == null ^ this.getCancelStepsInfoList() == null)
            return false;
        if (other.getCancelStepsInfoList() != null
                && other.getCancelStepsInfoList().equals(this.getCancelStepsInfoList()) == false)
            return false;
        return true;
    }
}
