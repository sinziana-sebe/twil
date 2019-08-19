package utility;

/**
 * parameter class
 */
public class CParameter implements IParameter
{
    private final Double m_first;
    private final Double m_second;
    private final Double m_third;

    public CParameter( final Double p_first, final Double p_second, final Double p_third )
    {
        m_first = p_first;
        m_second = p_second;
        m_third = p_third;
    }

    @Override
    public Double getFirst()
    {
        return m_first;
    }

    @Override
    public Double getSecond()
    {
        return m_second;
    }

    @Override
    public Double getThird()
    {
        return m_third;
    }
}
