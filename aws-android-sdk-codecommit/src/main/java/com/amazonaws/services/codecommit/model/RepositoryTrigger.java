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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a trigger for a repository.
 * </p>
 */
public class RepositoryTrigger implements Serializable {
    /**
     * <p>
     * The name of the trigger.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger (for example,
     * the ARN of a topic in Amazon SNS).
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * Any custom data associated with the trigger to be included in the
     * information sent to the target of the trigger.
     * </p>
     */
    private String customData;

    /**
     * <p>
     * The branches to be included in the trigger configuration. If you specify
     * an empty array, the trigger applies to all branches.
     * </p>
     * <note>
     * <p>
     * Although no content is required in the array, you must include the array
     * itself.
     * </p>
     * </note>
     */
    private java.util.List<String> branches;

    /**
     * <p>
     * The repository events that cause the trigger to run actions in another
     * service, such as sending a notification through Amazon SNS.
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     */
    private java.util.List<String> events;

    /**
     * <p>
     * The name of the trigger.
     * </p>
     *
     * @return <p>
     *         The name of the trigger.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     *
     * @param name <p>
     *            The name of the trigger.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger (for example,
     * the ARN of a topic in Amazon SNS).
     * </p>
     *
     * @return <p>
     *         The ARN of the resource that is the target for a trigger (for
     *         example, the ARN of a topic in Amazon SNS).
     *         </p>
     */
    public String getDestinationArn() {
        return destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger (for example,
     * the ARN of a topic in Amazon SNS).
     * </p>
     *
     * @param destinationArn <p>
     *            The ARN of the resource that is the target for a trigger (for
     *            example, the ARN of a topic in Amazon SNS).
     *            </p>
     */
    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * The ARN of the resource that is the target for a trigger (for example,
     * the ARN of a topic in Amazon SNS).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationArn <p>
     *            The ARN of the resource that is the target for a trigger (for
     *            example, the ARN of a topic in Amazon SNS).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * <p>
     * Any custom data associated with the trigger to be included in the
     * information sent to the target of the trigger.
     * </p>
     *
     * @return <p>
     *         Any custom data associated with the trigger to be included in the
     *         information sent to the target of the trigger.
     *         </p>
     */
    public String getCustomData() {
        return customData;
    }

    /**
     * <p>
     * Any custom data associated with the trigger to be included in the
     * information sent to the target of the trigger.
     * </p>
     *
     * @param customData <p>
     *            Any custom data associated with the trigger to be included in
     *            the information sent to the target of the trigger.
     *            </p>
     */
    public void setCustomData(String customData) {
        this.customData = customData;
    }

    /**
     * <p>
     * Any custom data associated with the trigger to be included in the
     * information sent to the target of the trigger.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customData <p>
     *            Any custom data associated with the trigger to be included in
     *            the information sent to the target of the trigger.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withCustomData(String customData) {
        this.customData = customData;
        return this;
    }

    /**
     * <p>
     * The branches to be included in the trigger configuration. If you specify
     * an empty array, the trigger applies to all branches.
     * </p>
     * <note>
     * <p>
     * Although no content is required in the array, you must include the array
     * itself.
     * </p>
     * </note>
     *
     * @return <p>
     *         The branches to be included in the trigger configuration. If you
     *         specify an empty array, the trigger applies to all branches.
     *         </p>
     *         <note>
     *         <p>
     *         Although no content is required in the array, you must include
     *         the array itself.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getBranches() {
        return branches;
    }

    /**
     * <p>
     * The branches to be included in the trigger configuration. If you specify
     * an empty array, the trigger applies to all branches.
     * </p>
     * <note>
     * <p>
     * Although no content is required in the array, you must include the array
     * itself.
     * </p>
     * </note>
     *
     * @param branches <p>
     *            The branches to be included in the trigger configuration. If
     *            you specify an empty array, the trigger applies to all
     *            branches.
     *            </p>
     *            <note>
     *            <p>
     *            Although no content is required in the array, you must include
     *            the array itself.
     *            </p>
     *            </note>
     */
    public void setBranches(java.util.Collection<String> branches) {
        if (branches == null) {
            this.branches = null;
            return;
        }

        this.branches = new java.util.ArrayList<String>(branches);
    }

    /**
     * <p>
     * The branches to be included in the trigger configuration. If you specify
     * an empty array, the trigger applies to all branches.
     * </p>
     * <note>
     * <p>
     * Although no content is required in the array, you must include the array
     * itself.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The branches to be included in the trigger configuration. If
     *            you specify an empty array, the trigger applies to all
     *            branches.
     *            </p>
     *            <note>
     *            <p>
     *            Although no content is required in the array, you must include
     *            the array itself.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withBranches(String... branches) {
        if (getBranches() == null) {
            this.branches = new java.util.ArrayList<String>(branches.length);
        }
        for (String value : branches) {
            this.branches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The branches to be included in the trigger configuration. If you specify
     * an empty array, the trigger applies to all branches.
     * </p>
     * <note>
     * <p>
     * Although no content is required in the array, you must include the array
     * itself.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param branches <p>
     *            The branches to be included in the trigger configuration. If
     *            you specify an empty array, the trigger applies to all
     *            branches.
     *            </p>
     *            <note>
     *            <p>
     *            Although no content is required in the array, you must include
     *            the array itself.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withBranches(java.util.Collection<String> branches) {
        setBranches(branches);
        return this;
    }

    /**
     * <p>
     * The repository events that cause the trigger to run actions in another
     * service, such as sending a notification through Amazon SNS.
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     *
     * @return <p>
     *         The repository events that cause the trigger to run actions in
     *         another service, such as sending a notification through Amazon
     *         SNS.
     *         </p>
     *         <note>
     *         <p>
     *         The valid value "all" cannot be used with any other values.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The repository events that cause the trigger to run actions in another
     * service, such as sending a notification through Amazon SNS.
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     *
     * @param events <p>
     *            The repository events that cause the trigger to run actions in
     *            another service, such as sending a notification through Amazon
     *            SNS.
     *            </p>
     *            <note>
     *            <p>
     *            The valid value "all" cannot be used with any other values.
     *            </p>
     *            </note>
     */
    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The repository events that cause the trigger to run actions in another
     * service, such as sending a notification through Amazon SNS.
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The repository events that cause the trigger to run actions in
     *            another service, such as sending a notification through Amazon
     *            SNS.
     *            </p>
     *            <note>
     *            <p>
     *            The valid value "all" cannot be used with any other values.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withEvents(String... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<String>(events.length);
        }
        for (String value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The repository events that cause the trigger to run actions in another
     * service, such as sending a notification through Amazon SNS.
     * </p>
     * <note>
     * <p>
     * The valid value "all" cannot be used with any other values.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The repository events that cause the trigger to run actions in
     *            another service, such as sending a notification through Amazon
     *            SNS.
     *            </p>
     *            <note>
     *            <p>
     *            The valid value "all" cannot be used with any other values.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryTrigger withEvents(java.util.Collection<String> events) {
        setEvents(events);
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getDestinationArn() != null)
            sb.append("destinationArn: " + getDestinationArn() + ",");
        if (getCustomData() != null)
            sb.append("customData: " + getCustomData() + ",");
        if (getBranches() != null)
            sb.append("branches: " + getBranches() + ",");
        if (getEvents() != null)
            sb.append("events: " + getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        hashCode = prime * hashCode + ((getCustomData() == null) ? 0 : getCustomData().hashCode());
        hashCode = prime * hashCode + ((getBranches() == null) ? 0 : getBranches().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryTrigger == false)
            return false;
        RepositoryTrigger other = (RepositoryTrigger) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null
                && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        if (other.getCustomData() == null ^ this.getCustomData() == null)
            return false;
        if (other.getCustomData() != null
                && other.getCustomData().equals(this.getCustomData()) == false)
            return false;
        if (other.getBranches() == null ^ this.getBranches() == null)
            return false;
        if (other.getBranches() != null && other.getBranches().equals(this.getBranches()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }
}
