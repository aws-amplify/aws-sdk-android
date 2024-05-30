/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListTaskTemplatesResult implements Serializable {
    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     */
    private java.util.List<TaskTemplateMetadata> taskTemplates;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     */
    private String nextToken;

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     *
     * @return <p>
     *         Provides details about a list of task templates belonging to an
     *         instance.
     *         </p>
     */
    public java.util.List<TaskTemplateMetadata> getTaskTemplates() {
        return taskTemplates;
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     *
     * @param taskTemplates <p>
     *            Provides details about a list of task templates belonging to
     *            an instance.
     *            </p>
     */
    public void setTaskTemplates(java.util.Collection<TaskTemplateMetadata> taskTemplates) {
        if (taskTemplates == null) {
            this.taskTemplates = null;
            return;
        }

        this.taskTemplates = new java.util.ArrayList<TaskTemplateMetadata>(taskTemplates);
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskTemplates <p>
     *            Provides details about a list of task templates belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskTemplatesResult withTaskTemplates(TaskTemplateMetadata... taskTemplates) {
        if (getTaskTemplates() == null) {
            this.taskTemplates = new java.util.ArrayList<TaskTemplateMetadata>(taskTemplates.length);
        }
        for (TaskTemplateMetadata value : taskTemplates) {
            this.taskTemplates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Provides details about a list of task templates belonging to an instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param taskTemplates <p>
     *            Provides details about a list of task templates belonging to
     *            an instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskTemplatesResult withTaskTemplates(
            java.util.Collection<TaskTemplateMetadata> taskTemplates) {
        setTaskTemplates(taskTemplates);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     *         <important>
     *         <p>
     *         This is always returned as a null in the response.
     *         </p>
     *         </important>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is always returned as a null in the response.
     *            </p>
     *            </important>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <important>
     * <p>
     * This is always returned as a null in the response.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     *            <important>
     *            <p>
     *            This is always returned as a null in the response.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTaskTemplatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTaskTemplates() != null)
            sb.append("TaskTemplates: " + getTaskTemplates() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTaskTemplates() == null) ? 0 : getTaskTemplates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTaskTemplatesResult == false)
            return false;
        ListTaskTemplatesResult other = (ListTaskTemplatesResult) obj;

        if (other.getTaskTemplates() == null ^ this.getTaskTemplates() == null)
            return false;
        if (other.getTaskTemplates() != null
                && other.getTaskTemplates().equals(this.getTaskTemplates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
