/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.auth.policy.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.policy.Action;
import com.amazonaws.auth.policy.Condition;
import com.amazonaws.auth.policy.Policy;
import com.amazonaws.auth.policy.Principal;
import com.amazonaws.auth.policy.Principal.WebIdentityProviders;
import com.amazonaws.auth.policy.Resource;
import com.amazonaws.auth.policy.Statement;
import com.amazonaws.auth.policy.Statement.Effect;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import java.io.IOException;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Generate an AWS policy object by parsing the given JSON string.
 */
public class JsonPolicyReader {

    private static final String PRINCIPAL_SCHEMA_USER = "AWS";

    private static final String PRINCIPAL_SCHEMA_SERVICE = "Service";

    private static final String PRINICIPAL_SCHEMA_FEDERATED = "Federated";

    private AwsJsonReader reader;

    /**
     * Converts the specified JSON string to an AWS policy object. For more
     * information see, @see http://docs.aws.amazon.com/AWSSdkDocsJava/latest
     * /DeveloperGuide/java-dg-access-control.html
     *
     * @param jsonString the specified JSON string representation of this AWS
     *            access control policy.
     * @return An AWS policy object.
     * @throws IllegalArgumentException If the specified JSON string is null or
     *             invalid and cannot be converted to an AWS policy object.
     */
    public Policy createPolicyFromJsonString(String jsonString) {

        if (jsonString == null) {
            throw new IllegalArgumentException("JSON string cannot be null");
        }

        reader = JsonUtils.getJsonReader(new StringReader(jsonString));
        Policy policy = new Policy();
        List<Statement> statements = new LinkedList<Statement>();

        try {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                if (JsonDocumentFields.POLICY_ID.equals(name)) {
                    policy.setId(reader.nextString());
                } else if (JsonDocumentFields.STATEMENT.equals(name)) {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        statements.add(statementOf(reader));
                    }
                    reader.endArray();
                } else {
                    reader.skipValue();
                }
            }
            reader.endObject();

        } catch (Exception e) {
            String message = "Unable to generate policy object fron JSON string "
                    + e.getMessage();
            throw new IllegalArgumentException(message, e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
            }
        }
        policy.setStatements(statements);
        return policy;
    }

    /**
     * Creates a <code>Statement<code> instance from the statement node.
     *
     * A statement consists of an Effect, id (optional), principal, action, resource,
     * and conditions.
     * <p>
     * principal is the AWS account that is making a request to access or modify one of your AWS resources.
     * <p>
     * action is the way in which your AWS resource is being accessed or modified, such as sending a message to an Amazon SQS queue, or storing an object in an Amazon S3 bucket.
     * <p>
     * resource is the AWS entity that the principal wants to access, such as an Amazon SQS queue, or an object stored in Amazon S3.
     * <p>
     * conditions are the optional constraints that specify when to allow or deny access for the principal to access your resource. Many expressive conditions are available, some specific to each service. For example, you can use date conditions to allow access to your resources only after or before a specific time.
     *
     * @param jStatement JsonNode representing the statement.
     * @return a reference to the statement instance created.
     * @throws IOException
     */
    private Statement statementOf(AwsJsonReader reader) throws IOException {

        Statement statement = new Statement(null);

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (JsonDocumentFields.STATEMENT_EFFECT.equals(name)) {
                statement.setEffect(Effect.valueOf(reader.nextString()));
            } else if (JsonDocumentFields.STATEMENT_ID.equals(name)) {
                statement.setId(reader.nextString());
            } else if (JsonDocumentFields.ACTION.equals(name)) {
                statement.setActions(actionsOf(reader));
            } else if (JsonDocumentFields.RESOURCE.equals(name)) {
                statement.setResources(resourcesOf(reader));
            } else if (JsonDocumentFields.PRINCIPAL.equals(name)) {
                statement.setPrincipals(principalOf(reader));
            } else if (JsonDocumentFields.CONDITION.equals(name)) {
                statement.setConditions(conditionsOf(reader));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return statement.getEffect() == null ? null : statement;
    }

    /**
     * Generates a list of actions from the Action JSON Node.
     *
     * @param actionNodes the action JSON node to be parsed.
     * @return the list of actions.
     * @throws IOException
     */
    private List<Action> actionsOf(AwsJsonReader reader) throws IOException {
        List<Action> actions = new LinkedList<Action>();

        if (reader.isContainer()) {
            reader.beginArray();
            while (reader.hasNext()) {
                actions.add(new NamedAction(reader.nextString()));
            }
            reader.endArray();
        } else {
            actions.add(new NamedAction(reader.nextString()));
        }

        return actions;
    }

    /**
     * Generates a list of resources from the Resource JSON Node.
     *
     * @param resourceNodes the resource JSON node to be parsed.
     * @return the list of resources.
     */
    private List<Resource> resourcesOf(AwsJsonReader reader) throws IOException {
        List<Resource> resources = new LinkedList<Resource>();

        if (reader.isContainer()) {
            reader.beginArray();
            while (reader.hasNext()) {
                resources.add(new Resource(reader.nextString()));
            }
            reader.endArray();
        } else {
            resources.add(new Resource(reader.nextString()));
        }

        return resources;
    }

    /**
     * Generates a list of principals from the Principal JSON Node
     *
     * @param principalNodes the principal JSON to be parsed
     * @return a list of principals
     * @throws IOException
     */
    private List<Principal> principalOf(AwsJsonReader reader) throws IOException {
        List<Principal> principals = new LinkedList<Principal>();

        if (reader.isContainer()) {
            reader.beginObject();
            String schema;
            while (reader.hasNext()) {
                schema = reader.nextName();
                if (reader.isContainer()) {
                    reader.beginArray();
                    while (reader.hasNext()) {
                        principals.add(createPrincipal(schema, reader.nextString()));
                    }
                    reader.endArray();
                } else {
                    principals.add(createPrincipal(schema, reader.nextString()));
                }
            }
            reader.endObject();
        } else {
            String s = reader.nextString();
            if ("*".equals(s)) {
                principals.add(Principal.All);
            } else {
                throw new IllegalArgumentException("Invalid principals: " + s);
            }
        }

        return principals;
    }

    /**
     * Creates a new principal instance for the given schema and the JSON node.
     *
     * @param schema the schema for the principal instance being created.
     * @param principalNode the node indicating the AWS account that is making
     *            the request.
     * @return a principal instance.
     */
    private Principal createPrincipal(String schema, String principal) {
        if (schema.equalsIgnoreCase(PRINCIPAL_SCHEMA_USER)) {
            return new Principal(principal);
        } else if (schema.equalsIgnoreCase(PRINCIPAL_SCHEMA_SERVICE)) {
            return new Principal(schema, principal);
        } else if (schema.equalsIgnoreCase(PRINICIPAL_SCHEMA_FEDERATED)) {
            if (WebIdentityProviders.fromString(principal) != null) {
                return new Principal(
                        WebIdentityProviders.fromString(principal));
            } else {
                return new Principal(PRINICIPAL_SCHEMA_FEDERATED, principal);
            }
        }
        throw new AmazonClientException("Schema " + schema
                + " is not a valid value for the principal.");
    }

    /**
     * Generates a list of condition from the JSON node.
     *
     * @param conditionNodes the condition JSON node to be parsed.
     * @return the list of conditions.
     * @throws IOException
     */
    private List<Condition> conditionsOf(AwsJsonReader reader) throws IOException {

        List<Condition> conditionList = new LinkedList<Condition>();

        reader.beginObject();
        while (reader.hasNext()) {
            convertConditionRecord(conditionList, reader.nextName(), reader);
        }
        reader.endObject();

        return conditionList;
    }

    /**
     * Generates a condition instance for each condition type under the
     * Condition JSON node.
     *
     * @param conditions the complete list of conditions
     * @param conditionType the condition type for the condition being created.
     * @param conditionNode each condition node to be parsed.
     * @throws IOException
     */
    private void convertConditionRecord(List<Condition> conditions,
            String conditionType, AwsJsonReader reader) throws IOException {

        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            List<String> values = new LinkedList<String>();
            if (reader.isContainer()) {
                reader.beginArray();
                while (reader.hasNext()) {
                    values.add(reader.nextString());
                }
                reader.endArray();
            } else {
                values.add(reader.nextString());
            }
            conditions.add(new Condition().withType(conditionType).withConditionKey(name)
                    .withValues(values));
        }
        reader.endObject();
    }

    /**
     * An auxiliary class to help instantiate the action object.
     */
    private static class NamedAction implements Action {

        private final String actionName;

        public NamedAction(String actionName) {
            this.actionName = actionName;
        }

        @Override
        public String getActionName() {
            return actionName;
        }

    }

}
