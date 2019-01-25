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

package com.amazonaws.transform;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Contains the unmarshalling state for the parsing of an XML response. The
 * unmarshallers are stateless so that they can be reused, so this class holds
 * the state while different unmarshallers work together to parse an XML
 * response. It also tracks the current position and element depth of the
 * document being parsed and provides utilties for accessing the next XML event
 * from the parser, reading element text, handling attribute XML events, etc.
 */
public class StaxUnmarshallerContext {

    private int currentEventType;
    private final XmlPullParser xpp;

    /** The deque stack. */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    public final Deque<String> stack = new LinkedList<String>();
    private String stackString = "";

    private Map<String, String> metadata = new HashMap<String, String>();
    private List<MetadataExpression> metadataExpressions = new ArrayList<MetadataExpression>();

    private final Map<String, String> headers;

    /**
     * Constructs a new unmarshaller context using the specified source of XML
     * events.
     *
     * @param xpp The source of XML events for this unmarshalling context.
     */
    public StaxUnmarshallerContext(XmlPullParser xpp) {
        this(xpp, null);
    }

    /**
     * Constructs a new unmarshaller context using the specified source of XML
     * events, and a set of response headers.
     *
     * @param xpp The source of XML events for this unmarshalling context.
     * @param headers The set of response headers associated with this
     *            unmarshaller context.
     */
    public StaxUnmarshallerContext(XmlPullParser xpp, Map<String, String> headers) {
        this.xpp = xpp;
        this.headers = headers;
    }

    /**
     * Returns the value of the header with the specified name from the
     * response, or null if not present.
     *
     * @param header The name of the header to lookup.
     * @return The value of the header with the specified name from the response,
     *         or null if not present.
     */
    public String getHeader(String header) {
        if (headers == null)
            return null;

        return headers.get(header);
    }

    /**
     * Returns the text contents of the current element being parsed.
     *
     * @return The text contents of the current element being parsed.
     * @throws IOException
     * @throws XmlPullParserException
     */
    public String readText() throws XmlPullParserException, IOException {
        String s = xpp.nextText();
        // Warning: Prior to API level 14, the pull parser returned by
        // android.util.Xml did not always advance to the END_TAG event when
        // this method was called. Work around by using manually advancing after
        // calls to nextText():
        if (xpp.getEventType() != XmlPullParser.END_TAG) {
            xpp.next();
        }
        currentEventType = xpp.getEventType();
        updateContext();
        return s;
    }

    /**
     * Returns the element depth of the parser's current position in the XML
     * document being parsed.
     *
     * @return The element depth of the parser's current position in the XML
     *         document being parsed.
     */
    public int getCurrentDepth() {
        return stack.size();
    }

    /**
     * Tests the specified expression against the current position in the XML
     * document being parsed.
     *
     * @param expression The psuedo-xpath expression to test.
     * @return True if the expression matches the current document position,
     *         otherwise false.
     */
    public boolean testExpression(String expression) {
        return testExpression(expression, getCurrentDepth());
    }

    /**
     * Tests the specified expression against the current position in the XML
     * document being parsed, and restricts the expression to matching at the
     * specified stack depth.
     *
     * @param expression The psuedo-xpath expression to test.
     * @param startingStackDepth The depth in the stack representing where the
     *            expression must start matching in order for this method to
     *            return true.
     * @return True if the specified expression matches the current position in
     *         the XML document, starting from the specified depth.
     */
    public boolean testExpression(String expression, int startingStackDepth) {
        if (".".equals(expression))
            return true;

        int index = -1;
        while ((index = expression.indexOf("/", index + 1)) > -1) {
            // Don't consider attributes a new depth level
            if (expression.charAt(index + 1) != '@') {
                startingStackDepth++;
            }
        }

        return (getCurrentDepth() == startingStackDepth
                && stackString.endsWith("/" + expression));
    }

    /**
     * Returns true if this unmarshaller context is at the very beginning of a
     * source document (i.e. no data has been parsed from the document yet).
     *
     * @return true if this unmarshaller context is at the very beginning of a
     *         source document (i.e. no data has been parsed from the document
     *         yet).
     */
    public boolean isStartOfDocument() {
        return currentEventType == XmlPullParser.START_DOCUMENT;
    }

    /**
     * Returns the next XML event for the document being parsed. It's one of
     * XmlPullParser.START_DOCUMENT,XmlPullParser.END_DOCUMENT,
     * XmlPullParser.START_TAG, XmlPullParser.END_TAG.
     *
     * @return The next XML event for the document being parsed.
     * @throws IOException
     * @throws XmlPullParserException
     */
    public int nextEvent() throws XmlPullParserException, IOException {
        currentEventType = xpp.next();
        // skip text node
        if (currentEventType == XmlPullParser.TEXT) {
            currentEventType = xpp.next();
        }

        updateContext();

        // look for meta data
        if (currentEventType == XmlPullParser.START_TAG) {
            for (MetadataExpression metadataExpression : metadataExpressions) {
                if (testExpression(metadataExpression.expression,
                        metadataExpression.targetDepth)) {
                    metadata.put(metadataExpression.key, readText());
                    break;
                }
            }
        }

        return currentEventType;
    }

    /**
     * Returns any metadata collected through metadata expressions while this
     * context was reading the XML events from the XML document.
     *
     * @return A map of any metadata collected through metadata expressions
     *         while this context was reading the XML document.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Registers an expression, which if matched, will cause the data for the
     * matching element to be stored in the metadata map under the specified
     * key.
     *
     * @param expression The expression an element must match in order for it's
     *            data to be pulled out and stored in the metadata map.
     * @param targetDepth The depth in the XML document where the expression
     *            match must start.
     * @param storageKey The key under which to store the matching element's
     *            data.
     */
    public void registerMetadataExpression(String expression, int targetDepth, String storageKey) {
        metadataExpressions.add(new MetadataExpression(expression, targetDepth, storageKey));
    }

    /*
     * Private Interface
     */

    /**
     * Simple container for the details of a metadata expression this
     * unmarshaller context is looking for.
     */
    @SuppressWarnings("checkstyle:visibilitymodifier")
    private static class MetadataExpression {

        public String expression;
        public int targetDepth;
        public String key;

        public MetadataExpression(String expression, int targetDepth, String key) {
            this.expression = expression;
            this.targetDepth = targetDepth;
            this.key = key;
        }
    }

    private void updateContext() {
        if (currentEventType == XmlPullParser.START_TAG) {
            stackString += "/" + xpp.getName();
            stack.push(stackString);
        } else if (currentEventType == XmlPullParser.END_TAG) {
            stack.pop();
            stackString = stack.isEmpty() ? "" : stack.peek();
        }
    }
}
