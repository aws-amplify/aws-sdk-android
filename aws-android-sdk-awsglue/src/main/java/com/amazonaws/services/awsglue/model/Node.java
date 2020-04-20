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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * A node represents an AWS Glue component like Trigger, Job etc. which is part
 * of a workflow.
 * </p>
 */
public class Node implements Serializable {
    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     */
    private String type;

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String uniqueId;

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     */
    private TriggerNodeDetails triggerDetails;

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     */
    private JobNodeDetails jobDetails;

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     */
    private CrawlerNodeDetails crawlerDetails;

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     *
     * @return <p>
     *         The type of AWS Glue component represented by the node.
     *         </p>
     * @see NodeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     *
     * @param type <p>
     *            The type of AWS Glue component represented by the node.
     *            </p>
     * @see NodeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     *
     * @param type <p>
     *            The type of AWS Glue component represented by the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeType
     */
    public Node withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     *
     * @param type <p>
     *            The type of AWS Glue component represented by the node.
     *            </p>
     * @see NodeType
     */
    public void setType(NodeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of AWS Glue component represented by the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRAWLER, JOB, TRIGGER
     *
     * @param type <p>
     *            The type of AWS Glue component represented by the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NodeType
     */
    public Node withType(NodeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the AWS Glue component represented by the node.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the AWS Glue component represented by the node.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AWS Glue component represented by the node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the AWS Glue component represented by the node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Node withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The unique Id assigned to the node within the workflow.
     *         </p>
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param uniqueId <p>
     *            The unique Id assigned to the node within the workflow.
     *            </p>
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * <p>
     * The unique Id assigned to the node within the workflow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param uniqueId <p>
     *            The unique Id assigned to the node within the workflow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Node withUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return this;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     *
     * @return <p>
     *         Details of the Trigger when the node represents a Trigger.
     *         </p>
     */
    public TriggerNodeDetails getTriggerDetails() {
        return triggerDetails;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     *
     * @param triggerDetails <p>
     *            Details of the Trigger when the node represents a Trigger.
     *            </p>
     */
    public void setTriggerDetails(TriggerNodeDetails triggerDetails) {
        this.triggerDetails = triggerDetails;
    }

    /**
     * <p>
     * Details of the Trigger when the node represents a Trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerDetails <p>
     *            Details of the Trigger when the node represents a Trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Node withTriggerDetails(TriggerNodeDetails triggerDetails) {
        this.triggerDetails = triggerDetails;
        return this;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     *
     * @return <p>
     *         Details of the Job when the node represents a Job.
     *         </p>
     */
    public JobNodeDetails getJobDetails() {
        return jobDetails;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     *
     * @param jobDetails <p>
     *            Details of the Job when the node represents a Job.
     *            </p>
     */
    public void setJobDetails(JobNodeDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * Details of the Job when the node represents a Job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobDetails <p>
     *            Details of the Job when the node represents a Job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Node withJobDetails(JobNodeDetails jobDetails) {
        this.jobDetails = jobDetails;
        return this;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     *
     * @return <p>
     *         Details of the crawler when the node represents a crawler.
     *         </p>
     */
    public CrawlerNodeDetails getCrawlerDetails() {
        return crawlerDetails;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     *
     * @param crawlerDetails <p>
     *            Details of the crawler when the node represents a crawler.
     *            </p>
     */
    public void setCrawlerDetails(CrawlerNodeDetails crawlerDetails) {
        this.crawlerDetails = crawlerDetails;
    }

    /**
     * <p>
     * Details of the crawler when the node represents a crawler.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerDetails <p>
     *            Details of the crawler when the node represents a crawler.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Node withCrawlerDetails(CrawlerNodeDetails crawlerDetails) {
        this.crawlerDetails = crawlerDetails;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getUniqueId() != null)
            sb.append("UniqueId: " + getUniqueId() + ",");
        if (getTriggerDetails() != null)
            sb.append("TriggerDetails: " + getTriggerDetails() + ",");
        if (getJobDetails() != null)
            sb.append("JobDetails: " + getJobDetails() + ",");
        if (getCrawlerDetails() != null)
            sb.append("CrawlerDetails: " + getCrawlerDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getUniqueId() == null) ? 0 : getUniqueId().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerDetails() == null) ? 0 : getTriggerDetails().hashCode());
        hashCode = prime * hashCode + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        hashCode = prime * hashCode
                + ((getCrawlerDetails() == null) ? 0 : getCrawlerDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getUniqueId() == null ^ this.getUniqueId() == null)
            return false;
        if (other.getUniqueId() != null && other.getUniqueId().equals(this.getUniqueId()) == false)
            return false;
        if (other.getTriggerDetails() == null ^ this.getTriggerDetails() == null)
            return false;
        if (other.getTriggerDetails() != null
                && other.getTriggerDetails().equals(this.getTriggerDetails()) == false)
            return false;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null
                && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        if (other.getCrawlerDetails() == null ^ this.getCrawlerDetails() == null)
            return false;
        if (other.getCrawlerDetails() != null
                && other.getCrawlerDetails().equals(this.getCrawlerDetails()) == false)
            return false;
        return true;
    }
}
