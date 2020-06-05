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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the settings for a random split activity in a journey. This type of
 * activity randomly sends specified percentages of participants down one of as
 * many as five paths in a journey, based on conditions that you specify.
 * </p>
 */
public class RandomSplitActivity implements Serializable {
    /**
     * <p>
     * The paths for the activity, including the percentage of participants to
     * enter each path and the activity to perform for each path.
     * </p>
     */
    private java.util.List<RandomSplitEntry> branches;

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to
     * enter each path and the activity to perform for each path.
     * </p>
     *
     * @return <p>
     *         The paths for the activity, including the percentage of
     *         participants to enter each path and the activity to perform for
     *         each path.
     *         </p>
     */
    public java.util.List<RandomSplitEntry> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to
     * enter each path and the activity to perform for each path.
     * </p>
     *
     * @param branches <p>
     *            The paths for the activity, including the percentage of
     *            participants to enter each path and the activity to perform
     *            for each path.
     *            </p>
     */
    public void setBranches(java.util.Collection<RandomSplitEntry> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<RandomSplitEntry>(branches);
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to
     * enter each path and the activity to perform for each path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The paths for the activity, including the percentage of
     *            participants to enter each path and the activity to perform
     *            for each path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RandomSplitActivity withBranches(RandomSplitEntry... branches) {
        if (getBranches() == null) {
            this.branches = new java.util.ArrayList<RandomSplitEntry>(branches.length);
        }
        for (RandomSplitEntry value : branches) {
            this.branches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The paths for the activity, including the percentage of participants to
     * enter each path and the activity to perform for each path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The paths for the activity, including the percentage of
     *            participants to enter each path and the activity to perform
     *            for each path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RandomSplitActivity withBranches(java.util.Collection<RandomSplitEntry> branches) {
        setBranches(branches);
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
        if (getBranches() != null)
            sb.append("Branches: " + getBranches());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RandomSplitActivity == false)
            return false;
        RandomSplitActivity other = (RandomSplitActivity) obj;

        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        return true;
    }
}
