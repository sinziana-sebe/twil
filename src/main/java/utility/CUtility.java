package utility;

/**
 * utility class
 */
public class CUtility implements IUtility
{
    private final ICoefficient m_coefficient;
    private final IParameter m_parameter;


    public CUtility( final ICoefficient p_coefficient, final CParameter p_parameter )
    {
        m_coefficient = p_coefficient;
        m_parameter = p_parameter;
    }

    /**
     * calculates the utility value
     * @return utility value
     */
    @Override
    public Double calculate()
    {
        final Double l_first = m_coefficient.alpha() * m_parameter.getFirst();
        final Double l_second = m_coefficient.beta() * m_parameter.getSecond();
        final Double l_third = m_coefficient.gamma() * m_parameter.getThird();
        return  l_first + l_second + l_third;
    }

    /**
     * checks if parameter is even
     * @param p_number parameter
     * @return boolean
     */
    public Boolean even( final Integer p_number )
    {
        if ( p_number % 2 == 0 ) return true;
        return false;
    }

    /**
     * checks if parameter given is odd
     * @param p_number parameter
     * @return boolean
     */
    public Boolean odd( final Integer p_number )
    {
        if ( p_number % 2 != 0 ) return true;
        return false;
    }


}
