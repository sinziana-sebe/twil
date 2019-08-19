package utility;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCUtility
{
    private CUtility m_utility;

    @Before
    public void init()
    {
        m_utility = new CUtility( 0.5, 0.3, 0.2 );
    }

    @Test
    public void testCalculateParameter()
    {
        final CParameter l_parameter = new CParameter( 2.0, 10.0, 5.0 );
        Assert.assertTrue( m_utility.calculate( l_parameter ).equals( 5.0 ) );
    }

    @Test
    public void testCalculateDoubles()
    {
        //Assert.assertTrue( m_utility.calculate( 2.0, 10.0, 5.0 ).equals( 5.0 ) );
    }

    @Test
    public void testFunctionEven()
    {
        final Integer l_number = 4;
        Assert.assertTrue( m_utility.even( l_number ) );
        Assert.assertFalse( m_utility.odd( l_number ) );
    }
/**
    @Test
    public void testFunctionOdd()
    {
        final Integer l_number = 5;
        Assert.assertFalse( m_utility.even( l_number ) );
        Assert.assertTrue( m_utility.odd( l_number ) );
    }
    **/
}
