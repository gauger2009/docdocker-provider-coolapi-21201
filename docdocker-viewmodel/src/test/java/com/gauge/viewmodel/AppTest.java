package com.gauge.viewmodel;

import com.gauge.viewmodel.CoolApi;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        CoolApi  coolApi = new CoolApi();
        coolApi.setApi_id((long)20210307);
        coolApi.setApi_name("GetAll");
        coolApi.setApi_desc("获取所有");
        String actual = coolApi.toString();
        assertEquals( "CoolApi [api_id=20210307, api_name=GetAll, api_desc=获取所有]" ,actual);

    }
}