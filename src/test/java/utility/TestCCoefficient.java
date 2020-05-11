package utility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCCoefficient
{
    private CCoefficient m_coefficient;

    @Before
    public void init()
    {
        m_coefficient = new CCoefficient( 0.5, 0.3, 0.2 );
    }

    @Test
    public void testAlpha()
    {
        Assert.assertTrue( m_coefficient.alpha().equals( 0.5 ) );
    }

    @Test
    public void testBeta()
    {
        Assert.assertTrue( m_coefficient.equals( 0.3 ) );
    }

    @Test
    public void tesGamma()
    {
        Assert.assertTrue( m_coefficient.gamma().equals( 0.2 ) );
    }
}
