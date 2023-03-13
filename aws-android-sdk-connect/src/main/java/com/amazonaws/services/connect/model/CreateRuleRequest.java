/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a rule for the specified Amazon Connect instance.
 * </p>
 * <p>
 * Use the <a href=
 * "https://docs.aws.amazon.com/connect/latest/APIReference/connect-rules-language.html"
 * >Rules Function language</a> to code conditions for the rule.
 * </p>
 */
public class CreateRuleRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     */
    private RuleTriggerEventSource triggerEventSource;

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     */
    private String function;

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     */
    private java.util.List<RuleAction> actions;

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     */
    private String publishStatus;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @return <p>
     *         A unique name for the rule.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            A unique name for the rule.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[0-9a-zA-Z._-]+<br/>
     *
     * @param name <p>
     *            A unique name for the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     *
     * @return <p>
     *         The event source to trigger the rule.
     *         </p>
     */
    public RuleTriggerEventSource getTriggerEventSource() {
        return triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     *
     * @param triggerEventSource <p>
     *            The event source to trigger the rule.
     *            </p>
     */
    public void setTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
    }

    /**
     * <p>
     * The event source to trigger the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggerEventSource <p>
     *            The event source to trigger the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withTriggerEventSource(RuleTriggerEventSource triggerEventSource) {
        this.triggerEventSource = triggerEventSource;
        return this;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     *
     * @return <p>
     *         The conditions of the rule.
     *         </p>
     */
    public String getFunction() {
        return function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     *
     * @param function <p>
     *            The conditions of the rule.
     *            </p>
     */
    public void setFunction(String function) {
        this.function = function;
    }

    /**
     * <p>
     * The conditions of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param function <p>
     *            The conditions of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     *
     * @return <p>
     *         A list of actions to be run when the rule is triggered.
     *         </p>
     */
    public java.util.List<RuleAction> getActions() {
        return actions;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     */
    public void setActions(java.util.Collection<RuleAction> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<RuleAction>(actions);
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withActions(RuleAction... actions) {
        if (getActions() == null) {
            this.actions = new java.util.ArrayList<RuleAction>(actions.length);
        }
        for (RuleAction value : actions) {
            this.actions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of actions to be run when the rule is triggered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            A list of actions to be run when the rule is triggered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withActions(java.util.Collection<RuleAction> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @return <p>
     *         The publish status of the rule.
     *         </p>
     * @see RulePublishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public CreateRuleRequest withPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @see RulePublishStatus
     */
    public void setPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
    }

    /**
     * <p>
     * The publish status of the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DRAFT, PUBLISHED
     *
     * @param publishStatus <p>
     *            The publish status of the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RulePublishStatus
     */
    public CreateRuleRequest withPublishStatus(RulePublishStatus publishStatus) {
        this.publishStatus = publishStatus.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         A unique, case-sensitive identifier that you provide to ensure
     *         the idempotency of the request. If not provided, the Amazon Web
     *         Services SDK populates this field. For more information about
     *         idempotency, see <a href=
     *         "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *         >Making retries safe with idempotent APIs</a>.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the
     * idempotency of the request. If not provided, the Amazon Web Services SDK
     * populates this field. For more information about idempotency, see <a
     * href=
     * "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     * >Making retries safe with idempotent APIs</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param clientToken <p>
     *            A unique, case-sensitive identifier that you provide to ensure
     *            the idempotency of the request. If not provided, the Amazon
     *            Web Services SDK populates this field. For more information
     *            about idempotency, see <a href=
     *            "https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/"
     *            >Making retries safe with idempotent APIs</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRuleRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getTriggerEventSource() != null)
            sb.append("TriggerEventSource: " + getTriggerEventSource() + ",");
        if (getFunction() != null)
            sb.append("Function: " + getFunction() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getPublishStatus() != null)
            sb.append("PublishStatus: " + getPublishStatus() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getTriggerEventSource() == null) ? 0 : getTriggerEventSource().hashCode());
        hashCode = prime * hashCode + ((getFunction() == null) ? 0 : getFunction().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode
                + ((getPublishStatus() == null) ? 0 : getPublishStatus().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTriggerEventSource() == null ^ this.getTriggerEventSource() == null)
            return false;
        if (other.getTriggerEventSource() != null
                && other.getTriggerEventSource().equals(this.getTriggerEventSource()) == false)
            return false;
        if (other.getFunction() == null ^ this.getFunction() == null)
            return false;
        if (other.getFunction() != null && other.getFunction().equals(this.getFunction()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPublishStatus() == null ^ this.getPublishStatus() == null)
            return false;
        if (other.getPublishStatus() != null
                && other.getPublishStatus().equals(this.getPublishStatus()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }
}
