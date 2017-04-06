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

package com.amazonaws.mobileconnectors.pinpoint.analytics.utils;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

import java.util.Locale;

public class ApplyLocalesRule implements MethodRule {

    private Locale[] locales;

    public ApplyLocalesRule(Locale[] localesToApply) {
        this.locales = localesToApply;
    }

    @Override
    public Statement apply(final Statement base, final FrameworkMethod method, final Object target) {
        if (locales.length != 0) {
            return new Statement() {

                @Override
                public void evaluate() throws Throwable {
                    Locale original = Locale.getDefault();
                    System.out.println(String.format("Original locale: %s", original.toString()));

                    for (Locale locale : locales) {

                        Locale.setDefault(locale);
                        System.out.println("Locale set to: " + Locale.getDefault().toString());
                        try {
                            if (target instanceof LocaleTestingSetupAndTeardown) {
                                ((LocaleTestingSetupAndTeardown) target).setupForRepeatedTestCase();
                                System.out.println("Running test..."
                                        + method.getDeclaringClass().getCanonicalName() + " : "
                                        + method.getName());
                                base.evaluate();
                                ((LocaleTestingSetupAndTeardown) target)
                                        .teardownForRepeatedTestCase();
                            } else {
                                base.evaluate();
                            }
                        } catch (Exception e) {
                            System.out.println(String.format(
                                    "Test method '%s' failed with locale '%s'", method.getName(),
                                    locale.toString()));
                            throw e;
                        }
                    }

                    Locale.setDefault(original);
                    System.out.println("Locale set back to: " + Locale.getDefault().toString());
                }

            };
        }
        return base;
    }
}
