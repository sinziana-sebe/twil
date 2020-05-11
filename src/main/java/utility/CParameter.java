package utility;

/**
 * parameter class
 */
public class CParameter implements IParameter
{
    private final Double m_first;
    private final Double m_second;
    private final Double m_third;

    /**
     * ctor
     * @param p_first first
     * @param p_second second
     * @param p_third third
     */
    public CParameter( final Double p_first, final Double p_second, final Double p_third )
    {
        m_first = p_first;
        m_second = p_second;
        m_third = p_third;
    }

    /**
     * returns first
     * @return first
     */
    @Override
    public Double getFirst()
    {

        return m_first;
    }

    /**
     * returns second
     * @return second
     */
    @Override
    public Double getSecond()
    {
        return m_second;
    }

    /**
     * returs third
     * @return third
     */
    @Override
    public Double getThird()
    {
        return m_third;
    }
}
