package utility;

/**
 * utility class
 */
public class CUtility implements IUtility
{
    private final Double m_alpha;
    private final Double m_beta;
    private final Double m_gamma;

    public CUtility( final Double p_alpha, final Double p_beta, final Double p_gamma )
    {
        m_alpha = p_alpha;
        m_beta = p_beta;
        m_gamma = p_gamma;
    }

    public Boolean even( final Integer p_number )
    {
        if ( p_number % 2 == 0 ) return true;
        return false;
    }

    public Boolean odd( final Integer p_number )
    {
        if ( p_number % 2 == 1 ) return true;
        return false;
    }

    @Override
    public Double calculate( final IParameter p_parameter )
    {
        return m_alpha * p_parameter.getFirst() + m_beta * p_parameter.getSecond() + m_gamma * p_parameter.getThird();
    }

    @Override
    public Double calculate( final Double p_first, final Double p_second, final Double p_third )
    {
        return m_alpha * p_first + m_beta * p_second + m_gamma * p_third;
    }
}
