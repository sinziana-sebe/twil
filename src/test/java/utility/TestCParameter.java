package utility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCParameter
{
    private CParameter m_parameter;

    @Before
    public void init()
    {
        m_parameter = new CParameter( 1.0, 2.0, 3.0 );
    }

    @Test
    public void testFirst()
    {
        Assert.assertTrue( m_parameter.getFirst().equals( 1.0 ) );
    }

    @Test
    public void testSecond()
    {
        Assert.assertTrue( m_parameter.getSecond().equals( 2.0 ) );
    }

    @Test
    public void testThird()
    {
        Assert.assertTrue( m_parameter.getThird().equals( 3.0 ) );
    }
}
