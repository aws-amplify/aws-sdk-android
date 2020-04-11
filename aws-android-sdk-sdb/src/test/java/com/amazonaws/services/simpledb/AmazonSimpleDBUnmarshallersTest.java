
package com.amazonaws.services.simpledb;

import java.io.InputStream;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.Collections;
import java.util.List;

import com.amazonaws.*;
import com.amazonaws.transform.*;
import com.amazonaws.services.simpledb.model.*;
import com.amazonaws.services.simpledb.model.transform.*;
import com.amazonaws.handlers.*;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Basic response unmarshallers tests
 *
 * Auto-generated
 */
@RunWith(RobolectricTestRunner.class)
public class AmazonSimpleDBUnmarshallersTest {


	/**
	 * Test DomainMetadata response unmarshaller
	 */
	@Test
    public void testDomainMetadata() throws Exception {
		InputStream responseXML = DomainMetadataResult.class.getClassLoader()
				.getResourceAsStream("com/amazonaws/services/simpledb/DomainMetadataResponse.xml");

        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        Reader reader = new InputStreamReader(responseXML);
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        xpp.setInput(reader);
        StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(xpp);

        DomainMetadataResult domainMetadataResult = (DomainMetadataResult)new DomainMetadataResultStaxUnmarshaller().unmarshall(unmarshallerContext);

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        final List<RequestHandler2> requestHandler2s = 
            Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpledb/request.handler2s"));
        for (RequestHandler2 handler2 : requestHandler2s) {
            Response res = new Response(domainMetadataResult, null);
            handler2.afterResponse(null, res);
        }

            
        assertNotNull(domainMetadataResult.getItemCount());
        assertTrue(domainMetadataResult.getItemCount().equals(1));
        
        assertNotNull(domainMetadataResult.getItemNamesSizeBytes());
        assertTrue(domainMetadataResult.getItemNamesSizeBytes().equals(1L));
        
        assertNotNull(domainMetadataResult.getAttributeNameCount());
        assertTrue(domainMetadataResult.getAttributeNameCount().equals(1));
        
        assertNotNull(domainMetadataResult.getAttributeNamesSizeBytes());
        assertTrue(domainMetadataResult.getAttributeNamesSizeBytes().equals(1L));
        
        assertNotNull(domainMetadataResult.getAttributeValueCount());
        assertTrue(domainMetadataResult.getAttributeValueCount().equals(1));
        
        assertNotNull(domainMetadataResult.getAttributeValuesSizeBytes());
        assertTrue(domainMetadataResult.getAttributeValuesSizeBytes().equals(1L));
        
        assertNotNull(domainMetadataResult.getTimestamp());
        assertTrue(domainMetadataResult.getTimestamp().equals(1));
        
    }
    
	/**
	 * Test GetAttributes response unmarshaller
	 */
	@Test
    public void testGetAttributes() throws Exception {
		InputStream responseXML = GetAttributesResult.class.getClassLoader()
				.getResourceAsStream("com/amazonaws/services/simpledb/GetAttributesResponse.xml");

        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        Reader reader = new InputStreamReader(responseXML);
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        xpp.setInput(reader);
        StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(xpp);

        GetAttributesResult getAttributesResult = (GetAttributesResult)new GetAttributesResultStaxUnmarshaller().unmarshall(unmarshallerContext);

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        final List<RequestHandler2> requestHandler2s = 
            Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpledb/request.handler2s"));
        for (RequestHandler2 handler2 : requestHandler2s) {
            Response res = new Response(getAttributesResult, null);
            handler2.afterResponse(null, res);
        }

            
        assertNotNull(getAttributesResult.getAttributes());
        assertTrue(getAttributesResult.getAttributes().size() == 2);
        
        for (Object attributesObject : getAttributesResult.getAttributes()) {
            Attribute attributes = (Attribute)attributesObject;
        assertNotNull(attributes.getName());
        assertTrue(attributes.getName().equals("1"));
        
        assertNotNull(attributes.getValue());
        assertTrue(attributes.getValue().equals("1"));
        
        }
    	
    }
    
