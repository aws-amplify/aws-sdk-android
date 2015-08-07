/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.auth.policy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.amazonaws.auth.policy.Statement.Effect;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Unit tests for constructing policy objects and serializing them to JSON.
 */
public class PolicyTest {

    /**
     * Tests that a policy correctly assigns unique statement IDs to any added
     * statements without IDs yet.
     */
    @Test
    public void testStatementIdAssignment() throws Exception {
        Policy policy = new Policy("S3PolicyId1");
        policy.withStatements(
                new Statement(Effect.Allow).withId("0")
                        .withPrincipals(Principal.AllUsers)
                        .withActions(new TestAction("action1")),
                new Statement(Effect.Allow).withId("1")
                        .withPrincipals(Principal.AllUsers)
                        .withActions(new TestAction("action1")), new Statement(
                        Effect.Deny).withPrincipals(Principal.AllUsers)
                        .withActions(new TestAction("action2")));

        assertValidStatementIds(policy);
    }

    private class TestAction implements Action {
        private final String name;

        public TestAction(String name) {
            this.name = name;
        }

        @Override
        public String getActionName() {
            return name;
        }
    }

    /**
     * Asserts that each statement in the specified policy has a unique ID
     * assigned to it.
     */
    private void assertValidStatementIds(Policy policy) {
        Set<String> statementIds = new HashSet<String>();
        for (Statement statement : policy.getStatements()) {
            assertNotNull(statement.getId());
            assertFalse(statementIds.contains(statement.getId()));
            statementIds.add(statement.getId());
        }
    }

}