	/**
	 * Test ListDomains response unmarshaller
	 */
	@Test
    public void testListDomains() throws Exception {
		InputStream responseXML = ListDomainsResult.class.getClassLoader()
				.getResourceAsStream("com/amazonaws/services/simpledb/ListDomainsResponse.xml");

        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        Reader reader = new InputStreamReader(responseXML);
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        xpp.setInput(reader);
        StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(xpp);

        ListDomainsResult listDomainsResult = (ListDomainsResult)new ListDomainsResultStaxUnmarshaller().unmarshall(unmarshallerContext);

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        final List<RequestHandler2> requestHandler2s = 
            Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpledb/request.handler2s"));
        for (RequestHandler2 handler2 : requestHandler2s) {
            Response res = new Response(listDomainsResult, null);
            handler2.afterResponse(null, res);
        }

            
        assertNotNull(listDomainsResult.getDomainNames());
        assertTrue(listDomainsResult.getDomainNames().size() == 2);
        
        for (Object domainNamesObject : listDomainsResult.getDomainNames()) {
            String domainNames = (String)domainNamesObject;
        }
    	
        assertNotNull(listDomainsResult.getNextToken());
        assertTrue(listDomainsResult.getNextToken().equals("1"));
        
    }
    
	/**
	 * Test Select response unmarshaller
	 */
	@Test
    public void testSelect() throws Exception {
		InputStream responseXML = SelectResult.class.getClassLoader()
				.getResourceAsStream("com/amazonaws/services/simpledb/SelectResponse.xml");

        XmlPullParserFactory xmlPullParserFactory = XmlPullParserFactory.newInstance();
        Reader reader = new InputStreamReader(responseXML);
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        xpp.setInput(reader);
        StaxUnmarshallerContext unmarshallerContext = new StaxUnmarshallerContext(xpp);

        SelectResult selectResult = (SelectResult)new SelectResultStaxUnmarshaller().unmarshall(unmarshallerContext);

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        final List<RequestHandler2> requestHandler2s = 
            Collections.synchronizedList(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/simpledb/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/simpledb/request.handler2s"));
        for (RequestHandler2 handler2 : requestHandler2s) {
            Response res = new Response(selectResult, null);
            handler2.afterResponse(null, res);
        }

            
        assertNotNull(selectResult.getItems());
        assertTrue(selectResult.getItems().size() == 2);
        
        for (Object itemsObject : selectResult.getItems()) {
            Item items = (Item)itemsObject;
        assertNotNull(items.getName());
        assertTrue(items.getName().equals("1"));
        
        assertNotNull(items.getAttributes());
        assertTrue(items.getAttributes().size() == 2);
        
        for (Object attributesObject : items.getAttributes()) {
            Attribute attributes = (Attribute)attributesObject;
        assertNotNull(attributes.getName());
        assertTrue(attributes.getName().equals("1"));
        
        assertNotNull(attributes.getValue());
        assertTrue(attributes.getValue().equals("1"));
        
        }
    	
        }
    	
        assertNotNull(selectResult.getNextToken());
        assertTrue(selectResult.getNextToken().equals("1"));
        
    }
    

    private Date getExpectedDate() {
        /*
         * The example date in our test data is:
         *   2008-10-07T11:51:50.000Z
         *
         * So we construct that same date and verify that it matches
         * what we parsed out of the XML.
         */
        Calendar expectedDate = new GregorianCalendar();
        expectedDate.set(Calendar.YEAR, 2008);
        expectedDate.set(Calendar.MONTH, Calendar.OCTOBER);
        expectedDate.set(Calendar.DAY_OF_MONTH, 7);
        expectedDate.set(Calendar.AM_PM, Calendar.AM);
        expectedDate.set(Calendar.HOUR, 11);
        expectedDate.set(Calendar.MINUTE, 51);
        expectedDate.set(Calendar.SECOND, 50);
        expectedDate.set(Calendar.MILLISECOND, 0);
        expectedDate.setTimeZone(new SimpleTimeZone(0, "UTC"));

        return expectedDate.getTime();
   }

    private ByteBuffer getExpectedByteBuffer() {
        /*
         * The example base64-binary value in our test data is:
         *   YWJjZGVmZw==
         * which corresponds to the UTF-8 bytes of "abcdefg".
         */
        String utf8String = "abcdefg";
        try {
            return ByteBuffer.wrap(utf8String.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            fail("Unable to construct the expected ByteBuffer. " + e.getMessage());
            return null;
        }
   }

}
    
